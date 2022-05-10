Feature: API tests
  
  @firefox
 Scenario: get employee
    
   Given an employee exist in the database with id "2"
   When  user retrieves employee info by id
   Then the status code for get employee is 200
   And response includes the following employee info
    | status				| success	     |
 	| data.employee_name 	| Garrett Winters|
    | data.id		        | 2         	 |
    | data.employee_age     | 63        	 |