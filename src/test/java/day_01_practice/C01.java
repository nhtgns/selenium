package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C01 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("edgeDriver", "src/resources/driver/msedgedriver.exe");
        //System.out.println(System.getProperty("edgeDriver")); bu satir olmadan da calisiyor
        WebDriver driver = new EdgeDriver();


        //1. Pencereyi maximize yapiniz
        driver.manage().window().maximize();

        //2. "https://www.amazon.com/" adresine gidiniz.
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);

        //3. "https://www.n11.com/" adresine gidiniz.
        driver.get("https://www.n11.com/");
        Thread.sleep(2000);

        //4. amazon adresine geri donunuz
        driver.navigate().back();
        Thread.sleep(2000);

        //5. n11 adresine ilerleyiniz
        driver.navigate().forward();
        Thread.sleep(2000);

        //6. sayfayi yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(2000);

        //7. pencereyi kapat
        driver.close();

        //8. Konsola "HER ŞEY YOLUNDA" yazdir
        System.out.println("HER ŞEY YOLUNDA");








    }
}
