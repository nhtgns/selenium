package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C05 {
    public static void main(String[] args) {

        // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz
        // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz
        // sayfayi kapatiniz

        System.setProperty("edgeDriver", "src/resources/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz
        driver.manage().window().maximize();
        System.out.println("maximize pencere konumu:" + driver.manage().window().getPosition());
        System.out.println("pencere olcusu:" + driver.manage().window().getSize());

        // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz
        driver.manage().window().fullscreen();
        System.out.println("fullscreen pen konum:" + driver.manage().window().getPosition());
        System.out.println("pencere olcusu:" + driver.manage().window().getSize());

        // sayfayi kapatiniz
        driver.close();
    }
}
