INSERT INTO tb_tecnico (nome, cpf, telefone, email, endereco, arbitro)
VALUES ('Pedro Calvacante', '123.456.789-00', '67 88888-9999', 'pedro@gmail.com', 'Rua dois, 137', 1),
('Jose Silva', '123.456.789-00', '67 88888-9999', 'jose.silva@gmail.com', 'Rua dois, 137', 0);

INSERT INTO tb_equipe(nome_time, id_tecnico_fk)
VALUES('FUTSAL TADS 2019', 1),
('FUTSAL TADS 2020', 2),
('VOLEI TADS 2020', 1),
('VOLEI TADS 2021', 2);

INSERT INTO tb_atleta (nome, cpf, telefone, email, endereco, data_nascimento)
VALUES ('Julio Penha', '123.456.789-00', '67 88888-9999', 'julio@gmail.com', 'Rua dois, 137', '2000-01-01'),
('Maria Silva', '123.456.789-00', '67 88888-9999', 'maria.silva@gmail.com', 'Rua dois, 137', '2000-01-01');