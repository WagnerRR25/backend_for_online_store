
CREATE TABLE produto (
  id BIGINT NOT NULL,
   descricao_curta VARCHAR(255),
   descricao_detalhada VARCHAR(255),
   valor_custo VARCHAR(255),
   venda VARCHAR(255),
   id_categoria BIGINT,
   data_criacao TIMESTAMP WITHOUT TIME ZONE,
   data_atualizacao TIMESTAMP WITHOUT TIME ZONE,
   CONSTRAINT pk_produto PRIMARY KEY (id)
);

ALTER TABLE produto ADD CONSTRAINT FK_PRODUTO_ON_IDCATEGORIA FOREIGN KEY (id_categoria) REFERENCES categoria (id);