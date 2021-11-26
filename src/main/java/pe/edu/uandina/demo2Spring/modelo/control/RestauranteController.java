package pe.edu.uandina.demo2Spring.modelo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.Cliente;
import pe.edu.uandina.demo2Spring.modelo.Habitacion;
import pe.edu.uandina.demo2Spring.modelo.Restaurante;
import pe.edu.uandina.demo2Spring.modelo.services.IRestauranteService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestauranteController {
    @Autowired
    private IRestauranteService restauranteService;

    @GetMapping("/restaurante")
    public List<Restaurante> listar(){
        return restauranteService.findAll();
    }

    @GetMapping("/restaurante/{id}")
    public Restaurante mostrar(@PathVariable Long id){
        return restauranteService.findById(id);
    }

    @PostMapping("/restaurante")
    @ResponseStatus(HttpStatus.CREATED)
    public Restaurante crear(@RequestBody Restaurante restaurante) {
        return restauranteService.save(restaurante);
    }

    @PutMapping("/restaurante/{id}")
    public Restaurante actualizar(@RequestBody Restaurante restaurante, @PathVariable Long id){
        Restaurante restauranteOriginal = restauranteService.findById(id);
        restauranteOriginal.setPrecioPlato(restaurante.getPrecioPlato());
        return restauranteService.save(restauranteOriginal);
    }

    @DeleteMapping("/restaurante/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
        restauranteService.delete(id);
    }
}
