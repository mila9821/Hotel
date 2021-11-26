package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.uandina.demo2Spring.modelo.Habitacion;
import pe.edu.uandina.demo2Spring.modelo.dao.IHabitacionDao;

import java.util.List;

@Service
public class HabitacionServiceImpl implements IHabitacionService{
    @Autowired
    private IHabitacionDao habitacionDao;
    @Override
    public List<Habitacion> findAll() {
        return (List<Habitacion>) habitacionDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Habitacion findById(Long id) {
        return habitacionDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Habitacion save(Habitacion habitacion) {
        return habitacionDao.save(habitacion);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        habitacionDao.deleteById(id);

    }
}
