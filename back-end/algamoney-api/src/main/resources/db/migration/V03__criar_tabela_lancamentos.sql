
CREATE TABLE lancamento (
    id BIGSERIAL PRIMARY KEY,
    descricao VARCHAR(255),
    data_Vencimento DATE,
    data_Pagamento DATE,
    valor NUMERIC(10, 2),
    observacao TEXT,
    tipo VARCHAR(50) NOT NULL,
    id_categoria BIGINT NOT NULL,
    id_pessoa BIGINT NOT NULL,

    CONSTRAINT fk_lancamento_categoria FOREIGN KEY (id_categoria) REFERENCES categoria(id),
    CONSTRAINT fk_lancamento_pessoa FOREIGN KEY (id_pessoa) REFERENCES pessoa(id)
);

INSERT INTO lancamento (descricao, data_vencimento, data_Pagamento, valor, observacao, tipo, id_categoria, id_pessoa) values ('Salário mensal', '2017-06-10', null, 6500.00, 'Distribuição de lucros', 'RECEITA', 1, 1);
INSERT INTO lancamento (descricao, data_vencimento, data_Pagamento, valor, observacao, tipo, id_categoria, id_pessoa) values ('Bahamas', '2017-02-10', '2017-02-10', 100.32, null, 'DESPESA', 2, 2);
INSERT INTO lancamento (descricao, data_vencimento, data_Pagamento, valor, observacao, tipo, id_categoria, id_pessoa) values ('Top Club', '2017-06-10', null, 120, null, 'RECEITA', 3, 3);
INSERT INTO lancamento (descricao, data_vencimento, data_Pagamento, valor, observacao, tipo, id_categoria, id_pessoa) values ('CEMIG', '2017-02-10', '2017-02-10', 110.44, 'Geração', 'RECEITA', 3, 4);
INSERT INTO lancamento (descricao, data_vencimento, data_Pagamento, valor, observacao, tipo, id_categoria, id_pessoa) values ('DMAE', '2017-06-10', null, 200.30, null, 'DESPESA', 3, 5);
INSERT INTO lancamento (descricao, data_vencimento, data_Pagamento, valor, observacao, tipo, id_categoria, id_pessoa) values ('Extra', '2017-03-10', '2017-03-10', 1010.32, null, 'RECEITA', 4, 6);
INSERT INTO lancamento (descricao, data_vencimento, data_Pagamento, valor, observacao, tipo, id_categoria, id_pessoa) values ('Bahamas', '2017-06-10', null, 500, null, 'RECEITA', 1, 7);
INSERT INTO lancamento (descricao, data_vencimento, data_Pagamento, valor, observacao, tipo, id_categoria, id_pessoa) values ('Top Club', '2017-03-10', '2017-03-10', 400.32, null, 'DESPESA', 4, 8);
INSERT INTO lancamento (descricao, data_vencimento, data_Pagamento, valor, observacao, tipo, id_categoria, id_pessoa) values ('Despachante', '2017-06-10', null, 123.64, 'Multas', 'DESPESA', 3, 9);
INSERT INTO lancamento (descricao, data_vencimento, data_Pagamento, valor, observacao, tipo, id_categoria, id_pessoa) values ('Pneus', '2017-04-10', '2017-04-10', 665.33, null, 'RECEITA', 5, 10);
INSERT INTO lancamento (descricao, data_vencimento, data_Pagamento, valor, observacao, tipo, id_categoria, id_pessoa) values ('Café', '2017-06-10', null, 8.32, null, 'DESPESA', 1, 5);
INSERT INTO lancamento (descricao, data_vencimento, data_Pagamento, valor, observacao, tipo, id_categoria, id_pessoa) values ('Eletrônicos', '2017-04-10', '2017-04-10', 2100.32, null, 'DESPESA', 5, 4);
INSERT INTO lancamento (descricao, data_vencimento, data_Pagamento, valor, observacao, tipo, id_categoria, id_pessoa) values ('Instrumentos', '2017-06-10', null, 1040.32, null, 'DESPESA', 4, 3);
INSERT INTO lancamento (descricao, data_vencimento, data_Pagamento, valor, observacao, tipo, id_categoria, id_pessoa) values ('Café', '2017-04-10', '2017-04-10', 4.32, null, 'DESPESA', 4, 2);
INSERT INTO lancamento (descricao, data_vencimento, data_Pagamento, valor, observacao, tipo, id_categoria, id_pessoa) values ('Lanche', '2017-06-10', null, 10.20, null, 'DESPESA', 4, 1);