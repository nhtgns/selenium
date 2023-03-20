import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DenemeEdge {
    public static void main(String[] args) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver =new EdgeDriver();

       // driver.get("https://www.amazon.com");
        driver.get("https://www.hepsiburada.com/");

    }
}
