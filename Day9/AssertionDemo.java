import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

public class AssertionDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement veeva = driver.findElement(
                By.cssSelector("#identifierId"));

        veeva.sendKeys("mani");

        Thread.sleep(3000);

        String actual = veeva.getAttribute("value");

        String raju = "Ram";

        Assert.assertEquals(actual, raju);
    }
}