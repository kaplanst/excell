import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabSwitch {
    public static void main(String[] args) {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://signup.live.com");
        String mainTab = driver.getWindowHandle();

        driver.findElement(By.xpath("//a[@id='terms']")).click();

        for (String tab : driver.getWindowHandles()){
        driver.switchTo().window(tab);
    }

        driver.findElement(By.xpath("//div[@id='Right_Nav_Title11']")).click();

        driver.switchTo().window(mainTab);

        driver.findElement(By.xpath(".//*[@id='MemberName']")).sendKeys("jopaprigojina@mail.cu");
        driver.findElement(By.xpath(".//*[@id='iSignupAction']")).click();






//        driver.quit();
}
}
