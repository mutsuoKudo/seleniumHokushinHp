package seleniumHokushinHP;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHokushinHPChrome {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//chromeドライバの設定 Chromeを使用するよという設定
        System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();

        //実行する前にメモリをクリアさせる
        options.addArguments("--purge-memory-button");

//        見えないところでやる
//        options.addArguments("--headless");

        WebDriver driver = new ChromeDriver(options);
        //待ち時間を設定 今回は22秒
        WebDriverWait wait = new WebDriverWait(driver, 22);

        Actions act = new Actions(driver);

      //現在時刻格納用
        LocalDateTime nowLocalDt = null;
      //現在時刻の文字列化用
        String localTimeStr1 = null;
      //スクリーンショット保存フォルダ+ファイル名共通部
        String saveFolder = "./screenShots/";

      //カレントウインドウを最大化する
	    driver.manage().window().maximize();

        //driverはchromeがはいっている→https://ae1036569i.smartrelease.jpに遷移しろというている
//        driver.get("http://192.168.71.208/hokushin_util/index.php");
        driver.get("https://ae1036569i.smartrelease.jp");

        try {

			//カレントウインドウを最大化する
		    driver.manage().window().maximize();
        	//ちょっとだけ待つ
			Thread.sleep(10);// Let the user actually see something!

			//会社概要
			 //クリック対象要素が表示されるまで待つ
			wait.until(ExpectedConditions
                   .visibilityOfElementLocated(By.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span")));

			//クリック準備
			//driver.findElement(By.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(3) > a > span")).sendKeys(Keys.CONTROL);

			//クリック
           driver.findElement(By.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span")).click();

           //クリック対象要素が表示されるまで待つ
			wait.until(ExpectedConditions
                  .visibilityOfElementLocated(By.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a")));

			//クリック
	           driver.findElement(By.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a")).click();


			 //クリック対象要素が表示されるまで待つ
			wait.until(ExpectedConditions
                  .visibilityOfElementLocated(By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));


	        //キャプチャ
           File sfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

           //コピー先の指定→ファイル名に時刻付加
           nowLocalDt = LocalDateTime.now();
           localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
           String destFileName = saveFolder + localTimeStr1 + "会社概要画面.png";
           System.out.println("ファイル名" + destFileName);

           //キャプチャ一時画像を消える前にコピー
           Path sourcePath = Paths.get(sfile.getAbsolutePath());
           Path targetPath = Paths.get(destFileName);
           Files.move(sourcePath, targetPath);

           //ホームに戻る
         //クリック
           driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();


           //サービス

           ServiceCheck serviceCheck = new ServiceCheck();

           serviceCheck.clickAndCaptureFromHome(driver, wait, saveFolder);



		    //終了のためしばらく待って
	        Thread.sleep(500);  // Let the user actually see something!

	        //chrome終了
	        driver.quit();

            JOptionPane pane = new JOptionPane("処理が終了しました。" , JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = pane.createDialog(null, "seleniumHokushinHp");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            System.out.println("*** 終了メッセージ表示終了");
            dialog.dispose();


        } catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}
