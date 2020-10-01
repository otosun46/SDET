package Gun11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _02_ActionDoubleClickTest extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demoqa.com/buttons"); // siteyi açtım

        WebElement doubleClickButton= driver.findElement(By.id("doubleClickBtn"));
        Actions builder=new Actions(driver);

        Action build=builder.moveToElement(doubleClickButton).doubleClick().build();
        Thread.sleep(3000);
        build.perform();

        Thread.sleep(6000);
        driver.quit();
    }
}
