package seleniumHokushinHP;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompanyCheck {

	//トップページから会社概要へ遷移のみ
	public void toCompany(WebDriver driver, WebDriverWait wait, String saveFolder)
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

		//クリック対象要素が表示されるまで待つ(ナビゲーションバーの会社概要)
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(
						"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a")));

		//クリック(ナビゲーションバーの会社概要)
		driver.findElement(By.cssSelector(
				"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a"))
				.click();
		System.out.println("会社概要クリック");
	}

	//会社概要へ戻る
	public void backToCompany(WebDriver driver, WebDriverWait wait, String saveFolder) {
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

		//クリック対象要素が表示されるまで待つ(ナビゲーションバーの会社概要)
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(
						"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0")));

		//クリック(ナビゲーションバーの会社概要)
		driver.findElement(By.cssSelector(
				"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0"))
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

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "トップページから会社概要");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "トップページから会社概要スクロール後");

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

		//クリック対象要素が表示されるまで待つ(ナビゲーションバーの会社概要)
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(
						"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0")));

		//クリック(ナビゲーションバーの会社概要)
		driver.findElement(By.cssSelector(
				"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0"))
				.click();
		System.out.println("会社概要クリック");

		//クリック対象要素が表示されるまで待つ（Companyタイトル）
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(
						By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

	}

//	会社概要からのアクセスキャプチャー
	protected void captureFromCompany(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "会社概要から会社概要");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "会社概要から会社概要スクロール後");


	}

	//	理念からのアクセスキャプチャー
	protected void captureFromPhilosophy(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "理念から会社概要");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "理念から会社概要スクロール後");


	}


//	パートナーシナジーからのアクセスキャプチャー
	public void captureFromPartnersynergy(WebDriver driver, WebDriverWait wait, String saveFolder) throws IOException, InterruptedException{
		// TODO 自動生成されたメソッド・スタブ

		//キャプチャー
				CaptureUtil captureUtil = new CaptureUtil();
				captureUtil.cupturePage(driver, saveFolder, "パートナーシナジーから会社概要");

				Actions act = new Actions(driver);

				//スクロールさせる
				act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
				act.perform();

				//しばらく待って
				Thread.sleep(1000);

				//キャプチャー
				captureUtil.cupturePage(driver, saveFolder, "パートナーシナジーから会社概要スクロール後");

	}
//	サービスからのアクセスキャプチャー
	public void captureFromService(WebDriver driver, WebDriverWait wait, String saveFolder) throws IOException, InterruptedException{
		// TODO 自動生成されたメソッド・スタブ

		//キャプチャー
				CaptureUtil captureUtil = new CaptureUtil();
				captureUtil.cupturePage(driver, saveFolder, "サービスから会社概要");

				Actions act = new Actions(driver);

				//スクロールさせる
				act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
				act.perform();

				//しばらく待って
				Thread.sleep(1000);

				//キャプチャー
				captureUtil.cupturePage(driver, saveFolder, "サービスから会社概要スクロール後");


	}


//	募集一覧からのアクセスキャプチャー
	public void captureFromJobcategory(WebDriver driver, WebDriverWait wait, String saveFolder) throws IOException, InterruptedException{
		// TODO 自動生成されたメソッド・スタブ

		//キャプチャー
				CaptureUtil captureUtil = new CaptureUtil();
				captureUtil.cupturePage(driver, saveFolder, "募集一覧から会社概要");

				Actions act = new Actions(driver);

				//スクロールさせる
				act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
				act.perform();

				//しばらく待って
				Thread.sleep(1000);

				//キャプチャー
				captureUtil.cupturePage(driver, saveFolder, "募集一覧から会社概要スクロール後");
	}



}
