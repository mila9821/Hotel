package pe.edu.uandina.demo2Spring.modelo.services;

import pe.edu.uandina.demo2Spring.modelo.Habitacion;
import pe.edu.uandina.demo2Spring.modelo.Restaurante;

import java.util.List;

public interface IRestauranteService {
    public List<Restaurante> findAll();
    public Restaurante findById(Long id);
    public Restaurante save(Restaurante restaurante);
    public void delete(Long id);
}
