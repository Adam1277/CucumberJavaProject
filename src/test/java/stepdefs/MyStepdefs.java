package java;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class MyStepdefs {
    WebDriver driver = new ChromeDriver();

    @Given("I navigate to the google home page")
    public void iNavigateToTheLoginPage() {
        driver.navigate().to("https://www.google.ca/");

    }

    @Then("I should see the homepage")
    public void iShouldSeeTheHomepage() {
    }
}
