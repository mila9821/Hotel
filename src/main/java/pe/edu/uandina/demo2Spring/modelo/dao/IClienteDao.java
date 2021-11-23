package pe.edu.uandina.demo2Spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2Spring.modelo.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
}
