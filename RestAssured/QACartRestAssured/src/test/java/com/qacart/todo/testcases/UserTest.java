package com.qacart.todo.testcases;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UserTest {

    @Test
    void UserShouldBeAbleToRegister(){

        String body = "{\n" +
                "    \"firstName\":\"saeed \",\n" +
                "    \"lastName\":\"moahemd\",\n" +
                "    \"email\":\"test@gmail.com\",\n" +
                "    \"password\":\"123456\"\n" +
                "}";
        given()
                .baseUri(
                       "https://qacart-todo.herokuapp.com"
                )
                .contentType(ContentType.JSON)
                .body(body)
                .when().post("/api/v1/users/register")
                .then()
                .log().all()
                .assertThat().statusCode(201)
                .assertThat().body("firstName",equalTo("saeed"));
    }
}
