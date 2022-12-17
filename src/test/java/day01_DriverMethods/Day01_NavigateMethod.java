package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {

    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

                //Amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");
                //Hepsiburada sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().to("https://techproeducation.com");
                //Tekrar amazon sayfasına dönelim
        Thread.sleep(3000);// 3 sanıye bekle
        driver.navigate().back();   // AMAZON SAYFASINA GERİ DONER
                //Tekrar Hepsiburada sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().forward(); // HEPSİBURADA SAY. GERİ DONER
                //Son sayfada sayfayı yenileyelim(refresh)
        driver.navigate().refresh();
                //Sayfayı kapatalım
        driver.close();










    }




}
