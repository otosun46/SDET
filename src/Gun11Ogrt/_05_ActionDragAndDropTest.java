package Gun11;

import org.junit.Assert;
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
   3- Daha sonra kutucuk içinde BANK butonunun textini kontrol ediniz.
   4- Assert ile doğrulayınız.
 */

public class _05_ActionDragAndDropTest  extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://demo.guru99.com/test/drag_drop.html"); // siteyi açtım
        driver.manage().window().maximize();

        WebElement bankButton=driver.findElement(By.id("credit2"));
        WebElement kutu=driver.findElement(By.id("bank"));

        Actions builder=new Actions(driver);
        Action build=builder.dragAndDrop(bankButton, kutu).build();
        //Thread.sleep(2000);
        build.perform();


        WebElement kutuIcerigi=driver.findElement(By.cssSelector("#bank > li"));

        Assert.assertTrue(   kutuIcerigi.getText().equals(bankButton.getText())  );

        Thread.sleep(6000);
        driver.quit();
    }
}
