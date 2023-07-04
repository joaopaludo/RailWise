### Requisitos Funcionais e NÃO funcionais
OBS: 
RF > Requisito Funcional
RNF > Requisito Não Funcional

1. Controle de tráfego <br>
RF-01 - O sistema deve fornecer quanto tempo em média uma dada locomotiva leva para percorrer uma rota. <br>
RF-02 - O sistema deve guardar quais rotas foram percorridas por cada locomotiva e quando. <br>

<br>

2. Agendar e planejar rotas / viagens <br>
RF-03 - Mapa das rotas: O sistema deve ser capaz de armazenar todas as rotas existentes, que conectam diferentes estações. <br>
RF-04 - O sistema deve calcular e disponibilizar a distância total de uma rota específica, considerando todas as estações e conexões envolvidas. <br>
RF-05 - Agendar rotas que acontecerão: O sistema deve permitir o agendamento de viagens. <br>
RNF-06 - Quantidade mínima de carga para viagem viável: O sistema deve determinar a quantidade mínima de carga necessária para que uma viagem seja considerada viável, garantindo a eficiência logística e evitando viagens com pouca carga. <br>
RF-07 - A relação de viagens deve incluir informações essenciais, como a origem e o destino da viagem, indicando os locais envolvidos. Além disso, deve conter a data e o horário agendados para cada viagem, permitindo um controle adequado do cronograma de transporte. <br>

<br>

3. Gestão de vagões e locomotivas <br>
RF-08 - Formação de trens: o sistema deve controlar quais vagões e locomotivas vão para cada viagem <br>
RF-09 - O sistema deve permitir cadastrar os [tipos de vagões](./tipos_vagoes.md). <br>
RF-10 - Deve permitir alocar vagões para viagens específicas -> adicionar código da estação na tabela vagao. E um atributo status para o vagao. <br>
RF-11 - Deve permitir controlar os vagões vazios que não estão sendo utilizados e estão parados nas estações/pátios. <br>
RF-12 - Atribuir locomotivas a viagens específicas <br>
RF-13 - O sistema deve possibilitar manter e atualizar informações relativas às capacidades e atributos das locomotivas, como potência e força. <br>
RF-14 - O sistema deve fornecer a data de fabricação da locomotiva. <br>

<br>

4. Gestão de carga <br>
RF-15 - Deve registrar informações sobre os tipos de carga transportados. <br>
RF-16 - O sistema deve monitorar o peso da carga em cada vagão e locomotiva para garantir que os limites de capacidade sejam respeitados. <br>
RF-17 - O sistema deve ter as informações sobre a origem e destino de uma carga em termos do transporte ferroviário. <br>

<br>

5. Gestão de manutenção <br>
RF-18 - Deve gerenciar manutenções que foram ou serão realizadas. <br>
RF-19 - Deve permitir agendar manutenções preventivas. <br>
RF-20 - O sistema deve guardar informações sobre o que foi feito em uma manutenção e o custo da mesma. <br>

<br>

6. Gestão de funcionários <br>
RF-21 - O sistema deve permitir gerir quais funcionários trabalham em uma estação ou foram / irão em uma viagem. <br>
RF-22 - Deve ser possível determinar o cargo ou função dos funcionários. <br>

<br>

RNF-24 - Deve funcionar em aplicativo Mobile / Web.
