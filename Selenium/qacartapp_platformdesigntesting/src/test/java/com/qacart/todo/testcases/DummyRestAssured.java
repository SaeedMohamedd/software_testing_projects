package com.qacart.todo.testcases;

import com.qacart.todo.objects.User;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DummyRestAssured {

    public static void main(String[] args) {
        User user=new User("test","test","test1@test.com","Test@123");
        Response res=given().
                baseUri("https://qacart-todo.herokuapp.com/").header("Content-Type","application/json").body(user)
                        .when().post("/api/v1/users/register")
                        .then().extract().response();

        String accessToken = res.path("UserId");
        System.out.println(accessToken);

    }
}
