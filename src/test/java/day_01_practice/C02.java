package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02 {
    public static void main(String[] args) throws InterruptedException {

        // Pencereyi maximize yapiniz
        // "https://teknosa.com/" adresine gidiniz
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        // "https://medunna.com/" adresine gidiniz
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        // teknosa adresine geri donunuz
        // Sayfayı yenileyiniz
        // medunna adresine ilerleyiniz
        // Sayfayı yenileyiniz
        // pencereyi kapat

        System.setProperty("edgeDriver", "src/resources/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();

        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");
        Thread.sleep(2000);

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String teknosaTitel = driver.getTitle();
        System.out.println("teknosatitel :" + teknosaTitel);

        String teknosaUrl = driver.getCurrentUrl();
        System.out.println("teknosaUrl :" + teknosaUrl);

        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz

        if (teknosaTitel.contains("Teknoloji")) {
            System.out.println("Titel Teknoloji iceriyor");
        } else {
            System.out.println("titel teknoloji icermiyor");
        }

        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz

        if (teknosaUrl.contains("teknosa")) {
            System.out.println("Url teknosa iceriyor");
        } else {
            System.out.println("Url teknosa icermiyor");
        }

        // "https://medunna.com/" adresine gidiniz
        driver.get("https://medunna.com/");
        Thread.sleep(2000);


        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String medunnaTitel = driver.getTitle();
        System.out.println("medunnaTitel:" + medunnaTitel);

        String medunnaUrl = driver.getCurrentUrl();
        System.out.println("medunnaUrl:" + medunnaUrl);

        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        if(medunnaTitel.contains("MEDUNNA")){
            System.out.println("medunnaTitel MEDUNNA iceriyor");
        }else {
            System.out.println("medunnaTitel MEDUNNA icermiyor");
        }

        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        if(medunnaUrl.contains("medunna")){
            System.out.println("medunnaUrl medunna iceriyor");
        }else{
            System.out.println("medunnaUrl medunna icermiyor");
        }
        // teknosa adresine geri donunuz
        driver.navigate().back();
        Thread.sleep(2000);

        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(2000);

        // medunna adresine ilerleyiniz
        driver.navigate().forward();
        Thread.sleep(2000);

        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(2000);

        // pencereyi kapat
        driver.close();
       // String URLmedunna = isContainsmedunna ? "Medunna URL 'medunna' iceriyor" : "Medunna URL 'medunna' icermiyor";

    }
}
