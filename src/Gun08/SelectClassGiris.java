/**
 * @Author:Otosun Tarih :02/09/2020
 */
package Gun08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class SelectClassGiris extends BaseStaticDriver {

    /*
            select  class ı
            görünen text ile seçim:  selectByVisibleText
            value si ile seçim    :  selectByValue
            indexi ile seçim      :  selectByIndex

            seçim yaptırılabilir.

            WebElement dropDownMenu=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

            Select menu = new Select(dropDownMenu);

            menu.selectByVisibleText("Automotive");
            menu.selectByValue("search-alias=automotive-intl-ship");
            menu.selectByIndex(2);
     */


        public static void main(String[] args) throws InterruptedException {
            driver.get("https://www.amazon.com/"); // siteyi açtım
            WebElement dropBox= driver.findElement(By.id("searchDropdownBox"));
            Select menu=new Select(dropBox);
            menu.selectByVisibleText("Books");
            WebElement ara= driver.findElement(By.xpath("//span[@id='nav-search-submit-text']"));
            ara.click();







            Thread.sleep(2000);
            driver.quit();
        }
    }

