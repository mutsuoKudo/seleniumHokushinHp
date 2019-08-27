package seleniumHokushinHP;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHokushinHPChrome {

	//現在時刻格納用
	public static LocalDateTime nowLocalDt = LocalDateTime.now();;

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

		//スクリーンショット保存フォルダ+ファイル名共通部
		String saveFolder = "./screenShots/";

		//カレントウインドウを最大化する
		//		driver.manage().window().maximize();

		// 指定のウィンドウサイズに変更
		int width = 1200 + 15;
		int height = 800;
		driver.manage().window().setSize(new Dimension(width, height));

		//driverはchromeがはいっている→https://ae1036569i.smartrelease.jpに遷移しろというている
		driver.get("https://ae1036569i.smartrelease.jp");

		try {

			//ちょっとだけ待つ
			Thread.sleep(10);// Let the user actually see something!

			//企業情報準備
			CompanyCheck companyCheck = new CompanyCheck();

			//企業情報（会社概要）
			companyCheck.clickAndCaptureFromHome(driver, wait, saveFolder, "会社概要");

			//ホームに戻る
			//クリック
			backHomeFromChild(driver, wait);

			//企業情報（理念）
			companyCheck.clickAndCaptureFromHome(driver, wait, saveFolder, "理念");

			//ホームに戻る
			//クリック
			backHomeFromChild(driver, wait);

			//企業情報（パートナーシナジー）
			companyCheck.clickAndCaptureFromHome(driver, wait, saveFolder, "パートナーシナジー");

			//ホームに戻る
			//クリック
			backHomeFromChild(driver, wait);

			//サービス

			ServiceCheck serviceCheck = new ServiceCheck();
			serviceCheck.clickAndCaptureFromHome(driver, wait, saveFolder);

			//終了のためしばらく待って
			Thread.sleep(500); // Let the user actually see something!

			//chrome終了
			driver.quit();

			JOptionPane pane = new JOptionPane("処理が終了しました。", JOptionPane.INFORMATION_MESSAGE);
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

	protected static void backHomeFromChild(WebDriver driver, WebDriverWait wait) {
		//ウィンドウサイズ確認
		int windowWidth = driver.manage().window().getSize().getWidth();
		//クリック
		if (windowWidth < (992 + 16)) {
			//（ハンバーガーメニュー）
			driver.findElement(
					By.cssSelector("body > header > nav > div.w-100 > button > span"))
					.click();

			//クリック対象要素が表示されるまで待つ（ハンバーガー→ホーム）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#Navbar > ul > li.nav-item.mt-4.mb-2 > a")));
			//クリック
			driver.findElement(By.cssSelector("#Navbar > ul > li.nav-item.mt-4.mb-2 > a")).click();
		} else {
			//通常メニュー
			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
		}

	}
}
