package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.uandina.demo2Spring.modelo.Administrador;
import pe.edu.uandina.demo2Spring.modelo.dao.IAdministradorDao;

import java.util.List;

@Service
public class AdministradorServiceImpl implements IAdministradorService{
    @Autowired
    private IAdministradorDao administradorDao;

    @Override
    @Transactional(readOnly = true)
    public List<Administrador> findAll() {
        return (List<Administrador>) administradorDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Administrador findById(Long id) {
        return administradorDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Administrador save(Administrador administrador) {
        return administradorDao.save(administrador);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        administradorDao.deleteById(id);
    }

}
