import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class ApiGetText {
    public static void main(String[] args) {
//        RequestSpecification requestSpecification = given().
//                baseUri("https://jsonmock.hackerrank.com/api/countries").
//                param("name", "France");
//        Response response = requestSpecification.get().then().log().all().extract().response();
//        System.out.println(response.path("data.capital").toString());

//        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
//        requestSpecBuilder.setBaseUri("https://jsonmock.hackerrank.com/api/countries");
//        requestSpecBuilder.addParam("name", "France");
//       // requestSpecBuilder.log(LogDetail.ALL);
//
//        RestAssured.requestSpecification = requestSpecBuilder.build();
//        Response response = get();
//        System.out.println(response.path("data.capital").toString());

        Response response = given().
                baseUri("https://jsonmock.hackerrank.com").
                param("name", "France").
                get("/api/countries").
                then().extract().response();
        System.out.println(response.path("data.capital").toString());

    }
}