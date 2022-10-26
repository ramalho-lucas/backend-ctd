# Modulo 1: Design Paterns

LINKS:
- UML: https://www.devmedia.com.br/modelagem-de-software-com-uml/20140
- UML: https://www.devmedia.com.br/o-que-e-uml-e-diagramas-de-caso-de-uso-introducao-pratica-a-uml/23408


## Aula 01

### O que é Backend?
São como o nome diz os bastidores, ou seja, o servidor e o banco de dados que 
ajudam a fornecer informações a partir de uma interface.

O backend deve ser capaz de ter uma camada de servico para que o frontedn possa
consumi-la, e assim, ser capaz de fazer solicitações.

### Testes Unitarios


Anotações:
- @AfterEach: Executa um metodo após da execução de cada teste.

- @ParameterizedTest: Permite executar o teste, com varios argumentos. Pode pegar
parametros de diferentes fontes, como um metodo, valores, um arquivo csv.

- @AfterAll: Executa um metodo após da execução de todos teste.

- @BeforeEach: Executa um metodo antes da execução de cada teste.

- @Test: Anotação que indica para o Junit que se trata de um teste e o execute

- @BeforeAll: Executa um metodo antes da execução de todos teste.

- @Disable: Desabilita um teste para qye ele nao seja executado

Os teste unitarios tem como objetivo pegar uma pequena parte do software, isolando-a
do resto do código, para determinar se ele se comporta / funciona conforme esperado.

Cada unidade é testada separadamente antes de ser integrada aos componentes para
testar as interfaces entre as unidades.

ARRANGE(Preparar o teste) : define os requisitos que o codigo deve atender
ACT(Rodar o teste) : aqui é executado o teste que dara origem ais resultados
que iremos analisar
ASSERT(Verifica as asserções) : comprova se os resultados obtidos sao os esperados


Vantagens dos Testes unitários:
- Facilitar as mudancas de código
- Encontrar bugs
- Fornecem documentação
- Melhoram o design e a qualidade do código

Teste de integração

As unidades individuais sao integradas oara formar componentes maiores, por exemplo,
duas unidades que ja foram testadas sao combinadas em um componente integrado e a interface
entre elas é testada. Isso nos permite cobrir uma area maior do código, sobre o qual as
vezes nao temos controle.


PRINCIPIO FIRST
São as 5 caracteristicas que devem ter para serem considerados testes de qualidade

- F: Fast
- I: Isolated/independent
- R: Repeatable
- S: Self-Validating
- T: Thorough

JUNIT

Utilizamos o Junit que é a forma de testar nosso código.
È o framework open source de testing para Java mais utilizado. 
Ele nos permite escrever e executar testes automatizados. 


TESTE PARAMETRIZADO 

Em nossos testes, várias verificações são realizadas simplesmente para testar casos diferentes.
Isso nos leva a repetir o código.

Para Construir testes parametrizados, o JUnit utiliza um custom runner que é
o Parametrized.

Este nos permite definir os parametros de variaveis execuções de um unico teste.

A anotação @Parameters indica qual é o método que retornara o conjunto de parametros a serem usados
pelo runner.

O que precisamos é de um construtor que permita ser inicializado com os objetos que temos
em cada elemento da coleção. Finalmente, o teste será executado usando os dados que coletamos no 
construtor.

TESTE SUITE

JUnit Test Suite nos permite agrupar e executar os teste em grupo. As suites de testes
podem ser criadas e executadas com essas anotações

- @RunWith
- @SuiteClasses


TDD - Test Diven Development

Com TDD utilizamos testes para orientar ou direcionar a maneira como escervemos
nosso código. Normalmente, o fluxo de trabalho é descrito como Red - Green - Refactor

- RED : 
  - Durante esta fase, escrevemos os casos de teste de lógica de negócios
  - Usamos a premissa: "Um novo caso de teste no inicio sempre falhará"
    
- GREEN:
    - Durante esta fase, vamos fazer ou modificar o código simplesmente para
    fazer o teste funcionar
      
- REFACTOR:
    - Nesta fase, vamos modificar o código e nosso teste para torná-lo mais eficiente


## Aula 02

### Template Method Pattern

Abstrair todo comportamento compartilhado pelas entidades em uma classe abstrata, a partir da qual
todas essas entidades são extendidas.

PROPOSITO:
- É um design patern comportamental que define um esqueleto de um algoritimo na superclasse,
mas permite que as subclasses sobrescrevam etapas do algoritmo sem alterar sua estrutura.
  
SOLUÇÃO:
- O método esqueleto é composto pelo código que essas classes tem em comum, permitindo que
algumas partes sejam modificadas pela subclasse que o implementa, conseguindo manter o 
  código repetido em um só lugar.
  

## Aula 04

### Chain of Responsibility pattern

Padrão da corrente de responsabilidade, padrão comportamental que permite estabelecer uma
corrente entre objetos atraves da qual eh passada uma solicitação, feita por um objeto emissor
que não sabe qual é o objeto que poderá responder a ela, dessa forma os objetos
receptores passarao essa informação ate qual algum deles saiba como respondê-la.

Composto por uma classe controladora: Classe Handler, que recebe as solicitações do
cliente, inicia a corrente e define como o cliente se comunicará com ela, as subclasses
que participam da corrente processam a informação do cliente de acordo com o critério
pré-estabelecido.

PROPOSITO:
- É um design patterm comportamental que permite que as solicitações passem por uma
corrente de manipuladores. Ao receber uma solicitação, cada um deles decide se vai
  processa-la ou repassa-la ao próximo manipulador.
  
SOLUÇÃO:
- Criar uma corrente com as classes manipuladoras para processar a solicitação de um
cliente. Cada uma possui um campo para armazenar uma referencia ao próximo manipulador
  na corrente. A solicitação viaja até que todos os manipuladores tenham a chance de
  processá-la (Os manipuladores podem decidir não aprovar a solicitação e interromper
  o procedimento)


## Aula 05

### Proxy Patern

É um padrão do tipo estrutural. Cumpre a função de ser um intermediário que adiciona
a funcionalidade a uma classe sem modificá-la.

PROPOSITO:
- Seu ibjetivo é desenvolver a funcao de ser um intermediario que agrega funcionalidade
a uma classe sem tocar nela.
  
SOLUÇÃO:
- Definir uma classe proxy com a mesma interface do objeto de servico original. Posteriormente
nosso aplicativo deve ser atualizado para que os clientes se comuniquem com o proxy e não com o
  serviço de destino. Ao receber um pedido de um cliente, o proxy ira encaminha-lo para
  o servico, mais como intermediário poderemos realizar operacoes antes ou depois de direcionar
  a solicitação.
  
