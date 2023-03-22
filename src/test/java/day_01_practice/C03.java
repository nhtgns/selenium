package day_01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class C03 {
    public static void main(String[] args) throws InterruptedException {

        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        // ilk kutucuga 20 giriniz
        // ikinci kutucuga 30 giriniz
        // calculate'e tıklayınız
        // sonucu yazdırınız
        // sayfayi kapatiniz

        System.setProperty("edgeDriver", "src/resources/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");
        Thread.sleep(2000);

        // ilk kutucuga 20 giriniz
        WebElement ilkKutucuk = driver.findElement(By.id("number1"));
        ilkKutucuk.sendKeys("20");
        Thread.sleep(2000);

        // ikinci kutucuga 30 giriniz
       WebElement ikinciKutucuk =  driver.findElement(By.id("number2"));
       ikinciKutucuk.sendKeys("30");
       Thread.sleep(2000);

        // calculate'e tıklayınız
        WebElement calculate = driver.findElement(By.id("calculate"));
        calculate.click();
        Thread.sleep(2000);

        // sonucu yazdırınız
        WebElement sonuc = driver.findElement(By.id("answer"));
        System.out.println("toplama isleminin sonucu: " + sonuc.getText()); //webElement i String e donusturduk getText methodu ile,
                                                                            // cunku WebElement ler direkt sout ile yazdirilmaz

        // sayfayi kapatiniz
        driver.close();


    }
}
