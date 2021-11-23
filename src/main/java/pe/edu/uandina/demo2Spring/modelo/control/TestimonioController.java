package pe.edu.uandina.demo2Spring.modelo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.Restaurante;
import pe.edu.uandina.demo2Spring.modelo.Testimonio;
import pe.edu.uandina.demo2Spring.modelo.services.ITestimonioService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestimonioController {
    @Autowired
    private ITestimonioService testimonioService;

    @GetMapping("/testimonio")
    public List<Testimonio> listar(){
        return testimonioService.findAll();
    }

    @PostMapping("/testimonio")
    @ResponseStatus(HttpStatus.CREATED)
    public Testimonio crear(@RequestBody Testimonio testimonio) {
        return testimonioService.save(testimonio);
    }

    @PutMapping("/testimonio/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Testimonio actualizar(@RequestBody Testimonio testimonio, @PathVariable Long id){
        Testimonio testimonioOriginal = testimonioService.findById(id);
        testimonioOriginal.setEstado(testimonioOriginal.getEstado());
        return testimonioService.save(testimonio);
    }

    @DeleteMapping("/testimonio/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
        testimonioService.delete(id);
    }
}
