/**
 * @Author:Otosun Tarih :15/09/2020
 */
package Gun17;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import utils.BaseStaticDriver;

import java.util.EventObject;

/*
    Senaryo
    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
    2- random 100 e kadar 2 sayı üretiniz.
    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
    4- Sonuçları Assert ile kontrol ediniz.
    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.
 */
public class Odev1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        Wait bekleme = new WebDriverWait(driver, 5);
        WebElement number1 = driver.findElement(By.id("number1Field"));
        WebElement number2 = driver.findElement(By.id("number2Field"));
        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        WebElement calculateButton = driver.findElement(By.id("calculateButton"));
        WebElement answer = driver.findElement(By.id("numberAnswerField"));
        Select islemler = new Select(operation);
        int sayi1 = 0, sayi2 = 0;
        double sonuc = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("**********************************************");
            for (int islem = 0; islem < 5; islem++) {
                number1.clear();
                sayi1 = randomNum(100);
                number1.sendKeys(sayi1 + "");
                number2.clear();
                sayi2 = randomNum(100);
                number2.sendKeys(sayi2 + "");
                operation.click();
                islemler.selectByIndex(islem);
                calculateButton.click();
                bekleme.until(ExpectedConditions.visibilityOfElementLocated(By.id("answerForm")));
                double ansver = Double.parseDouble(answer.getAttribute("value"));

                switch (islem) {
                    case 0://toplama
                        sonuc = sayi1 + sayi2;
                        System.out.println("Web sonucu= " + ansver + " Test TOPLAMA sonucu= " + sonuc);
                        Assert.assertTrue(sonuc == ansver);
                        break;
                    case 1://cikarma
                        sonuc = sayi1 - sayi2;
                        System.out.println("Web sonucu= " + ansver + " Test  CIKARMA sonucu= " + sonuc);
                        Assert.assertTrue(sonuc == ansver);
                        break;
                    case 2://carpma//
                        sonuc = sayi1 * sayi2;
                        System.out.println("Web sonucu= " + ansver + " Test CARPMA sonucu= " + sonuc);
                        Assert.assertTrue(sonuc == ansver);
                        break;
                    case 3://bolme
                        sonuc = sayi1 * 1.0 / sayi2 * 1.0;
                        System.out.println("Web sonucu= " + ansver + " Test BOLME sonucu= " + sonuc);
                        Assert.assertTrue(sonuc == ansver);
                        break;
                    case 4://string birlestirme
                        String birlestirme = ""+sayi1 +sayi2;
                        sonuc = Double.parseDouble(birlestirme);
                        System.out.println("Web sonucu= " + ansver + " Test BIRLESTIRME sonucu= " + sonuc);
                        Assert.assertTrue(sonuc == ansver);
                        break;

                }
            }
        }
        System.out.println("Test basari ile tamamlandi");
        Thread.sleep(2000);
        driver.quit();
    }

    /**
     * Parametre olarak girilen max degerine kadar rastgele sayi dondurur.
     *
     * @param max
     * @return
     */
    public static int randomNum(int max) {
        int value = 0;
        value = (int) (Math.random() * max + 1);
        return value;
    }

}
