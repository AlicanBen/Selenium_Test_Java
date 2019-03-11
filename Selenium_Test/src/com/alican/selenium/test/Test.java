package com.alican.selenium.test;
/**
 *
 * @author alica
 */
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    
    private WebDriver driver;

    public void taraciyiCalistirma() {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\alica"
                    + "\\Desktop\\Yeni klasör (4)\\chromedriver.exe");
            driver= new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            Thread.sleep(1500);
            driver.get("https://www.onurair.com/tr/");
            Thread.sleep(3000);
        } catch (Exception e) {
             e.printStackTrace();
        }

    }

    public void ucusArama() {
        try {
            driver.findElement(By.xpath("//*[@id=\"depPort\"]/optgroup[1]/"
                + "option[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"arrPort\"]/optgroup[1]/"
                + "option[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"radio\"]/tbody/tr/td[2]"
                )).click();
        driver.findElement(By.xpath("//*[@id=\"departureDate\"]"))
                .click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/table/"
                + "tbody/tr[5]/td[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"btnSearch\"]")).click();
        Thread.sleep(3000);
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
    
    public void ucusSaatSecimSayfası(){
        try {
            driver.findElement(By.xpath("//*[@id=\"flight_hours_0\"]/div[1]/"
                    + "div[2]/div[1]/div[3]/div/label/div")).click();
            driver.findElement(By.xpath("//*[@id=\"bundleListDivid_0_3_0_0\"]"
                    + "/div[2]/ul/li[2]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"btnContinue\"]")).click();
            Thread.sleep(3000);
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
    
    public void açılırPencereKapatma(){
        try {
            driver.switchTo().frame(1).findElement(By.xpath("//*[@id=\"icon-close-button-1454703945249\"]")).click();
            driver.switchTo().defaultContent();
            Thread.sleep(1500);
        } catch (Exception e) {
             e.printStackTrace(); 
        }
    }
    
     public void yolcuBilgileriGirişSayfası(){
        try {
            driver.findElement(By.xpath("//*[@id=\"tabPax1\"]/div/div[2]/span[1]/label")).click();
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id=\"tabPax1\"]/div/div[2]/span[1]/div/div/div[2]/div/div[1]")).click();
            driver.findElement(By.name("name1")).sendKeys("Selenium");
            driver.findElement(By.name("surname1")).sendKeys("Test");
            driver.findElement(By.xpath("//*[@id=\"nationalityGroup1\"]/div/div/div[1]")).click();
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id=\"nationalityGroup1\"]/div/div/div[2]/div/div[1]")).click();
            Thread.sleep(1500);
            driver.findElement(By.name("natId1")).sendKeys("80669453720");
            driver.findElement(By.xpath("//*[@id=\"bday_day_1-selectized\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"bdateDiv0\"]/div[1]/div/div/div[2]/div/div[1]")).click();
            driver.findElement(By.xpath("//*[@id=\"bday_month_1-selectized\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"bdateDiv0\"]/div[2]/div/div/div[2]/div/div[1]")).click();
            driver.findElement(By.xpath("//*[@id=\"bday_year_1-selectized\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"bdateDiv0\"]/div[3]/div/div/div[2]/div/div[11]")).click();
            driver.findElement(By.xpath("//*[@id=\"frst-tel-number0\"]")).sendKeys("5341111111");
            driver.findElement(By.xpath("//*[@id=\"email0\"]")).sendKeys("example@example.com");
            driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace(); 
            
            
        }
    }
     
     public void nitelikliBiletSayfası() {
        try {
            driver.findElement(By.xpath("//*[@id=\"QFTK\"]/tbody/tr[2]/td/label")).click();
            driver.findElement(By.xpath("//*[@id=\"addSSRContinueBTn\"]")).click();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace(); 
        }
     }
     
     public void krediKartıdemeBilgileriSayfası() {
        try {
            driver.findElement(By.xpath("//*[@id=\"card-owner\"]")).sendKeys("Selenium Test");
            driver.findElement(By.xpath("//*[@id=\"card-number\"]")).sendKeys("1234 5678 9012 3456");
            driver.findElement(By.xpath("//*[@id=\"expiry-month\"]/option[2]")).click();
            driver.findElement(By.xpath("//*[@id=\"expiry-year\"]/option[6]")).click();
            driver.findElement(By.xpath("//*[@id=\"cvc\"]")).sendKeys("111");
            driver.findElement(By.xpath("//*[@id=\"rules-and-conditions\"]/div/label")).click();
        /*
        *   Satın Alma Onay
        *   
        *   driver.findElement(By.xpath("//*[@id=\"btnBuy\"]")).click();
        *    
        */
        } catch (Exception e) {
            e.printStackTrace(); 
        }

    }
     
    public static void main(String[] args) {
        Test testObje=new Test();
        testObje.taraciyiCalistirma();
        testObje.ucusArama();
        testObje.ucusSaatSecimSayfası();
        testObje.açılırPencereKapatma();
        testObje.yolcuBilgileriGirişSayfası();
        testObje.nitelikliBiletSayfası();
        testObje.krediKartıdemeBilgileriSayfası();
    }
}