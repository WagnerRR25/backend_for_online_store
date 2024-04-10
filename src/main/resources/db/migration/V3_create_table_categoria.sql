
CREATE TABLE categoria (
  id BIGINT NOT NULL,
   nome VARCHAR(255),
   data_criacao TIMESTAMP WITHOUT TIME ZONE,
   data_atualizacao TIMESTAMP WITHOUT TIME ZONE,
   CONSTRAINT pk_categoria PRIMARY KEY (id)
);