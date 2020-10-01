/**
 * @Author:Otosun Tarih :14/09/2020
 */
package Gun16;

import utils.BaseStaticDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClassintro extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException, AWTException {
        driver.get("https://www.cleartrip.com/");
        Robot rbt=new Robot();
        Thread.sleep(4000);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);





        Thread.sleep(3000);
        driver.quit();
    }
}
