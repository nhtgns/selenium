package day01Driver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C01_Driver {
    public static void main(String[] args) {
        System.setProperty("edgeDriver","src/resources/driver/msedgedriver.exe");
        //System.setProperty java uygulamalarında sistem özelliklerini ayarlamak için kullanılır
        //Bu method ile class'ımıza webdriver'in fiziki yerini belirtiriz
        //Key, value olarak önce isim sonra driver'imizin yolunu belirtiriz

        System.out.println(System.getProperty("edgeDriver"));

        //getProperty methodu ile "Key değerini girerek "value"'ya ulaşabilirim

        WebDriver driver = new EdgeDriver();   //Bos bir driver acar
      //  driver.get("https://techproeducation.com");//get() methodu ile adresini belittiğimiz sayfaya gideriz
        driver.get("https://www.hepsiburada.com/");

        System.out.println("sayfa basligi :" +driver.getTitle()); //icinde bulundugumuz sayfanin basligini verir

       System.out.println("sayfa url i :" + driver.getCurrentUrl());//icinde bulundugumuz sayfanin url ini verir
    //   System.out.println(driver.getPageSource()); //icinde bulundugumuz sayfanin html kodlarini verir




    }
}
