import org.openqa.selenium.;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

public class GetAttributeDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(httpsaccounts.google.com);
        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement veeva = driver.findElement(
                By.cssSelector(#identifierId));

         veeva.sendKeys(arun);

        Thread.sleep(3000);

        String as = veeva.getAttribute(value);

        Assert.assertEquals(as, ar);
    }
}