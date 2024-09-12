import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        String googleSource = driver.getPageSource();
        System.out.println(googleSource);


        String googleTitle = driver.getTitle();
        System.out.println("google title is: " + googleTitle);

        driver.navigate().to("https://www.udemy.com");
        String udemySource = driver.getPageSource();
        System.out.println(udemySource);

        String udemyTitle = driver.getTitle();
        System.out.println("udemy title is: " + udemyTitle);

        String udemyUrl = driver.getCurrentUrl();
        System.out.println("Udemy Url is : " + udemyUrl);
        driver.navigate().back();
        driver.getCurrentUrl();
        String googleUrl = driver.getCurrentUrl();
        System.out.println("Google Url is : " + googleUrl);

        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.navigate().refresh();

        googleUrl = driver.getCurrentUrl();
        System.out.println("Google Url is : " + googleUrl);
        String googleHandle = driver.getWindowHandle();
        System.out.println(googleHandle); //unique id of the page

        driver.navigate().forward();

        udemyUrl = driver.getCurrentUrl();
        System.out.println("Udemy Url is : " + udemyUrl);
        Thread.sleep(3000);
        driver.quit();
    }
}
