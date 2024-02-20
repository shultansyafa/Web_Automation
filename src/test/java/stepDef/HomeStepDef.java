package stepDef;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import page.HomePage;
import runner.BaseTest;

public class HomeStepDef extends BaseTest {


HomePage homePage;

    @Then("user is on homepage")
    public void userIsOnHomepage(){
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }
}
