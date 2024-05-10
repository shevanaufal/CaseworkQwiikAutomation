package sauceDemo.stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import sauceDemo.configuration.environment;

import java.time.Duration;

public class sortZtoA extends environment {
    @Then("user click dropdown filter")
    public void user_click_dropdown_filter(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(clickdropdownFilter).click();

    }

    @Then("user choose filter Z to A")
    public void user_choose_filter_Z_to_A() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Select dropdown = new Select(driver.findElement(choosedropdownFilter));
        dropdown.selectByValue("za");
    }

    @Then("user verify sorting was successful")
    public void user_verify_sorting_was_successful() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String descending = driver.findElement(asserttextfilterDscending).getText();
        Assert.assertEquals(descending, "Name (Z to A)");
    }
}
