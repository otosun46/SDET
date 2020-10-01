/**
 * @Author:Otosun Tarih :07/09/2020
 */
package Gun11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

import java.util.List;

/*
 Senaryo :
         1- http://demo.guru99.com/test/drag_drop.html Siteyi açınız.
         2- Bank butonunu sürükleyerek bağtaki kutucuğa bırakınız.
         3- Daha sonra bütün kutularda BANK butonunun textini aratınız.
         4- Assert ile doğrulayınız.
*/
public class ActionDragAndDropTest2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {


        driver.get("http://demo.guru99.com/test/drag_drop.html");
        WebElement bank = driver.findElement(By.id("credit2"));//xpath("//a[@class='button button-orange'][6]"));
        WebElement hol = driver.findElement(By.id("bank"));

        Actions builder = new Actions(driver);

        Action build = builder.dragAndDrop(bank,hol).build();
        List<WebElement>elements=driver.findElements(By.cssSelector("#bank > li"));
        for (WebElement e:elements) {
            System.out.println(e.toString());

        }
        System.out.println(elements.size());
        Thread.sleep(3000);
        build.perform();

        Thread.sleep(3000);
        driver.quit();
    }
}
