package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C04 {
    public static void main(String[] args) {

        // https://www.amazon.com/ adresine gidin
        // Kaynak Kodlarini konsola yazdiriniz
        // Kaynak Kodlarinda "Gateway" yazdigini test edin
        // sayfayi kapatiniz

        System.setProperty("edgeDriver", "src/resources/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");


        // Kaynak Kodlarini konsola yazdiriniz
        String sayfakaynakKodlari = driver.getPageSource();
        System.out.println(sayfakaynakKodlari);

        // Kaynak Kodlarinda "Gateway" yazdigini test edin
        if(sayfakaynakKodlari.contains("Gateway")){
            System.out.println("kodlar Gateway iceriyor");
        }else{
            System.out.println("kodlar Gateway icermiyor");
        }
        // sayfayi kapatiniz
        driver.close();

    }
}
