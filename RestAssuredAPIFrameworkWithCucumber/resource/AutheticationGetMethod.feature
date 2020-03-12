Feature: Validate Authetication Get Method 
Scenario: Validate Authetication status for valid user 
	Given Login valid user and make a valid Get request for users 
	When the hit request to server for for specific valid user 
	Then the server returns Successfully '200' response 
	
Scenario: Validate response Time for user
	Given Login valid user and make a valid Get request for users 
	When the hit request to server for for specific valid user 
	Then response Time for valid user 
	
Scenario: Validate response body for Valid user 
	Given Login valid user and make a valid Get request for users 
	When the hit request to server for for specific valid user 
	Then Response body of OPERATION_SUCCESS 
	
Scenario: Validate Authetication status for Invalid user 
	Given Login Invalid user and try to Get request for users 
	When the hit request to server for for specific Invalid user 
	Then the server returns Successfully '401' response 
	
Scenario: Validate response body for Valid user 
	Given Login valid user and make a valid Get request for users 
	When the hit request to server for for specific valid user 
	Then Response body of FAULT_USER_INVALID_USER_PASSWORD 
	
Scenario: Validate header validand invalid user response 
	Given Login valid user and make a valid Get request for users 
	When the hit request to server for for specific valid user 
	Then Check header for valida user