package wagnerdevR25.com.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wagnerdevR25.com.backend.entity.Cidade;
import wagnerdevR25.com.backend.repository.CidadeRepository;

import java.util.Date;
import java.util.List;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public List<Cidade> buscarTodos() {
        return cidadeRepository.findAll();
    }

    public Cidade inserir(Cidade objeto) {
        objeto.setDataCriacao(new Date());
        Cidade objetoNovo = cidadeRepository.saveAndFlush(objeto);
        return objetoNovo;
    }

    public Cidade alterar(Cidade objeto) {
        objeto.setDataAtualizacao(new Date());
        return cidadeRepository.saveAndFlush(objeto);
    }

    public void excluir(Long id) {
        Cidade objeto = cidadeRepository.findById(id).get();
        cidadeRepository.delete(objeto);
    }
}
