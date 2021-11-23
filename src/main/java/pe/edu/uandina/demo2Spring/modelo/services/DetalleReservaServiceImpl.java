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

}
