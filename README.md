## Study Week Web

Este projeto é da semana de estudo. Acompanhado com o [Cleverson](https://github.com/clevsampaio)

### Objetivo: 
Para teste de fluxo de comprar até no final de pedido.


### Tecnologias utilizadas:

- [Maven 3](http://maven.apache.org/download.cgi)
- [Java 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html),
- [TestNG 7.3.0](https://mvnrepository.com/artifact/org.testng/testng/7.3.0),
- [Selenium Java 3.141.59](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59),
- [WebDriverManager 4.3.1](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/4.3.1),
- [ExtentReports 4.0.9](https://mvnrepository.com/artifact/com.aventstack/extentreports/4.0.9),
- [ExtentReports TestNG Adapter 1.0.3](https://mvnrepository.com/artifact/com.aventstack/extentreports-testng-adapter/1.0.3),
- [Java Faker 1.0.2](https://mvnrepository.com/artifact/com.github.javafaker/javafaker/1.0.2),
---

### Como executar o projeto?

Este projeto foi feito no IntelliJ, porém, pode ser usar a IDE sua preferência para executar.

- **Executar na sua máquina local:** 

Utilizar terminal o comando `mvn test` ou na sua IDE. 

- **Executar com browser de firefox:** 
  
Abrir sua IDE e procurar a pasta de main > utils > classe: BaseTest `@BeforeMethod` tem um método de `setUp` e modificar para `BrowserEnum.FIREFOX`.

- **Suites:**

Abrir sua IDE e procurar a pasta de test > reources > suites > AllTest.xml, clique com a botão direito do mouse > Run.

- **Executar via CMD**

Para executar o projeto via comando, é primeiro ter o Maven instalado e configurado na sua máquina.
[Como instalar o maven no windows](https://dicasdejava.com.br/como-instalar-o-maven-no-windows/).

Foi feito? Abra dentro da pasta do projeto, abrir o CMD e digite o comando: `mvn test`

---

## Report

Visualizar o report apos de executou, abra a pasta de report > report.html, clique com a botão direito do mouse > Open in > Browser > escolher a browser da sua perferencia.
