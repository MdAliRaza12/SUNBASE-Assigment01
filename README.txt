Customer Management CRUD Application


Java Maven Spring Boot License: MIT

Overview
This project is a CRUD (Create, Read, Update, Delete) application for managing customer data. It provides a backend API built with Spring Boot, uses MySQL as the database, and incorporates JWT (JSON Web Token) authentication for secure user interactions.

Technologies Used
Framework: Spring Boot
Language: Java
Build Tool: Maven
Database: MySql
Authentication: JWT (JSON Web Token)
Model
Customer:
Admin:
JwtRequest: Represents a request object containing user credentials (e.g., username and password) sent to a server for the generation of a JSON Web Token (JWT).
JwtResponse: Represents a server response object containing a generated JWT and possibly other user-related information, returned to the client after a successful authentication request.
Key Features
Create a Customer The application allows users to create new customer profiles by providing essential information such as first name, last name, address details, email, and phone number.

Update a Customer Users can update existing customer records, modifying details like the customer's address, email, or phone number.

Get a List of Customers The application provides a paginated and sortable list of customers, enabling users to efficiently browse and manage a large volume of customer data. The search functionality allows users to find specific customers based on various criteria.

Get a Single Customer by ID Users can retrieve detailed information about a specific customer by providing the unique identifier (ID) associated with that customer.

Delete a Customer The application supports the deletion of customer records, ensuring the removal of outdated or irrelevant information.

Authentication with JWT Security To enhance security, the application implements JSON Web Token (JWT) authentication. Users must authenticate themselves using valid credentials, and subsequent requests to secured endpoints require the inclusion of a valid JWT token in the Authorization header.

Controller
In the "controller" package, there are two key classes: AuthController and CustomerController.

AuthController:

The AuthController is dedicated to user authentication. Upon successful login, this controller generates a JSON Web Token (JWT) to facilitate secure access to other APIs. This token, acting as a key, is subsequently used for authentication and authorization in subsequent requests, ensuring a secure and streamlined user experience.
CustomController:

The CustomerController is responsible for handling CRUD (Create, Read, Update, Delete) operations related to customer entities. It manages the core functionalities for customer-related data, allowing the application to perform essential operations seamlessly.

These controllers collectively contribute to a robust and organized structure, with AuthController addressing user authentication and token issuance, while CustomerController manages operations specific to customer-related data, promoting modularity and clarity in the overall design of the application.

Security
The security layer package consist of three class

JwtAuthenticationEntryPoint: Serves as an entry point for handling unauthorized access attempts, providing a custom response when users without valid authentication credentials try to access protected resources.

JwtAuthenticationFilter: Acts as a filter in the authentication process, intercepting incoming requests to validate and extract JWTs. It plays a crucial role in authenticating users based on the provided tokens and setting up the security context.

JwtHelper: A utility class likely designed to assist with common tasks related to JSON Web Tokens, such as token generation, parsing, and validation. It simplifies the handling of JWTs within the application's authentication and authorization processes.

Services
The Services layer implements the core business logic, data processing, and interaction with the data repository. Key responsibilities include:

Validating input data.
Performing CRUD operations on restaurant data.
Handling data transformations and interactions with external systems (if applicable).
User Service:
JWT Service:
Customer Service:
CustomUserDetailService:
Repository
The Repository layer manages data access to the underlying database. It handles database operations such as Create, Read, Update, and Delete (CRUD) for patient,doctor and token data etc. Additionally, it may include data mapping and conversion between Java objects and database entities.

Database
MySql database is used
Customer Class
The Customer class has the following attributes:

customerId (Type: Long): A unique identifier for each customer.
firstName (Type: String): The first name of the customer.
lastName (Type: String): The last name of the customer.
street (Type: String): The street information associated with the customer's address.
address (Type: String): The detailed address information of the customer.
city (Type: String): The city where the customer resides.
state (Type: String): The state or region where the customer is located.
email (Type: String): The email address of the customer.
phone (Type: String): The contact phone number of the customer.
Project Summary
The Customer Management CRUD Application is a comprehensive solution for efficiently managing customer data through Create, Read, Update, and Delete (CRUD) operations. This application utilizes a robust backend built with Spring Boot, employs MySQL as the database for data storage, and implements JSON Web Token (JWT) security to ensure secure user interactions.

Key Features:

Data validation to ensure data integrity.
Clean code separation with a layered architecture (Controller, Services, Repository).
Robust error handling for improved reliability.
Java-based backend and Maven for build management.
License
This project is licensed under the MIT License.

Acknowledgments

Thank you to the Spring Boot and Java communities for providing excellent tools and resources.