package wagnerdevR25.com.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wagnerdevR25.com.backend.dto.PessoaClienteRequestDTO;
import wagnerdevR25.com.backend.entity.Pessoa;
import wagnerdevR25.com.backend.service.PessoaClienteService;

@RestController
@RequestMapping("/api/cliente")
public class PessoaClienteController {

    @Autowired
    private PessoaClienteService pessoaService;

    @PostMapping("/")
    public Pessoa inserir(@RequestBody PessoaClienteRequestDTO pessoaClienteRequestDTO) {
        Pessoa pessoa = new PessoaClienteRequestDTO().converter(pessoaClienteRequestDTO);
        return pessoaService.registrar(pessoaClienteRequestDTO);
    }
}
