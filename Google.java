import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Google {


    public static void main (String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        System.out.println("fsffs");

        String OptionToSelect="testing";
        int count=0;
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("test");
        Thread.sleep(3000);
        List<WebElement> d = driver.findElements(By.xpath("//div[@id='c7mM1c']"));
        for(WebElement ele:d)
        {
            String currentOptions=ele.getText();
            if(currentOptions.contains(OptionToSelect))
            {
                ele.click();
                count++;
                break;

            }
            driver.close();
        }
    }
}
