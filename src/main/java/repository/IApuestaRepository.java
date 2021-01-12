package repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import entity.ApuestaEntity;

@Component
@Repository
public interface IApuestaRepository  extends CrudRepository<ApuestaEntity, Long>{
	
	public List<ApuestaEntity> findByPartidoId(Long partidoId);
	
	public List<ApuestaEntity> findByPartidoIdAndCedula(Long partidoId, String cedula);

}
