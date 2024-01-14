package project1;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.with;

public class ApiGetText {
    public static void main(String[] args) {
        System.out.println(getCapital("kazakhstan"));
    }

    public static String getCapital (String country) {
        RequestSpecification requestSpecification = given().
                baseUri("https://jsonmock.hackerrank.com/api/countries").
                param("name", country);
        Response response = requestSpecification.get().then().log().all().extract().response();
        return (response.path("data.capital").toString());
    }
}
