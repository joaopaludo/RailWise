
-- usuários

create user joaop with login password 'h*XQynY8m';

create user gabriel with login password 'f}ZQvnr6K';

create user luis with login password 'bzr*V2Hvg';

create user fabricio with login password 'km5]r2SPG';


create user default_user with login password '_user_psswrd_railwise_1';


create user manager_user with login password '_railwise_management_psswrd_$0';



-- grupo administrador

create group administrador with superuser;

grant all
on carga, cliente, contato, estacao, funcionario, funcionarioviagem, locomotiva, log,
   manutencao, rota, tipofuncionario, tipovagao, vagao, viagem, viagemrota, viagemvagao
to administrador;


grant administrador to joaop;
grant administrador to gabriel;
grant administrador to luis;
grant administrador to fabricio;



-- grupo usuário básico

create group usuario_basico;

grant insert, update, select
on carga, cliente, contato, funcionarioviagem, manutencao, rota, viagem, viagemrota, viagemvagao
to usuario_basico


grant usuario_basico to default_user;



-- grupo gerente

create group gerente;

grant insert, update, select, delete
on carga, cliente, contato, estacao, funcionario, funcionarioviagem, locomotiva, manutencao,
   rota, tipofuncionario, tipovagao, vagao, viagem, viagemrota, viagemvagao
to gerente;


grant gerente to manager_user;
