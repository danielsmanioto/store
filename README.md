Monolitic Java 14 application
for simulate a litle store.

this projecs is only a monolitic system to registers and mantain all data 

# Tecnologies
<ul>
    <li>Spring/Spring boot/Spring security</li>
    <li>Java14</li>
    <li>Monolitic application</li>
    <li>Thymeleaf </li>
    <li>MySQL Database</li>
    <li>Bycrpt </li>
</ul>


# Enviroments 

local : jar / tomcat + h2 database
development : jar / tomcat + docker with mysql
homolog: java / tomvcat local + mysql aws 
production(application.properties): heroku tomcat + mysql hostgator  

# LOCAL ENVIROMENT 

5. `./mvmw clean install`
6. `java -jar -Dspring.profiles.active=local target/registrations-0.0.1-SNAPSHOT.jar`

# DEV ENVIROMENT 

1. Install Java14
2. Up docker compose image in devops foulder.
`docker-compose up --build`
3. go to mysql db and create database 
4. go to mysql db and execute data.sql for insert all data  
5. `./mvmw clean install`
6. `java -jar -Dspring.profiles.active=development target/registrations-0.0.1-SNAPSHOT.jar`


# HOMOLOG ENVIROMENT 

5. `./mvmw clean install`
6. `java -jar -Dspring.profiles.active=homolog target/registrations-0.0.1-SNAPSHOT.jar`

# Using

1. Home and first test
http://localhost:8080/home

user: daniel
password: 123 

2. Product 

http://localhost:8080/products/signup
http://localhost:8080/products/list


# CI & CD

https://travis-ci.com/

# References

https://spring.io/guides/gs/accessing-data-mysql/
https://www.appsdeveloperblog.com/spring-security-default-username-password-role/#:~:text=Add%20Spring%20Security&text=The%20default%20username%20is%3A%20user,Spring%20Boot%20project%20is%20starting.
https://www.javaguides.net/2019/04/spring-boot-thymeleaf-crud-example-tutorial.html
https://github.com/RameshMF/springboot-thymeleaf-crud-tutorial
