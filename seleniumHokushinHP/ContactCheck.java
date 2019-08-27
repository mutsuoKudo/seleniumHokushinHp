package seleniumHokushinHP;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactCheck {



	//トップからのアクセス
	protected void clickAndCaptureFromHome(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

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

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "トップページからお問い合わせ");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "トップページからお問い合わせスクロール後");

	}


	//会社概要・理念からのアクセス
	public void clickAndCaptureFromOther(WebDriver driver, WebDriverWait wait, String saveFolder)throws IOException, InterruptedException{
		// TODO 自動生成されたメソッド・スタブ

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

	}

//	会社概要からのアクセスキャプチャー
	protected void captureFromCompany(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "会社概要からお問合せ");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "会社概要からお問合せスクロール後");

	}

	//	理念からのアクセスキャプチャー
	protected void captureFromPhilosophy(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "理念からお問合せ");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "理念からお問合せスクロール後");

	}

//	パートナーシナジーからのアクセスキャプチャー
	public void captureFromPartnersynergy(WebDriver driver, WebDriverWait wait, String saveFolder)throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "パートナーシナジーからお問合せ");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "パートナーシナジーからお問合せスクロール後");

	}

//	サービスからのアクセスキャプチャー
	public void captureFromServuce(WebDriver driver, WebDriverWait wait, String saveFolder) throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "サービスからお問合せ");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "サービスからお問合せスクロール後");


	}


}
