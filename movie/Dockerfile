FROM eclipse-temurin:17

LABEL maintainer="javaguides.net@gmail.com"

WORKDIR /movie

COPY target/movie.jar /movie/movie.jar

ENTRYPOINT ["java", "-jar", "movie.jar"]
