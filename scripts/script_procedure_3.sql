CREATE OR REPLACE PROCEDURE public.criar_log(descricao varchar(5000))
	LANGUAGE sql
AS $procedure$
	INSERT INTO log (tx_descricao) VALUES (descricao);
$procedure$
;
