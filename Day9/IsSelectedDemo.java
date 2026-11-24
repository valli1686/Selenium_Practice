import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelectedDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement veeva = driver.findElement(
                By.cssSelector("#identifierId"));

        boolean Eswar1 = veeva.isSelected();

        System.out.println(Eswar1);
    }
}