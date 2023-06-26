import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static void main(String[] args) {


        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://en.wikipedia.org/");

        WebElement link = driver.findElement(By.xpath("//tr[@role='list']//a[text()='Электроника']"));
        WebElement element = driver.findElement(By.xpath("//tr[@role='list']//a[text()='Электроника']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(link).build().perform();

        actions.dragAndDrop(element, link).build().perform();

        actions.clickAndHold(element).moveToElement(link).release().build().perform();

        actions.doubleClick(element);
        actions.contextClick(element);

        Action action = actions.clickAndHold(element).moveToElement(link).release().build();

        action.perform();
    }
}
