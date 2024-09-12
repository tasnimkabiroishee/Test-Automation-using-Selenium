import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementsUsingLinktext {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.partialLinkText("Auth")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Drag")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.findElement(By.linkText("Form Authentication")).click();

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        Thread.sleep(2000);




        driver.quit();



    }
}
