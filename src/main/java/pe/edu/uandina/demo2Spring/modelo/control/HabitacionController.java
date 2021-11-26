package pe.edu.uandina.demo2Spring.modelo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.Cliente;
import pe.edu.uandina.demo2Spring.modelo.DetalleReserva;
import pe.edu.uandina.demo2Spring.modelo.Habitacion;
import pe.edu.uandina.demo2Spring.modelo.services.IHabitacionService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HabitacionController {
    @Autowired
    private IHabitacionService habitacionService;

    @GetMapping("/habitacion")
    public List<Habitacion> listar() {
        return  habitacionService.findAll();
    }

    @GetMapping("/habitacion/{id}")
    public Habitacion mostrar(@PathVariable Long id){
        return habitacionService.findById(id);
    }

    @PostMapping("/habitacion")
    @ResponseStatus(HttpStatus.CREATED)
    public Habitacion crear(@RequestBody Habitacion habitacion) {
        return habitacionService.save(habitacion);
    }

    @PutMapping("/habitacion/{id}")
    public Habitacion actualizar(@RequestBody Habitacion habitacion, @PathVariable Long id){
        Habitacion habitacionOriginal = habitacionService.findById(id);
        habitacionOriginal.setEstado(habitacion.getEstado());
        return habitacionService.save(habitacionOriginal);
    }

    @DeleteMapping("/habitacion/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
        habitacionService.delete(id);
    }
}
