package seleniumHokushinHP;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhilosophyCheck {
	//トップページから理念へ遷移のみ
	public void toPhilosophy(WebDriver driver, WebDriverWait wait, String saveFolder) {
		// TODO 自動生成されたメソッド・スタブ

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

	}

	//理念へ戻る
	public void backToPhilosophy(WebDriver driver, WebDriverWait wait, String saveFolder) {
		// TODO 自動生成されたメソッド・スタブ

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
	}

	//トップからのアクセス
	protected void clickAndCaptureFromHome(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

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

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "トップページから理念");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "トップページから理念スクロール後");
	}

	//会社概要・理念からのアクセス
	public void clickAndCaptureFromOther(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
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

	}

	//会社概要からのアクセスキャプチャー
	protected void captureFromCompany(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "会社概要から理念");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "会社概要から理念スクロール後");

	}

	//理念からのアクセスキャプチャー
	protected void captureFromPhilosophy(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "理念から理念");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "理念から理念スクロール後");

	}


	//パートナーシナジーからのアクセスキャプチャー
	public void captureFromPartnersynergy(WebDriver driver, WebDriverWait wait, String saveFolder)throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		//キャプチャー
				CaptureUtil captureUtil = new CaptureUtil();
				captureUtil.cupturePage(driver, saveFolder, "パートナーシナジーから理念");

				Actions act = new Actions(driver);

				//スクロールさせる
				act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
				act.perform();

				//しばらく待って
				Thread.sleep(1000);

				//キャプチャー
				captureUtil.cupturePage(driver, saveFolder, "パートナーシナジーから理念スクロール後");


	}

	//サービスからのアクセスキャプチャー
	public void captureFromService(WebDriver driver, WebDriverWait wait, String saveFolder)throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		//キャプチャー
				CaptureUtil captureUtil = new CaptureUtil();
				captureUtil.cupturePage(driver, saveFolder, "サービスから理念");

				Actions act = new Actions(driver);

				//スクロールさせる
				act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
				act.perform();

				//しばらく待って
				Thread.sleep(1000);

				//キャプチャー
				captureUtil.cupturePage(driver, saveFolder, "サービスから理念スクロール後");

	}

	//募集一覧からのアクセスキャプチャー
	public void captureFromJobcategory(WebDriver driver, WebDriverWait wait, String saveFolder) throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		//キャプチャー
				CaptureUtil captureUtil = new CaptureUtil();
				captureUtil.cupturePage(driver, saveFolder, "募集一覧から理念");

				Actions act = new Actions(driver);

				//スクロールさせる
				act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
				act.perform();

				//しばらく待って
				Thread.sleep(1000);

				//キャプチャー
				captureUtil.cupturePage(driver, saveFolder, "募集一覧から理念スクロール後");

	}

}
