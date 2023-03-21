import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDeneme {
    public static void main(String[] args) {
        //  System.setProperty("webdriver.http.factory", "jdk-http-client"); //zorda kalirsan bu kodu acabilirsin ,calisiyor
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
          //  System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
          //  WebDriver driver = new ChromeDriver();

        driver.get(" https://www.techproeducation.com");
        driver.get("https://www.hepsiburada.com/");
        driver.get("https://www.amazon.com");
        //https://www.youtube.com/watch?v=AzYDxVXvKUY&ab_channel=AhmetBulutluoz  link

    }
}
