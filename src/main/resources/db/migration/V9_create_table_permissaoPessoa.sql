
CREATE TABLE permissao_pessoa (
  id BIGINT NOT NULL,
   id_pessoa BIGINT,
   id_permissao BIGINT,
   data_criacao TIMESTAMP WITHOUT TIME ZONE,
   data_atualizacao TIMESTAMP WITHOUT TIME ZONE,
   CONSTRAINT pk_permissao_pessoa PRIMARY KEY (id)
);

ALTER TABLE permissao_pessoa ADD CONSTRAINT FK_PERMISSAO_PESSOA_ON_IDPERMISSAO FOREIGN KEY (id_permissao) REFERENCES produto (id);

ALTER TABLE permissao_pessoa ADD CONSTRAINT FK_PERMISSAO_PESSOA_ON_IDPESSOA FOREIGN KEY (id_pessoa) REFERENCES pessoa (id);

ALTER TABLE permissao_pessoa ADD CONSTRAINT FK_PERMISSAO_PESSOA_ON_IDPESSOAVcBoR1 FOREIGN KEY (id_pessoa) REFERENCES permissao (id);