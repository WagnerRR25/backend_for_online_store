package wagnerdevR25.com.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wagnerdevR25.com.backend.entity.Marca;
import wagnerdevR25.com.backend.repository.CategoriaRepository;
import wagnerdevR25.com.backend.repository.MarcaRepository;

import java.util.Date;
import java.util.List;

@Service
public class MarcaService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private MarcaRepository marcaRepository;

    public List<Marca> buscarTodos() {
        return marcaRepository.findAll();
    }

    public Marca inserir(Marca objeto) {
        objeto.setDataCriacao(new Date());
        Marca objetoNovo = marcaRepository.saveAndFlush(objeto);
        return objetoNovo;
    }

    public Marca alterar(Marca objeto) {
        objeto.setDataAtualizacao(new Date());
        return marcaRepository.saveAndFlush(objeto);
    }

    public void excluir(Long id) {
        Marca objeto = marcaRepository.findById(id).get();
        marcaRepository.delete(objeto);
    }
}
