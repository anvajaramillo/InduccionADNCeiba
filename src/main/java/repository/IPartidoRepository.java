package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import entity.PartidoEntity;

@Component
@Repository
public interface IPartidoRepository extends CrudRepository<PartidoEntity, Long>{
	
}
