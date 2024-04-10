
CREATE TABLE cidade (
  id BIGINT NOT NULL,
   nome VARCHAR(255),
   id_estado BIGINT,
   data_criacao TIMESTAMP WITHOUT TIME ZONE,
   data_atualizacao TIMESTAMP WITHOUT TIME ZONE,
   CONSTRAINT pk_cidade PRIMARY KEY (id)
);

ALTER TABLE cidade ADD CONSTRAINT FK_CIDADE_ON_IDESTADO FOREIGN KEY (id_estado) REFERENCES estado (id);