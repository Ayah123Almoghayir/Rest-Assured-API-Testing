package training;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class MyfirstRestAssuredClass{
@Test
public  void getResponseBody(){
	/*Response response=RestAssured.get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1");
	   System.out.println("The Status Code ="+response.getStatusCode());
	   System.out.println("The Time ="+response.getTime());
	   System.out.println(" all the response is fetched, log response, headers, essentially everything that the request returns");
	   given().when().get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().log()
	   .all();
	   System.out.println("Return the information by using the body and entering the parameters");
	   given().queryParam("CUSTOMER_ID","68195")
       .queryParam("PASSWORD","1234!")
       .queryParam("Account_No","1")
       .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log()
       .body();
	   int statusCode= given().queryParam("CUSTOMER_ID","68195")
	           .queryParam("PASSWORD","1234!")
	           .queryParam("Account_No","1") .when().get("http://demo.guru99.com/V4/sinkministatement.php").getStatusCode();
	   System.out.println("The response status is "+statusCode);

	   given().when().get("http://demo.guru99.com/V4/sinkministatement.php").then().assertThat().statusCode(200);
	 System.out.println("The headers in the response "+
             get("http://demo.guru99.com/V4/sinkministatement.php").then().extract()
     .headers());
	 
	 System.out.println("The time taken to fetch the response "+get("http://demo.guru99.com/V4/sinkministatement.php")
     .timeIn(TimeUnit.MILLISECONDS) + " milliseconds");
	 
	 System.out.println("The content type of response "+
	           get("http://demo.guru99.com/V4/sinkministatement.php").then().extract()
	              .contentType());*/
	 

		List<String> amounts = when().get("http://demo.guru99.com/V4/sinkministatement.php").then().extract().path("result.statements.AMOUNT") ;
		int sumOfAll=0;
		for(String a:amounts){

		    System.out.println("The amount value fetched is "+a);
		    sumOfAll=sumOfAll+Integer.valueOf(a);
		}
		System.out.println("The total amount is "+sumOfAll);
	}

}