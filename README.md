# Santander Dev Week 2024 - Backend Java

Este projeto é uma aplicação de backend desenvolvida em Java utilizando Spring Boot, com o propósito de gerenciar usuários e suas contas bancárias. A aplicação utiliza um banco de dados em memória H2 e oferece operações CRUD para a entidade `User`.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.3.1
- Spring Data JPA
- H2 Database
- Gradle
- Springdoc OpenAPI

## Requisitos

- JDK 17 ou superior
- Gradle 7 ou superior



# dev-api-santander-week-2024


## Diagrama de Classes

```mermaid
classDiagram
    class User {
        +String name
        +Account account
        +Feature[] features
        +Card card
        +News[] news
    }

    class Account {
        +String number
        +String agency
        +double balance
        +double limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +double limit
    }

    class News {
        +String icon
        +String description
    }

    User --> Account
    User --> Feature
    User --> Card
    User --> News
