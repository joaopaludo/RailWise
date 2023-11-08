<p float="left">
 <img src="./docs/img/railwise.jpg" width="285" />
</p>
Railwise é um sistema para o gerenciamento de linhas ferroviárias para o transporte de cargas.

<br>

### Repositório
* [docs](./docs): documentações do projeto, requisitos etc.
* [modelagem](./modelagem/): modelo relacional (visual paradigm)
* [scripts](./scripts/): scripts, selects, sql do projeto

<br>

### Funções
[Requisitos](./docs/requisitos.md)
1. Controle de tráfego:
>Permite ao usuário controlar em tempo real as linhas dos trens, onde o mesmo também faz cálculos em tempo real para evitar conflitos de vagões, maximizando assim a segurança e organização das linhas.

<br>

2. Agendar e planejar rotas:
>Esta funcionalidade é definida ao criar uma rota, onde se adiciona o local de partida e o destino, e, logo após a data e horário previsto para saída do trem, onde o sistema irá calcular a data e hora prevista de chegada e também irá demonstrar ao usuário a melhor rota a ser feita e se há possibilidade de conflitos com outros trens.

<br>

3. Gestão de vagões e locomotivas:
>Possibilita cadastrar e gerenciar novos vagões e trens, este cadastro é necessário para realizar uma contratação de carga, onde só se pode atribuir vagões e trens a rotas caso estes já estiverem cadastrados. Aqui também ocorre a vinculação dos trens as cargas, onde é definido que um determinado trem, efetuará o transporte de determinados vagões.

<br>

4. Gestão de carga:
>Ficam armazenados nesse local informações sobre as cargas que estão sendo ou serão transportadas, esta funcionalidade também controla o peso de cada vagão e a capacidade do trem, para que todos os limites de capacidade sejam respeitados.

<br>

5. Gestão de manutenção:
>Controla todas as manutenções que estão ocorrendo ou ocorrerão na ferrovia. Permite ao usuário agendar manutenções preventivas e controlar as linhas e os custos das manutenções.

<br>

6. Gestão de funcionários:
>Permite controlar quais funcionários trabalham em uma estação ou em um trem, e também definir as liberações que cada um vai ter dentro de sistema com base no cargo que o mesmo possui.

<br> <br>

### Tabelas:
[Representação visual das tabelas no modelo relacional](./docs/img/railwise_diagram.png)
* log
* estacao
* funcionario
* funcionarioviagem
* carga
* cliente
* contato
* tipofuncionario
* viagem
* viagemvagao
* rota
* locomotiva
* vagao
* tipovagao
* manutencao

<br>

### Autores:
* [Fabrício Tolotti](https://github.com/FabricioTolotti)
* [Gabriel Perico](https://github.com/GabrielPerico)
* [João Paulo Gregolon Paludo](https://github.com/joaopaludo)
* [Luiz Augusto Berti Dal Bello](https://github.com/LuizAugustoBertiDalBello)

<br>

>Disciplinas: Banco de dados II, Programação II e Engenharia de Software I

>Docente: Roberson Junior Fernandes Alves, Otília Donato Barbosa e Franciele Carla Petry