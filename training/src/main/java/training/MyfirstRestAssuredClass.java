package training;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class MyfirstRestAssuredClass{
@Test
public  void getResponseBody(){
	/*Response response=RestAssured.get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1");
	   System.out.println("The Status Code ="+response.getStatusCode());
	   System.out.println("The Time ="+response.getTime());*/
	   given().when().get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().log()
	   .all();
	}
}