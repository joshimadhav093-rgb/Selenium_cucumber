package basics_of_java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class test_demo {


    WebDriver driver;
    public void launch(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();



        Set<String> window=driver.getWindowHandles();

        Iterator<String> handles=window.iterator();

        String parent=handles.next();
        String chile = handles.next();
        driver.switchTo().window(parent);
    }


}
