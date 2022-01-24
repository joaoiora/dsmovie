# Movie Ratings

## Description

Monorepo for a web application using Java with Spring Boot and Spring Data on the backend, and React on the frontend.

The application consists of a simple MVP for rating movies. The rating requires an score and the reviewer's e-mail address.

If the reviewer has already reviewed a movie, the amount of reviews and the review average note will be recalculated on the backend, and the star rating will be updated as well on the frontend.

Developed as part of __Semana Spring React SDS 6.0__ by [DevSuperior](https://devsuperior.com.br/cursos).

## Backend Deploy

### Requirements
- Java SDK 11
- Apache Maven

Enter the **backend** folder and run `mvn clean install -U`.

To run the application, run either one of the commands below:
- `./mvnw spring-boot:run`
- Enter the `target` folder and run `java -jar dsmovie-0.0.1-SNAPSHOT.jar`

By default, the service will be served at: `http://localhost:8080/`. It uses the test profile, with H2 in-memory database.

Data will be loaded onto the database on startup using the [import.sql](https://github.com/joaoiora/dsmovie/blob/main/backend/src/main/resources/import.sql) script.

The H2 console is available at `http:/localhost:8080//h2-console`.

## Frontend Deploy

### Requirements
- NodeJS LTS v16.13.1 was used during development of the project
- To install Yarn, the command `npm install --global` was used.

#### Dependências utilizadas
- Bootstrap (`yarn add bootstrap@5.1.3`)
- React Router DOM (`yarn add react-router-dom@6.2.1 @types/react-router-dom@5.3.2`)
- Axios (`yarn add axios@0.24.0`)

Enter the **frontend** folder and run `yarn start`.

The application will be served on `http://localhost:3000`.
