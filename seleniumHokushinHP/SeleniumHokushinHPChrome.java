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
		int width = 1300 + 15;
		int height = 730;
		driver.manage().window().setSize(new Dimension(width, height));

		//driverはchromeがはいっている→https://ae1036569i.smartrelease.jpに遷移しろというている
		driver.get("http://hokusys.jp");

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

		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		driver.get("https://atmick.blog.so-net.ne.jp/");

		waitAndClick(driver, wait, "#side-a > div:nth-child(16) > div.sidebar-body > ul > li > a", "＠ミックシンキングのリンク");

		//ちょっとだけ待つ
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e2) {
			// TODO 自動生成された catch ブロック
			e2.printStackTrace();
		} // Let the user actually see something!

		//企業情報準備
		CompanyCheck companyCheck = new CompanyCheck();

		//企業情報（会社概要）
		try {
			companyCheck.clickAndCaptureFromHome(driver, wait, saveFolder, "会社概要");
		} catch (IOException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}

		driver.get("https://atmick.blog.so-net.ne.jp/");

		waitAndClick(driver, wait, "#main > div:nth-child(3) > div.articles-body > a:nth-child(174)",
				"＠ミックシンキングの記事リンク");

		//ちょっとだけ待つ
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e2) {
			// TODO 自動生成された catch ブロック
			e2.printStackTrace();
		} // Let the user actually see something!

		//ホームに戻る
		String currUrl = driver.getCurrentUrl();
		System.out.println(currUrl);
		//クリック
		if (!(currUrl.equals("http://hokusys.jp/"))) {
			backHomeFromChild(driver, wait);
		}

		//企業情報（パートナーシナジー）
		try {
			companyCheck.clickAndCaptureFromHome(driver, wait, saveFolder, "パートナーシナジー");
		} catch (IOException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}

		driver.get("https://tetsuwangenshi.blog.so-net.ne.jp/");

		waitAndClick(driver, wait, "#side-a > div:nth-child(13) > div.sidebar-body > ul > li > a", "鉄腕原子のリンク");

		//企業情報（会社概要）
		try {
			companyCheck.clickAndCaptureFromHome(driver, wait, saveFolder, "会社概要");
		} catch (IOException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}

		driver.get("https://tetsuwangenshi.blog.so-net.ne.jp/");

		waitAndClick(driver, wait, "#main > div:nth-child(3) > div.articles-body > a:nth-child(13)",
				"鉄腕原子の記事リンク");

		//ホームに戻る
		currUrl = driver.getCurrentUrl();
		System.out.println(currUrl);
		//クリック
		if (!(currUrl.equals("http://hokusys.jp/"))) {
			backHomeFromChild(driver, wait);
		}

		//企業情報（パートナーシナジー）
		try {
			companyCheck.clickAndCaptureFromHome(driver, wait, saveFolder, "パートナーシナジー");
		} catch (IOException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}

		driver.get("https://tetsuwangenshi.blog.so-net.ne.jp/");

		waitAndClick(driver, wait, "#main > div:nth-child(6) > div.articles-body > a:nth-child(13)",
				"鉄腕原子の記事リンク");

		//ホームに戻る
		currUrl = driver.getCurrentUrl();
		System.out.println(currUrl);
		//クリック
		if (!(currUrl.equals("http://hokusys.jp/"))) {
			backHomeFromChild(driver, wait);
		}

		//企業情報（パートナーシナジー）
		try {
			companyCheck.clickAndCaptureFromHome(driver, wait, saveFolder, "理念");
		} catch (IOException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}

		driver.get("https://tetsuwangenshi.blog.so-net.ne.jp/");

		waitAndClick(driver, wait, "#main > div:nth-child(9) > div.articles-body > a:nth-child(13)",
				"鉄腕原子の記事リンク");

		//ホームに戻る
		currUrl = driver.getCurrentUrl();
		System.out.println(currUrl);
		//クリック
		if (!(currUrl.equals("http://hokusys.jp/"))) {
			backHomeFromChild(driver, wait);
		}

		ServiceCheck serviceCheck = new ServiceCheck();

		try {
			serviceCheck.clickAndCaptureFromHome(driver, wait, saveFolder);
		} catch (IOException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}

		driver.get("https://tetsuwangenshi.blog.so-net.ne.jp/");

		waitAndClick(driver, wait, "#main > div:nth-child(12) > div.articles-body > a:nth-child(13)",
				"鉄腕原子の記事リンク");

		//ホームに戻る
		currUrl = driver.getCurrentUrl();
		System.out.println(currUrl);
		//クリック
		if (!(currUrl.equals("http://hokusys.jp/"))) {
			backHomeFromChild(driver, wait);
		}

		try {
			serviceCheck.clickAndCaptureFromHome(driver, wait, saveFolder);
		} catch (IOException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}

		driver.get("https://tetsuwangenshi.blog.so-net.ne.jp/");

		waitAndClick(driver, wait, "#main > div:nth-child(15) > div.articles-body > a:nth-child(13)",
				"鉄腕原子の記事リンク");

		//ホームに戻る
		currUrl = driver.getCurrentUrl();
		System.out.println(currUrl);
		//クリック
		if (!(currUrl.equals("http://hokusys.jp/"))) {
			backHomeFromChild(driver, wait);
		}

		//企業情報（会社概要）
		try {
			companyCheck.clickAndCaptureFromHome(driver, wait, saveFolder, "会社概要");
		} catch (IOException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}

		//終了のためしばらく待って
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} // Let the user actually see something!

		//chrome終了
		driver.quit();

		JOptionPane pane = new JOptionPane("処理が終了しました。", JOptionPane.INFORMATION_MESSAGE);
		JDialog dialog = pane.createDialog(null, "seleniumHokushinHp");
		dialog.setAlwaysOnTop(true);
		dialog.setVisible(true);
		System.out.println("*** 終了メッセージ表示終了");
		dialog.dispose();
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

	protected static void waitAndClick(WebDriver driver, WebDriverWait wait, String cssSelector, String targetName) {

		//クリック対象要素が表示されるまで待つ
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(cssSelector)));

		//クリック
		driver.findElement(By.cssSelector(cssSelector)).click();

		//コンソール出力
		System.out.println(targetName + " クリック");
	}
}
