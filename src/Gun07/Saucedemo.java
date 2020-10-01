/**
 * @Author:Otosun Tarih :01/09/2020
 */
package Gun07;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;

public class Saucedemo extends BaseStaticDriver {
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

        List<WebElement> elements=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));//(By.className("inventory_item_name"));//(By.xpath("//div[@class='inventory_item_name']"))
        for (WebElement e:elements) {
            System.out.println(e.getText());
        }
        Thread.sleep(2000);
        driver.close();
    }


}
