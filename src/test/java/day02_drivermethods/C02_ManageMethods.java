package day02_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C02_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("edgeDriver","src/resources/driver/msedgedriver.exe");
        System.out.println(System.getProperty("edgeDriver"));
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify),
        //eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://youtube.com");
        String actueltitel = driver.getTitle();  // gercek baslik
        String expecteditel = "youtube"; // beklenen baslik

        if (actueltitel.equals(expecteditel)){
            System.out.println("TEST PASSED");

        }else {
            System.out.println("TEST FAILED gercek baslik:" + actueltitel);
        }

        //Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        String actuelUrl = driver.getCurrentUrl();
       String beklenenkelime = "youtube";

        if (actuelUrl.contains(beklenenkelime)){
            System.out.println("TEST PASSED");

       }else {
            System.out.println("TEST FAILED gercek Url:" + actuelUrl);
        }
        //Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://amazon.com");

        //Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(2000);

        //Sayfayi yenileyin
        driver.navigate().refresh();

        //Amazon sayfasina donun
        driver.navigate().forward();

        //Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
        String actualtitel = driver.getTitle();
        String istenenkelime = "Amazon";

        if ( actueltitel.contains(istenenkelime)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED GERCEK BASLIK" + actualtitel);
        }

        //Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        String gercekUrl = driver.getCurrentUrl();
        String istenenUrl = "https://www.amazon.com/";

        if (gercekUrl.equals(istenenUrl)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED Gerçek Url = "+gercekUrl);

      // Sayfayi kapatin
        driver.close();

    }
}
