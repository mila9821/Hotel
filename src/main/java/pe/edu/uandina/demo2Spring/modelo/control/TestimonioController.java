package pe.edu.uandina.demo2Spring.modelo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
