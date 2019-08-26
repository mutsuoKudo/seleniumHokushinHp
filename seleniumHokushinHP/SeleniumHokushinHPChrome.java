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

		//driverはchromeがはいっている→index.phpに遷移しろというている
		//        driver.get("http://192.168.71.208/hokushin_util/index.php");
		driver.get("https://ae1036569i.smartrelease.jp/");

		try {
			//ちょっとだけ待つ
			Thread.sleep(10);// Let the user actually see something!

//トップページについてここから
//トップページのナビゲーションバーここから
//会社概要
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの企業情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span")));

			//クリック準備
			//driver.findElement(By.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(3) > a > span")).sendKeys(Keys.CONTROL);

			//クリック(ナビゲーションバーの企業情報)
			driver.findElement(By
					.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span"))
					.click();
			System.out.println("企業情報クリック");

			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの会社概要)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a")));

			//クリック(ナビゲーションバーの会社概要)
			driver.findElement(By.cssSelector(
					"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a"))
					.click();
			System.out.println("会社概要クリック");

			//クリック対象要素が表示されるまで待つ（Companyタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			File sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			String destFileName = saveFolder + localTimeStr1 + "会社概要画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			Path sourcePath = Paths.get(sfile.getAbsolutePath());
			Path targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("会社概要キャプチャ");

			////会社概要NEWS
			//          //クリック(会社概要のNEWS)
			//           driver.findElement(By.cssSelector("li > a")).click();
			//
			//           //クリック対象要素が表示されるまで待つ(会社概要のNEWSモーダル)
			//			wait.until(ExpectedConditions
			//                  .visibilityOfElementLocated(By.cssSelector("#modal01-label\\ font-weight-bold\\ text-center")));
			//
			//			//キャプチャ
			//	         sfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//
			//	         //コピー先の指定→ファイル名に時刻付加
			//	         nowLocalDt = LocalDateTime.now();
			//	         localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			//	         destFileName = saveFolder + localTimeStr1 + "会社概要NEWS.png";
			//	         System.out.println("ファイル名" + destFileName);
			//
			//	         //キャプチャ一時画像を消える前にコピー
			//	         sourcePath = Paths.get(sfile.getAbsolutePath());
			//	         targetPath = Paths.get(destFileName);
			//	         Files.move(sourcePath, targetPath);
			//
			//	       //クリック(会社概要のNEWSモーダル閉じるボタン)
			//	           driver.findElement(By.cssSelector("#about-modal > div > div > div.modal-header.hs-recruit-modal-header > button")).click();

			//ホームに戻る
			//クリック
			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			System.out.println("ホームボタンクリック");

//理念
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの企業情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span")));

			//クリック(ナビゲーションバーの企業情報)
			driver.findElement(By
					.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span"))
					.click();
			System.out.println("企業情報クリック");

			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの理念)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(2) > a")));

			//クリック(ナビゲーションバーの理念)
			driver.findElement(By.cssSelector(
					"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(2) > a"))
					.click();
			System.out.println("理念クリック");

			//クリック対象要素が表示されるまで待つ（Philosophyタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "理念画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("理念キャプチャ");

			//ホームに戻る
			//クリック
			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			System.out.println("ホームボタンクリック");

//パートナーシナジー
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの企業情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span")));

			//クリック(ナビゲーションバーの企業情報)
			driver.findElement(By
					.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span"))
					.click();
			System.out.println("企業情報クリック");

			//クリック対象要素が表示されるまで待つ(ナビゲーションバーのパートナーシナジー)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(3) > a")));

			//クリック(ナビゲーションバーのパートナーシナジー)
			driver.findElement(By.cssSelector(
					"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(3) > a"))
					.click();
			System.out.println("パートナーシナジークリック");

			//クリック対象要素が表示されるまで待つ（PartnerSynergyタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "パートナーシナジー画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("パートナーシナジーキャプチャ");

			//ホームに戻る
			//クリック
			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			System.out.println("ホームボタンクリック");

//サービス
			//クリック対象要素が表示されるまで待つ
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(3) > a > span")));

			//クリック準備
			//driver.findElement(By.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(3) > a > span")).sendKeys(Keys.CONTROL);

			//クリック
			driver.findElement(By
					.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(3) > a > span"))
					.click();
			System.out.println("サービスクリック");

			//クリック対象要素が表示されるまで待つ
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "サービス画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("サービスキャプチャ");

			//         // pagedown 押下
			//            act.sendKeys(Keys.PAGE_DOWN);
			//
			//          //しばらく待って
			//	        Thread.sleep(1000);
			//
			//	        //キャプチャ
			//           sfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//
			//            //コピー先の指定→ファイル名に時刻付加
			//            nowLocalDt = LocalDateTime.now();
			//            localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			//            destFileName = saveFolder + localTimeStr1 + "サービス画面スクロール後.png";
			//            System.out.println("ファイル名" + destFileName);
			//
			//            //キャプチャ一時画像を消える前にコピー
			//            sourcePath = Paths.get(sfile.getAbsolutePath());
			//            targetPath = Paths.get(destFileName);
			//            Files.move(sourcePath, targetPath);

			//ホームに戻る
			//クリック
			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			System.out.println("ホームボタンクリック");

//募集一覧
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの採用情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(4) > a > span")));

			//クリック(ナビゲーションバーの採用情報)
			driver.findElement(By
					.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(4) > a > span"))
					.click();
			System.out.println("採用情報クリック");

			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの募集一覧)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a")));

			//クリック(ナビゲーションバーの募集一覧)
			driver.findElement(By.cssSelector(
					"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a"))
					.click();
			System.out.println("募集一覧クリック");

			//クリック対象要素が表示されるまで待つ（JobCategoryタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "募集一覧画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("募集一覧キャプチャ");

			//ホームに戻る
			//クリック
			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			System.out.println("ホームボタンクリック");

//福利厚生
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの採用情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(4) > a > span")));

			//クリック(ナビゲーションバーの採用情報)
			driver.findElement(By
					.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(4) > a > span"))
					.click();
			System.out.println("採用情報クリック");

			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの福利厚生)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(2) > a")));

			//クリック(ナビゲーションバーの福利厚生)
			driver.findElement(By.cssSelector(
					"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(2) > a"))
					.click();
			System.out.println("福利厚生クリック");

			//クリック対象要素が表示されるまで待つ（Welfareタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "福利厚生画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("福利厚生キャプチャ");

			//ホームに戻る
			//クリック
			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			System.out.println("ホームボタンクリック");

//教育・研修
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの採用情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(4) > a > span")));

			//クリック(ナビゲーションバーの採用情報)
			driver.findElement(By
					.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(4) > a > span"))
					.click();
			System.out.println("採用情報クリック");

			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの募集一覧)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(3) > a")));

			//クリック(ナビゲーションバーの募集一覧)
			driver.findElement(By.cssSelector(
					"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(3) > a"))
					.click();
			System.out.println("募集一覧クリック");

			//クリック対象要素が表示されるまで待つ（Trainingタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "教育・研修画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("教育・研修キャプチャ");

			//ホームに戻る
			//クリック
			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			System.out.println("ホームボタンクリック");

//社員の声
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの採用情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(4) > a > span")));

			//クリック(ナビゲーションバーの採用情報)
			driver.findElement(By
					.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(4) > a > span"))
					.click();
			System.out.println("採用情報クリック");

			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの社員の声)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(4) > a")));

			//クリック(ナビゲーションバーの社員の声)
			driver.findElement(By.cssSelector(
					"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(4) > a"))
					.click();
			System.out.println("募集一覧クリック");

			//クリック対象要素が表示されるまで待つ（Voicesタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "社員の声画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("社員の声キャプチャ");

			//ホームに戻る
			//クリック
			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			System.out.println("ホームボタンクリック");

//エントリー
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの採用情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(4) > a > span")));

			//クリック(ナビゲーションバーの採用情報)
			driver.findElement(By
					.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(4) > a > span"))
					.click();
			System.out.println("採用情報クリック");

			//クリック対象要素が表示されるまで待つ(ナビゲーションバーのエントリー)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(5) > a")));

			//クリック(ナビゲーションバーのエントリー)
			driver.findElement(By.cssSelector(
					"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(5) > a"))
					.click();
			System.out.println("募集一覧クリック");

			//クリック対象要素が表示されるまで待つ（ApplicationFormタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "エントリー画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("エントリーキャプチャ");

			//ホームに戻る
			//クリック
			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			System.out.println("ホームボタンクリック");

//お問い合わせ
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーのお問い合わせ)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(5) > a > span")));

			//クリック(ナビゲーションバーのお問い合わせ)
			driver.findElement(By
					.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(5) > a > span"))
					.click();
			System.out.println("お問い合わせクリック");

			//クリック対象要素が表示されるまで待つ（Contactタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "お問い合わせ画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("お問い合わせキャプチャ");

			//ホームに戻る
			//クリック
			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			System.out.println("ホームボタンクリック");

//トップページのナビゲーションバーここまで

//トップページの梅アイコンここから

//梅アイコン左から一番目
			//クリック対象要素が表示されるまで待つ(梅アイコン左から一番目)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(1) > div > p.hs-icon > a")));

			//クリック(梅アイコン左から一番目)
			driver.findElement(By.cssSelector(
					"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(1) > div > p.hs-icon > a"))
					.click();
			System.out.println("梅アイコン左から一番目");

			//クリック対象要素が表示されるまで待つ（会社概要：Companyタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "梅アイコンからの会社概要画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("梅アイコンからの会社概要キャプチャ");

			//ホームに戻る
			//クリック
			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			System.out.println("ホームボタンクリック");

//梅アイコン左から二番目
			//クリック対象要素が表示されるまで待つ(梅アイコン左から二番目)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(2) > div > p.hs-icon > a")));

			//クリック(梅アイコン左から二番目)
			driver.findElement(By.cssSelector(
					"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(2) > div > p.hs-icon > a"))
					.click();
			System.out.println("梅アイコン左から二番目");

			//クリック対象要素が表示されるまで待つ（理念：Philosophyタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "梅アイコンからの理念画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("梅アイコンからの理念キャプチャ");

			//ホームに戻る
			//クリック
			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			System.out.println("ホームボタンクリック");

//梅アイコン左から三番目
			//クリック対象要素が表示されるまで待つ(梅アイコン左から三番目)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(3) > div > p.hs-icon > a")));

			//クリック(梅アイコン左から三番目)
			driver.findElement(By.cssSelector(
					"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(3) > div > p.hs-icon > a"))
					.click();
			System.out.println("梅アイコン左から三番目");

			//クリック対象要素が表示されるまで待つ（パートナーシナジー：PartnerSynergyタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "梅アイコンからのパートナーシナジー画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("梅アイコンからのパートナーシナジーキャプチャ");

			//ホームに戻る
			//クリック
			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			System.out.println("ホームボタンクリック");

//梅アイコン左から四番目
			//クリック対象要素が表示されるまで待つ(梅アイコン左から四番目)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(4) > div > p.hs-icon > a")));

			//クリック(梅アイコン左から四番目)
			driver.findElement(By.cssSelector(
					"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(4) > div > p.hs-icon > a"))
					.click();
			System.out.println("梅アイコン左から四番目");

			//クリック対象要素が表示されるまで待つ（パートナーシナジー：PartnerSynergyタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "梅アイコンからのサービス画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("梅アイコンからのサービスキャプチャ");

			//ホームに戻る
			//クリック
			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			System.out.println("ホームボタンクリック");

//梅アイコン左から五番目
			//クリック対象要素が表示されるまで待つ(梅アイコン左から五番目)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(5) > div > p.hs-icon > a")));

			//クリック(梅アイコン左から五番目)
			driver.findElement(By.cssSelector(
					"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(5) > div > p.hs-icon > a"))
					.click();
			System.out.println("梅アイコン左から五番目");

			//クリック対象要素が表示されるまで待つ（募集一覧：JobCategoryタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "梅アイコンからの募集一覧画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("梅アイコンからの募集一覧キャプチャ");

			//ホームに戻る
			//クリック
			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			System.out.println("ホームボタンクリック");

//梅アイコン左から六番目
			//クリック対象要素が表示されるまで待つ(梅アイコン左から六番目)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(6) > div > p.hs-icon > a")));

			//クリック(梅アイコン左から六番目)
			driver.findElement(By.cssSelector(
					"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(6) > div > p.hs-icon > a"))
					.click();
			System.out.println("梅アイコン左から六番目");

			//クリック対象要素が表示されるまで待つ（福利厚生：Welfareタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "梅アイコンからの福利厚生画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("梅アイコンからの福利厚生キャプチャ");

			//ホームに戻る
			//クリック
			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			System.out.println("ホームボタンクリック");

//梅アイコン左から七番目
			//クリック対象要素が表示されるまで待つ(梅アイコン左から七番目)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(7) > div > p.hs-icon > a")));

			//クリック(梅アイコン左から七番目)
			driver.findElement(By.cssSelector(
					"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(7) > div > p.hs-icon > a"))
					.click();
			System.out.println("梅アイコン左から七番目");

			//クリック対象要素が表示されるまで待つ（教育・研修：Trainingタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "梅アイコンからの教育・研修画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("梅アイコンからの教育・研修キャプチャ");

			//ホームに戻る
			//クリック
			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			System.out.println("ホームボタンクリック");

//梅アイコン左から八番目
			//クリック対象要素が表示されるまで待つ(梅アイコン左から八番目)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(8) > div > p.hs-icon > a")));

			//クリック(梅アイコン左から八番目)
			driver.findElement(By.cssSelector(
					"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(8) > div > p.hs-icon > a"))
					.click();
			System.out.println("梅アイコン左から八番目");

			//クリック対象要素が表示されるまで待つ（社員の声：Voicesタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "梅アイコンからの社員の声画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("梅アイコンからの社員の声キャプチャ");

			//ホームに戻る
			//クリック
			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			System.out.println("ホームボタンクリック");

//トップページの梅アイコンここまで

//トップページヘッダーロゴここから

			//クリック対象要素が表示されるまで待つ(トップページヘッダーロゴ)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("body > div.hs-base-container > nav > div.w-100 > a")));

			//クリック(トップページヘッダーロゴ)
			driver.findElement(By.cssSelector("body > div.hs-base-container > nav > div.w-100 > a")).click();
			System.out.println("トップページヘッダーロゴ");

			//クリック対象要素が表示されるまで待つ（トップページヘッダーロゴimg）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.hs-base-container > nav > div.w-100 > a > img")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "トップページヘッダーロゴからのトップ画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("トップページヘッダーロゴからのトップキャプチャ");

			//すでにトップにいるため戻りはなし。

//トップページヘッダーロゴここまで

//トップページフッタここから

//トップページフッターロゴ
			//クリック対象要素が表示されるまで待つ(トップページフッターロゴ)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("body > div.hs-base-container > nav > div.w-100 > a")));

			//クリック(トップページフッターロゴ)
			driver.findElement(By.cssSelector("#footer-comtent-comp-left > a")).click();
			System.out.println("トップページフッターロゴ");

			//クリック対象要素が表示されるまで待つ（トップページフッターロゴimg）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#footer-logo")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "トップページフッターロゴからのトップ画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("トップページフッターロゴからのトップキャプチャ");

			//すでにトップにいるため戻りはなし。

//トップページフッターここまで
//トップページについてここまで


//会社概要についてここから
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの企業情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span")));

			//クリック(ナビゲーションバーの企業情報)
			driver.findElement(By
					.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span"))
					.click();
			System.out.println("企業情報クリック");

			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの会社概要)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a")));

			//クリック(ナビゲーションバーの会社概要)
			driver.findElement(By.cssSelector(
					"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a"))
					.click();
			System.out.println("会社概要クリック");


//会社概要からのトップページ
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーホーム)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#menu-item-18 > a > span")));

			//クリック(ナビゲーションバーホーム)
			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			System.out.println("プライバシーマーク");

			//クリック対象要素が表示されるまで待つ（トップページ）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#privacymark-logo")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "会社概要からのトップ画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("会社概要からのトップキャプチャ");

			//会社概要に戻る
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの企業情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span")));

			//クリック(ナビゲーションバーの企業情報)
			driver.findElement(By
					.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span"))
					.click();
			System.out.println("企業情報クリック");

			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの会社概要)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a")));

			//クリック(ナビゲーションバーの会社概要)
			driver.findElement(By.cssSelector(
					"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a"))
					.click();
			System.out.println("会社概要クリック");


//会社概要からの理念
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの企業情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#navbarDropdownCompany > span")));

			//クリック(ナビゲーションバーの企業情報)
			driver.findElement(By
					.cssSelector("#navbarDropdownCompany > span"))
					.click();
			System.out.println("企業情報クリック");

			//クリック対象要素が表示されるまで待つ（理念）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#menu-item-22 > div > a:nth-child(2)")));

			//クリック(ナビゲーションバーの理念)
			driver.findElement(By
					.cssSelector("#menu-item-22 > div > a:nth-child(2)"))
					.click();

			//クリック対象要素が表示されるまで待つ（Philosophyタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "会社概要からの理念画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("会社概要からの理念キャプチャ");

			//会社概要に戻る
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの企業情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#navbarDropdownCompany > span")));

			//クリック(ナビゲーションバーの企業情報)
			driver.findElement(By
					.cssSelector("#navbarDropdownCompany > span"))
					.click();
			System.out.println("企業情報クリック");

			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの会社概要)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0")));

			//クリック(ナビゲーションバーの会社概要)
			driver.findElement(By.cssSelector(
					"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0"))
					.click();
			System.out.println("会社概要クリック");


//会社概要からのパートナーシナジー
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの企業情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#navbarDropdownCompany > span")));

			//クリック(ナビゲーションバーの企業情報)
			driver.findElement(By
					.cssSelector("#navbarDropdownCompany > span"))
					.click();
			System.out.println("企業情報クリック");

			//クリック対象要素が表示されるまで待つ（パートナーシナジー）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#menu-item-22 > div > a:nth-child(3)")));

			//クリック(ナビゲーションバーのパートナーシナジー)
			driver.findElement(By
					.cssSelector("#menu-item-22 > div > a:nth-child(3)"))
					.click();

			//クリック対象要素が表示されるまで待つ（PartnerSynergyタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "会社概要からのパートナーシナジー画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("会社概要からの理念キャプチャ");

			//会社概要に戻る
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの企業情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#navbarDropdownCompany > span")));

			//クリック(ナビゲーションバーの企業情報)
			driver.findElement(By
					.cssSelector("#navbarDropdownCompany > span"))
					.click();
			System.out.println("企業情報クリック");

			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの会社概要)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0")));

			//クリック(ナビゲーションバーの会社概要)
			driver.findElement(By.cssSelector(
					"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0"))
					.click();
			System.out.println("会社概要クリック");


//会社概要からのサービス
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーのサービス)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#menu-item-20 > a > span")));

			//クリック(ナビゲーションバーのサービス)
			driver.findElement(By
					.cssSelector("#menu-item-20 > a > span"))
					.click();
			System.out.println("サービスクリック");

			//クリック対象要素が表示されるまで待つ（Serviceタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));


			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "会社概要からのサービス画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("会社概要からのサービスキャプチャ");

			//会社概要に戻る
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの企業情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#navbarDropdownCompany > span")));

			//クリック(ナビゲーションバーの企業情報)
			driver.findElement(By
					.cssSelector("#navbarDropdownCompany > span"))
					.click();
			System.out.println("企業情報クリック");

			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの会社概要)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0")));

			//クリック(ナビゲーションバーの会社概要)
			driver.findElement(By.cssSelector(
					"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0"))
					.click();
			System.out.println("会社概要クリック");


//会社概要からの募集一覧
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの採用情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#navbarDropdownRecruit > span")));

			//クリック(ナビゲーションバーの採用情報)
			driver.findElement(By
					.cssSelector("#navbarDropdownRecruit > span"))
					.click();
			System.out.println("採用情報クリック");

			//クリック対象要素が表示されるまで待つ（募集一覧）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0")));

			//クリック(ナビゲーションバーの募集一覧)
			driver.findElement(By
					.cssSelector("#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0"))
					.click();

			//クリック対象要素が表示されるまで待つ（JobCategoryタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "会社概要からの募集一覧画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("会社概要からの募集一覧キャプチャ");

			//会社概要に戻る
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの企業情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#navbarDropdownCompany > span")));

			//クリック(ナビゲーションバーの企業情報)
			driver.findElement(By
					.cssSelector("#navbarDropdownCompany > span"))
					.click();
			System.out.println("企業情報クリック");

			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの会社概要)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0")));

			//クリック(ナビゲーションバーの会社概要)
			driver.findElement(By.cssSelector(
					"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0"))
					.click();
			System.out.println("会社概要クリック");


//会社概要からの福利厚生
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの採用情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#navbarDropdownRecruit > span")));

			//クリック(ナビゲーションバーの採用情報)
			driver.findElement(By
					.cssSelector("#navbarDropdownRecruit > span"))
					.click();
			System.out.println("採用情報クリック");

			//クリック対象要素が表示されるまで待つ（福利厚生
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#menu-item-22 > div > a:nth-child(2)")));

			//クリック(ナビゲーションバーの福利厚生
			driver.findElement(By
					.cssSelector("#menu-item-22 > div > a:nth-child(2)"))
					.click();

			//クリック対象要素が表示されるまで待つ（Welfareタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "会社概要からの福利厚生画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("会社概要からの福利厚生キャプチャ");

			//会社概要に戻る
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの企業情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#navbarDropdownCompany > span")));

			//クリック(ナビゲーションバーの企業情報)
			driver.findElement(By
					.cssSelector("#navbarDropdownCompany > span"))
					.click();
			System.out.println("企業情報クリック");

			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの会社概要)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0")));

			//クリック(ナビゲーションバーの会社概要)
			driver.findElement(By.cssSelector(
					"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0"))
					.click();
			System.out.println("会社概要クリック");


//会社概要からの教育・研修
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの採用情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#navbarDropdownRecruit > span")));

			//クリック(ナビゲーションバーの採用情報)
			driver.findElement(By
					.cssSelector("#navbarDropdownRecruit > span"))
					.click();
			System.out.println("採用情報クリック");

			//クリック対象要素が表示されるまで待つ（教育・研修）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#menu-item-22 > div > a:nth-child(3)")));

			//クリック(ナビゲーションバーの教育・研修
			driver.findElement(By
					.cssSelector("#menu-item-22 > div > a:nth-child(3)"))
					.click();

			//クリック対象要素が表示されるまで待つ（Trainingタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "会社概要からの教育・研修画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("会社概要からの教育・研修キャプチャ");

			//会社概要に戻る
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの企業情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#navbarDropdownCompany > span")));

			//クリック(ナビゲーションバーの企業情報)
			driver.findElement(By
					.cssSelector("#navbarDropdownCompany > span"))
					.click();
			System.out.println("企業情報クリック");

			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの会社概要)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0")));

			//クリック(ナビゲーションバーの会社概要)
			driver.findElement(By.cssSelector(
					"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0"))
					.click();
			System.out.println("会社概要クリック");


//会社概要からの社員の声
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの採用情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#navbarDropdownRecruit > span")));

			//クリック(ナビゲーションバーの採用情報)
			driver.findElement(By
					.cssSelector("#navbarDropdownRecruit > span"))
					.click();
			System.out.println("採用情報クリック");

			//クリック対象要素が表示されるまで待つ（社員の声）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#menu-item-22 > div > a:nth-child(4)")));

			//クリック(ナビゲーションバーの社員の声
			driver.findElement(By
					.cssSelector("#menu-item-22 > div > a:nth-child(4)"))
					.click();

			//クリック対象要素が表示されるまで待つ（Voicesタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "会社概要からの社員の声画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("会社概要からの社員の声キャプチャ");

			//会社概要に戻る
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの企業情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#navbarDropdownCompany > span")));

			//クリック(ナビゲーションバーの企業情報)
			driver.findElement(By
					.cssSelector("#navbarDropdownCompany > span"))
					.click();
			System.out.println("企業情報クリック");

			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの会社概要)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0")));

			//クリック(ナビゲーションバーの会社概要)
			driver.findElement(By.cssSelector(
					"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0"))
					.click();
			System.out.println("会社概要クリック");


//会社概要からのエントリー
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの採用情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#navbarDropdownRecruit > span")));

			//クリック(ナビゲーションバーの採用情報)
			driver.findElement(By
					.cssSelector("#navbarDropdownRecruit > span"))
					.click();
			System.out.println("採用情報クリック");

			//クリック対象要素が表示されるまで待つ（エントリー）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#menu-item-22 > div > a:nth-child(5)")));

			//クリック(ナビゲーションバーのエントリー
			driver.findElement(By
					.cssSelector("#menu-item-22 > div > a:nth-child(5)"))
					.click();

			//クリック対象要素が表示されるまで待つ（ApplicationFormタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "会社概要からのエントリー画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("会社概要からのエントリーキャプチャ");

			//会社概要に戻る
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの企業情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#navbarDropdownCompany > span")));

			//クリック(ナビゲーションバーの企業情報)
			driver.findElement(By
					.cssSelector("#navbarDropdownCompany > span"))
					.click();
			System.out.println("企業情報クリック");

			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの会社概要)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0")));

			//クリック(ナビゲーションバーの会社概要)
			driver.findElement(By.cssSelector(
					"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0"))
					.click();
			System.out.println("会社概要クリック");


//会社概要からのお問合せ
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーのお問合せ)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#menu-item-19 > a > span")));

			//クリック(ナビゲーションバーのサービス)
			driver.findElement(By
					.cssSelector("#menu-item-19 > a > span"))
					.click();
			System.out.println("お問合せクリック");

			//クリック対象要素が表示されるまで待つ（Contactタイトル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(
							By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));


			//キャプチャ
			sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			//コピー先の指定→ファイル名に時刻付加
			nowLocalDt = LocalDateTime.now();
			localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
			destFileName = saveFolder + localTimeStr1 + "会社概要からのサービス画面.png";
			System.out.println("ファイル名" + destFileName);

			//キャプチャ一時画像を消える前にコピー
			sourcePath = Paths.get(sfile.getAbsolutePath());
			targetPath = Paths.get(destFileName);
			Files.move(sourcePath, targetPath);

			System.out.println("会社概要からのサービスキャプチャ");

//理念に戻る
			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの企業情報)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#navbarDropdownCompany > span")));

			//クリック(ナビゲーションバーの企業情報)
			driver.findElement(By
					.cssSelector("#navbarDropdownCompany > span"))
					.click();
			System.out.println("企業情報クリック");

			//クリック対象要素が表示されるまで待つ(ナビゲーションバーの理念)
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"#menu-item-22 > div > a:nth-child(2)")));

			//クリック(ナビゲーションバーの理念)
			driver.findElement(By.cssSelector(
					"#menu-item-22 > div > a:nth-child(2)"))
					.click();
			System.out.println("会社概要クリック");































			//しばらく待って
			Thread.sleep(500); // Let the user actually see something!

			//chrome終了
			driver.quit();

			System.out.println("chrone終了");

			//終了メッセージ
			JOptionPane pane = new JOptionPane("処理が終了しました。", JOptionPane.INFORMATION_MESSAGE);
			JDialog dialog = pane.createDialog(null, "seleniumHokushinChrome");
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
