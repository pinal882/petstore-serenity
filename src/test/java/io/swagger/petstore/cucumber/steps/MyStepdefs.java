package io.swagger.petstore.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.swagger.petstore.petinfo.PetSteps;
import net.serenitybdd.annotations.Steps;

/**
 * Created By Pinal
 */

public class MyStepdefs {
    @Steps
    PetSteps steps;
    @Given("petstore application is running")
    public void petstoreApplicationIsRunning() {
    }




    @When("I create new pet by providing the information  name {string} status {string}")
    public void iCreateNewPetByProvidingTheInformationNameCharlieStatusAvailable(String name,String status) {
        steps.createPet(name,status).statusCode(200);
    }
}
