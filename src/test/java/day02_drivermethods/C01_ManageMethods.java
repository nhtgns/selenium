package day02_drivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C01_ManageMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("edgeDriver","src/resources/driver/msedgedriver.exe");
        System.out.println(System.getProperty("edgeDriver"));
        WebDriver driver = new EdgeDriver();

        System.out.println("sayfa konumu :"    + driver.manage().window().getPosition());
        System.out.println("sayfa boyutlari :" + driver.manage().window().getSize());
        driver.manage().window().maximize();  //acilan browser i maximal yapar

        driver.get("https://techproeducation.com");

        System.out.println("sayfa konumu :"    + driver.manage().window().getPosition());
        System.out.println("sayfa boyutlari :" + driver.manage().window().getSize());
        driver.manage().window().minimize();// sayfayi simge halinde asagiya indirir

        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        System.out.println("Sayfa Konumu = "   +driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutları = "+driver.manage().window().getSize());

        driver.manage().window().setPosition(new Point(50,50));  // istedigimiz konuma getirir
        Thread.sleep(3000);
        driver.manage().window().setSize(new Dimension(600,600)); // istedigimiz boyuta getirir
        Thread.sleep(2000);
    }
}
