/**
 * @Author:Otosun Tarih :01/09/2020
 */
package Gun07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.ArrayList;
import java.util.List;

public class LoginTest extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        ArrayList<String> users = new ArrayList<>();
        users.add("standard_user");
        users.add("locked_out_user");
        users.add("problem_user");
        users.add("performance_glitch_user");

        for (String user : users) {
            WebElement usernameInput = driver.findElement(By.xpath("//input[@id='user-name']"));
            usernameInput.clear();
            usernameInput.sendKeys(user);
            Thread.sleep(1000);
            WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
            passwordInput.clear();
            passwordInput.sendKeys("secret_sauce");
            Thread.sleep(1000);
            WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
            loginButton.click();
            Thread.sleep(500);
            List<WebElement> txtProducts = driver.findElements(By.xpath("//div[text()='Products']"));
            if (txtProducts.size() == 1) {
                System.out.println(user + " Login oldu");
                driver.navigate().back();
            } else {
                System.out.println(user +  " Login olamadi");
            }
        }
        Thread.sleep(2000);
        driver.close();
}
}
