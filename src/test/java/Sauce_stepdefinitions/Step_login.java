package Sauce_stepdefinitions;

import Sauce_lab.Login_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Step_login {

    WebDriver driver;

    @Given("browser is open")
    public void browser_is_open() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }


    @And("User on login page")
    public void user_on_login_page() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

    }
    @When("^User enter (.*) and (.*)$")
    public void user_enter_username_and_password(String username,String Password) {
        Login_Page lp = new Login_Page(driver);
        lp.enter_username(username);
        lp.enter_pass(Password);

    }
    @And("Click on login button")
    public void click_on_login_button() {
        Login_Page lp = new Login_Page(driver);
        lp.click_login();
    }
    @Then("User navigate to home page")
    public void user_navigate_to_home_page() {

        String expect="Swag Labs";
        String actual=driver.getTitle();
        if(actual.equals(expect)){
            System.out.println("User is login Succesfully");

            driver.close();
        }
        else{
            System.out.println("USer failed to login");
        }

    }
}
