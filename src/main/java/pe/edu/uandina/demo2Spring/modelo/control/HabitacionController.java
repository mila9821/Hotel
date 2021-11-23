package pe.edu.uandina.demo2Spring.modelo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
