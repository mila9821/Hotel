package pe.edu.uandina.demo2Spring.modelo.services;

import pe.edu.uandina.demo2Spring.modelo.Administrador;
import pe.edu.uandina.demo2Spring.modelo.Cliente;

import java.util.List;

public interface IAdministradorService {
    public List<Administrador> findAll();
    public Administrador findById(Long id);
    public Administrador save(Administrador administrador);
    public void delete(Long id);
}
