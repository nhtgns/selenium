package day05_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_RelativeLocaters {
    public static void main(String[] args) {
        System.setProperty("edgeDriver", "src/resources/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        /*
         RELATIVE LOCATOR
    - bir web sayfasında benzer özelliklere sahip elementlerin olduğu durumlarda kullanılabilir
    1- above --> Belirtilen elementin üstünde olan elementi seçer
    2- below --> Belirtilen elementin altında olan elementi seçer
    3- to_left_of --> Belirtilen elementin solunda olan elementi seçer
    4- to_right_of --> Belirtilen elementin sağında olan elementi seçer
    5- near --> Belirtilen elementin yanında/yakınında olan elementi seçer
         */

        //amazon sayfasina gidiniz
        driver.get("https://amazon.com");

        //city bike aratalım
        WebElement aramakutusu = driver.findElement(By.xpath("//input[@type='text']"));
        aramakutusu.sendKeys("city bike", Keys.ENTER);

        //Hybrid Bikes bölümüne tıklayalım
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        WebElement roadBikes = driver.findElement(with(By.tagName("a")).below(hybridBike));
        roadBikes.click();

        //Relative Locator kullanarak hybrid bike altındaki webelemente tıklayalım










    }
}
