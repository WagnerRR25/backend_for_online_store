
CREATE TABLE produto_imagens (
  id BIGINT NOT NULL,
   nome VARCHAR(255),
   id_produto BIGINT,
   data_criacao TIMESTAMP WITHOUT TIME ZONE,
   data_atualizacao TIMESTAMP WITHOUT TIME ZONE,
   CONSTRAINT pk_produto_imagens PRIMARY KEY (id)
);

ALTER TABLE produto_imagens ADD CONSTRAINT FK_PRODUTO_IMAGENS_ON_IDPRODUTO FOREIGN KEY (id_produto) REFERENCES produto (id);