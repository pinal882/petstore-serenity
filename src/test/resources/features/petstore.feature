Feature: petstore CRUD operation
  As a user, I want to test petstore CRUD operation
  Scenario: verify CRUD operation for petstore
    Given  petstore application is running
    When I create new pet by providing the information  name 'charlie' status 'available'