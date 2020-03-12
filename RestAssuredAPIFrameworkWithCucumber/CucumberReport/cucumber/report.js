$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AutheticationGetMethod.feature");
formatter.feature({
  "line": 1,
  "name": "Validate Authetication Get Method",
  "description": "",
  "id": "validate-authetication-get-method",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validate Authetication status for valid user",
  "description": "",
  "id": "validate-authetication-get-method;validate-authetication-status-for-valid-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Login valid user and make a valid Get request for users",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "the hit request to server for for specific valid user",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "the server returns Successfully \u0027200\u0027 response",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationGetTestcases.login_valid_user_and_make_a_valid_Get_request_for_users()"
});
formatter.result({
  "duration": 99599406,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationGetTestcases.the_hit_request_to_server_for_for_specific_valid_user()"
});
formatter.result({
  "duration": 3610552932,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 33
    }
  ],
  "location": "AuthenticationGetTestcases.the_server_returns_Successfully_response(int)"
});
formatter.result({
  "duration": 2957496,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Validate response Time for user",
  "description": "",
  "id": "validate-authetication-get-method;validate-response-time-for-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Login valid user and make a valid Get request for users",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "the hit request to server for for specific valid user",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "response Time for valid user",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationGetTestcases.login_valid_user_and_make_a_valid_Get_request_for_users()"
});
formatter.result({
  "duration": 1814184,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationGetTestcases.the_hit_request_to_server_for_for_specific_valid_user()"
});
formatter.result({
  "duration": 941445064,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationGetTestcases.response_Time_for_valid_user()"
});
formatter.result({
  "duration": 2136401,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Validate response body for Valid user",
  "description": "",
  "id": "validate-authetication-get-method;validate-response-body-for-valid-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Login valid user and make a valid Get request for users",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "the hit request to server for for specific valid user",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Response body of OPERATION_SUCCESS",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationGetTestcases.login_valid_user_and_make_a_valid_Get_request_for_users()"
});
formatter.result({
  "duration": 2291289,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationGetTestcases.the_hit_request_to_server_for_for_specific_valid_user()"
});
formatter.result({
  "duration": 1060449051,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationGetTestcases.response_body_of_OPERATION_SUCCESS()"
});
formatter.result({
  "duration": 40569852,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Validate Authetication status for Invalid user",
  "description": "",
  "id": "validate-authetication-get-method;validate-authetication-status-for-invalid-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "Login Invalid user and try to Get request for users",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "the hit request to server for for specific Invalid user",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "the server returns Successfully \u0027401\u0027 response",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationGetTestcases.login_Invalid_user_and_try_to_Get_request_for_users()"
});
formatter.result({
  "duration": 1040675,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationGetTestcases.the_hit_request_to_server_for_for_specific_Invalid_user()"
});
formatter.result({
  "duration": 898501191,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "401",
      "offset": 33
    }
  ],
  "location": "AuthenticationGetTestcases.the_server_returns_Successfully_response(int)"
});
formatter.result({
  "duration": 705084,
  "error_message": "java.lang.AssertionError: expected:\u003c200\u003e but was:\u003c401\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:743)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat org.junit.Assert.assertEquals(Assert.java:555)\r\n\tat org.junit.Assert.assertEquals(Assert.java:542)\r\n\tat StepDefination.AuthenticationGetTestcases.the_server_returns_Successfully_response(AuthenticationGetTestcases.java:56)\r\n\tat ✽.Then the server returns Successfully \u0027401\u0027 response(AutheticationGetMethod.feature:20)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 22,
  "name": "Validate response body for Valid user",
  "description": "",
  "id": "validate-authetication-get-method;validate-response-body-for-valid-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "Login valid user and make a valid Get request for users",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "the hit request to server for for specific valid user",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Response body of FAULT_USER_INVALID_USER_PASSWORD",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationGetTestcases.login_valid_user_and_make_a_valid_Get_request_for_users()"
});
formatter.result({
  "duration": 2236550,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationGetTestcases.the_hit_request_to_server_for_for_specific_valid_user()"
});
formatter.result({
  "duration": 1077648808,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationGetTestcases.response_body_of_FAULT_USER_INVALID_USER_PASSWORD()"
});
formatter.result({
  "duration": 1745137,
  "error_message": "org.json.JSONException: JSONObject[\"fault\"] not found.\r\n\tat org.json.JSONObject.get(JSONObject.java:573)\r\n\tat Utility.readjsondata.getvalueByJpath(readjsondata.java:18)\r\n\tat StepDefination.AuthenticationGetTestcases.response_body_of_FAULT_USER_INVALID_USER_PASSWORD(AuthenticationGetTestcases.java:113)\r\n\tat ✽.Then Response body of FAULT_USER_INVALID_USER_PASSWORD(AutheticationGetMethod.feature:25)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 27,
  "name": "Validate header validand invalid user response",
  "description": "",
  "id": "validate-authetication-get-method;validate-header-validand-invalid-user-response",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "Login valid user and make a valid Get request for users",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "the hit request to server for for specific valid user",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Check header for valida user",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationGetTestcases.login_valid_user_and_make_a_valid_Get_request_for_users()"
});
formatter.result({
  "duration": 4921903,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationGetTestcases.the_hit_request_to_server_for_for_specific_valid_user()"
});
formatter.result({
  "duration": 923077737,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationGetTestcases.check_header_for_valida_user()"
});
formatter.result({
  "duration": 427653,
  "status": "passed"
});
formatter.uri("GetMethod.feature");
formatter.feature({
  "line": 1,
  "name": "Validate Get Method",
  "description": "",
  "id": "validate-get-method",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validate status response",
  "description": "",
  "id": "validate-get-method;validate-status-response",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "the user is about to make a valid Get request for users",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "the hit request to server for for specific user",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "the server returns a \u0027200\u0027 response",
  "keyword": "Then "
});
formatter.match({
  "location": "GetTestcases.the_user_is_about_to_make_a_valid_Get_request_for_users()"
});
formatter.result({
  "duration": 2248991,
  "status": "passed"
});
formatter.match({
  "location": "GetTestcases.the_hit_request_to_server_for_for_specific_user()"
});
formatter.result({
  "duration": 1376174880,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 22
    }
  ],
  "location": "GetTestcases.the_server_returns_a_response(int)"
});
formatter.result({
  "duration": 151778,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Validate response Time",
  "description": "",
  "id": "validate-get-method;validate-response-time",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "the user is about to make a valid Get request for users",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "the hit request to server for for specific user",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "response Time",
  "keyword": "Then "
});
formatter.match({
  "location": "GetTestcases.the_user_is_about_to_make_a_valid_Get_request_for_users()"
});
formatter.result({
  "duration": 1736428,
  "status": "passed"
});
formatter.match({
  "location": "GetTestcases.the_hit_request_to_server_for_for_specific_user()"
});
formatter.result({
  "duration": 773762604,
  "status": "passed"
});
formatter.match({
  "location": "GetTestcases.response_Time()"
});
formatter.result({
  "duration": 457512,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Validate response body",
  "description": "",
  "id": "validate-get-method;validate-response-body",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "the user is about to make a valid Get request for users",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "the hit request to server for for specific user",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Response body",
  "keyword": "Then "
});
formatter.match({
  "location": "GetTestcases.the_user_is_about_to_make_a_valid_Get_request_for_users()"
});
formatter.result({
  "duration": 5059374,
  "status": "passed"
});
formatter.match({
  "location": "GetTestcases.the_hit_request_to_server_for_for_specific_user()"
});
formatter.result({
  "duration": 1168921878,
  "status": "passed"
});
formatter.match({
  "location": "GetTestcases.response_body()"
});
formatter.result({
  "duration": 20105000,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Validate header response",
  "description": "",
  "id": "validate-get-method;validate-header-response",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "the user is about to make a valid Get request for users",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "the hit request to server for for specific user",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "headers",
  "keyword": "Then "
});
formatter.match({
  "location": "GetTestcases.the_user_is_about_to_make_a_valid_Get_request_for_users()"
});
formatter.result({
  "duration": 2192384,
  "status": "passed"
});
formatter.match({
  "location": "GetTestcases.the_hit_request_to_server_for_for_specific_user()"
});
formatter.result({
  "duration": 539681266,
  "status": "passed"
});
formatter.match({
  "location": "GetTestcases.headers()"
});
formatter.result({
  "duration": 456889,
  "status": "passed"
});
formatter.uri("PostMethod.feature");
formatter.feature({
  "line": 1,
  "name": "Validate Post Method",
  "description": "",
  "id": "validate-post-method",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validate status Post response",
  "description": "",
  "id": "validate-post-method;validate-status-post-response",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "the user is about to make a valid Post request for users",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "the hit request to server for for specific add resource",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "the server returns a created \u0027201\u0027 response",
  "keyword": "Then "
});
formatter.match({
  "location": "PostTestcases.the_user_is_about_to_make_a_valid_Post_request_for_users()"
});
formatter.result({
  "duration": 5342403,
  "status": "passed"
});
formatter.match({
  "location": "PostTestcases.the_hit_request_to_server_for_for_specific_add_resource()"
});
formatter.result({
  "duration": 1366806937,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 30
    }
  ],
  "location": "PostTestcases.the_server_returns_a_created_response(int)"
});
formatter.result({
  "duration": 421433,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Validate response post Time",
  "description": "",
  "id": "validate-post-method;validate-response-post-time",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "the user is about to make a valid Post request for users",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "the hit request to server for for specific add resource",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Post response Time",
  "keyword": "Then "
});
formatter.match({
  "location": "PostTestcases.the_user_is_about_to_make_a_valid_Post_request_for_users()"
});
formatter.result({
  "duration": 4549610,
  "status": "passed"
});
formatter.match({
  "location": "PostTestcases.the_hit_request_to_server_for_for_specific_add_resource()"
});
formatter.result({
  "duration": 1632735551,
  "status": "passed"
});
formatter.match({
  "location": "PostTestcases.post_response_Time()"
});
formatter.result({
  "duration": 169507,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Validate post response body",
  "description": "",
  "id": "validate-post-method;validate-post-response-body",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "the user is about to make a valid Post request for users",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "the hit request to server for for specific add resource",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Post Response body",
  "keyword": "Then "
});
formatter.match({
  "location": "PostTestcases.the_user_is_about_to_make_a_valid_Post_request_for_users()"
});
formatter.result({
  "duration": 2077930,
  "status": "passed"
});
formatter.match({
  "location": "PostTestcases.the_hit_request_to_server_for_for_specific_add_resource()"
});
formatter.result({
  "duration": 997315270,
  "status": "passed"
});
formatter.match({
  "location": "PostTestcases.postMethodValidateJsonData()"
});
formatter.result({
  "duration": 323772,
  "status": "passed"
});
});