package pe.edu.uandina.demo2Spring.modelo.services;

import pe.edu.uandina.demo2Spring.modelo.Administrador;
import pe.edu.uandina.demo2Spring.modelo.DetalleReserva;

import java.util.List;

public interface IDetalleReservaService {
    public List<DetalleReserva> findAll();
    public DetalleReserva findById(Long id);
    public DetalleReserva save(DetalleReserva detalleReserva);
    public void delete(Long id);
}
