package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C02_cssSelector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("edgeDriver", "src/resources/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));


        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get(" https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin
        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();
        Thread.sleep(2000);

        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.cssSelector("button[class='added-manually']"));
        //Delete tusuna basin
        deleteButton.click();

        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        // xpath de de sadece "h3" ile locate yapilabilir
        System.out.println(driver.findElement(By.xpath("//*[text()='Add/Remove Elements']")).isDisplayed());
        WebElement addremoveE = driver.findElement(By.cssSelector("h3")); //cssSelector ile bu sekilde de olur
        System.out.println("gorunuyor mu? : " + addremoveE.isDisplayed());

        driver.close();
      /*
        Xpath ve cssSelector arasindaki farklar;
        1)Xpath metin ile calisabilir, cssSelector calisamaz.
        2)Xpath daha fazla kombinasyona sahiptir ve index'e gore arama yapabilir.
        3)cssSelector index'e gore arama yapamaz ancak daha hizli calisir.
 */

    }
}
