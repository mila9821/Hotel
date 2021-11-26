package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.uandina.demo2Spring.modelo.Restaurante;
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

    @Override
    @Transactional(readOnly = true)
    public Testimonio findById(Long id) {
        return testimonioDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Testimonio save(Testimonio testimonio) {
        return testimonioDao.save(testimonio);
    }

    @Override
    public void delete(Long id) {
        testimonioDao.deleteById(id);

    }


}
