/**
 * @Author:Otosun Tarih :10/09/2020
 */
package Gun14;

import org.openqa.selenium.JavascriptExecutor;
import utils.BaseStaticDriver;
/*
    Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
    Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için
    ve sayfanın üstünde oluşan ek popuplar ın konumun kaydırılmasıdır.
    Çünkü üzerinde popup olan eleman tıklatılamaz.

    Bu işlem javascript executer ile yapılır.Bu interface sayesinde
    sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir
    sayfa üzerinde.
 */
public class ScroolIntro extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://triplebyte.com/");
        JavascriptExecutor js=(JavascriptExecutor) driver;  // JavaScript komutlarını çalıştırmak için önce js değişkeni tanımlandı.
        js.executeScript("window.scrollBy(0,5000)");  // javascript komutu internetten bulunarak , executeScript metodu ile çalıştırıldı
                                                            // window.scrollBy(0, 5000)  : window u kaydı x ve y miktarınca.
                                                            // Burada sayfa 5000 pixel kaydırıldı.
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-2000)"); // Burada sayfa -2000 pixel kaydırıldı.  - (eksi verildiğinden yukarı kaydırıldı.)

        Thread.sleep(3000);
        driver.quit();
    }
}
