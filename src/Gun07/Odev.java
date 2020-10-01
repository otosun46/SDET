/**
 * @Author:Otosun Tarih :02/09/2020
 */
package Gun07;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.ArrayList;
import java.util.List;

public class Odev extends BaseStaticDriver {
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
        //driver.manage().window().maximize();
        logIn("standard_user", "secret_sauce");
        List<WebElement> elements = driver.findElements(By.xpath("//button[@class='btn_primary btn_inventory']"));//(By.className("inventory_item_name"));//(By.xpath("//div[@class='inventory_item_name']"))
        int counterSepet=0;
        System.out.println("Urunler sepete ekleniyor...");
        for (WebElement e : elements) {
            e.click();
            WebElement counterBadge = driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
            counterSepet = Integer.parseInt(counterBadge.getText());
            System.out.println("Sepetteki urun adedi: " + counterSepet);
            Thread.sleep(500);
        }
        System.out.println("Urunler siriniyor...");

        List<WebElement> buttonRemove = driver.findElements(By.xpath("//button[@class='btn_secondary btn_inventory']"));

        for (WebElement bRemove : buttonRemove) {

            List<WebElement> counterBadge = driver.findElements(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
            counterSepet = Integer.parseInt(counterBadge.get(0).getText());
            bRemove.click();
            System.out.println("Kalan urun adedi: " + (counterSepet-1));
            Thread.sleep(500);
        }
        List<WebElement> counterBadge = driver.findElements(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
        Assert.assertTrue(counterBadge.size()==0);
        Thread.sleep(2000);
        driver.close();
    }
}
