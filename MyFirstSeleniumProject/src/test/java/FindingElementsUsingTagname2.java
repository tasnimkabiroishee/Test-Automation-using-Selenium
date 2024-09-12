import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collections;
import java.util.List;

public class FindingElementsUsingTagname2 {
    public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    driver.get("https://the-internet.herokuapp.com/");

    driver.findElement(By.linkText("Sortable Data Tables")).click();
    WebElement table = driver.findElement(By.id("table2"));
    List<WebElement> tableRows = table.findElements(By.tagName("tr"));// Use findElements to get all rows


    Thread.sleep(2000);
    System.out.println(tableRows.size()); // Print the size of the list
    System.out.println(tableRows.get(0).getText());
    System.out.println(tableRows.get(1).getText());
    System.out.println(tableRows.get(2).getText());
    System.out.println(tableRows.get(3).getText());
    System.out.println(tableRows.get(4).getText());

    // finding elements using xpath
    driver.findElement(By.xpath("html"));



    driver.quit();



}
}
