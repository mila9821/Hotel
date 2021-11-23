package pe.edu.uandina.demo2Spring.modelo.services;

import pe.edu.uandina.demo2Spring.modelo.DetalleReserva;
import pe.edu.uandina.demo2Spring.modelo.Habitacion;

import java.util.List;

public interface IHabitacionService {
    public List<Habitacion> findAll();
    public Habitacion findById(Long id);
    public Habitacion save(Habitacion habitacion);
    public void delete(Long id);
}
