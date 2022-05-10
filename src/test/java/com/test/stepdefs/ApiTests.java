package com.test.stepdefs;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.inject.Inject;
import com.test.support.Global;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.restassured.RestAssured;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiTests {

       @Inject
	   Global global;
       
	@Given("an employee exist in the database with id {string}")
	public void an_employee_exists_with_id(String ID){
		global.apiPageObjects.id=ID;
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		global.apiPageObjects.request= RestAssured.given();
	}
	
	@When("user retrieves employee info by id")
	public void user_retrieves_employee_info_by_id(){
		global.apiPageObjects.response= global.apiPageObjects.request.pathParam("id", global.apiPageObjects.id).get("/employee/{id}");
		global.apiPageObjects.jsonPathEvaluator=global.apiPageObjects.response.jsonPath();
		assertThat(global.apiPageObjects.response).isNotNull();
	}
	
	@Then("the status code for get employee is {int}")
	public void verify_status(int sc){
		System.out.println("status code check..  " );
		global.apiPageObjects.json=global.apiPageObjects.response.then().statusCode(sc);
		assertThat(global.apiPageObjects.response.getStatusCode()).isEqualTo(sc);
	}
	
	 @And("response includes the following employee info$")
	public void employee_response_equals(Map<String, Object> ExpectedFields){
    Map<String, Object> actualFields =  ExpectedFields.keySet().stream().collect(Collectors.toMap(expectedKey -> expectedKey, expectedKey -> global.apiPageObjects.jsonPathEvaluator.get(expectedKey).toString()));
    assertThat(actualFields).containsAllEntriesOf(ExpectedFields);
	}
	
}
