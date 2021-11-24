package pe.edu.uandina.demo2Spring.modelo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.Administrador;
import pe.edu.uandina.demo2Spring.modelo.Cliente;
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

    @GetMapping("/detalle/{id}")
    public DetalleReserva mostrar(@PathVariable Long id){
        return detalleReservaService.findById(id);
    }

    @PostMapping("/detalle")
    @ResponseStatus(HttpStatus.CREATED)
    public DetalleReserva crear(@RequestBody DetalleReserva detalleReserva) {
        return detalleReservaService.save(detalleReserva);
    }

    @PutMapping("/detalle/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public DetalleReserva actualizar(@RequestBody DetalleReserva detalleReserva, @PathVariable Long id){
        DetalleReserva detalleOriginal = detalleReservaService.findById(id);
        detalleOriginal.setPrecio(detalleOriginal.getPrecio());
        return detalleReservaService.save(detalleReserva);
    }

    @DeleteMapping("/detalle/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
        detalleReservaService.delete(id);
    }

}
