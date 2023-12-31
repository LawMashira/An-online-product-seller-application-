An online-product-seller application 
When I say online-product-seller application, we can think of it like that we will have a product-list page. Somehow users or customers will see these product-lists and they can buy one of them. Of course, at the end of it, this purchase will be stored and displayed later.
This project was implemented using Spring Boot, ReactJS, and MySQL.
In the project, CRUD operations were implemented. These CRUD operations were for users and products. Users were used for sign-in, sign-up and authorization operations. And we will use the products for creating, editing, and deleting product operations.
The CRUD operations were requested from ReactJS.  On the backend, an infrastructure for these CRUD operations was created and, on the frontend, they served t with the user interface.
Our main operations were user login, register, product-list, create-product, delete-product etc.
Also, this is a role-based application so different roles like “Admin”, “User” were implemented. Then different authorizations were provided to these users according to the role.
And this all things will be provided with a secure way in both React and Spring Boot.
The project was implemented following the Model view controller architecture on our project.
Spring-security was one of the main issues to be implemented with the help of JWT to provide security.
In Spring Boot, Data is presented to the client as an API call so Spring Rest Controller was used to handle it.
TOOLS AND TECHNOLOGY
Spring boot
Database: MySQL 
Lombok library: is also used for getter and setters
Maven: To handle all dependencies on the server side
Java 11
IntelliJ IDEA
Hibernate
