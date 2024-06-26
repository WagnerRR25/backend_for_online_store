package wagnerdevR25.com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wagnerdevR25.com.backend.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
    Pessoa findByEmail(String email);

    Pessoa findByEmailAndCodigoRecuperacaoSenha(String email, String codigoRecuperacaoSenha);
}
