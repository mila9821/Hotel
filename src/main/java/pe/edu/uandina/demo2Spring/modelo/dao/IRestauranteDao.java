package pe.edu.uandina.demo2Spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2Spring.modelo.Restaurante;

public interface IRestauranteDao extends CrudRepository<Restaurante,Long> {
}
