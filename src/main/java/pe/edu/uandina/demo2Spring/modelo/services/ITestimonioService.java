package pe.edu.uandina.demo2Spring.modelo.services;

import pe.edu.uandina.demo2Spring.modelo.Restaurante;
import pe.edu.uandina.demo2Spring.modelo.Testimonio;

import java.util.List;

public interface ITestimonioService {
    public List<Testimonio> findAll();
    public Testimonio findById(Long id);
    public Testimonio save(Testimonio testimonio);
    public void delete(Long id);
}
