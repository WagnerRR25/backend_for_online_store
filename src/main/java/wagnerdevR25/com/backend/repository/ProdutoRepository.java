package wagnerdevR25.com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wagnerdevR25.com.backend.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
