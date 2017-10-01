# Employee Inventory Spring boot app MongoDB#

Angular runs on port --6070 configured in .angular-cli.json

Spring Boot based implementation of a minimalist Employee inventory app to represent a possible module architecture.
This app offers basic CRUD functionality and some search functionality for handling employees via employee id.
The employee entities are persisted in an underlying MongoDB for the sake of simplicity.

### Create a employee
POST http://localhost:6060/api/employees
payload:
{ "author":"Tamas Lang","title":"Spring app architecture","isbn":null }
response:
201 Created with header: Location : http://localhost:6060/api/books/isbn1001

### Get a book by id (isbn)
GET http://localhost:6060/api/books/isbn1001
response:
{ "author":"Tamas Lang","title":"Spring app architecture","isbn":null }

### Get all books
GET http://localhost:6060/api/books
response:
[{ "author":"William Shakespeare","title":"Hamlet","isbn":null },
 { "author":"Paolo Giordani","title":"La solitudine dei numeri primi","isbn":null }]

### Update a book
PUT http://localhost:6060/api/books/isbn1001
payload:
{ "author":"Tamas Lang","title":"Spring app architecture","isbn":"isbn1001" }
response:
200 OK

### Get by author
GET http://localhost:6060/api/books?author=William
response:
[{ "author":"William Shakespeare","title":"Hamlet","isbn":null }]

### Get by title
GET http://localhost:6060/api/books?title=Hamlet
response:
200 OK
[{ "author":"William Shakespeare","title":"Hamlet","isbn":null }]

### Delete
DELETE http://localhost:6060/api/books/isbn1001
response:
200 OK
