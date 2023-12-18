package com.maren.steps;

import com.maren.pages.LoginPage;
import com.maren.pages.ProductsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import java.util.logging.Logger;


public class ProductsStep {


    LoginPage loginPage = new LoginPage();
    ProductsPage exercisePage = new ProductsPage();

    private String user;

    @Given("an standard user {string}")
    public void anStandardUser(String user) {
        this.user = user;
    }

    @When("user do login successfully")
    public void userDoLoginSuccessfully() {
        loginPage.doLogin(user);
    }

    @Then("Swag lab products should be displayed")
    public void swagLabProductsShouldBeDisplayed() {
        Assertions.assertFalse(exercisePage.getProductsName().isEmpty());
        System.out.println("Products: " + exercisePage.getProductsName());
    }
}
