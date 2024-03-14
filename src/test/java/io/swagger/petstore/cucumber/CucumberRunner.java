package io.swagger.petstore.cucumber;


import io.cucumber.junit.CucumberOptions;
import io.swagger.petstore.testbase.TestBase;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/")//content root and / at the end
public class CucumberRunner extends TestBase {


}
