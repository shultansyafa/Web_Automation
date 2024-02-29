package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.HomePage;
import page.LoginPage;
import runner.BaseTest;

public class HomeStepDef extends BaseTest {


HomePage homePage;

    @Then("user is on homepage")
    public void userIsOnHomepage(){
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }

    @When("user adds the first product to the cart")
    public void userAddsTheFirstProductToTheCart() {
        homePage = new HomePage(driver);
        homePage.addingProduct();
    }

    @Then("user should see the product added to the cart")
    public void userShouldSeeTheProductAddedToTheCart() {
        homePage = new HomePage(driver);
       homePage.verifyTheProduct();
    }

    @And("user has added a product to the cart")
    public void userHasAddedAProductToTheCart() {
        homePage = new HomePage(driver);
        homePage.addingProduct();
    }

    @When("user clicks on the shpping cart icon")
    public void userClicksOnTheShppingCartIcon() {
        homePage = new HomePage(driver);
        homePage.cartPage();
    }

    @Then("user should be redirected to the shopping cart page and see the added product")
    public void userShouldBeRedirectedToTheShoppingCartPageAndSeeTheAddedProduct() {
    }
}
