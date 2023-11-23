classDiagram
    class Locomotiva {
        - int id
        - string modelo
        - int potencia
        - int forca
        - string dataFabricacao
    }
    
    class Rota {
        - int id
        - string origem
        - string destino
        - int distanciaTotal
    }
    
    class Viagem {
        - int id
        - int idRota
        - int idLocomotiva
        - string dataHora
        - int quantidadeCarga
    }
    
    class Vagao {
        - int id
        - int idTipoVagao
        - string status
    }
    
    class Carga {
        - int id
        - string tipo
        - string origem
        - string destino
        - int idViagem
        - int peso
    }
    
    class Manutencao {
        - int id
        - string descricao
        - string data
        - float custo
    }
    
    class Funcionario {
        - int id
        - string nome
        - string cargo
        - int idEstacao
    }
    
    class Estacao {
        - int id
        - string nome
        - string localizacao
    }
    
    class Aplicativo {
        - int id
        - string plataforma
        - string funcionalidades
    }
    
    Locomotiva "1" --* "1..*" Viagem
    Rota "1" --* "1..*" Viagem
    Viagem "1..*" --* "1..*" Vagao
    Viagem "1" --* "0..*" Carga
    Viagem "1" --* "1" Manutencao
    Funcionario "0..*" --* "1..*" Estacao
    Aplicativo "1" --* "1..*" Funcionalidades
