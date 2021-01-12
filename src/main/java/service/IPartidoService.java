package service;

import java.util.List;
import dto.PartidoDTO;
import entity.PartidoEntity;


public interface IPartidoService {
	
	public List<PartidoEntity> findAll();
	
	public PartidoEntity finById(Long id);
	
	public PartidoEntity save(PartidoDTO partidoDto);
	
	public Integer delete(Long id);

}
