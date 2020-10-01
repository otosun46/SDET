/**
 * @Author:Otosun Tarih :02/09/2020
 */
package Gun08;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.ArrayList;
import java.util.List;

public class Ornek1 extends BaseStaticDriver {
    static void logIn(String userName, String password) throws InterruptedException {
        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameInput.clear();
        usernameInput.sendKeys(userName);
        Thread.sleep(1000);
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.clear();
        passwordInput.sendKeys(password);
        Thread.sleep(1000);
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
        Thread.sleep(500);
    }

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        logIn("standard_user", "secret_sauce");
        List<WebElement> elements = driver.findElements(By.xpath("//button[@class='btn_primary btn_inventory']"));//(By.className("inventory_item_name"));//(By.xpath("//div[@class='inventory_item_name']"))
        int counterSepet = 0;
        List<String> urunIsimleri = new ArrayList<>();
        System.out.println("Urunler sepete ekleniyor...");
        for (WebElement e : elements) {
            e.click();
            WebElement counterBadge = driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
            counterSepet = Integer.parseInt(counterBadge.getText());
            System.out.println("Sepetteki urun adedi: " + counterSepet);
            Thread.sleep(500);
        }
        List<WebElement> urunler = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        for (WebElement e : urunler) {
            urunIsimleri.add(e.getText());
            System.out.println(e.getText());
        }
        driver.findElement(By.cssSelector("div#shopping_cart_container")).click();

        List<WebElement> sepetListe = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        List<String> sepetUrunIsimleri = new ArrayList<>();
        for (WebElement e : sepetListe) {
            System.out.println(e.getText());
            sepetUrunIsimleri.add(e.getText());
        }
        Assert.assertTrue(urunIsimleri.equals(sepetUrunIsimleri));
        Thread.sleep(2000);
        driver.quit();

    }
}
