package pe.edu.uandina.demo2Spring.modelo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.Administrador;
import pe.edu.uandina.demo2Spring.modelo.Cliente;
import pe.edu.uandina.demo2Spring.modelo.services.IAdministradorService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AdministradorController {
    @Autowired
    private IAdministradorService administradorService;

    @GetMapping("/administradores")
    public List<Administrador> listar() {
        return administradorService.findAll();
    }

    @GetMapping("/administradores/{id}")
    public Administrador mostrar(@PathVariable Long id){
        return administradorService.findById(id);
    }

    @PostMapping("/administradores")
    @ResponseStatus(HttpStatus.CREATED)
    public Administrador crear(@RequestBody Administrador administrador) {
        return administradorService.save(administrador);
    }

    @PutMapping("/administradores/{id}")
    public Administrador actualizar(@RequestBody Administrador administrador, @PathVariable Long id){
        Administrador administradorOriginal = administradorService.findById(id);
        administradorOriginal.setNombre(administrador.getNombre());
        return administradorService.save(administradorOriginal);
    }

    @DeleteMapping("/administradores/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
        administradorService.delete(id);
    }

}
