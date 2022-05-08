# Curso de Programação Orientada a Objetos
### O que é Orientação a Objetos(OO)?
- é um paradigma de análise, foca no "o que" a gente quer resolver, entender o problema a ser resolvido
- de projeto, colocar o mundo real no computacional, pegar a necessidade no mundo real e criar um modelo computacional
- Paradigma de programação de sistemas/softwares baseados na composição e interação entre diversos objetos.

-----

### Paradigma Estruturado vs Paradigma Orientado a Objetos
PE|POO|
-----|----|
Representação mais simplista| Representação mais realista|
Foca em operações(funções) e dados|Foca na modelagem de entidades e nas interações entre estas|
"como fazer"|"o que fazer"|
Não possui coletor de lixos | Possui coletor de lixos|
Acoplamentos mais rigidos | Acoplamentos mais flexiveis |
Mundo real e computacional mais distantes  | Mundo real e computacional mais proximos |
Muitas responsabilidades misturadas | Melhor coesão, Responsabilidades bem definicas, trabalham em conjunto|

-----

### >> Fundamentos

- **Abstração:**
  - Características Essenciais, Básicas de um determinado objeto, para ser considerado esse determinado objeto

- **Reuso:**
  - Reuso de outros códigos, criar outros códigos a partir de outro que já existe.

- **Encapsulamento:**
  - Encapsula/Esconde comportamentos
  - Camada de proteção de informação/dados

-----

### >> Conceitos que criam estrutura básicas da Orientação a Objetos
Apresentar os conceitos que criam as estruturas básicas da OO
Abstração

- **Classe:**
  - A base, o molde para a criação de objetos.
  - Abstrai comportamentos e caracteristicas similares do mundo real, para criar objetos.
  - Descreve os serviços fornecidos por seus objetos e quais informações eles podem armazenar.
  - Substantivo/Entidade

- **Atributo:**
  - Caracteristicas do Objeto
  - Adjetivos

Obs.: Atributo é próprio e peculiar a alguém ou a alguma coisa  é diferente de váriavel que está sujeito a variações ou mudanças, é inconstante e instável.

- **Método:**
  - Comportamentos/Serviçõs dos Objetos
  - Verbos/Ações
  - Assinatura: nome + parâmetros
  - Uso de sobrecarga para evitar muitos nome de métodos (Mudar a assinatura de acordo com a necessidade)

- **Construtores e Destrutores**
  - **Construtores:** Contruindo os objetos em mémoria, que vão ser instanciados.
  - **Destrutores:** Auxilia na destruição dos objetos, coletor de lixo.

- **Objeto:**
  - Representação de um conceito/entidade do mundo real
  - A classe é a parte estativa e o objeto "da vida", objeto faz as coisas realmente acontecerem
  - Atráves dos construtores, os objetos são instancias das classes. 

- **Mensagem:**
  - Chamando o método
  - Executando um coportamento do objeto

[Exemplo com a Estrutura Básica de OO](https://github.com/Brunarquino/curso-POO/tree/master/src/br/com/dio/estruturaB%C3%A1sicaOO)


-----

### >> Conceitos que ajudam a criar entidades a partir de outras entidades - Relacionamentos

Conceitos que ajudam a criar entidades a partir de outras entidades(Relacionamento entre Classes)

"Reuso de Códigos"

- **Herança:**
  - Uma classe filha/subclasse/subtipo que extend/herda de uma classe mãe/classe pai/classe base/super classe
  - Classe que deriva de outra classe
  - é subtipo de um determinado objeto
  - Tipos de heranças:
    - Simples: A classe filha tem só uma classe mãe
      -  Exemplo: Carro, Moto e Caminhão são subtipos de Veiculos
      - [Exemplo de Herança](https://github.com/Brunarquino/curso-POO/tree/master/src/br/com/dio/relacoes/exemploHeranca01)
      
    - Multipla: A classe filha tem uma ou mais classes mães (Não existe no java)
      -  Exemplo: Estagiario herda informações de Estudante e Funcionario
      
  - **Upcast e Downcast:** fazer um objeto se passar por outro
    - **Upcast:** subir os tipos, subir na sua hierarquia de classe, pega um gerente , vendedor ou faxineiro e transforma em um funcionário (Implicita)
    - **Downcast:** Descendo na hierarquia de classe, transformando funcionário em gerente, vendedor ou Faxineiro (Explicita)
    - [Exemplos de upcast e downcast](https://github.com/Brunarquino/curso-POO/tree/master/src/br/com/dio/relacoes/exemploHeranca02/upcastDowncast)
  
  - **Polimorfismo x Sobrescrita:**
    - Polimorfismo: "A mesma ação, se comportando diferente." -> tem que
    - Sobrescrita: "A mesma ação, podendo se comportar diferente. " -> pode
    - [Exemplos de Polimorfismo e Sobrescrita](https://github.com/Brunarquino/curso-POO/tree/master/src/br/com/dio/relacoes/exemploHeran%C3%A7a03/sobrescrita)
 
  

- **Associação:**
  - **Associação Estrutural de Compisição:** (Associação pela Estrutura)
    - "Com Parte Todo" -> Um depende do outro para existir
    - [Endereço e Pessoa tem uma relação forte, porque o endereço de uma pessoa que não existe, não é necessario mais](https://github.com/Brunarquino/curso-POO/blob/master/src/br/com/dio/relacoes/exemploAssociacao/Pessoa.java)
  
  - **Associação Estrutural de Agregação:** (Associação pela Estrutura)
    - "Sem Parte Todo" -> Um pode existir sem o outro
    - [Disciplina e Aluno tem uma relação fraca, porque o aluno pode fazer parte de outras disciplinas](https://github.com/Brunarquino/curso-POO/blob/master/src/br/com/dio/relacoes/exemploAssociacao/Disciplina.java)
  
  - **Associação Comportamental de Depêndencia:** (Associação pelo Comportamento)
    - Um dos seus métodos depende de uma outra classe
    - [Compra depende de Cupom](https://github.com/Brunarquino/curso-POO/blob/master/src/br/com/dio/relacoes/exemploAssociacao/Compra.java)

- **Herança x Associação:**
  - Associação: mais flexível, porque pode ser modificado durante a execução do programa. Se uma coisa **NÃO É** a outra, ai você vai **USAR** a outra.
  - Herança: mais rígida, uma coisa **É** a outra.

- **Interface:**
  - A classe que implementa uma interface, precisa realizar todos os comportamentos da interface
  - "Contrato" de utilização obrigatoria de determinados comportamentos
  - [Exemplo de Interface](https://github.com/Brunarquino/curso-POO/tree/master/src/br/com/dio/relacoes/exemplosInterface)

-----

### >> Conceitos de Organização

Conceitos de organização da OO e Encapsulamento

- **Pacotes:**
  - Separar classes com resposabilidades distintas
  - Com o objetivo de tornar a aplicação mais organizadas de acordo com suas finalidades e representatividade diferentes
  - Pacotes = pastas

- **Visibilidades:**
  - Modificador de acesso
  - Determinar quem pode acessar e usar os medtodos e atributos de uma classe
  - Utilizado para proteção de dados
  - Tipos:
    - Private: Só pode ser utilizado dentro da classe
    - Protected: Dentro da classe, do mesmo pacote e de suas subclasses
    - Public: Em qualquer lugar
 
 [Exemplo de Visibilidade](https://github.com/Brunarquino/curso-POO/tree/master/src/br/com/dio/organizacao)








