Spring Boot Category-Product CRUD API with Pagination

This Spring Boot application provides RESTful APIs for managing categories and products using JPA and Hibernate
with server-side pagination. Categories and products have a one-to-many relationship, where one category can contain multiple products. 
The application also supports CRUD operations for both entities.

#Technologies Used
    Spring Boot
    Spring Data JPA
    Hibernate
    MySQL (RDBMS)
    Java 17
    Maven
    REST API

#Prerequisites
    Java 17+ installed
    MySQL installed and running
    Maven installed

#Setup
Database Configuration
    Create a MySQL database named Jap67.
    Update your application.properties with your database credentials:

#properties
spring.datasource.url=jdbc:mysql://localhost:3306/Jap67
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

#Running the Application

#The application will start on http://localhost:8080.

#Category CRUD APIs
  #GET all categories (paginated)
    GET /api/categories?page={pageNumber}&size={pageSize}
    Example:
           GET "http://localhost:8080/api/categories?page=0&size=5"

 #POST - create a new category
   POST /api/categories
   Request body example:
     {
       "name": "Electronics"
     }

#GET category by ID
  GET /api/categories/{id}
  Example:
     GET "http://localhost:8080/api/categories/1"

#PUT - update category by ID
  PUT /api/categories/{id}
  PUT "http://localhost:8080/api/categories/1"
  Request body example:
    {
      "name": "Updated Category"
    }

#DELETE category by ID
   DELETE /api/categories/{id}
   Example:
      DELETE "http://localhost:8080/api/categories/1"

#Same All For products also

#The application returns appropriate error messages for invalid requests, 
such as:
    404 Not Found: When a category or product is not found.
    400 Bad Request: When the input data is invalid.

    
