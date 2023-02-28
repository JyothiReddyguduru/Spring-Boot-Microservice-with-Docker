#####


Application to list a candidate job portfolio
Learning objectives
Enhancing a Spring Boot microservice
Hardening the microservice
Configuring security with JSON web tokens
Leveraging Docker for MySQL database access
Dockerizing your microservice

Requirements
Use maven aware IDE
spring boot application

dependencies 
spring boot starter for Tomcat

Spring Persistence : 
Spring boot starter Data JPA for entities - The Spring Data JPA module provides support for data access using the Java Persistence API (JPA).
@Entity is infact JPA interface , @Entity annotation defines that a class can be mapped to a table. nothing to do with spring annotation
Adding JPA requires that we add a datasource as well - spring tries to read for it 
- If you want an embedded database (H2, HSQL or Derby), please put it on the classpath.
- If you have database settings to be loaded from a particular profile you may need to activate it (no profiles are currently active).

To run the application without configuring above - we can use an annotation to postpone this.
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, XADataSourceAutoConfiguration.class})
or spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration 

Add mysql dependency in pom.xml to add driver to spring project
/usr/local/Cellar/mysql/8.0.21_1/bin/mysqld  Ver 8.0.21 for osx10.15 on x86_64 (Homebrew)

spring.datasource.url=jdbc:mysql://localhost:3306/job_portfolio?createDatabaseIfNotExist=true
use createDatabaseIfNotExist=true to create a DB on startup
to avoid recreating DB for each run add the following
spring.jpa.generate-ddl=true
spring.jpa.hibernate.ddl-auto=update

Also in Spring Boot 1, the default connection pool was Tomcat, but it has been changed to HikariCP with Spring Boot 2.

to see a web page in the browser:at port 8080 where tomcat is running 
Add a controller with mapping handlers
use @RestController
but need setters and getters to create objects

In latest spring 
@Repository
@Controller
@Service are all @component



dispatcherServlet



Hibernate
mapping between java objects and DB objects is provided


Spring profiles





Things to workon

automatic java imports
ordering of imports

