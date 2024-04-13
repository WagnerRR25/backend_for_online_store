package wagnerdevR25.com.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wagnerdevR25.com.backend.entity.Permissao;
import wagnerdevR25.com.backend.entity.PermissaoPessoa;
import wagnerdevR25.com.backend.entity.Pessoa;
import wagnerdevR25.com.backend.repository.PermissaoRepository;
import wagnerdevR25.com.backend.repository.PessoaRepository;

import java.util.Date;
import java.util.List;

@Service
public class PermissaoService {

    @Autowired
    private PermissaoRepository permissaoRepository;

    public List<Permissao> buscarTodos() {
        return permissaoRepository.findAll();
    }

    public Permissao inserir(Permissao objeto) {
        objeto.setDataCriacao(new Date());
        Permissao objetoNovo = permissaoRepository.saveAndFlush(objeto);
        return objetoNovo;
    }

    public Permissao alterar(Permissao objeto) {
        objeto.setDataAtualizacao(new Date());
        return permissaoRepository.saveAndFlush(objeto);
    }

    public void excluir(Long id) {
        Permissao
                objeto = permissaoRepository.findById(id).get();
        permissaoRepository.delete(objeto);
    }
}
