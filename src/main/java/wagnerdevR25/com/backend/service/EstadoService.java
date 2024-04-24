package wagnerdevR25.com.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wagnerdevR25.com.backend.entity.Estado;
import wagnerdevR25.com.backend.repository.EstadoRepository;

import java.util.Date;
import java.util.List;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> buscarTodos() {
        return estadoRepository.findAll();
    }

    public Estado inserir(Estado objeto) {
        objeto.setDataCriacao(new Date());
        Estado objetoNovo = estadoRepository.saveAndFlush(objeto);
        return objetoNovo;
    }

    public Estado alterar(Estado objeto) {
        objeto.setDataAtualizacao(new Date());
        return estadoRepository.saveAndFlush(objeto);
    }

    public void excluir(Long id) {
        Estado objeto = estadoRepository.findById(id).get();
        estadoRepository.delete(objeto);
    }
}
