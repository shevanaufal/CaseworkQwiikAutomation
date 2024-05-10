package sauceDemo.stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import sauceDemo.configuration.environment;

import java.util.concurrent.TimeUnit;

public class login extends environment{

    @Given("saucedemo login page")
    public void saucedemo_login_page(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String loginAssert = driver.findElement(loginLogo).getText();
        Assert.assertEquals(loginAssert, "Swag Labs");

    }

    @When("user input (.*) as username$")
    public void user_input_username_as_username(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("user input (.*) as password$")
    public void user_input_password_as_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("click login button")
    public void click_login_button() {
        driver.findElement(loginButton).click();
    }

    @Then("user verify (.*) login$")
    public void user_verify_status_login(String status) {
        if (status.equals("success")){
            String products = driver.findElement(titleProduct).getText();
            Assert.assertEquals(products, "Products");
        } else {
            String errorLogin = driver.findElement(errorwordingLogin).getText();
            Assert.assertEquals(errorLogin, "Epic sadface: Username and password do not match any user in this service");
        }
    }
}
