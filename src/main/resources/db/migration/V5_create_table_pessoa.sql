
CREATE TABLE pessoa (
  id BIGINT NOT NULL,
   nome VARCHAR(255),
   cpf VARCHAR(255),
   email VARCHAR(255),
   senha VARCHAR(255),
   "endereço" VARCHAR(255),
   cep VARCHAR(255),
   id_cidade BIGINT,
   data_criacao TIMESTAMP WITHOUT TIME ZONE,
   data_atualizacao TIMESTAMP WITHOUT TIME ZONE,
   CONSTRAINT pk_pessoa PRIMARY KEY (id)
);

ALTER TABLE pessoa ADD CONSTRAINT FK_PESSOA_ON_IDCIDADE FOREIGN KEY (id_cidade) REFERENCES cidade (id);