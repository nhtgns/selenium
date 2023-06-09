package day02_drivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class C03_WebelementLocators {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("edgeDriver", "src/resources/driver/msedgedriver.exe");
        System.out.println(System.getProperty("edgeDriver"));
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Amazon sayfasına gidiniz
       // driver.get("https://amazon.com");
        //Search box bölümünü locate ediniz ve amazonda iphone aratınız
      //  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //submit yapmak yerine sendKeys("iphone", Keys.ENTER); olarak kullanabiliriz.

        //WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        //searchBox.submit();//Enter yapmak için submit() kullanılabilir
        //NOT : Eğer bir webelementi birden fazla kullanılacaksa bir webelement e atama yapılabilir
        //searchBox.sendKeys("iphone");//Locate ettiğimiz searchBox'a iphone metnini gönderir



        driver.get("https://amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
        List <WebElement> list = driver.findElements(By.className("s-image"));
        list.get(2).click();


    }
}
