package service;

import java.util.List;
import dto.ApuestaDTO;
import entity.ApuestaEntity;


public interface IApuestaService {
	
	public List<ApuestaEntity> findAll();
	
	public ApuestaEntity finById(Long id);
	
	public ApuestaEntity save(ApuestaDTO apuestaDto);
	
	public void delete(Long id);
	
	public List<ApuestaEntity> consultarResultados(Long id);
	
	public List<ApuestaEntity> findByPartidoId(Long id);
	
	public List<ApuestaEntity> findByPartidoIdAndCedula(Long id, String cedula);

}
