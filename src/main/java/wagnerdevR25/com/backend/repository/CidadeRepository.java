package wagnerdevR25.com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wagnerdevR25.com.backend.entity.Cidade;
import wagnerdevR25.com.backend.entity.Estado;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{


}
