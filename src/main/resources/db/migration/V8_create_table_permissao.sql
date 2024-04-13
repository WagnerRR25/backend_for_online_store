
CREATE TABLE permissao (
  id BIGINT NOT NULL,
   permissao VARCHAR(255),
   data_criacao TIMESTAMP WITHOUT TIME ZONE,
   data_atualizacao TIMESTAMP WITHOUT TIME ZONE,
   CONSTRAINT pk_permissao PRIMARY KEY (id)
);