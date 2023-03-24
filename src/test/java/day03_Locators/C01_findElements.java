package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class C01_findElements {
    public static void main(String[] args) {

        System.setProperty("edgeDriver", "src/resources/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Amazon  sayfasinda kac tane link oldugunu konsola yazdiriniz.
        driver.get("https://amazon.com/");

        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("linklerin sayisi :" + linklerListesi.size());

        for (WebElement w : linklerListesi) {
            System.out.println(w.getText());

        }
    }
}
