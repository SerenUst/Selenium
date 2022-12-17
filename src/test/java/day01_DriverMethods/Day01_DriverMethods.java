package day01_DriverMethods;

import com.sun.tools.javac.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();    // Boş bir browser açtık.
        driver.get("https://www.amazon.com");   // ilk olarak gitmek istediğimiz sayfayı belirtiriz.

        System.out.println(driver.getTitle());

        System.out.println("Sayfa Başlığı :" + driver.getTitle());

        System.out.println("Sayfa url'i : " +driver.getCurrentUrl());

     //   System.out.println(driver.getPageSource());


        System.out.println(driver.getWindowHandle());//Bize o window'a ait hash degerlerini verir. Biz bu hash degerlerini

                               //bir string'e atayıp pencereler arası geçiş yapabiliriz.


                    /*
                    Yeni bir package olusturalim : day01
            Yeni bir class olusturalim : C03_GetMethods
            Amazon sayfasina gidelim. https://www.amazon.com/
            Sayfa basligini(title) yazdirin
            Sayfa basliginin “Amazon” icerdigini test edin
            Sayfa adresini(url) yazdirin
            Sayfa url’inin “amazon” icerdigini test edin.
            Sayfa handle degerini yazdirin
            Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
            Sayfayi kapatin.
                     */










    }


}
