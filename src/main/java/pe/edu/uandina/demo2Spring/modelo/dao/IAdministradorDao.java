package pe.edu.uandina.demo2Spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2Spring.modelo.Administrador;

public interface IAdministradorDao extends CrudRepository<Administrador, Long> {
}
