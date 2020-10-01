package Gun11Ogrt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _04_ActionDragAndDropTest extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html"); // siteyi açtım

        // kaynak : box1    hedef: box101
        WebElement oslo=driver.findElement(By.id("box1"));
        WebElement norvec=driver.findElement(By.id("box101"));

        Actions builder=new Actions(driver);

        Action build=builder.dragAndDrop(oslo, norvec).build();
        Thread.sleep(3000);
        build.perform();

        Thread.sleep(6000);
        driver.quit();
    }
}
