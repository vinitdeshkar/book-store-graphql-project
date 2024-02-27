# book-store-graphql-project
A GraphQL Service for serving book stores data

## Getting Started
1. Run to install dependencies: `mvn clean install`

2. Run the project in IDE to start spring boot app.

3. Login to H2 database using [link](http://localhost:8080/h2-console/login.jsp)
   Username : sa
   Password: No password needed
   JDBC Url: jdbc:h2:mem:test
   Click on test connection and then click on connect.
4. The default graphQL endpoint is localhost:8080/graphql

5. Try running sample graphQL query like below in Postman 
   URL - http://localhost:8080/graphql
   Method - POST
   Add the below query in Request body and select graphQL as type in Request body section of postman.
```
query {
    allBooks {
        id
        title
        desc
        price
    }
}
```
