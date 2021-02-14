"#inventory" 
## **Create New Database**

```
CREATE DATABASE restapi;
USE restapi;
```

## Run Spring Boot application

```
mvn spring-boot:run
```

## Interact with API using Postman

1. #### Create New User

   ```
   Example:
   
   POST  localhost:8080/user
   
   Body raw JSON
   {
       "id": 1,
       "username" : "arindawarda47",
       "password" : "123qwerty",
       "fullname" : "Arinda Kusuma Wardani"
   }
   
   ->Send
   ```

2. #### Create New User Success

   ```
   response:
   
   {
       "id": 1,
       "username": "arindawarda47",
       "password": "123qwerty",
       "fullname": "Arinda Kusuma Wardani"
   }
   ```

3. #### Authenticate User Credentials

   ```
   POST http://localhost:8081/authenticate
   
   Body raw JSON
   
   {
       "username" : "arindawardani@gmail.com",
       "password" : "123qwerty"
   }
   
   ->Send
   ```

   

4. #### Authenticate User Credentials Success, You Get Token

   ```
   {
       "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhcmluZGF3YXJkYW5pQGdtYWlsLmNvbSIsImV4cCI6MTYxMzI1MDE3MSwiaWF0IjoxNjEzMjMyMTcxfQ.0LpIJBu9TByCtP988zOwUoSN5V90Zsm5sRM1ZFr5L6jEk2aHZoDqU0V-kWc7bp1vHIB9tqLW7peNf637weFyrw"
   }
   ```

   

5. #### Create New Unit Request Body

   ```
   POST http://localhost:8080/units
   
   Body raw JSON
   
   {
       "code" : "kg",
       "description" : "Kilogram"
   }
   
   Headers
   key Content-Type				value application/json
   key Authorization				value Bearer token
   
   ->Send
   ```

6. #### Create New Unit Request Body Success

   ```
   {
       "code": 200,
       "message": null,
       "data": {
           "id": 1,
           "code": "pcs",
           "description": "Pieces"
       },
       "timestamp": "2021-02-15T05:20:18.1170779"
   }
   ```

   

7. #### Create New Item

   ```
   POST localhost:8080/items
   
   Body raw JSON
   
   {
       "name" : "Tepung",
       "price" : 7000,
       "unitId" : 1
   }
   
   Headers
   key Content-Type				value application/json
   key Authorization				value Bearer token
   
   ->Send
   ```

   

8. #### Create New Stock

   ```
   POST localhost:8080/stocks
   
   Body raw JSON
   
   {
       "itemId" : 1,
       "quantity" : 20
   }
   
   Headers
   key Content-Type				value application/json
   key Authorization				value Bearer token
   
   ->Send
   ```

   

9. #### Create New Transaction

   ```
   POST localhost:8080/transactions
   
   Body raw JSON
   
   {
       "itemId" : 1,
       "userId" : 1,
       "stockId" : 1,
       "quantity" : 1
   }
   
   Headers
   key Content-Type				value application/json
   key Authorization				value Bearer token
   
   ->Send
   ```

   

10. #### You Can Run Testing in Package 'test'

    

"# project-inventory" 
