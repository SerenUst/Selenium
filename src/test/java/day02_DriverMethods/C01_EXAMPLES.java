package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;

public class C01_EXAMPLES {
    static   WebDriver driver;
    public static void main(String[] args) {

        /*
        1) İlk önce browser'i maximize yapalım sonra tüm sayfa için max bekleme süresi olarak 15 saniye belirtelim.
        2)Sırasıyla  amazon , facebook ve youtube sayfalarına gidelim.
        3)Amazon sayfasına tekrar dönelim.
        4)Amazon sayfasının url'inin https://www.amazon.com/ adresine eşit old test edelim
        5)Sayfanın konumunu ve size'ını  istediğimiz şekilde ayarlıyalım .
        6)ve istediğimiz sekilde olup olamdıgını test edelim .
        7) Ve sayfayı kapatalım.
         */

        System.setProperty("webdriver.chrome.driver","src\\resources\\driver\\chromedriver.exe");
      driver=new ChromeDriver();


            // İlk önce browser'i maximize yapalım sonra tüm sayfa için max bekleme süresi olarak 15 saniye belirtelim.
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


            // Sırasıyla  amazon , facebook ve youtube sayfalarına gidelim.
        driver.get("https://amazon.com");
        driver.get("https://facebook.com");
        driver.get("https://youtube.com");


            // Amazon sayfasına tekrar dönelim.
        driver.navigate().back();
        driver.navigate().back();


            // Amazon sayfasının url'inin https://www.amazon.com/ adresine eşit old test edelim
        String actualUrl = driver.getCurrentUrl();
        String expenctedUrl = "https://amazon.com/";
        if(actualUrl.equals(expenctedUrl)){
            System.out.println("Url TESTİ PASSED");
        }else System.out.println("Url TESTİ FASSED");



        // Sayfanın konumunu ve size'ını YAZDIRALIM.
        System.out.println("Sayfanın size'i : "+driver.manage().window().getSize());
        System.out.println("Sayfanın konumu : " + driver.manage().window().getPosition());



        //Sayfanın konumunu ve size'inı istediğimiz şekilde ayarlıyalım
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));
        System.out.println("Sayfanın  yeni size'i : "+driver.manage().window().getSize());
        System.out.println("Sayfanın yeni  konumu : " + driver.manage().window().getPosition());


        // ve istediğimiz sekilde old test edelim.
        Dimension actualYenisize = driver.manage().window().getSize();
        if(actualYenisize.getWidth()==600 && actualYenisize.getHeight()==600){
            System.out.println("Size TESTİ PASSED");
        }else System.out.println("Size TESTİ FAILED");
        Point actualYeniKonum = driver.manage().window().getPosition();
        if(actualYeniKonum.getX()==50 && actualYeniKonum.getY()==50){
            System.out.println("Konum TESTİ PASSED");
        }else System.out.println("Konum TESTİ FAILED");


        //ve sayfayı kapatalım
        driver.close();














}
}
