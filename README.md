# Message API 

REST API built with **Spring Boot**, **Spring Data JPA**, and
**PostgreSQL** to manage messages.
The project follows clean architecture principles, separating responsibilities into **Controllers**, **Services**, **Repositories**, and
**Entities**.

------------------------------------------------------------------------

# 📌 1. Architecture Overview

The application is structured using:

-   **Entities** → Map database tables\
-   **Repositories** → Database access operations\
-   **Services** → Business logic\
-   **Controllers** → HTTP request/response layer\

------------------------------------------------------------------------

# Entities (Models)

## Message

It represents the message.

Fields: - `id`, `text`

Mapping:

``` java
@Entity
@Table(name = "message")
```

------------------------------------------------------------------------

# Repositories

## MessageRepository

It contains a function to return a list of messages with a specific word.

### `List<Message> findByTextContaining(String word)`

------------------------------------------------------------------------

# Services

## MessageService

Contains the main ordering logic:

### `addMessage(Message message)` - Add a new Message
### `getById(Integer id)` - Get Message by Id
### `getAll()` - Get All Messages
### `getMessagesByWord(String word)` - Get a list of messages that contain a specific word.
### `updateMessage(Integer id, Message updatedMessage)` - Update messages.

------------------------------------------------------------------------

# Controllers

## MessageController

Routes: -
`GET /message` - `GET /message/{id}` - `GET /message/byword/{word}` - `PUT /message/{id}` -
`POST /message` -
`PUT /message/{id}`

------------------------------------------------------------------------

# application-\*.properties Files

### application-test.properties

Used only for tests.

Differences: - `server.port=8081` - Separate database\
- `spring.jpa.show-sql=true` - `ddl-auto=update`


### application.properties

Global configuration:

    spring.profiles.active=${APP_PROFILE:test}
    spring.jpa.open-in-view=false
    cors.origins=${CORS_ORIGINS:http://localhost:5173,...}

------------------------------------------------------------------------

# Main Annotations Used

  Annotation          Purpose
  ------------------- ------------------------
  `@Entity`           Maps class to table
  `@Id`               Primary key
  `@GeneratedValue`   Auto-increment
  `@Service`          Business logic
  `@Repository`       Database layer
  `@RestController`   REST controller
  `@GetMapping`       GET endpoint
  `@PostMapping`      POST endpoint
  `@PutMapping`       PUT endpoint
  
------------------------------------------------------------------------

# Technologies Used

-   Java 21+
-   Spring Boot
-   Spring Data JPA
-   PostgreSQL
-   Maven
