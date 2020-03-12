Feature: Validate Get Method 
Scenario: Validate status response 
	Given the user is about to make a valid Get request for users 
	When the hit request to server for for specific user 
	Then the server returns a '200' response 
	
Scenario: Validate response Time 
	Given the user is about to make a valid Get request for users 
	When the hit request to server for for specific user 
	Then response Time 
	
Scenario: Validate response body 
	Given the user is about to make a valid Get request for users 
	When the hit request to server for for specific user 
	Then Response body 
	
Scenario: Validate header response 
	Given the user is about to make a valid Get request for users 
	When the hit request to server for for specific user 
	Then headers