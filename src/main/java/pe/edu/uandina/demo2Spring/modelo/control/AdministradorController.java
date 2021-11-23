package pe.edu.uandina.demo2Spring.modelo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.uandina.demo2Spring.modelo.Administrador;
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

}
