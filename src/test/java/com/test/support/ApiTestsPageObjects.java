package com.test.support;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class ApiTestsPageObjects {
    
	public Response response;
	public ValidatableResponse json;
	public RequestSpecification request;
	public   String id;
	public JsonPath jsonPathEvaluator;
}
