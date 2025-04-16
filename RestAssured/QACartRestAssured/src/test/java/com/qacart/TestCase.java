package com.qacart;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.ResponseAwareMatcher.*;
import static org.hamcrest.Matchers.*;

public class TestCase {

    @org.testng.annotations.Test
    public void Testf()
    {
        Response response = given().get("https://678e2b10a64c82aeb11f50c3.mockapi.io/api/v1/users");
        System.out.println(response.getStatusCode());  // Should print 200
        System.out.println(response.getHeader("Content-Type"));  // Should print "application/json"

        given().baseUri("https://678e2b10a64c82aeb11f50c3.mockapi.io/api/v1/users")
                .when().get("users")
                .then().log().all()
                .assertThat().body("data[0].name",is(equalTo("Linda Ankunding")));
    }
    @Test
    public void Testpost()
    {
        File bodyfile = new File("src/test/resources/login.json");

        String bodystring = "  {\n" +
                "    \"createdAt\": \"2025-01-19T15:52:33.278Z\",\n" +
                "    \"name\": \"Linda Ankunding\",\n" +
                "    \"avatar\": \"https://cloudflare-ipfs.com/ipfs/Qmd3W5DuhgHirLHGVixi6V76LhCkZUz6pnFt5AJBiyvHye/avatar/830.jpg\",\n" +
                "    \"country\": \"Saeed\",\n" +
                "    \"id\": \"4\"\n" +
                "  }";
        given()
                .baseUri("https://678e2b10a64c82aeb11f50c3.mockapi.ios")
                .header("Content-Type","application/json")
                .contentType(ContentType.JSON)
                .body(bodyfile)
                .log().all()
                .when()
                .post("/api/v1/users")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200);
    }
}
