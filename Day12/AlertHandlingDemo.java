import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // 1. Simple Alert
        driver.findElement(
                By.xpath("//button[text()='Click for JS Alert']")).click();

        Alert alert = driver.switchTo().alert();

        System.out.println("Alert text: " + alert.getText());

        Thread.sleep(3000);

        alert.accept();


        // 2. Confirmation Alert
        driver.findElement(
                By.xpath("//button[text()='Click for JS Confirm']")).click();

        Alert confirm = driver.switchTo().alert();

        System.out.println("Confirm text: " + confirm.getText());

        Thread.sleep(3000);

        confirm.dismiss();


        // 3. Prompt Alert
        driver.findElement(
                By.xpath("//button[text()='Click for JS Prompt']")).click();

        Alert prompt = driver.switchTo().alert();

        System.out.println("Prompt text: " + prompt.getText());

        Thread.sleep(5000);

        prompt.sendKeys("Hello Selenium");

        Thread.sleep(3000);

        prompt.accept();

        driver.quit();
    }
}