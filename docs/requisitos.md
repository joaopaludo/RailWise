### Requisitos Funcionais
1. Controle de tráfego <br>
RF01 - O sistema deve fornecer quanto tempo em média uma dada locomotiva leva para percorrer uma rota. <br>
RF02 - O sistema deve guardar quais rotas foram percorridas por cada locomotiva e quando. <br>

<br>

2. Agendar e planejar rotas / viagens <br>
RF03 - Mapa das rotas: O sistema deve ser capaz de armazenar todas as rotas existentes, que conectam diferentes estações. <br>
RF04 - O sistema deve calcular e disponibilizar a distância total de uma rota específica, considerando todas as estações e conexões envolvidas. <br>
RF05 - Agendar rotas que acontecerão: O sistema deve permitir o agendamento de viagens. <br>
RF06 - Quantidade mínima de carga para viagem viável: O sistema deve determinar a quantidade mínima de carga necessária para que uma viagem seja considerada viável, garantindo a eficiência logística e evitando viagens com pouca carga. <br>
RF07 - A relação de viagens deve incluir informações essenciais, como a origem e o destino da viagem, indicando os locais envolvidos. Além disso, deve conter a data e o horário agendados para cada viagem, permitindo um controle adequado do cronograma de transporte. <br>

<br>

3. Gestão de vagões e locomotivas <br>
RF08 - Formação de trens: o sistema deve controlar quais vagões e locomotivas vão para cada viagem <br>
RF09 - O sistema deve permitir cadastrar os [tipos de vagões](./tipos_vagoes.md). <br>
RF10 - Deve permitir alocar vagões para viagens específicas -> adicionar código da estação na tabela vagao. E um atributo status para o vagao. <br>
RF11 - Deve permitir controlar os vagões vazios que não estão sendo utilizados e estão parados nas estações/pátios. <br>
RF12 - Atribuir locomotivas a viagens específicas -> adicionar código da estação na tabela locomotiva. E um atributo status para a locomotiva. <br>
RF13 - O sistema deve possibilitar manter e atualizar informações relativas às capacidades e atributos das locomotivas, como potência e força. <br>
RF14 - O sistema deve fornecer a data de fabricação da locomotiva. <br>

<br>

4. Gestão de carga <br>
RF15 - Deve registrar informações sobre os tipos de carga transportados. <br>
RF16 - O sistema deve monitorar o peso da carga em cada vagão e locomotiva para garantir que os limites de capacidade sejam respeitados. <br>
RF17 - O sistema deve ter as informações sobre a origem e destino de uma carga em termos do transporte ferroviário. <br>

<br>

5. Gestão de manutenção <br>
RF18 - Deve gerenciar manutenções que foram ou serão realizadas. <br>
RF19 - Deve permitir agendar manutenções preventivas. <br>
RF20 - O sistema deve guardar informações sobre o que foi feito em uma manutenção e o custo da mesma. <br>

<br>

6. Gestão de funcionários <br>
RF21 - O sistema deve permitir gerir quais funcionários trabalham em uma estação ou foram / irão em uma viagem. <br>
RF22 - Deve ser possível determinar o cargo ou função dos funcionários. <br>

<br>

7. Gestão de problemas <br>
RF23 - Gravar o relatório de problemas ou empecilhos que possam acontecer na viagem, como problemas climáticos, com a via etc. <br>
