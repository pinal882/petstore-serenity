package io.swagger.petstore.petinfo;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.swagger.petstore.models.PetPojo;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

/**
 * Created By Pinal
 */

public class PetSteps {
    @Step
    public ValidatableResponse createPet(String name, String status){
        PetPojo petPojo = new PetPojo();
        petPojo.setName(name);
        petPojo.setStatus(status);

        return SerenityRest.given()
                .contentType(ContentType.JSON)
                .when()
                .body(petPojo)
                .post()
                .then().log().all();
    }
}
