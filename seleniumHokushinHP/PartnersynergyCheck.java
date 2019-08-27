package seleniumHokushinHP;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PartnersynergyCheck {
	//トップページからパートナーシナジーへ遷移のみ
	public void toPartnersynergy(WebDriver driver, WebDriverWait wait, String saveFolder)
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

		//クリック対象要素が表示されるまで待つ(ナビゲーションバーのパートナーシナジー)
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(
						"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(3) > a")));

		//クリック(ナビゲーションバーのパートナーシナジー)
		driver.findElement(By.cssSelector(
				"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(3) > a"))
				.click();
		System.out.println("パートナーシナジークリック");
	}

	//パートナーシナジーへ戻る
	public void backToPartnersynergy(WebDriver driver, WebDriverWait wait, String saveFolder) {
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

		//クリック対象要素が表示されるまで待つ(ナビゲーションバーのパートナーシナジー)
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(
						"#menu-item-22 > div > a:nth-child(3)")));

		//クリック(ナビゲーションバーのパートナーシナジー)
		driver.findElement(By.cssSelector(
				"#menu-item-22 > div > a:nth-child(3)"))
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

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "トップページからパートナーシナジー");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "トップページからパートナーシナジースクロール後");

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

	}

	//	会社概要からのアクセスキャプチャー
	protected void captureFromCompany(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "会社概要からパートナーシナジー");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "会社概要からパートナーシナジースクロール後");

	}

	//	理念からのアクセスキャプチャー
	protected void captureFromPhilosophy(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "理念からパートナーシナジー");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "理念からパートナーシナジースクロール後");

	}


//	パートナーシナジーからのアクセスキャプチャー
	public void captureFromPartnersynergy(WebDriver driver, WebDriverWait wait, String saveFolder)throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

		//キャプチャー
				CaptureUtil captureUtil = new CaptureUtil();
				captureUtil.cupturePage(driver, saveFolder, "パートナーシナジーからパートナーシナジー");

				Actions act = new Actions(driver);

				//スクロールさせる
				act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
				act.perform();

				//しばらく待って
				Thread.sleep(1000);

				//キャプチャー
				captureUtil.cupturePage(driver, saveFolder, "パートナーシナジーからパートナーシナジースクロール後");


	}

//	サービスからのアクセスキャプチャー

	public void captureFromService(WebDriver driver, WebDriverWait wait, String saveFolder)throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

		//キャプチャー
				CaptureUtil captureUtil = new CaptureUtil();
				captureUtil.cupturePage(driver, saveFolder, "サービスからパートナーシナジー");

				Actions act = new Actions(driver);

				//スクロールさせる
				act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
				act.perform();

				//しばらく待って
				Thread.sleep(1000);

				//キャプチャー
				captureUtil.cupturePage(driver, saveFolder, "サービスからパートナーシナジースクロール後");

	}




//	募集一覧からのアクセスキャプチャー
	public void captureFromJobcategory(WebDriver driver, WebDriverWait wait, String saveFolder) throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

		//キャプチャー
				CaptureUtil captureUtil = new CaptureUtil();
				captureUtil.cupturePage(driver, saveFolder, "募集一覧からパートナーシナジー");

				Actions act = new Actions(driver);

				//スクロールさせる
				act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
				act.perform();

				//しばらく待って
				Thread.sleep(1000);

				//キャプチャー
				captureUtil.cupturePage(driver, saveFolder, "募集一覧からパートナーシナジースクロール後");

	}

}
