package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.uandina.demo2Spring.modelo.DetalleReserva;
import pe.edu.uandina.demo2Spring.modelo.dao.IDetalleReservaDao;

import java.util.List;

@Service
public class DetalleReservaServiceImpl implements IDetalleReservaService{
    @Autowired
    private IDetalleReservaDao detalleReservaDao;

    @Override
    @Transactional(readOnly = true)
    public List<DetalleReserva> findAll() {
        return (List<DetalleReserva>) detalleReservaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public DetalleReserva findById(Long id) {
        return detalleReservaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public DetalleReserva save(DetalleReserva detalleReserva) {
        return detalleReservaDao.save(detalleReserva);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        detalleReservaDao.deleteById(id);

    }

}
