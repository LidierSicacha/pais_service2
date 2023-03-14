package co.edu.uceva.pais_service2.model.dao;

import co.edu.uceva.pais_service2.model.entities.Pais;
import org.springframework.data.repository.CrudRepository;

public interface IPaisDao extends CrudRepository<Pais, Long> {

}
