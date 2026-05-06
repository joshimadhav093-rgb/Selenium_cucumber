package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Calculator;

import java.time.Duration;

public class Step_cal {

    WebDriver driver;
    Calculator cl;
    @Given("User is on calculator page")
    public void app_launch(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.calculator.net/");
        driver.manage().window().maximize();

    }
    @When("User enter first value")
    public void user_enter_first_value() {
        cl= new Calculator(driver);
        cl.Enter_frist_num();

    }
    @When("Click on the plus sign")
    public void click_on_the_plus_sign() {
       cl.Enter_add_sign();
    }
    @Then("User enter second value")
    public void user_enter_second_value() {
        cl.Enter_second_num();

    }
    @Then("Check number is pallindrome")
    public void check_number_is_pallindrome() {
        cl.check_palindrome();
    }
    @Then("Close application")
    public void Close_app() {
        driver.close();
    }
}
