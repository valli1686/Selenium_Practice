import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/nested_frames");

        Thread.sleep(3000);

        // Switch to Top Frame
        driver.switchTo().frame("frame-top");

        Thread.sleep(5000);

        // Switch to Left Frame
        driver.switchTo().frame("frame-left");

        String text = driver.findElement(
                By.tagName("body")).getText();

        System.out.println("Left Frame Text: " + text);

        Thread.sleep(5000);

        // Return to Parent Frame
        driver.switchTo().parentFrame();

        Thread.sleep(5000);

        // Switch to Middle Frame
        driver.switchTo().frame("frame-middle");

        String middleText = driver.findElement(
                By.id("content")).getText();

        System.out.println("Middle Frame: " + middleText);

        Thread.sleep(5000);

        // Return to Main Page
        driver.switchTo().defaultContent();

        driver.quit();
    }
}