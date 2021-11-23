package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
}
