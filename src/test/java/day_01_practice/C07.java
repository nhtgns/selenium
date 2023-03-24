package day_01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class C07 {
    public static void main(String[] args) throws InterruptedException {

        // https://www.amazon.com/ adresine gidin
        // arama motorunda nutella yazip aratınız
        // sayfada kac tane link oldugunu bulunuz
        // linkleri yazdiriniz
        // pencereyi kapatiniz

        System.setProperty("edgeDriver", "src/resources/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);

        // arama motorunda nutella yazip aratınız
        WebElement aramaMotoru = driver.findElement(By.id("twotabsearchtextbox"));
        aramaMotoru.sendKeys("nutella",Keys.ENTER);
        //veya aramaMotoru.submit

        // sayfada kac tane link oldugunu bulunuz. html de taglar <a> seklindedir
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a")); //list dönuyor
        System.out.println(linklerListesi.size());

        // linkleri yazdiriniz
        int sayac = 1;
        for (WebElement each : linklerListesi) {
            System.out.println(sayac + ". link " + each.getText());
            sayac++;
        }
        // pencereyi kapatiniz
        driver.close();
    }
}
