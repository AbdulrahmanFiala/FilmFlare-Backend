# FilmFlare-Backend

FilmFlare is a full-stack web application designed to be your ultimate movie hub. With FilmFlare, you can explore a vast collection of movies, watch trailers, read reviews, and write reviews of your favorite movies.

## Features

- **Comprehensive Movie Database**: Access a simple database of movies from various genres, eras, and languages.
- **Rich Media Content**: Watch high-quality trailers and view posters for each movie.
- **User Reviews**: Share your thoughts on movies and rate them based on your experience.
- **Preview Reviews**: Get a sneak peek into other users' reviews before watching a movie.
- **Responsive Design**: Enjoy a seamless browsing experience on any device.

## Installation

### Prerequisites
- Java Development Kit (JDK)
- Maven build tool installed
- MongoDB Compass

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/AbdulrahmanFiala/FilmFlare-BackEnd.git

2. Navigate to the project directory:
   ```bash
   cd "FilmFlare-BackEnd"

3. Switch to the development branch
   ```bash
   git checkout development

4. Open the database folder in the project root directory and export the collections using MongoDB Compass. Checkout MongoDB docs for importing data: [MongoDB Docs](https://www.mongodb.com/docs/compass/current/import-export/)

5. Move to the .env.example file location and change it to .env
   ```bash
   cd ./src/main/resources
   mv .env.example .env

6. Open the .env file and fill it with your database credentials.

7. Move back to the root directory of the project and run the project using Maven:
   ```bash
   cd ../../
   mvn spring-boot:run

## Usage
Once the application is running, you can access it in your web browser at:
[http://localhost:7000](http://localhost:7000)

For the frontend of the application, you can refer to the [FilmFlare-FrontEnd](https://github.com/AbdulrahmanFiala/FilmFlare-FrontEnd) repository.

