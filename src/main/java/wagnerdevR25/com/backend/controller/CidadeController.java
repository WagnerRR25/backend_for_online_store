package wagnerdevR25.com.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wagnerdevR25.com.backend.entity.Cidade;
import wagnerdevR25.com.backend.entity.Estado;
import wagnerdevR25.com.backend.repository.CidadeRepository;
import wagnerdevR25.com.backend.service.CidadeService;
import wagnerdevR25.com.backend.service.EstadoService;

import java.util.List;

@RestController
@RequestMapping("/api/cidade")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping("/")
    public List<Cidade> buscarTodos() {
        return cidadeService.buscarTodos();
    }

    @PostMapping("/")
    public Cidade inserir(@RequestBody Cidade objeto) {
        return cidadeService.inserir(objeto);
    }

    @PutMapping("/")
    public Cidade alterar(@RequestBody Cidade objeto) {
        return cidadeService.alterar(objeto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        cidadeService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
