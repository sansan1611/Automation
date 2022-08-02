import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\quynhtn\\Documents\\Web_Driver\\chromedriver.exe");
        int result = 1;
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com/");

        String keyword = "samsung";
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys(keyword);
        searchBox.sendKeys(Keys.ENTER);

        List<WebElement> records = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        //validation
        Validation validation= new Validation();
        for(int i=0; i<records.size(); i++){
            validation.isContain(records.get(i).getText(),keyword,result);
//            Assert.assertTrue(records.get(i).getText().toLowerCase().contains(keyword.toLowerCase()));
        }
//
        //Click item 5th
        int selected = 4;
        String SelectItemName = records.get(selected).getText();
        records.get(selected).click();
        WebElement ProductTitle = driver.findElement(By.xpath("//span[@id='productTitle']"));
//        Assert.assertTrue(ProductTitle.getText().toLowerCase().contains(keyword.toLowerCase()));
        validation.isMatch(ProductTitle.getText(),SelectItemName,result);


        //Buy Now + Checkout
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//span[@id='attach-sidesheet-checkout-button']")).click();

        //Result
        System.out.println(result);
    }
}
