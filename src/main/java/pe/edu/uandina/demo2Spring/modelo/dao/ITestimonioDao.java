package pe.edu.uandina.demo2Spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2Spring.modelo.Testimonio;

public interface ITestimonioDao extends CrudRepository<Testimonio, Long> {
}
