package day01Driver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C03_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("edgeDriver","src/resources/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));

        //1 amazon sayfasına gidelim
        driver.get("https://amazon.com");
        Thread.sleep(3000);//Java kodlarını bekletmek için kullanırız(3 saniye bekletir)

        //2 Sonra techproeducation sayfasına gidelim
        driver.navigate().to("https://techproeducation.com");//get() methodu ile aynı şekilde çalışır
        Thread.sleep(3000);

        //3 techpro sayfa başlığını konsola yazdıralım
        System.out.println("Sayfa Başlığı : "+driver.getTitle());

        //4 tekrar amazon sayfasına geri dönelim
        driver.navigate().back();//ilk sayfaya döner
        Thread.sleep(3000);

        //5 Amazon sayfasının başlığını yazdıralım
        System.out.println("Sayfa Başlığı : "+driver.getTitle());

        //6 tekrar techpro sayfasına geri gidelim
        driver.navigate().forward();
        Thread.sleep(4000);

        //7 son olarak sayfayı yenileyelim ve sayfayı kapatalım
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(5000);//sayfayı yeniler
        driver.close();//driver'i kapatır
        //NOT: Sayfalar arası geçişler hızlı olacağından 3 saniye geçişler için bekletelim.

    }
}
