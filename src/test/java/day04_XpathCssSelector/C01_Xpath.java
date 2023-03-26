package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) {

        System.setProperty("edgeDriver", "src/resources/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://amazon.com");
        //Search(ara) “city bike”
       // driver.findElement(By.xpath("//input[@type='text']")).sendKeys("city bike",Keys.ENTER);
       // driver.findElement(By.xpath("//*[text()='Search Amazon']")).sendKeys("city bike",Keys.ENTER);
        /*
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
        placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0"
        aria-label="Search Amazon" spellcheck="false"> // bu kodlara search Box denir

        XPATH SYNTAX;
                    //tag_name[@attributeName='atributeDeğeri']
                    //input[@id='twotabsearchtextbox']
//         */
        WebElement aramakutusu = driver.findElement(By.xpath("//input[@type='text']"));
        aramakutusu.sendKeys("city bike");
        aramakutusu.submit();
//
//        //Hybrid Bikes bölümüne tıklayın ve görünür olup olmadığını,
//        // erişilebilir olup olmadığını ve seçilebilir olup olmadığını konsolda gösteriniz
//        /*
//        (//*[@class='a-size-base a-color-base'])[11] --> Bu şekilde index kullanarak uniqe olarak WE ulaşabiliriz
//        //*[text()='Hybrid Bikes'] --> xpath ile locate alırken html kodlarında attribute name olmayan
//        <tagname class=değeri>text()
//        metin varsa bu şekilde locate edebiliriz
//         */
//        /*
//        <span class="a-size-base a-color-base">hybrid bike</span>
//         */
//
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        System.out.println(hybridBike.isDisplayed());//WE görüntüleniyormu ? -->Görüntülenebiliyor True
        System.out.println(hybridBike.isEnabled());//WE erişilebiliyormu ? --> Erişilebiliyor True
        System.out.println(hybridBike.isSelected());//WE seçilebiliyormu ? --> Seçilemiyor False
        hybridBike.click();
        //validetion , dogrulama demek
//
//        //Sadece sonuc sayısını yazdıralım
//        /*
//        //*[text()='15 results for']
//        (//*[@class='a-section a-spacing-small a-spacing-top-small'])[1] --> 15 results for "city bike"
//         */
//
        WebElement sonucSayisi = driver.findElement(By.xpath("//*[text()='15 results for']"));
        String [] sonuc = sonucSayisi.getText().split(" ");
        System.out.println(sonuc[0]);
//
//        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
//
//        driver.findElement(By.xpath("(//*[@class='a-link-normal s-no-outline'])[1]")).click();
//        //Sayfayı kapatınız
//        driver.close();

       /* <a data-routing="" class="a-link-normal s-navigation-item" href="/s?k=city+bike&amp;
       rh=n%3A1265458011%2Cp_36%3A17784040011&amp;dc&amp;qid=1679824620&amp;rnid=17784038011&amp;
       ref=sr_nr_p_36_1&amp;ds=v1%3AVaoQj%2BOYDJuHfpnAXXqZgHADf5AVvsL3wC9Ue%2FnJBrs">

    <span class="a-size-base a-color-base">$200 to $500</span>

    </a>*/
//
       // driver.findElement(By.xpath("//a[@class='a-link-normal s-navigation-item']")).click();

        //<span class="a-size-base a-color-base">Hybrid Bikes</span>
        //driver.findElement(By.xpath("//*[text()='Hybrid Bikes']")).click();




    }
}
