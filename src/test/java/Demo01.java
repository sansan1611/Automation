import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\quynhtn\\Documents\\Web_Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://confluence.vnextglobal.net/login.action?os_destination=%2Findex.action&permissionViolation=true");
    }
}
