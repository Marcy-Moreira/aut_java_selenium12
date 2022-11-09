## Automacao-java-selenium::
### Automação de testes funcionais

Documentação:

Este projeto de automação de testes foi desenvolvido na linguagem de programação Java com o framework selenium, usando a arquitetura pageObject, para rodar esse projeto e necessario seguir as instruções deste documento, os requisitos minimo será abordado adiante.

Dependências utilizadas;
* Selenium-java
* Junit4

### Pré-Requisito:

* Ter o java jdk 8 instalado e configurado na máquina
    * Para verificar se está instalado execute o seguinte comando no cmd:
    * javac -version

### Prepraração do ambiente:

* Faça a importação das dependências utilizando o gerenciador de dependências maven

### Execução do projeto:

IDE intellij:
* Para executar os testes você deverá rodar as classes dentro da pasta
  steps
  ou execute o comando
  mvn test
  na raiz do projeto.
***

IDE Visual Code:
* Execute o comando na raiz do projeto:
  mvn test
***

#### Organização do projeto:

Arquitetura do projeto.

* driver (Armazena o chromeDriver na <versão> do browser local)
* src
  /test/java/br.com.Automação_java_sellenium
    * pages (Class com os mapeamento dos elementos por pagina)
    * steps (Class para rodar os testes)
    * util (Class que inicia o Browser)


###### Autor:
Marcilene Batista
