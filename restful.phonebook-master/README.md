# Phone Book RESTful Web Service

An example implementation of a RESTful Web Service using Spring Boot, Java 7 and Swagger.

## How to interact with the phone book

The project uses SpringFox to create a human readable specification for the phone book's API. This is accomplished using a combination of SpringFox classes and Swagger annotations. To take a look at the phone book's API you can type `http://localhost:8080/swagger-ui.html` on your browser. There you will find a short description of the project and an overview of the operations you can execute, using the Phone Book Controller. These operations are:

* Search all contacts by name, surname or phone. In case that there are not search criteria, all contacts will be returned.
* Retrieve a single specific contact.
* Create a new (not indexed) contact.
* Create an indexed contact or update an old one.
* Delete a single specific contact.


