FROM maven:3.6.3-openjdk-11

WORKDIR /gateway-service

COPY . .

RUN mvn package

EXPOSE 8080

CMD ["mvn", "spring-boot:run"]