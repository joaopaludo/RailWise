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
