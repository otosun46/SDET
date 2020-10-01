/**
 * @Author:Otosun Tarih :28/08/2020
 */
package Gun05;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class SendKeysClick extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.practiceselenium.com/");
        Thread.sleep(1000);
        WebElement link= driver.findElement(By.linkText("Check Out"));
        link.click();
        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys("hasan@gmail.com");

        WebElement name= driver.findElement(By.id("name"));
        name.sendKeys("Hasan Sahan");

        WebElement adres= driver.findElement(By.id("address"));
        adres.sendKeys("Yeni adresimiz bu");

        WebElement buton= driver.findElement(By.className("btn-primary"));
        buton.click();

        WebElement menuKontrol= driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914921"));
        String menuTxt=menuKontrol.getText();
        Assert.assertEquals("Menu",menuTxt);

        String url=driver.getCurrentUrl();
        Assert.assertEquals("http://www.practiceselenium.com/menu.html?",url);

        Thread.sleep(3000);
        driver.quit();

    }
}
