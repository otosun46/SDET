/**
 * @Author:Otosun Tarih :14/09/2020
 */
package Gun16;

import utils.BaseStaticDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotOrnek2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException, AWTException {
        driver.get("http://demo.guru99.com/test/upload/");

        Robot rbt=new Robot();

        // ctrl+s  : kaydet kısayol
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_S);
        Thread.sleep(2000);

        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_S);
        Thread.sleep(2000);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        rbt.keyPress(KeyEvent.VK_LEFT);
        rbt.keyRelease(KeyEvent.VK_LEFT);
        Thread.sleep(2000);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(3000);
        driver.quit();


    }
}
