package wagnerdevR25.com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wagnerdevR25.com.backend.entity.Pessoa;

public interface PessoaClienteRepository extends JpaRepository<Pessoa, Long>{

}
