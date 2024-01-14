import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Screenshots {

    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://exler.ru");
        driver.getCurrentUrl();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        try {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File src = screenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File("D:\\tmp\\" + "screen.png"));
            System.out.println("Screenshot was taken :)");


        } catch (Exception e) {
            System.out.println("Impossible to take screenshot");
        }


        driver.quit();
    }
}
