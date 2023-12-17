# Spring Boot JdbcTemplate with MySQL

## Prerequisites
* Java 17 ([Download here](https://www.oracle.com/java/technologies/downloads/#java17))
* IDE preferrably IntelliJ Idea Community Edition ([Download here](https://www.jetbrains.com/idea/download))
* Maven ([Download here](https://maven.apache.org/download.cgi))

## Spring Initializer 

Using Spring Boot initilizer website, we can generate our project template to start with

Visit https://start.spring.io/ 
  *  Choose **Maven** in Project & language as **Java**
  *  Choose any 3.x.x **version** under Spring Boot which is not a SNAPSHOT
  *  Under **group & artifcat**, enter your package & project name respectively
  *  Choose **packing** as **Jar**
  *  Add following dependencies by clicking **add dependencies** button
      * Spring Web
      * MySQL Driver
      * Spring Data JDBC
   
Once  done, click on **generate** button. Extract the generated zip file & open the folder in IntelliJ idea to get started

## Things discussed

* pom.xml is where the depencies are listed down
* To connect to database, we need atleast 3 properties - url, username & password. They have to be configured in application.properties file under src/main/resources folder

```
spring.datasource.url=jdbc:mysql://localhost:3306/book_catalogue
spring.datasource.username=root
spring.datasource.password=root
```
* POJO class contains private fields, getters & setters, constructor if needed
* POJO class which matching the columns in a Table is called entity
* We usually don't expose the Entity class to outside world directly. We use the DTOs (Data Transfer Object).
* Any object mentioned in **Has A** relationship, need not have object initialization. Instead in Spring Boot, we use the **@autowired** annotation

Queries we ran in MySQL

```sql
create database book_catalogue;

use book_catalogue;

create table book (id int auto_increment, name varchar(100), author varchar(100), primary key(id), created timestamp not null default current_timestamp);

insert into book (name, author) values ('ponniyin selvan', 'kalki'), ('alchemist', 'random author'), ('wings of fire', 'Dr. Kalam');
```
