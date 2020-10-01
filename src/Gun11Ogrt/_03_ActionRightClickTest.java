package Gun11;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _03_ActionRightClickTest  extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demoqa.com/buttons"); // siteyi açtım

        WebElement button= driver.findElement(By.id("rightClickBtn"));

        Actions builder=new Actions(driver); // driver üzerinden aksiyonları çalıştırmak için değişken tanımladım

        Action build= builder.moveToElement(button).contextClick().build();
        build.perform();
        
        WebElement mesaj=driver.findElement(By.id("rightClickMessage"));
        Assert.assertEquals("You have done a right click", mesaj.getText());

        Thread.sleep(6000);
        driver.quit();
    }
}
