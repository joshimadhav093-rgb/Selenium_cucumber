package Sauce_lab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

    WebDriver driver;

    public Login_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath ="//input[@name='user-name']")
    private WebElement username;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement pass;
    @FindBy(xpath="//input[@name='login-button']")
    private WebElement bttn_log;

    public void enter_username(String Username)
    {
        username.sendKeys(Username);
    }

    public void enter_pass(String Password)
    {
        pass.sendKeys(Password);
    }

    public void click_login(){

        bttn_log.click();
    }


}
