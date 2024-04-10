
CREATE TABLE estado (
  id BIGINT NOT NULL,
   nome VARCHAR(255),
   sigla VARCHAR(2),
   data_criacao TIMESTAMP WITHOUT TIME ZONE,
   data_atualizacao TIMESTAMP WITHOUT TIME ZONE,
   CONSTRAINT pk_estado PRIMARY KEY (id)
);