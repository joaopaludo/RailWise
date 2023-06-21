### Requisitos Funcionais
1. Controle de tráfego
RF01 - O sistema deve fornecer quanto tempo em média uma dada locomotiva leva para percorrer uma rota.
RF02 - O sistema deve guardar quais rotas foram percorridas por cada locomotiva e quando.

<br>

2. Agendar e planejar rotas / viagens
RF03 - Mapa das rotas: O sistema deve ser capaz de armazenar todas as rotas existentes, que conectam diferentes estações.
RF04 - O sistema deve calcular e disponibilizar a distância total de uma rota específica, considerando todas as estações e conexões envolvidas.
RF05 - Agendar rotas que acontecerão: O sistema deve permitir o agendamento de viagens.
RF06 - Quantidade mínima de carga para viagem viável: O sistema deve determinar a quantidade mínima de carga necessária para que uma viagem seja considerada viável, garantindo a eficiência logística e evitando viagens com pouca carga.
RF07 - A relação de viagens deve incluir informações essenciais, como a origem e o destino da viagem, indicando os locais envolvidos. Além disso, deve conter a data e o horário agendados para cada viagem, permitindo um controle adequado do cronograma de transporte.

<br>

3. Gestão de vagões e locomotivas
RF08 - Formação de trens: o sistema deve controlar quais vagões e locomotivas vão para cada viagem
RF09 - O sistema deve permitir cadastrar os [tipos de vagões](./tipos_vagoes.md).
RF10 - Deve permitir alocar vagões para viagens específicas -> adicionar código da estação na tabela vagao. E um atributo status para o vagao
RF11 - Deve permitir controlar os vagões vazios que não estão sendo utilizados e estão parados nas estações/pátios.
RF12 - Atribuir locomotivas a viagens específicas -> adicionar código da estação na tabela locomotiva. E um atributo status para a locomotiva
RF13 - O sistema deve possibilitar manter e atualizar informações relativas às capacidades e atributos das locomotivas, como potência e força.
RF14 - O sistema deve fornecer a data de fabricação da locomotiva.

<br>

4. Gestão de carga
RF15 - Deve registrar informações sobre os tipos de carga transportados.
RF16 - O sistema deve monitorar o peso da carga em cada vagão e locomotiva para garantir que os limites de capacidade sejam respeitados.
RF17 - O sistema deve ter as informações sobre a origem e destino de uma carga em termos do transporte ferroviário.

<br>

5. Gestão de manutenção
RF18 - Deve gerenciar manutenções que foram ou serão realizadas. 
RF19 - Deve permitir agendar manutenções preventivas.
RF20 - O sistema deve guardar informações sobre o que foi feito em uma manutenção e o custo da mesma.

<br>

6. Gestão de funcionários
RF21 - O sistema deve permitir gerir quais funcionários trabalham em uma estação ou foram / irão em uma viagem.
RF22 - Deve ser possível determinar o cargo ou função dos funcionários.

<br>

7. Gestão de problemas
RF23 - Gravar o relatório de problemas ou empecilhos que possam acontecer na viagem, como problemas climáticos, com a via etc.
