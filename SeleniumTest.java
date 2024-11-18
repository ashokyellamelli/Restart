import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class SeleniumTest
{
    public static void main (String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        driver.manage().window().maximize();
        System.out.println("fsffs");

        String OptionToSelect="toys for ages 5-7";
        int count=0;
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("toys");
      Thread.sleep(3000);
        List<WebElement> d = driver.findElements(By.xpath("//div[@aria-label='toys for ages 5-7']"));
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
    }}
}
