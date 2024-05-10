package sauceDemo.configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class environment {
    protected static WebDriver driver;
    protected static String baseURL = "https://www.saucedemo.com/";

    //Xpath
    protected static By loginLogo = By.xpath("//div[@class=\"login_logo\"]");
    protected static By loginButton = By.xpath("//input[@id=\"login-button\"]");
    protected static By titleProduct = By.xpath("//span[contains(text(), 'Products')]");
    protected static By errorwordingLogin = By.xpath("//h3[@data-test=\"error\"]");
    protected static By addtocartSauceLabsBackpackButton = By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]");
    protected static By shoppingcartIcon = By.xpath("//div[@class=\"shopping_cart_container\"]");
    protected static By checkoutButton = By.xpath("//button[@id=\"checkout\"]");
    protected static By continuecheckoutButton = By.xpath("//input[@id=\"continue\"]");
    protected static By finishcheckoutButton = By.xpath("//button[@id=\"finish\"]");
    protected static By successcheckoutTicker = By.xpath("//h2[@class=\"complete-header\"]");
    protected static By clickdropdownFilter = By.xpath("//select[@class=\"product_sort_container\"]");
    protected static By choosedropdownFilter = By.className("product_sort_container");
    protected static By assertpricefilterAscending = By.xpath("//span[contains(text(), 'Price (low to high)')]");
    protected static By asserttextfilterDscending = By.xpath("//span[contains(text(), 'Name (Z to A)')]");












}
