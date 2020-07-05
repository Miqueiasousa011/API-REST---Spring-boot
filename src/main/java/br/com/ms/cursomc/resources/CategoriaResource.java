package br.com.ms.cursomc.resources;

import br.com.ms.cursomc.domain.Categoria;
import br.com.ms.cursomc.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<List<Categoria>> findAll() {
        var categorias = categoriaService.findAll();
        return ResponseEntity.ok().body(categorias);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Categoria>> findById(@PathVariable Integer id) {
        var categoria = categoriaService.findById(id);

        return categoria.isPresent()
                ? ResponseEntity.ok().body(categoria)
                : ResponseEntity.notFound().build();
    }

    @PostMapping
    public void salve(@RequestBody Categoria categoria, HttpServletResponse response) {
        var categoriaSalva = categoriaService.save(categoria);
        
    }

}
