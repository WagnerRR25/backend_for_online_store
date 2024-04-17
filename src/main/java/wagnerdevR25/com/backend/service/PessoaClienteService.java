package wagnerdevR25.com.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wagnerdevR25.com.backend.dto.PessoaClienteRequestDTO;
import wagnerdevR25.com.backend.entity.Pessoa;
import wagnerdevR25.com.backend.repository.PessoaClienteRepository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class PessoaClienteService {

    @Autowired
    private PessoaClienteRepository pessoaRepository;

    @Autowired
    private PermissaoPessoaService permissaoPessoaService;

    @Autowired
    private EmailService emailService;
    public Pessoa registrar(PessoaClienteRequestDTO PessoaClienteRequestDTO) {
        Pessoa pessoa = new PessoaClienteRequestDTO().converter(PessoaClienteRequestDTO);
        pessoa.setDataCriacao(new Date());
        Pessoa objetoNovo = pessoaRepository.saveAndFlush(pessoa);
        permissaoPessoaService.vinculatPessoaPermissaoCliente(objetoNovo);
        // emailService.enviarEmailTexto(objetoNovo.getEmail(), "Cadastro em nossa Loja, OBRIGADO!", "O registro na loja foi realizado com sucesso. Em breve você receberá a senha de acesso por e-mail!!");
        Map<String, Object> propMap = new HashMap<>();
        propMap.put("nome", objetoNovo.getNome());
        propMap.put("mensagem", "O registro na loja foi realizado com sucesso. Em breve você receberá a senha de acesso por e-mail!!");
        emailService.enviarEmailTemplate(objetoNovo.getEmail(), "Cadastro na Loja WR25", propMap);
        return objetoNovo;
    }
}
