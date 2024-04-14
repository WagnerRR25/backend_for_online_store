
CREATE TABLE produto (
  id BIGINT NOT NULL,
   descricao_curta VARCHAR(255),
   descricao_detalhada VARCHAR(255),
   valor_custo DOUBLE PRECISION,
   venda VENDA::DOUBLE precision,
   id_marca BIGINT,
   id_categoria BIGINT,
   data_criacao TIMESTAMP WITHOUT TIME ZONE,
   data_atualizacao TIMESTAMP WITHOUT TIME ZONE,
   CONSTRAINT pk_produto PRIMARY KEY (id)
);

ALTER TABLE produto ADD CONSTRAINT FK_PRODUTO_ON_IDCATEGORIA FOREIGN KEY (id_categoria) REFERENCES categoria (id);

ALTER TABLE produto ADD CONSTRAINT FK_PRODUTO_ON_IDMARCA FOREIGN KEY (id_marca) REFERENCES marca (id);