package sauceDemo.stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import sauceDemo.configuration.environment;

import java.time.Duration;

public class sortpriceAscending extends environment {

    @Then("user choose filter price ascending")
    public void user_choose_filter_price_ascending() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Select dropdown = new Select(driver.findElement(choosedropdownFilter));
        dropdown.selectByValue("lohi");
    }

    @Then("user verify sorting price ascending was successful")
    public void user_verify_sorting_price_ascending_was_successful() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String priceAscending = driver.findElement(assertpricefilterAscending).getText();
        Assert.assertEquals(priceAscending, "Price (low to high)");
    }
}
