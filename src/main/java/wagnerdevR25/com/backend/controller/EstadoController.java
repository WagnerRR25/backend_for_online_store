package wagnerdevR25.com.backend.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wagnerdevR25.com.backend.entity.Estado;
import wagnerdevR25.com.backend.service.EstadoService;

import java.util.List;

@RestController
@RequestMapping("/api/estado")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("/")
    public List<Estado> buscarTodos(){
        return estadoService.buscarTodos();
    }

    @PostMapping("/")
    public Estado inserir(@RequestBody Estado estado){
        return estadoService.inserir(estado);
    }

    @PutMapping("/")
    public Estado alterar(@RequestBody Estado estado){
        return estadoService.alterar(estado);
    }

    @DeleteMapping("/(id)")
    public ResponseEntity<Void> excluir(@PathVariable("id")Long id){
        estadoService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
