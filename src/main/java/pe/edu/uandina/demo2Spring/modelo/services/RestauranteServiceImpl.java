package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.uandina.demo2Spring.modelo.Restaurante;
import pe.edu.uandina.demo2Spring.modelo.dao.IAdministradorDao;
import pe.edu.uandina.demo2Spring.modelo.dao.IRestauranteDao;

import java.util.List;

@Service
public class RestauranteServiceImpl implements IRestauranteService{
    @Autowired
    private IRestauranteDao restauranteDao;
    @Override
    public List<Restaurante> findAll() {
        return (List<Restaurante>) restauranteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Restaurante findById(Long id) {
        return restauranteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Restaurante save(Restaurante restaurante) {
        return restauranteDao.save(restaurante);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        restauranteDao.deleteById(id);

    }
}
