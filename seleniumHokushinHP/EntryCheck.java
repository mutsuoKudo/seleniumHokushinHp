package seleniumHokushinHP;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryCheck {

	//トップからのアクセス
	protected void clickAndCaptureFromHome(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

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

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "トップページからエントリー");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "トップページからエントリースクロール後");

	}

	//会社概要からのアクセス
	public void clickAndCaptureFromOther(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

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
				.visibilityOfElementLocated(By.cssSelector("#menu-item-21 > div > a:nth-child(5)")));

		//クリック(ナビゲーションバーのエントリー
		driver.findElement(By
				.cssSelector("#menu-item-21 > div > a:nth-child(5)"))
				.click();

		//クリック対象要素が表示されるまで待つ（ApplicationFormタイトル）
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(
						By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

	}

	//	会社概要からのアクセスキャプチャー
	protected void captureFromCompany(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "会社概要からエントリー");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "会社概要からエントリースクロール後");

	}

	//	理念からのアクセスキャプチャー
	protected void captureFromPhilosophy(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "理念からエントリー");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "理念からエントリースクロール後");

	}

	//	パートナーシナジーからのアクセスキャプチャー
	public void captureFromPartnersynergy(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "パートナーシナジーからエントリー");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "パートナーシナジーからエントリースクロール後");
	}

	//	サービスからのアクセスキャプチャー
	public void captureFromService(WebDriver driver, WebDriverWait wait, String saveFolder) throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "サービスからエントリー");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "サービスからエントリースクロール後");
	}

}
