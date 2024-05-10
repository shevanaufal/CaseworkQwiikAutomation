package sauceDemo.stepDefinitions;
import com.google.errorprone.annotations.Var;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import sauceDemo.configuration.environment;

import java.time.Duration;

public class checkout extends environment {
    @And("click addtocart button")
    public void click_addtocart_button(){
        driver.findElement(addtocartButton).click();
    }

    @When("click shopping cart icon")
    public void click_shopping_cart_icon() {
        driver.findElement(shoppingcartIcon).click();
    }

    @Then("click checkout button")
    public void click_checkout_button() {
        driver.findElement(checkoutButton).click();
    }

    @Then("user input (.*) as firstname$")
    public void user_input_username_as_username(String firstname) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("first-name")).sendKeys(firstname);
    }

    @And("user input (.*) as lastname$")
    public void user_input_lastname_as_lastname(String lastname) {
        driver.findElement(By.id("last-name")).sendKeys(lastname);
    }

    @And("user input (.*) as postalcode$")
    public void user_input_postalcode_as_postalcode(String postalcode) {
        driver.findElement(By.id("postal-code")).sendKeys(postalcode);
    }

    @Then("user click continue button")
    public void user_click_continue_button() {
        driver.findElement(continuecheckoutButton).click();
    }

    @Then("user click finish button")
    public void user_click_finish_button() {
        driver.findElement(finishcheckoutButton).click();
    }

    @Then("user successfully checkout")
    public void user_sucessfully_checkout() {
        String checkoutAssert = driver.findElement(successcheckoutTicker).getText();
        Assert.assertEquals(checkoutAssert, "Thank you for your order!");
    }
}
