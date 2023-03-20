package day01Driver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02_Driver {
    public static void main(String[] args) {

        System.setProperty("edgeDriver","src/resources/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.amazon.com");

        //sayfa basligini yazdir
        System.out.println("sayfa basligi :" + driver.getTitle());

        //sayfanin url ini getir
        System.out.println("sayfa url i :" + driver.getCurrentUrl());

        // techproeducation a git
        driver.get("https://techproeducation.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getTitle());

        //sayfanin windowhandle degerini yazdirir
        System.out.println(driver.getWindowHandle());
    }
}
