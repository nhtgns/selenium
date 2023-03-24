package day_01_practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C06 {
    public static void main(String[] args) {

        // pencere konumunu ve pencere olcusunu yazdiriniz
        // pencere konumunu 20,20 yapiniz, pencere olcusunu 900,600 olarak degistirelim
        // yeni pencere konumunu ve yeni pencere olcusunu yazdiriniz

        System.setProperty("edgeDriver", "src/resources/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        // pencere konumunu ve pencere olcusunu yazdiriniz
        System.out.println("pencere konumu:" + driver.manage().window().getPosition());
        System.out.println("pencere olcusu:" + driver.manage().window().getSize());

        // pencere konumunu 20,20 yapiniz, pencere olcusunu 900,600 olarak degistirelim
        driver.manage().window().setPosition(new Point(20,30));
        driver.manage().window().setSize(new Dimension(500,900));

        // yeni pencere konumunu ve yeni pencere olcusunu yazdiriniz
        System.out.println("yeni pencere konumu:" + driver.manage().window().getPosition());
        System.out.println("yeni pencere olcusu:" + driver.manage().window().getSize());
    }
}
