# Web_Service_Basic_ProductionDocumentation

I.	 What I wanted to learn and achieve with this project

I wanted to create a Basic Server  with 4 methods (GET, PUT, POST, DELETE ) focusing on the Post Method that has behind a (Request and Response Model) that will provide the user to input a firstName, a lastName, an email and a password getting as a response a UserId, his firstName, lastName and email.
As a consequence of the user’s input on the first hand I wanted to store his password in the database (for this I used the path from UserRequest to UserResponse throw the DTO, UserEntity, UserServiceImpl, UserService interface and UserRepository making use of the Crud Repository). On the second hand I wanted the email to be unique for every new user that was provided from the Post method so I created a costume 500 error message to handle the duplicate entry’s using a method in the Service Repository that the Service Implementation Class used codding an if statement that will throw a new RuntimeException.

II.	 Dependencies
1) Spring Web
2) Spring Data JPA
3) PostgreSQL Driver


III.	 Future development
1) creating a generated User Public Id (the field in this application remained testUserId)
1) creating the other 3 methods
2) implementing security using SpringSecurity
3) adding XML and JsonSupport
