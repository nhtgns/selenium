package day04_XpathCssSelector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C02_cssSelector {
    public static void main(String[] args) {

        System.setProperty("edgeDriver", "src/resources/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin

        driver.get("//https://the-internet.herokuapp.com/add_remove_elements/");
        //Add Element butonuna basin
        //Delete butonu’nun gorunur oldugunu test edin
        //Delete tusuna basin
        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin



    }
}
