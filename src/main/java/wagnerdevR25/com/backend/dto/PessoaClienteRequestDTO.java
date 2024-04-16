package wagnerdevR25.com.backend.dto;

import lombok.Data;
import org.springframework.beans.BeanUtils;
import wagnerdevR25.com.backend.entity.Cidade;
import wagnerdevR25.com.backend.entity.Pessoa;

@Data
public class PessoaClienteRequestDTO {
    private String nome;
    private String cpf;
    private String email;
    private String endereço;
    private String cep;
    private Cidade cidade;

    public Pessoa converter(PessoaClienteRequestDTO pessoaClienteRequestDTO){
        Pessoa pessoa = new Pessoa();
        BeanUtils.copyProperties(pessoaClienteRequestDTO, pessoa);
        return pessoa;
    }
}
