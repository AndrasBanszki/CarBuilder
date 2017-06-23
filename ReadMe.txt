Car Builder Web Application

A small car factory in China need your help.
You need to develope a web application, which will be help to follow the stock of the car parts.
Only need a sinle page application, which need to list the car parts and how much car you could build by type.

Functions need to be build:
1. - Show each car type and parts that need to be build one, and plus need to show how much we could produce of this car.

Database
1. car_type - what kind of cars we could build
2. part_storage - what kind of parts we have, and how much
3. car_part_connection - describe what parts need for the each car type

Columns of the database:
car_type - id, name, brand
part_storage - id, name, number
car_part_connection - id, part_storage_id, car_type_id

Technology good to know:
- JavaEE (Servlet, JSP)
- Server to run the web application (Wildfly, Tomcat, ...)
- JDBC
- Maven or Gradle for build tool
