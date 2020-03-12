Feature: Validate Post Method 
Scenario: Validate status Post response 
	Given the user is about to make a valid Post request for users 
	When the hit request to server for for specific add resource 
	Then the server returns a created '201' response 
	
Scenario: Validate response post Time 
	Given the user is about to make a valid Post request for users 
	When the hit request to server for for specific add resource 
	Then Post response Time 
	
Scenario: Validate post response body 
	Given the user is about to make a valid Post request for users 
	When the hit request to server for for specific add resource  
	Then Post Response body 
	
