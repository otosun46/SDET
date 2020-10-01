package utils;
/**
 * @Author:Otosun Tarih :08/09/2020
 */
/** SITEYI ACMA
driver.get("website URL");
driver.quit(); //bu komutu bir alternatifi de close() dur.
quit(): bütün açılmış tarayıcıları kapatır.
close(): sadece aktif olanı kapatır.
 */
 /* ELEMAN BULMA
driver.findElement(By.id("id"));
driver.findElement(By.name("name"));
driver.findElement(By.className("class name buraya yazılır"));
driver.findElement(By.linkText("linkin tam text i buraya yazılır"));
driver.findElement(By.partialLinkText("linkin text inin bir parçası"));
driver.findElement(By.tagName("tagAdı"));
driver.findElement(By.cssSelector("tagAdı[özellikAdi=‘değer’]"));
driver.findElement(By.xpath("//tagAdı[@özellikAdi=‘değer’]"));
*/
/**ELEMANLAR BULMA
        *Bulunulan sayfadaki verilen kritere göre bütün elelamanları bulur.
        * Bulamazsa list i boş oalrak döndürür.
        *        List<WebElement> elements=driver.findElements(By.tagName("li"));
        *         for (WebElement element:elements) {
        *             System.out.println(element.getText());
        *         }
        */
/*
WebElement submitButton = driver.findElement(By.id("id"))
String text = submitButton.getText(); // görünen text ini verir
String deger = submitButton.getAttribute("özellikeAdı"); //Yok ise null değeri döndürür.
Elemana Click yapmak için ise;
submitButton.click();
 */
/* driver.navigate.to("url") ve driver.get("url")
driver.navigate.to :

geçmişi tutabiliyor, back ve next yapabiliyoruz.
sayfanın tümünün yüklenmesini beklemez.
driver.navigate.back;
driver.navigate.forward;

driver.get :
geçmişi tutmaz.
Sayfanın tümünün yüklenmesini bekler.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;



public class Formatlar extends BaseStaticDriver{
    public static void main(String[] args) {
        List<WebElement> elements=driver.findElements(By.tagName("li"));
        for (WebElement element:elements) {
            System.out.println(element.getText());
        }

    }
}
