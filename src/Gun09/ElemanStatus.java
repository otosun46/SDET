/**
 * @Author:Otosun Tarih :03/09/2020
 */
package Gun09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class ElemanStatus extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        Thread.sleep(1000);
        WebElement sali= driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        Thread.sleep(500);
        System.out.println("Sali display "+sali.isDisplayed());
        System.out.println("Sali enable "+sali.isEnabled());
        System.out.println("Sali select "+sali.isSelected());
        Thread.sleep(500);
        sali.click();
        Thread.sleep(500);
        System.out.println("Sali select click sonrasi "+sali.isSelected());
        WebElement sunday= driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-input"));
        System.out.println("Pazar display "+sunday.isDisplayed());
        System.out.println("Pazar enable "+sunday.isEnabled());
        System.out.println("Pazar select "+sunday.isSelected());
        Thread.sleep(500);
        driver.close();

    }
}
