-- 2023/2
-- 08/11/2023 -> Gerado
-- 12/11/2023 -> Editado


-- Criação do banco de dados

CREATE DATABASE railwise;


-- tabela cliente

CREATE TABLE cliente (
	id_cliente SERIAL NOT NULL,
	tx_nome varchar(100) NOT NULL,
	tx_documento varchar(19) NOT NULL UNIQUE,
	dt_cadastro date NOT NULL,
	cd_status int4 NOT NULL CHECK(cd_status IN (0, 1, 2)),
	CONSTRAINT cliente_pk PRIMARY KEY (id_cliente)
);

COMMENT ON TABLE cliente IS 'Tabela de cadastro dos clientes que contratam o transporte das cargas';
COMMENT ON COLUMN cliente.id_cliente IS 'Id ta tabela cliente (chave primária)';
COMMENT ON COLUMN cliente.tx_nome IS 'Nome do cliente:
Nome da pessoa física ou razão social da pessoa jurídica';
COMMENT ON COLUMN cliente.tx_documento IS 'CPF da pessoa física ou CNPJ da pessoa jurídica';
COMMENT ON COLUMN cliente.dt_cadastro IS 'Data em que o cliente foi cadastrado no sistema';
COMMENT ON COLUMN cliente.cd_status IS 'Código que indica o status do cliente no sistema:
0 - Inativo
1 - Ativo
2 - Bloqueado';


-- tabela estacao

CREATE TABLE estacao (
	id_estacao SERIAL NOT NULL,
	tx_nome varchar(80) NOT NULL,
	tx_cidade varchar(40) NOT NULL,
	tx_uf varchar(2) NOT NULL,
	tx_endereco varchar(200) NOT NULL,
	hr_inicioexpediente time(7),
	hr_finalexpediente time(7),
	CONSTRAINT estacao_pk PRIMARY KEY (id_estacao)
);

COMMENT ON TABLE estacao IS 'Tabela de cadastro das estações onde os trens podem parar / passar.';
COMMENT ON COLUMN estacao.id_estacao IS 'Id da estação (chave primária)';
COMMENT ON COLUMN estacao.tx_nome IS 'Nome da estação';
COMMENT ON COLUMN estacao.tx_cidade IS 'Noma da cidade onde a estação fica localizada';
COMMENT ON COLUMN estacao.tx_uf IS 'Sigla da unidade federativa a que pertence a cidade onde a estação está localizada.';
COMMENT ON COLUMN estacao.tx_endereco IS 'Endereço da estação (rua, número, referência etx.)';
COMMENT ON COLUMN estacao.hr_inicioexpediente IS 'Horário de início do expediente da estação';
COMMENT ON COLUMN estacao.hr_finalexpediente IS 'Horário do final do expediente de funcionamento da estação';


-- tabela locomotiva

CREATE TABLE locomotiva (
	id_locomotiva SERIAL NOT NULL,
	tx_modelo varchar(80) NOT NULL,
	an_anofabricacao int4 NOT NULL,
	vl_capacidadecarga numeric(7, 0) NOT NULL,
	vl_potencia numeric(7, 2) NOT NULL,
	vl_capacidadecombustivel numeric(8, 3) NOT NULL,
	vl_peso numeric(10, 0) NOT NULL,
	cd_status int4 NOT NULL CHECK(cd_status IN (0, 1)),
	CONSTRAINT locomotiva_pk PRIMARY KEY (id_locomotiva)
);

COMMENT ON TABLE locomotiva IS 'Tabela de cadastro das locomotivas.';
COMMENT ON COLUMN locomotiva.id_locomotiva IS 'Id da tabela locomotiva (chave primária)';
COMMENT ON COLUMN locomotiva.tx_modelo IS 'Modelo da locomotiva';
COMMENT ON COLUMN locomotiva.an_anofabricacao IS 'Ano de fabricação da locomotiva';
COMMENT ON COLUMN locomotiva.vl_capacidadecarga IS 'Capacidade de carga máxima que a locomotiva é capaz de transportar em kg.';
COMMENT ON COLUMN locomotiva.vl_potencia IS 'Potência do motor da locomotiva em hp.';
COMMENT ON COLUMN locomotiva.vl_capacidadecombustivel IS 'Capacidade de combustível da locomotiva em litros.';
COMMENT ON COLUMN locomotiva.vl_peso IS 'Peso da locomotiva em kg.';
COMMENT ON COLUMN locomotiva.cd_status IS 'Status da locomotiva:
0 - inativa
1 - ativa';


-- tabela log

CREATE TABLE log (
	id_log SERIAL NOT NULL,
	tx_descricao varchar(5000) NOT NULL,
	dt_registro timestamp DEFAULT current_timestamp NOT NULL,
	CONSTRAINT log_pk PRIMARY KEY (id_log)
);

COMMENT ON TABLE log IS 'Tabela dos logs do sistema';
COMMENT ON COLUMN log.id_log IS 'Id da tabela log';
COMMENT ON COLUMN log.tx_descricao IS 'Descrição do log: o que ele especifica, qua ação foi realizada etc.';
COMMENT ON COLUMN log.dt_registro IS 'Data em que o log foi gerado';


-- tabela tipofuncionario

CREATE TABLE tipofuncionario (
	id_tipofuncionario SERIAL NOT NULL,
	tx_descricao varchar(80) NOT NULL,
	CONSTRAINT tipofuncionario_pk PRIMARY KEY (id_tipofuncionario)
);

COMMENT ON TABLE tipofuncionario IS 'Tabela que especifica os cargos (tipos) de funcionários.';
COMMENT ON COLUMN tipofuncionario.id_tipofuncionario IS 'Id da tabela tipo funcionário (chave primária)';
COMMENT ON COLUMN tipofuncionario.tx_descricao IS 'Descrição do tipo de funcionário (cargo)';


-- tabela tipovagao

CREATE TABLE tipovagao (
	id_tipovagao SERIAL NOT NULL,
	tx_descricao varchar(80) NOT NULL,
	CONSTRAINT tipovagao_pk PRIMARY KEY (id_tipovagao)
);

COMMENT ON TABLE tipovagao IS 'Tabela dos tipos de vagões';
COMMENT ON COLUMN tipovagao.id_tipovagao IS 'Id da tabela tipovagao (chave primária)';
COMMENT ON COLUMN tipovagao.tx_descricao IS 'Descrição do tipo de vagão';


-- tabela carga

CREATE TABLE carga (
	id_carga SERIAL NOT NULL,
	tx_descricao varchar(100) NOT NULL,
	cd_estacaoorigem int4 NOT NULL,
	cd_estacaodestino int4 NOT NULL,
	cd_cliente int4 NOT NULL,
	vl_peso numeric(10, 3) NOT NULL,
	CONSTRAINT carga_pk PRIMARY KEY (id_carga)
);

COMMENT ON TABLE carga IS 'Tabela de cadastro das cargas';
COMMENT ON COLUMN carga.id_carga IS 'Id da tabela carga (chave primária)';
COMMENT ON COLUMN carga.tx_descricao IS 'Descrição da carga';
COMMENT ON COLUMN carga.cd_estacaoorigem IS 'Código que referencia a estação de onde a carga saiu.';
COMMENT ON COLUMN carga.cd_estacaodestino IS 'Código que referencia a estação para a qual a carga está destinada.';
COMMENT ON COLUMN carga.cd_cliente IS 'Código que indica qual cliente contratou o transporte da carga.';
COMMENT ON COLUMN carga.vl_peso IS 'Peso da carga em kg.';


-- tabela contato

CREATE TABLE contato (
	id_contato SERIAL NOT NULL,
	cd_tipocontato int4 NOT NULL,
	tx_contato varchar(60) NOT NULL,
	cd_cliente int4 NOT NULL,
	CONSTRAINT contato_pk PRIMARY KEY (id_contato)
);

COMMENT ON TABLE contato IS 'Tabela de cadastro dos contatos dos clientes';
COMMENT ON COLUMN contato.id_contato IS 'Id da tabela contato (chave primária)';
COMMENT ON COLUMN contato.cd_tipocontato IS 'Código que define o tipo do contato:
1 - E-mail
2 - Telefone
3 - Celular';
COMMENT ON COLUMN contato.tx_contato IS 'Campo para informar o contato, podendo ser e-mail, telefone ou número de celular, a depender do especificado no campo cd_tipocontato';
COMMENT ON COLUMN contato.cd_cliente IS 'Código do cliente ao qual o contato pertence.';


-- tabela funcionario

CREATE TABLE funcionario (
	id_funcionario SERIAL NOT NULL,
	cd_tipofuncionario int4 NOT NULL,
	cd_estacao int4,
	tx_nome varchar(80) NOT NULL,
	tx_cpf varchar(15) NOT NULL UNIQUE,
	dt_nascimento date NOT NULL,
	vl_salario numeric(8, 2) NOT NULL,
	CONSTRAINT funcionario_pk PRIMARY KEY (id_funcionario)
);

COMMENT ON TABLE funcionario IS 'Tabela de cadastro dos funcionários';
COMMENT ON COLUMN funcionario.id_funcionario IS 'Id da tabela funcionário (chave primária)';
COMMENT ON COLUMN funcionario.cd_tipofuncionario IS 'Código do tipo de funcionário. Chave estrangeira que faz referência à chave primária da tabela tipofuncionario.';
COMMENT ON COLUMN funcionario.cd_estacao IS 'Código da estação: referencia o id da estação em que o funcionário trabalha, se ele trabalha em uma estação.';
COMMENT ON COLUMN funcionario.tx_nome IS 'Nome do funcionário';
COMMENT ON COLUMN funcionario.tx_cpf IS 'CPF do funcionário';
COMMENT ON COLUMN funcionario.dt_nascimento IS 'Data de nascimento do funcionário';
COMMENT ON COLUMN funcionario.vl_salario IS 'Salário do funcionário em R$';


-- tabela rota

CREATE TABLE rota (
	id_rota SERIAL NOT NULL,
	cd_estacaoorigem int4 NOT NULL,
	cd_estacaodestino int4 NOT NULL,
	vl_distancia numeric(10, 3) NOT NULL,
	CONSTRAINT rota_pk PRIMARY KEY (id_rota)
);

COMMENT ON TABLE rota IS 'Tabela de registro das rotas';
COMMENT ON COLUMN rota.id_rota IS 'Id da tabela rota (chave primária)';
COMMENT ON COLUMN rota.cd_estacaoorigem IS 'Código da estação de origem da rota';
COMMENT ON COLUMN rota.cd_estacaodestino IS 'Código da estação de destino da rota.';
COMMENT ON COLUMN rota.vl_distancia IS 'Distância da origem até o destino em km.';


-- tabela vagao

CREATE TABLE vagao (
	id_vagao SERIAL NOT NULL,
	cd_tipovagao int4 NOT NULL,
	vl_capacidade numeric(10, 3) NOT NULL,
	vl_peso numeric(10, 3) NOT NULL,
	CONSTRAINT vagao_pk PRIMARY KEY (id_vagao)
);

COMMENT ON TABLE vagao IS 'Tabela de cadastro dos vagões.';
COMMENT ON COLUMN vagao.id_vagao IS 'Id da tabela vagão (chave primária)';
COMMENT ON COLUMN vagao.cd_tipovagao IS 'Código que referencia o tipo de vagão na tabela tipovagao.';
COMMENT ON COLUMN vagao.vl_capacidade IS 'Capacidade do vagão em kg.';
COMMENT ON COLUMN vagao.vl_peso IS 'Peso do vagão em kg.';


-- tabela viagem

CREATE TABLE viagem (
	id_viagem SERIAL NOT NULL,
	cd_locomotiva int4 NOT NULL,
	dt_inicio timestamp,
	dt_fim timestamp,
	CONSTRAINT viagem_pk PRIMARY KEY (id_viagem)
);

COMMENT ON TABLE viagem IS 'Tabela que relaciona as locomotivas às rotas nas viagens';
COMMENT ON COLUMN viagem.id_viagem IS 'Id da tabela viagem (chave primária)';
COMMENT ON COLUMN viagem.cd_locomotiva IS 'Código da locomotiva que fez ou fará uma determinada viagem.';
COMMENT ON COLUMN viagem.dt_inicio IS 'Data de início da viagem (saída da primeira estação)';
COMMENT ON COLUMN viagem.dt_fim IS 'Data de fim da viagem (chegada na última estação).';


-- tabela viagemrota

CREATE TABLE viagemrota (
	id_viagemrota SERIAL NOT NULL,
	cd_rota int4 NOT NULL,
	cd_viagem int4 NOT NULL,
	dt_momentosaida timestamp,
	dt_momentochegada timestamp,
	CONSTRAINT viagemrota_pk PRIMARY KEY (id_viagemrota)
);

COMMENT ON TABLE viagemrota IS 'Tabela que relaciona as rotas presentes em uma viagem.';
COMMENT ON COLUMN viagemrota.id_viagemrota IS 'Id da tabela viagemrota (chave primária).';
COMMENT ON COLUMN viagemrota.cd_rota IS 'Código da rota';
COMMENT ON COLUMN viagemrota.cd_viagem IS 'Código da viagem';
COMMENT ON COLUMN viagemrota.dt_momentosaida IS 'Momento de saída do trem da estação origem.';
COMMENT ON COLUMN viagemrota.dt_momentochegada IS 'Momento de chegada do trem na estação de destino.';


-- tabela viagemvagao

CREATE TABLE viagemvagao (
	id_viagemvagao SERIAL NOT NULL,
	cd_viagem int4 NOT NULL,
	cd_vagao int4 NOT NULL,
	cd_carga int4 NOT NULL,
	vl_custoporkm numeric(8, 2) NOT NULL,
	CONSTRAINT viagemvagao_pk PRIMARY KEY (id_viagemvagao)
);

COMMENT ON TABLE viagemvagao IS 'Tabela que relaciona os vagões de uma viagem e a carga transportada por eles';
COMMENT ON COLUMN viagemvagao.id_viagemvagao IS 'Id da tabela viagemvagao (chave primária)';
COMMENT ON COLUMN viagemvagao.cd_viagem IS 'Código da viagem';
COMMENT ON COLUMN viagemvagao.cd_vagao IS 'Código que indica o vagão que está sendo referenciado.';
COMMENT ON COLUMN viagemvagao.cd_carga IS 'Código da carga que foi / será transportada por dado vagão em uma determinada viagem.';
COMMENT ON COLUMN viagemvagao.vl_custoporkm IS 'Valor de custo para transporte por quilômetro';


-- tabela funcionarioviagem

CREATE TABLE funcionarioviagem (
	id_funcionarioviagem SERIAL NOT NULL,
	cd_funcionario int4 NOT NULL,
	cd_viagem int4 NOT NULL,
	CONSTRAINT funcionarioviagem_pk PRIMARY KEY (id_funcionarioviagem));

COMMENT ON TABLE funcionarioviagem IS 'Tabela que relaciona os funcionários às viagens realizadas, permitindo saber em quais viagens um funcionário foi.';
COMMENT ON COLUMN funcionarioviagem.id_funcionarioviagem IS 'Id da tabela funcionário viagem (chave primária).';
COMMENT ON COLUMN funcionarioviagem.cd_funcionario IS 'Referencia o código do funcionário na tabela funcionario';
COMMENT ON COLUMN funcionarioviagem.cd_viagem IS 'Referencia o código da viagem na tabela viagem';


-- tabela manutencao

CREATE TABLE manutencao (
	id_manutencao SERIAL NOT NULL,
	tx_descricao varchar(1000) NOT NULL,
	cd_status int4 NOT NULL CHECK(cd_status IN (0, 1, 2, 3, 4)),
	dt_realizacao date NOT NULL,
	vl_custo numeric(10, 2) NOT NULL,
	cd_locomotiva int4,
	cd_vagao int4,
	cd_ferrovia int4,
	CONSTRAINT manutencao_pk PRIMARY KEY (id_manutencao)
);

COMMENT ON TABLE manutencao IS 'Tabela de controle das manutenções';
COMMENT ON COLUMN manutencao.id_manutencao IS 'Id da tabela manutenção (chave primária)';
COMMENT ON COLUMN manutencao.tx_descricao IS 'Descrição dos problemas encontrados e de itens que passaram por manutenção';
COMMENT ON COLUMN manutencao.cd_status IS 'Código que determina o status da manutenção:
0 - Programada
1 - Em andamento
2 - Em pausa
3 - Concluída
4 - Cancelada';
COMMENT ON COLUMN manutencao.dt_realizacao IS 'Data de realização da manutenção';
COMMENT ON COLUMN manutencao.vl_custo IS 'Custo do item da manutenção';
COMMENT ON COLUMN manutencao.cd_locomotiva IS 'Código da locomotiva: referencia o id da locomotiva';
COMMENT ON COLUMN manutencao.cd_vagao IS 'Código da vagao: referencia o id do vagao';
COMMENT ON COLUMN manutencao.cd_ferrovia IS 'Código da rota: referencia o id da rota, em que a ferrovia esta localizada';


-- adição de constraints (foreign keys)

ALTER TABLE viagem ADD CONSTRAINT FKviagem768070 FOREIGN KEY (cd_locomotiva) REFERENCES locomotiva (id_locomotiva);
ALTER TABLE viagemvagao ADD CONSTRAINT FKviagemvaga821457 FOREIGN KEY (cd_vagao) REFERENCES vagao (id_vagao);
ALTER TABLE viagemvagao ADD CONSTRAINT FKviagemvaga429978 FOREIGN KEY (cd_carga) REFERENCES carga (id_carga);
ALTER TABLE rota ADD CONSTRAINT FKrota934183 FOREIGN KEY (cd_estacaoorigem) REFERENCES estacao (id_estacao);
ALTER TABLE rota ADD CONSTRAINT FKrota579318 FOREIGN KEY (cd_estacaodestino) REFERENCES estacao (id_estacao);
ALTER TABLE funcionario ADD CONSTRAINT FKfuncionari560815 FOREIGN KEY (cd_tipofuncionario) REFERENCES tipofuncionario (id_tipofuncionario);
ALTER TABLE funcionario ADD CONSTRAINT FKfuncionari680980 FOREIGN KEY (cd_estacao) REFERENCES estacao (id_estacao);
ALTER TABLE funcionarioviagem ADD CONSTRAINT FKfuncionari853514 FOREIGN KEY (cd_funcionario) REFERENCES funcionario (id_funcionario);
ALTER TABLE funcionarioviagem ADD CONSTRAINT FKfuncionari444446 FOREIGN KEY (cd_viagem) REFERENCES viagem (id_viagem);
ALTER TABLE vagao ADD CONSTRAINT FKvagao327069 FOREIGN KEY (cd_tipovagao) REFERENCES tipovagao (id_tipovagao);
ALTER TABLE carga ADD CONSTRAINT FKcarga858886 FOREIGN KEY (cd_estacaoorigem) REFERENCES estacao (id_estacao);
ALTER TABLE carga ADD CONSTRAINT FKcarga654615 FOREIGN KEY (cd_estacaodestino) REFERENCES estacao (id_estacao);
ALTER TABLE contato ADD CONSTRAINT FKcontato84069 FOREIGN KEY (cd_cliente) REFERENCES cliente (id_cliente);
ALTER TABLE carga ADD CONSTRAINT FKcarga987407 FOREIGN KEY (cd_cliente) REFERENCES cliente (id_cliente);
ALTER TABLE manutencao ADD CONSTRAINT FKmanutencao963723 FOREIGN KEY (cd_locomotiva) REFERENCES locomotiva (id_locomotiva);
ALTER TABLE manutencao ADD CONSTRAINT FKmanutencao4100 FOREIGN KEY (cd_vagao) REFERENCES vagao (id_vagao);
ALTER TABLE manutencao ADD CONSTRAINT FKmanutencao192529 FOREIGN KEY (cd_ferrovia) REFERENCES rota (id_rota);
ALTER TABLE viagemrota ADD CONSTRAINT FKviagemrota253688 FOREIGN KEY (cd_rota) REFERENCES rota (id_rota);
ALTER TABLE viagemrota ADD CONSTRAINT FKviagemrota854197 FOREIGN KEY (cd_viagem) REFERENCES viagem (id_viagem);
ALTER TABLE viagemvagao ADD CONSTRAINT FKviagemvaga445439 FOREIGN KEY (cd_viagem) REFERENCES viagem (id_viagem);
