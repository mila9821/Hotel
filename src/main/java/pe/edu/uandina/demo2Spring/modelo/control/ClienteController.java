package pe.edu.uandina.demo2Spring.modelo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.Cliente;
import pe.edu.uandina.demo2Spring.modelo.services.IClienteService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {
    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> listar(){
        return clienteService.findAll();
    }

    @GetMapping("/clientes/{id}")
    public Cliente mostrar(@PathVariable Long id){
        return clienteService.findById(id);
    }

    @PostMapping("/clientes")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente crear(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @PutMapping("/clientes/{id}")
    public Cliente actualizar(@RequestBody Cliente cliente, @PathVariable Long id){
        Cliente clienteOriginal = clienteService.findById(id);
        clienteOriginal.setNombre(cliente.getNombre());
        return clienteService.save(clienteOriginal);
    }

    @DeleteMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
        clienteService.delete(id);
    }
}
