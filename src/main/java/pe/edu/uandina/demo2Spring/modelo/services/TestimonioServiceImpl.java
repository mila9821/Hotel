package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.uandina.demo2Spring.modelo.Testimonio;
import pe.edu.uandina.demo2Spring.modelo.dao.ITestimonioDao;

import java.util.List;

@Service
public class TestimonioServiceImpl implements ITestimonioService{
    @Autowired
    private ITestimonioDao testimonioDao;
    @Override
    public List<Testimonio> findAll() {
        return (List<Testimonio>) testimonioDao.findAll();
    }
}
