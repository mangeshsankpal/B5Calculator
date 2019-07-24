package com.batch5.Batch5Calculator;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.DEFINED_PORT, classes=Batch5CalculatorApplication.class)
public class Stepdef {
	
	String restApiURL;
	double result;
	@Given("Rest Api {string}")
	public void rest_Api(String restapiUrl) {
		this.restApiURL = restapiUrl;
	}

	@When("I invoke the given rest api")
	public void i_invoke_the_given_rest_api() {
		RestTemplate restTemplate = new RestTemplate();
		result = restTemplate.getForObject(restApiURL,Double.class);
	}

	@Then("the expected is {double}")
	public void the_expected_is(Double expected) {
	    assertEquals(expected, result,0.01);
	}

}
