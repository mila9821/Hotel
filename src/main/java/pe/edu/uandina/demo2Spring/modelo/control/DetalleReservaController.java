package pe.edu.uandina.demo2Spring.modelo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.Administrador;
import pe.edu.uandina.demo2Spring.modelo.DetalleReserva;
import pe.edu.uandina.demo2Spring.modelo.services.IDetalleReservaService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DetalleReservaController {
    @Autowired
    private IDetalleReservaService detalleReservaService;

    @GetMapping("/detalle")
    public List<DetalleReserva> listar(){
        return detalleReservaService.findAll();
    }

}
