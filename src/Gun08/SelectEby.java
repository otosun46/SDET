/**
 * @Author:Otosun Tarih :02/09/2020
 */
package Gun08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

/*
  Senaryo :
  1- https://www.ebay.com/ sitesini açın
  2- Arama seçim menüsünden 2984  değerli elemanı seçtiriniz.
  3- Arama işlemini yaptırınız.

 */
public class SelectEby extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.ebay.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        WebElement menuDropDown = driver.findElement(By.id("gh-cat"));
        Select menu = new Select(menuDropDown);
        menu.selectByValue("2984");

        WebElement ara = driver.findElement(By.id("gh-btn"));
        ara.click();

        Thread.sleep(3000);
        driver.quit();
    }
}








