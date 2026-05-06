package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Calculator {

    WebDriver driver;

    public Calculator(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//span[@class='sciop' and text()='+']")
    private WebElement add_sign;
    @FindBy(xpath="//span[@class='scinm' and text()='1']")
    private WebElement num_1;
    @FindBy(xpath="//span[@class='scinm' and text()='0']")
    private WebElement num_2;
    @FindBy(xpath="//span[@class='scinm' and text()='0']")
    private WebElement num_3;
    @FindBy(xpath="//span[@class='scinm' and text()='1']")
    private WebElement num_4;
    @FindBy(xpath="//span[@class='scinm' and text()='2']")
    private WebElement num_5;
    @FindBy(xpath="//span[@class='scinm' and text()='0']")
    private WebElement num_6;
    @FindBy(xpath="//span[@class='scinm' and text()='0']")
    private WebElement num_7;
    @FindBy(xpath="//span[@class='scinm' and text()='2']")
    private WebElement num_8;
    @FindBy(xpath="//div[@id='sciOutPut' ]")
    private WebElement outupt;

    public void Enter_frist_num(){
        num_1.click();
        num_2.click();
        num_3.click();
        num_4.click();


    }

    public void Enter_add_sign(){
        add_sign.click();
    }

    public void Enter_second_num(){
        num_5.click();
        num_6.click();
        num_7.click();
        num_8.click();
    }
    public void check_palindrome(){

        String actual = outupt.getText().replace("\\s+",""); // Get value from UI
       String reve="";
       int len=actual.length();
        System.out.println(len);
       for(int i=len-1;i>=0;i--)
       {
           reve+=actual.charAt(i);
       }

       if(actual.equals(reve)){
           System.out.println("Out Put Value is Palindrome"+reve);
       }
       else {
           System.out.println("Out Put Value is NOT  Palindrome"+reve);
       }

    }
}
