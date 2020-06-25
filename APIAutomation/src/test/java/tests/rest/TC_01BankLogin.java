package tests.rest;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;


public class TC_01BankLogin extends RESTAssuredBase{

	@BeforeTest
	public void setValues() {
		testCaseName = "Login UiBank";
		testDescription = "Login using valid credential ";
		nodes = "Login Credentials";
		authors = "Madhavan";
		category = "API";
		dataFileName = "TC001";
		dataFileType = "JSON";
		
		
	}

	@Test(dataProvider = "fetchData")
	public void userlogin(File file) {		
		
	  setLogs();
	  Response res = postWithBodyAsFileAndUrl(file, "/users/login");
	  
	  verifyResponseCode(res, 200);
		 	
		
	}


}




