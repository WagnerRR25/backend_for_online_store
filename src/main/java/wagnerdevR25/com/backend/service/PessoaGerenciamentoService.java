package wagnerdevR25.com.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wagnerdevR25.com.backend.entity.Pessoa;
import wagnerdevR25.com.backend.repository.PessoaClienteRepository;
import wagnerdevR25.com.backend.repository.PessoaRepository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class PessoaGerenciamentoService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private EmailService emailService;
    @Autowired
    private PessoaClienteRepository pessoaClienteRepository;

    public String solicitarCodigo(String email) {

        Pessoa pessoa = pessoaRepository.findByEmail(email);
        pessoa.setCodigoRecuperacaoSenha(getCodigoRecuperacaoSenha(pessoa.getId()));
        pessoa.setDataEnvioCodigo(new Date());
        pessoaRepository.saveAndFlush(pessoa);
        emailService.enviarEmailTexto(pessoa.getEmail(), "Código de Recuperação de Senha",
                "Olá, o seu código para recuperação de senha é o seguinte: " + pessoa.getCodigoRecuperacaoSenha());
        return "Código Enviado!";
    }

    public String alterarSenha(Pessoa pessoa) {

        Pessoa pessoaBanco = pessoaRepository.findByEmailAndCodigoRecuperacaoSenha(pessoa.getEmail(), pessoa.getCodigoRecuperacaoSenha());
        if (pessoaBanco == null) {
            return "Código inválido";
        }
        Date diferenca = new Date(new Date().getTime() - pessoaBanco.getDataEnvioCodigo().getTime());
        if (diferenca.getTime() / 1000 < 900) {
            pessoaBanco.setSenha(pessoa.getSenha());
            pessoaBanco.setCodigoRecuperacaoSenha(null);
            pessoaRepository.saveAndFlush(pessoaBanco);
            return "Senha alterada com sucesso!";
        } else {
            return "Tempo expirado, solicite um novo código";
        }
    }

    private String getCodigoRecuperacaoSenha(Long id) {
        DateFormat format = new SimpleDateFormat("ddMMyyyyHHmmssmm");
        return format.format(new Date()) + id;
    }
}
