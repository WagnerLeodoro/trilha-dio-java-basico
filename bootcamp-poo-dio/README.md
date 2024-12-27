# Bootcamp POO DIO - Java Básico

Este repositório faz parte do Desafio de Projeto do Bootcamp da Digital Innovation One (DIO) e tem como foco principal a prática dos conceitos fundamentais de Programação Orientada a Objetos (POO) utilizando a linguagem Java.

## Objetivo do Projeto

O projeto visa consolidar o aprendizado de POO, promovendo a compreensão e a aplicação dos conceitos básicos e avançados dessa abordagem de programação, incluindo:

- **Encapsulamento**
- **Herança**
- **Polimorfismo**
- **Abstração**

## Tecnologias Utilizadas

- **Linguagem de programação:** Java 17
- **IDE:** IntelliJ IDEA (ou qualquer outra IDE de sua preferência)
- **Controle de versão:** Git e GitHub

## Conceitos de POO Aplicados

### 1. **Abstração**
- A abstração foi utilizada para modelar classes que representam conceitos do mundo real, como "Curso" e "Mentoria".
- A ideia central é capturar apenas as características essenciais para o contexto do projeto.

### 2. **Encapsulamento**
- Os atributos das classes foram definidos como **privados** e acessados através de métodos **getters** e **setters**, garantindo o controle e a segurança dos dados.

### 3. **Herança**
- Classes mais gerais (superclasses) foram criadas para representar conceitos comuns, enquanto classes mais específicas (subclasses) herdaram essas características.
- Exemplo: A classe "Conteúdo" é uma superclasse e é estendida por "Curso" e "Mentoria".

### 4. **Polimorfismo**
- O polimorfismo foi aplicado para permitir que objetos de diferentes classes (que compartilham uma mesma superclasse) possam ser tratados de forma uniforme.
- Exemplo: Uma lista de "Conteúdo" pode conter tanto objetos da classe "Curso" quanto da classe "Mentoria".

## Estrutura do Projeto

O projeto está organizado em pacotes que representam as diferentes responsabilidades do sistema:

```
src/
|-- dominio/
|   |-- Bootcamp.java
|   |-- Conteudo.java
|   |-- Dev.java
|   |-- Curso.java
|   |-- Mentoria.java
|
|-- Main.java
```

### Descrição das Classes

- **Conteudo.java:** Classe abstrata que define os atributos e métodos comuns a todos os conteúdos.
- **Curso.java:** Classe que representa um curso, contendo atributos como "título", "descrição" e "carga horária".
- **Mentoria.java:** Classe que representa uma mentoria, com atributos como "data" e "descrição".
- **Dev.java:** Classe que representa um desenvolvedor inscrito em um bootcamp, contendo atributos como "nome", "conteúdos inscritos" e "conteúdos concluídos".
- **Bootcamp.java:** Classe que representa um bootcamp, contendo atributos como "nome", "descrição", "lista de conteúdos" e "desenvolvedores inscritos".
- **Main.java:** Classe principal que demonstra a criação e manipulação dos objetos do projeto.

## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/WagnerLeodoro/trilha-dio-java-basico.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd trilha-dio-java-basico/bootcamp-poo-dio
   ```
3. Importe o projeto em sua IDE favorita.
4. Execute a classe `Main` para visualizar os resultados no console.

## Aprendizados

Durante a implementação deste projeto, foram consolidados os seguintes conhecimentos:

- Criação e manipulação de classes e objetos em Java.
- Uso de herança para reaproveitamento de código.
- Aplicar polimorfismo para tratar diferentes objetos de forma uniforme.
- Implementação de encapsulamento para proteger os dados e melhorar a manutenção do sistema.
- Utilização de abstração para modelar classes mais genéricas e reutilizáveis.

