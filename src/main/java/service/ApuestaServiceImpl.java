package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import dto.ApuestaDTO;
import entity.ApuestaEntity;
import repository.IApuestaRepository;

@Component
@Service
public class ApuestaServiceImpl  implements IApuestaService{
	
	@Autowired
	private IApuestaRepository apuestaRepository;

	@Override
	@Transactional(readOnly=true)
	public List<ApuestaEntity> findAll() {
		return (List<ApuestaEntity>) apuestaRepository.findAll();
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<ApuestaEntity> findByPartidoId(Long id) {
		return apuestaRepository.findByPartidoId(id);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<ApuestaEntity> consultarResultados(Long id) {
		List<ApuestaEntity> apuestas = apuestaRepository.findByPartidoId(id);
		List<ApuestaEntity> apuestasFinalizadas = new ArrayList<>();
		for(ApuestaEntity apuesta : apuestas) {
			if(apuesta.getPartido().getHoraFin() != null) {
				apuestasFinalizadas.add(apuesta);
			}
		}
		return apuestasFinalizadas;
	}

	@Override
	@Transactional(readOnly=true)
	public ApuestaEntity finById(Long id) {
		return apuestaRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public ApuestaEntity save(ApuestaDTO apuestaDto) {
		ApuestaEntity apuesta = new ApuestaEntity(apuestaDto);
		List<ApuestaEntity> apuestas = findByPartidoIdAndCedula(apuesta.getPartido().getId(), apuesta.getCedula());
		if(apuestas.isEmpty()) {
			Date currentDate = new Date();
			if(currentDate.compareTo(apuesta.getPartido().getHoraInicio()) < 0) {
				return apuestaRepository.save(apuesta);
			}
		}
		
		return null;
	}

	@Override
	@Transactional
	public void delete(Long id) {
		apuestaRepository.deleteById(id);
	}

	@Override
	public List<ApuestaEntity> findByPartidoIdAndCedula(Long partidoId, String cedula) {
		return apuestaRepository.findByPartidoIdAndCedula(partidoId, cedula);
	}

}
