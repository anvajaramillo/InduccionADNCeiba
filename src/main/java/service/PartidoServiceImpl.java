package service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import dto.PartidoDTO;
import entity.ApuestaEntity;
import entity.PartidoEntity;
import repository.IApuestaRepository;
import repository.IPartidoRepository;

@Component
@Service
public class PartidoServiceImpl implements IPartidoService{
	
	@Autowired
	private IPartidoRepository partidoRepository;
	@Autowired
	private IApuestaRepository apuestaRepository;

	@Override
	@Transactional(readOnly=true)
	public List<PartidoEntity> findAll() {
		return (List<PartidoEntity>) partidoRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public PartidoEntity finById(Long id) {
		return partidoRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public PartidoEntity save(PartidoDTO partidoDto) {
		PartidoEntity partidoActual = new PartidoEntity(partidoDto);
		PartidoEntity partidoAnterior = (partidoActual.getId() != null) ? partidoRepository.findById(partidoActual.getId()).orElse(null) : null;
		Date currentDate = new Date();
		if(partidoAnterior != null && partidoAnterior.getHoraFin() != null) {
			return partidoAnterior;
		} else if (partidoAnterior != null && partidoAnterior.getHoraFin() == null && currentDate.compareTo(partidoAnterior.getHoraInicio()) >= 0) {
			partidoAnterior.setHoraFin(partidoActual.getHoraFin());
			partidoAnterior.setPuntajePais1(partidoActual.getPuntajePais1());
			partidoAnterior.setPuntajePais2(partidoActual.getPuntajePais2());
			guardarResultados(partidoAnterior);
			return partidoRepository.save(partidoAnterior);
		}else {
			return partidoRepository.save(partidoActual);
		}
		
	}

	private void guardarResultados(PartidoEntity partidoActual) {
		List<ApuestaEntity> apuestas = apuestaRepository.findByPartidoId(partidoActual.getId());
		
		Integer totalDineroPerdedores = 0;
		Integer totalPGanadores = 0;
		for(ApuestaEntity apuesta : apuestas) {
			if(partidoActual.getPuntajePais1() == apuesta.getPuntajePais1() && partidoActual.getPuntajePais2() == apuesta.getPuntajePais2()) {
				apuesta.setGanador(true);
				totalPGanadores += 1;
			}else {
				apuesta.setGanador(false);
				totalDineroPerdedores += apuesta.getDinero();
			}
			apuestaRepository.save(apuesta);
		}
		
		calcularPremio(apuestas,totalDineroPerdedores,totalPGanadores);
	}

	private void calcularPremio(List<ApuestaEntity> apuestas, Integer totalDineroPerdedores, Integer totalGanadores) {
		Integer dineroPerdedores = (totalGanadores != 0) ? totalDineroPerdedores / totalGanadores : 0;
		for(ApuestaEntity apuesta : apuestas) {
			if(apuesta.isGanador()) {
				apuesta.setDineroGanado(apuesta.getDinero()+dineroPerdedores);
			}else {
				apuesta.setDineroGanado(0);
			}
			apuestaRepository.save(apuesta);
		}
		
	}

	@Override
	@Transactional
	public Integer delete(Long id) {
		if(apuestaRepository.findByPartidoId(id).isEmpty()) {
			partidoRepository.deleteById(id);
			return 1;
		}else {
			return 0;
		}
	}
	
}
