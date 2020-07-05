package br.com.ms.cursomc.resources;

import br.com.ms.cursomc.domain.Cliente;
import br.com.ms.cursomc.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/{clientes}")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll() {
        var clientes = clienteService.findAll();
        return ResponseEntity.ok().body(clientes);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Cliente>> findById(@PathVariable Integer id) {
        var cliente = clienteService.findById(id);

        return cliente.isPresent()
                ? ResponseEntity.ok().body(cliente)
                : ResponseEntity.notFound().build();
    }
}
