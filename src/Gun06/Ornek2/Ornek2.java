/**
 * @Author:Otosun Tarih :31/08/2020
 */
package Gun06.Ornek2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class Ornek2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameInput.sendKeys("standard_user");
        Thread.sleep(1000);
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");
        Thread.sleep(1000);
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
        Thread.sleep(500);
        WebElement urun1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        urun1.click();
        Thread.sleep(500);
        WebElement sepeteEkle1 = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
        sepeteEkle1.click();
        Thread.sleep(500);
        WebElement back1 = driver.findElement(By.xpath("//button[text()='<- Back']"));
        back1.click();
        Thread.sleep(500);
        WebElement urun2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        urun2.click();
        Thread.sleep(500);
        WebElement sepeteEkle2 = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
        sepeteEkle2.click();
        Thread.sleep(500);
        WebElement back2 = driver.findElement(By.xpath("//button[text()='<- Back']"));
        back2.click();
        Thread.sleep(500);
        WebElement sepet = driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']"));
        sepet.click();
        Thread.sleep(500);
        WebElement checkOut = driver.findElement(By.xpath("//a[@class='btn_action checkout_button']"));
        checkOut.click();
        Thread.sleep(500);
        WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstName.sendKeys("Orhan");
        Thread.sleep(500);
        WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastName.sendKeys("Tosun");
        Thread.sleep(500);
        WebElement zipCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipCode.sendKeys("313 91");
        Thread.sleep(500);
        WebElement continueButton = driver.findElement(By.xpath("//input[@value='CONTINUE']"));
        continueButton.click();
        Thread.sleep(500);
        WebElement valueText1 = driver.findElement(By.xpath("(//div[@ class='inventory_item_price'])[1]"));
        valueText1.getText();
        Thread.sleep(500);
        WebElement valueText2 = driver.findElement(By.xpath("(//div[@ class='inventory_item_price'])[2]"));
        valueText2.getText();
        WebElement totalvalueText = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        totalvalueText.getText();

        double value1=cevirici(valueText1.getText());
        double value2=cevirici(valueText2.getText());
        double totalvalue=cevirici(totalvalueText.getText());
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(totalvalue);
        double toplam=value1+value2;
        System.out.println(toplam);
        Assert.assertTrue(totalvalue==toplam);
        Thread.sleep(2000);
        driver.close();

    }
    public static double cevirici(String valueText){
        return Double.parseDouble(valueText.replaceAll("[^0-9-+.]", ""));
    }
}
