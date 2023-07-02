-- inserção de clientes
INSERT INTO cliente VALUES (default, 'Pedro', '44515943081', '26/06/2002', 1);
INSERT INTO cliente VALUES (default, 'Maria', '12345678901', '10/01/2023', 1);
INSERT INTO cliente VALUES (default, 'João', '98765432109', '05/03/2023', 2);
INSERT INTO cliente VALUES (default, 'Ana', '45678912345', '20/02/2022', 3);
INSERT INTO cliente VALUES (default, 'Carlos', '78901234567', '08/04/2023', 1);
INSERT INTO cliente VALUES (default, 'Laura', '89012345678', '11/02/2023', 1);
INSERT INTO cliente VALUES (default, 'Rafaela', '43210987654', '28/04/2022', 2);
INSERT INTO cliente VALUES (default, 'Gustavo', '34567891234', '07/03/2023', 3);
INSERT INTO cliente VALUES (default, 'Matheus', '90123456789', '19/01/2021', 2);
INSERT INTO cliente VALUES (default, 'Vitória', '32109876543', '31/03/2023', 3);
INSERT INTO cliente VALUES (default, 'Frigorífico Périco', '67166426000190', '20/01/2022', 1);
INSERT INTO cliente VALUES (default, 'Supermercado ABC', '12345678901234', '15/06/2023', 2);
INSERT INTO cliente VALUES (default, 'Restaurante Delícia', '11111111111111', '01/07/2023', 1);
INSERT INTO cliente VALUES (default, 'Loja de Roupas Fashion', '22222222222222', '02/07/2023', 1);
INSERT INTO cliente VALUES (default, 'Salão de Beleza Encanto', '55555555555555', '05/07/2023', 1);
INSERT INTO cliente VALUES (default, 'Oficina Mecânica Veloz', '66666666666666', '06/07/2023', 1);
INSERT INTO cliente VALUES (default, 'Academia Corpo em Movimento', '77777777777777', '07/07/2023', 1);
INSERT INTO cliente VALUES (default, 'Farmácia Bem-Estar', '88888888888888', '08/07/2023', 1);
INSERT INTO cliente VALUES (default, 'Pizzaria Sabor e Arte', '99999999999999', '09/07/2023', 1);
INSERT INTO cliente VALUES (default, 'Cafeteria Aconchego', '10101010101010', '10/07/2023', 1);


-- inserção de estações
INSERT INTO estacao VALUES (default, 'Estação Ferroviária de Paranaguá', 'Paranaguá', 'PR', 'Av. Rua Antonio Alceu Zielonka, s/n', '08:00', '20:00');
INSERT INTO estacao VALUES (default, 'Estação Ferroviária de Santos', 'Santos', 'SP', 'Av. Senador Feijó, s/n', '07:00', '22:00');
INSERT INTO estacao VALUES (default, 'Estação Ferroviária de São Simão', 'São Simão', 'GO', 'Av. 13 de Maio, s/n', '06:30', '21:30');
INSERT INTO estacao VALUES (default, 'Estação Ferroviária de Rondonópolis', 'Rondonópolis', 'MT', 'Rua Marechal Dutra, s/n', '05:45', '20:30');
INSERT INTO estacao VALUES (default, 'Estação Ferroviária de Juiz de Fora', 'Juiz de Fora', 'MG', 'Av. Brasil, s/n', '05:00', '23:00');
INSERT INTO estacao VALUES (default, 'Estação Ferroviária de São Francisco do Sul', 'São Francisco do Sul', 'SC', 'Rua Riachuelo, s/n', '04:30', '00:30');
INSERT INTO estacao VALUES (default, 'Estação Ferroviária de Araguari', 'Araguari', 'MG', 'Av. Dr. Mário Natal, s/n', '05:30', '22:30');
INSERT INTO estacao VALUES (default, 'Estação Ferroviária de Santa Maria', 'Santa Maria', 'RS', 'Av. Prefeito Evandro Behr, s/n', '06:00', '21:00');
INSERT INTO estacao VALUES (default, 'Estação Ferroviária de Araucária', 'Araucária', 'PR', 'Rua Ricardo Gumbleton Daunt, s/n', '05:30', '00:00');
INSERT INTO estacao VALUES (default, 'Estação Ferroviária de Porto Velho', 'Porto Velho', 'RO', 'Av. Sete de Setembro, s/n', '07:00', '20:00');


-- inserção de locomotivas
INSERT INTO locomotiva VALUES (default, 'GE U8B', 1961, 198000, 900.00, 1514, 54500);
INSERT INTO locomotiva VALUES (default, 'GE C44-9W', 1996, 81646, 4000.00, 19000, 192000);
INSERT INTO locomotiva VALUES (default, 'EMD G12', 1968, 90000, 1310.00, 2840, 80000);
INSERT INTO locomotiva VALUES (default, 'GE ES44AC', 2003, 195000, 4400.00, 20000, 193000);
INSERT INTO locomotiva VALUES (default, 'EMD SD70ACe', 2005, 177000, 4300.00, 15000, 197000);
INSERT INTO locomotiva VALUES (default, 'Alstom BB40-9WM', 2008, 130000, 3800.00, 12000, 143000);
INSERT INTO locomotiva VALUES (default, 'GE C30-7', 1976, 113000, 3000.00, 10000, 117000);
INSERT INTO locomotiva VALUES (default, 'EMD GP40-2', 1972, 109000, 3000.00, 8000, 125000);
INSERT INTO locomotiva VALUES (default, 'GE Dash 9-44CW', 1993, 181000, 4400.00, 18000, 181000);
INSERT INTO locomotiva VALUES (default, 'EMD SD40-2', 1972, 135000, 3000.00, 11500, 134000);


-- inserção de logs
INSERT INTO log VALUES (default, 'Criação da base', '27/06/2023 20:20:00');
INSERT INTO log VALUES (default, 'Evento na base 1', '28/06/2023 19:30:30');
INSERT INTO log VALUES (default, 'Evento na base 2', '28/06/2023 19:05:00');
INSERT INTO log VALUES (default, 'Evento na base 3', '29/06/2023 20:01:55');
INSERT INTO log VALUES (default, 'Evento na base 4', '29/06/2023 21:06:19');
INSERT INTO log VALUES (default, 'Evento na base 5', '30/06/2023 22:01:01');
INSERT INTO log VALUES (default, 'Evento na base 6', '01/07/2023 09:58:00');


-- inserção de tipos de funcionário
INSERT INTO tipofuncionario VALUES (DEFAULT, 'Maquinista');
INSERT INTO tipofuncionario VALUES (DEFAULT, 'Operador de Pátio');
INSERT INTO tipofuncionario VALUES (DEFAULT, 'Técnico de Manutenção');
INSERT INTO tipofuncionario VALUES (DEFAULT, 'Supervisor de Logística');
INSERT INTO tipofuncionario VALUES (DEFAULT, 'Inspetor de Segurança');
INSERT INTO tipofuncionario VALUES (DEFAULT, 'Auxiliar Administrativo');
INSERT INTO tipofuncionario VALUES (DEFAULT, 'Auxiliar de Carga e Descarga');
INSERT INTO tipofuncionario VALUES (DEFAULT, 'Coordenador de Operações');
INSERT INTO tipofuncionario VALUES (DEFAULT, 'Auxiliar de Limpeza');
INSERT INTO tipofuncionario VALUES (DEFAULT, 'Operador de Empilhadeira');
INSERT INTO tipofuncionario VALUES (DEFAULT, 'Assistente de Recursos Humanos');


-- inserção de tipos de vagão
INSERT INTO tipovagao VALUES (DEFAULT, 'Vagão tanque');
INSERT INTO tipovagao VALUES (DEFAULT, 'Vagão fechado');
INSERT INTO tipovagao VALUES (DEFAULT, 'Vagão plataforma');
INSERT INTO tipovagao VALUES (DEFAULT, 'Vagão hopper');
INSERT INTO tipovagao VALUES (DEFAULT, 'Vagão gôndola');


-- inserção de cargas
INSERT INTO carga VALUES (DEFAULT, 'Carvão mineral - Hulha', 1, 10, 1);
INSERT INTO carga VALUES (DEFAULT, 'Contêiner', 2, 9, 2);
INSERT INTO carga VALUES (DEFAULT, 'Minério de Ferro', 2, 5, 3);
INSERT INTO carga VALUES (DEFAULT, 'Cimento', 3, 9, 4);
INSERT INTO carga VALUES (DEFAULT, 'Grãos - Soja', 4, 7, 5);
INSERT INTO carga VALUES (DEFAULT, 'Produtos Químicos - Ácido Sulfúrico', 5, 3, 6);
INSERT INTO carga VALUES (DEFAULT, 'Petróleo - Bruto', 6, 8, 7);
INSERT INTO carga VALUES (DEFAULT, 'Produtos Siderúrgicos - Bobinas de Aço', 7, 6, 8);
INSERT INTO carga VALUES (DEFAULT, 'Madeira - Toras', 8, 4, 9);
INSERT INTO carga VALUES (DEFAULT, 'Automóveis - Carros', 9, 2, 10);
INSERT INTO carga VALUES (DEFAULT, 'Fertilizantes - Nitrogenados', 10, 1, 11);
INSERT INTO carga VALUES (DEFAULT, 'Açúcar', 3, 8, 12);
INSERT INTO carga VALUES (DEFAULT, 'Máquinas Industriais', 5, 10, 13);
INSERT INTO carga VALUES (DEFAULT, 'Máquinas Agrícolas', 4, 6, 14);
INSERT INTO carga VALUES (DEFAULT, 'Equipamentos Eletrônicos', 6, 5, 15);
INSERT INTO carga VALUES (DEFAULT, 'Combustíveis - Querosene', 4, 8, 16);
INSERT INTO carga VALUES (DEFAULT, 'Alimentos Refrigerados', 5, 10, 17);
INSERT INTO carga VALUES (DEFAULT, 'Eletrodomésticos', 3, 7, 18);
INSERT INTO carga VALUES (DEFAULT, 'Combustíveis - Gás Natural', 1, 6, 19);
INSERT INTO carga VALUES (DEFAULT, 'Grãos- Milho', 6, 5, 20);


-- inserção de contatos dos clientes
INSERT INTO contato VALUES (DEFAULT, 1, 'pedro@gmail.com', 1);
INSERT INTO contato VALUES (DEFAULT, 3, '11987654321', 2);
INSERT INTO contato VALUES (DEFAULT, 2, '98765432109', 3);
INSERT INTO contato VALUES (DEFAULT, 2, '1231231231', 4);
INSERT INTO contato VALUES (DEFAULT, 1, 'laura@hotmail.com', 5);
INSERT INTO contato VALUES (DEFAULT, 2, '1192837465', 6);
INSERT INTO contato VALUES (DEFAULT, 3, '98765432109', 7);
INSERT INTO contato VALUES (DEFAULT, 2, '9876543210', 8);
INSERT INTO contato VALUES (DEFAULT, 2, '98765432109', 9);
INSERT INTO contato VALUES (DEFAULT, 2, '44515943081', 10);
INSERT INTO contato VALUES (DEFAULT, 1, 'contato@frigorificoperico.com.br', 11);
INSERT INTO contato VALUES (DEFAULT, 2, '1122334455', 12);
INSERT INTO contato VALUES (DEFAULT, 1, 'contato@restaurantedelicia.com.br', 13);
INSERT INTO contato VALUES (DEFAULT, 2, '6549873215', 14);
INSERT INTO contato VALUES (DEFAULT, 2, '3219876542', 15);
INSERT INTO contato VALUES (DEFAULT, 3, '4568293719', 16);
INSERT INTO contato VALUES (DEFAULT, 2, '4826159734', 17);
INSERT INTO contato VALUES (DEFAULT, 2, '9584763120', 18);
INSERT INTO contato VALUES (DEFAULT, 3, '7512469355', 19);
INSERT INTO contato VALUES (DEFAULT, 2, '5462318451', 20);
INSERT INTO contato VALUES (DEFAULT, 2, '1122836465', 5);


-- inserção de funcionários
INSERT INTO funcionario VALUES (DEFAULT, 1, null, 'João Silva', '12345678901', '01/01/1990', 3000.00);
INSERT INTO funcionario VALUES (DEFAULT, 2, 2, 'Maria Santos', '98765432109', '15/05/1985', 2500.00);
INSERT INTO funcionario VALUES (DEFAULT, 3, 3, 'Pedro Souza', '45678912345', '10/10/1992', 2800.00);
INSERT INTO funcionario VALUES (DEFAULT, 4, null, 'Ana Oliveira', '78901234567', '20/03/1998', 2700.00);
INSERT INTO funcionario VALUES (DEFAULT, 5, null, 'Carlos Ferreira', '89012345678', '05/07/1995', 2600.00);
INSERT INTO funcionario VALUES (DEFAULT, 6, 4, 'Laura Lima', '43210987654', '12/12/1990', 2900.00);
INSERT INTO funcionario VALUES (DEFAULT, 7, null, 'Rafaela Almeida', '34567891234', '25/09/1988', 2400.00);
INSERT INTO funcionario VALUES (DEFAULT, 8, 5, 'Gustavo Pereira', '90123456789', '08/08/1993', 2700.00);
INSERT INTO funcionario VALUES (DEFAULT, 9, 6, 'Matheus Costa', '32109876543', '18/04/1996', 2600.00);
INSERT INTO funcionario VALUES (DEFAULT, 10, null, 'Vitória Gomes', '76543210987', '30/11/1994', 2500.00);
INSERT INTO funcionario VALUES (DEFAULT, 11, null, 'Márcia Rodrigues', '10293847560', '03/06/1991', 2800.00);
INSERT INTO funcionario VALUES (DEFAULT, 4, null, 'Carolina Santos', '76843210987', '10/02/1998', 2700.00);
INSERT INTO funcionario VALUES (DEFAULT, 1, null, 'Fernanda Oliveira', '24681357902', '12/03/1987', 3000.00);
INSERT INTO funcionario VALUES (DEFAULT, 2, 7, 'Pedro Henrique', '13579246801', '25/09/1995', 2500.00);
INSERT INTO funcionario VALUES (DEFAULT, 3, 8, 'Luisa Silva', '98765432123', '18/07/1990', 2800.00);
INSERT INTO funcionario VALUES (DEFAULT, 5, null, 'Ricardo Pereira', '10987654321', '03/11/1993', 2600.00);
INSERT INTO funcionario VALUES (DEFAULT, 6, 9, 'Sandra Lima', '10993847560', '16/06/1992', 2900.00);
INSERT INTO funcionario VALUES (DEFAULT, 7, null, 'Lucas Almeida', '56789012345', '29/04/1989', 2400.00);
INSERT INTO funcionario VALUES (DEFAULT, 8, 10, 'Fábio Gomes', '45678901234', '11/12/1996', 2700.00);
INSERT INTO funcionario VALUES (DEFAULT, 9, 7, 'Juliana Costa', '98865432109', '24/08/1994', 2600.00);
INSERT INTO funcionario VALUES (DEFAULT, 10, null, 'Rodrigo Mendes', '12345668901', '06/05/1991', 2500.00);


-- inserção de rotas
INSERT INTO rota VALUES (DEFAULT, 1, 2, 300.0);
INSERT INTO rota VALUES (DEFAULT, 2, 1, 300.0);
INSERT INTO rota VALUES (DEFAULT, 1, 3, 500.0);
INSERT INTO rota VALUES (DEFAULT, 3, 1, 500.0);
INSERT INTO rota VALUES (DEFAULT, 1, 4, 800.0);
INSERT INTO rota VALUES (DEFAULT, 4, 1, 800.0);
INSERT INTO rota VALUES (DEFAULT, 1, 5, 350.0);
INSERT INTO rota VALUES (DEFAULT, 5, 1, 350.0);
INSERT INTO rota VALUES (DEFAULT, 1, 6, 400.0);
INSERT INTO rota VALUES (DEFAULT, 6, 1, 400.0);
INSERT INTO rota VALUES (DEFAULT, 2, 3, 250.0);
INSERT INTO rota VALUES (DEFAULT, 3, 2, 250.0);
INSERT INTO rota VALUES (DEFAULT, 2, 5, 550.0);
INSERT INTO rota VALUES (DEFAULT, 5, 2, 550.0);
INSERT INTO rota VALUES (DEFAULT, 3, 4, 300.0);
INSERT INTO rota VALUES (DEFAULT, 4, 3, 300.0);
INSERT INTO rota VALUES (DEFAULT, 4, 5, 200.0);
INSERT INTO rota VALUES (DEFAULT, 5, 4, 200.0);
INSERT INTO rota VALUES (DEFAULT, 4, 6, 500.0);
INSERT INTO rota VALUES (DEFAULT, 6, 4, 500.0);
INSERT INTO rota VALUES (DEFAULT, 5, 6, 150.0);
INSERT INTO rota VALUES (DEFAULT, 6, 5, 150.0);
INSERT INTO rota VALUES (DEFAULT, 5, 7, 250.0);
INSERT INTO rota VALUES (DEFAULT, 7, 5, 250.0);
INSERT INTO rota VALUES (DEFAULT, 6, 7, 100.0);
INSERT INTO rota VALUES (DEFAULT, 7, 6, 100.0);
INSERT INTO rota VALUES (DEFAULT, 6, 8, 450.0);
INSERT INTO rota VALUES (DEFAULT, 8, 6, 450.0);
INSERT INTO rota VALUES (DEFAULT, 7, 8, 350.0);
INSERT INTO rota VALUES (DEFAULT, 8, 7, 350.0);
INSERT INTO rota VALUES (DEFAULT, 7, 9, 600.0);
INSERT INTO rota VALUES (DEFAULT, 9, 7, 600.0);
INSERT INTO rota VALUES (DEFAULT, 8, 9, 250.0);
INSERT INTO rota VALUES (DEFAULT, 9, 8, 250.0);
INSERT INTO rota VALUES (DEFAULT, 8, 10, 700.0);
INSERT INTO rota VALUES (DEFAULT, 10, 8, 700.0);
INSERT INTO rota VALUES (DEFAULT, 9, 10, 400.0);
INSERT INTO rota VALUES (DEFAULT, 10, 9, 400.0);


-- inserção de vagões
INSERT INTO vagao VALUES (DEFAULT, 1, 60000.0, 25000.0);
INSERT INTO vagao VALUES (DEFAULT, 1, 55000.0, 23000.0);
INSERT INTO vagao VALUES (DEFAULT, 1, 70000.0, 28000.0);
INSERT INTO vagao VALUES (DEFAULT, 1, 58000.0, 24500.0);
INSERT INTO vagao VALUES (DEFAULT, 2, 45000.0, 18000.0);
INSERT INTO vagao VALUES (DEFAULT, 2, 48000.0, 20000.0);
INSERT INTO vagao VALUES (DEFAULT, 2, 42000.0, 17000.0);
INSERT INTO vagao VALUES (DEFAULT, 2, 51000.0, 21000.0);
INSERT INTO vagao VALUES (DEFAULT, 3, 65000.0, 30000.0);
INSERT INTO vagao VALUES (DEFAULT, 3, 70000.0, 32000.0);
INSERT INTO vagao VALUES (DEFAULT, 3, 60000.0, 28000.0);
INSERT INTO vagao VALUES (DEFAULT, 3, 72000.0, 33000.0);
INSERT INTO vagao VALUES (DEFAULT, 4, 55000.0, 24000.0);
INSERT INTO vagao VALUES (DEFAULT, 4, 52000.0, 22000.0);
INSERT INTO vagao VALUES (DEFAULT, 4, 58000.0, 25000.0);
INSERT INTO vagao VALUES (DEFAULT, 4, 50000.0, 21000.0);
INSERT INTO vagao VALUES (DEFAULT, 5, 40000.0, 18000.0);
INSERT INTO vagao VALUES (DEFAULT, 5, 38000.0, 17000.0);
INSERT INTO vagao VALUES (DEFAULT, 5, 42000.0, 19000.0);
INSERT INTO vagao VALUES (DEFAULT, 5, 45000.0, 20000.0);


-- inserção de viagens
INSERT INTO viagem VALUES (DEFAULT, 1, 1, '2023-05-01 08:00:00', '2023-05-01 16:00:00', '2023-05-01 08:00:00', '2023-05-01 16:00:00');
INSERT INTO viagem VALUES (DEFAULT, 1, 3, '2023-05-02 10:00:00', '2023-05-02 18:00:00', '2023-05-02 10:00:00', '2023-05-02 18:00:00');
INSERT INTO viagem VALUES (DEFAULT, 1, 5, '2023-05-03 12:00:00', '2023-05-03 20:00:00', '2023-05-03 12:00:00', '2023-05-03 20:00:00');
INSERT INTO viagem VALUES (DEFAULT, 2, 2, '2023-05-01 09:00:00', '2023-05-01 17:00:00', '2023-05-01 09:00:00', '2023-05-01 17:00:00');
INSERT INTO viagem VALUES (DEFAULT, 2, 4, '2023-05-02 11:00:00', '2023-05-02 19:00:00', '2023-05-02 11:00:00', '2023-05-02 19:00:00');
INSERT INTO viagem VALUES (DEFAULT, 2, 6, '2023-05-03 13:00:00', '2023-05-03 21:00:00', '2023-05-03 13:00:00', '2023-05-03 21:00:00');
INSERT INTO viagem VALUES (DEFAULT, 3, 3, '2023-05-01 10:00:00', '2023-05-01 18:00:00', '2023-05-01 10:00:00', '2023-05-01 18:00:00');
INSERT INTO viagem VALUES (DEFAULT, 3, 5, '2023-05-02 12:00:00', '2023-05-02 20:00:00', '2023-05-02 12:00:00', '2023-05-02 20:00:00');
INSERT INTO viagem VALUES (DEFAULT, 3, 7, '2023-05-03 14:00:00', '2023-05-03 22:00:00', '2023-05-03 14:00:00', '2023-05-03 22:00:00');
INSERT INTO viagem VALUES (DEFAULT, 4, 4, '2023-05-01 11:00:00', '2023-05-01 19:00:00', '2023-05-01 11:00:00', '2023-05-01 19:00:00');
INSERT INTO viagem VALUES (DEFAULT, 4, 6, '2023-05-02 13:00:00', '2023-05-02 21:00:00', '2023-05-02 13:00:00', '2023-05-02 21:00:00');
INSERT INTO viagem VALUES (DEFAULT, 4, 8, '2023-05-03 15:00:00', '2023-05-03 23:00:00', '2023-05-03 15:00:00', '2023-05-03 23:00:00');
INSERT INTO viagem VALUES (DEFAULT, 5, 5, '2023-05-01 12:00:00', '2023-05-01 20:00:00', '2023-05-01 12:00:00', '2023-05-01 20:00:00');
INSERT INTO viagem VALUES (DEFAULT, 5, 7, '2023-05-02 14:00:00', '2023-05-02 22:00:00', '2023-05-02 14:00:00', '2023-05-02 22:00:00');
INSERT INTO viagem VALUES (DEFAULT, 5, 9, '2023-05-02 16:00:00', '2023-05-03 00:00:00', '2023-05-03 16:00:00', '2023-05-03 00:00:00');
INSERT INTO viagem VALUES (DEFAULT, 6, 6, '2023-05-01 13:00:00', '2023-05-01 21:00:00', '2023-05-01 13:00:00', '2023-05-01 21:00:00');
INSERT INTO viagem VALUES (DEFAULT, 6, 8, '2023-05-02 15:00:00', '2023-05-02 23:00:00', '2023-05-02 15:00:00', '2023-05-02 23:00:00');
INSERT INTO viagem VALUES (DEFAULT, 6, 10, '2023-05-01 17:00:00', '2023-05-03 01:00:00', '2023-05-03 17:00:00', '2023-05-03 01:00:00');
INSERT INTO viagem VALUES (DEFAULT, 7, 7, '2023-05-01 14:00:00', '2023-05-01 22:00:00', '2023-05-01 14:00:00', '2023-05-01 22:00:00');
INSERT INTO viagem VALUES (DEFAULT, 7, 9, '2023-04-30 16:00:00', '2023-05-01 00:00:00', '2023-05-02 16:00:00', '2023-05-02 00:00:00');
INSERT INTO viagem VALUES (DEFAULT, 7, 1, '2023-05-01 18:00:00', '2023-05-03 02:00:00', '2023-05-03 18:00:00', '2023-05-03 02:00:00');
INSERT INTO viagem VALUES (DEFAULT, 8, 8, '2023-05-01 15:00:00', '2023-05-01 23:00:00', '2023-05-01 15:00:00', '2023-05-01 23:00:00');
INSERT INTO viagem VALUES (DEFAULT, 8, 10, '2023-04-29 17:00:00', '2023-05-02 01:00:00', '2023-05-02 17:00:00', '2023-05-02 01:00:00');
INSERT INTO viagem VALUES (DEFAULT, 8, 2, '2023-05-03 00:00:00', '2023-05-03 03:00:00', '2023-05-03 19:00:00', '2023-05-03 03:00:00');
INSERT INTO viagem VALUES (DEFAULT, 9, 9, '2023-05-01 16:00:00', '2023-05-01 23:00:00', '2023-05-01 16:00:00', '2023-05-01 00:00:00');
INSERT INTO viagem VALUES (DEFAULT, 9, 1, '2023-05-02 18:00:00', '2023-05-03 02:00:00', '2023-05-02 18:00:00', '2023-05-02 02:00:00');
INSERT INTO viagem VALUES (DEFAULT, 9, 3, '2023-05-03 20:00:00', '2023-05-04 04:00:00', '2023-05-03 20:00:00', '2023-05-03 04:00:00');
INSERT INTO viagem VALUES (DEFAULT, 10, 10, '2023-05-01 17:00:00', '2023-05-02 01:00:00', '2023-05-01 17:00:00', '2023-05-01 01:00:00');
INSERT INTO viagem VALUES (DEFAULT, 10, 2, '2023-05-02 19:00:00', '2023-05-04 03:00:00', '2023-05-02 19:00:00', '2023-05-02 03:00:00');
INSERT INTO viagem VALUES (DEFAULT, 10, 4, '2023-05-03 21:00:00', '2023-05-05 05:00:00', '2023-05-03 21:00:00', '2023-05-03 05:00:00');


-- inserção na tabela viagemvagao
