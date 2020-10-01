package Gun11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _08_ActionTusKontrolSendKeys   extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demoqa.com/auto-complete"); // siteyi açtım
        driver.manage().window().maximize();

         // Ahmet -> shift e basılı durumdayken a tuşuna basarsınız, sonra shift i burakıp geirisini yazarsınız.
        WebElement textInput=driver.findElement(By.id("autoCompleteSingleInput"));

        Actions builder=new Actions(driver);
        Action build=builder
                .moveToElement(textInput) // inputa gidildi.
                .click() // içine tıklandı.
                .keyDown(Keys.SHIFT) // büyük harf için önce SHIFT tuşuna basıldı.
                .sendKeys("a") // a tuşuna basığımızda shift basılı olduğundan büyük yazdı
                .keyUp(Keys.SHIFT) // büyük harf için bastığımız tuş kontrolünü geri aldık
                .sendKeys("hmet") // kalanını küçük harf yazdı.
                .build();

        Thread.sleep(2000);
        build.perform();

        Thread.sleep(6000);
        driver.quit();
    }
}
