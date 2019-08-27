package seleniumHokushinHP;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JobcategoryCheck {

	//トップページから募集一覧へ遷移のみ
	public void toJobcategory(WebDriver driver, WebDriverWait wait, String saveFolder) throws IOException, InterruptedException {
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

		//クリック対象要素が表示されるまで待つ(ナビゲーションバーの募集一覧)
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(
						"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a")));

		//クリック(ナビゲーションバーの募集一覧)
		driver.findElement(By.cssSelector(
				"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a"))
				.click();
		System.out.println("募集一覧クリック");


	}

	//募集一覧へ戻る
	public void backToJobcategory(WebDriver driver, WebDriverWait wait, String saveFolder) {
		// TODO 自動生成されたメソッド・スタブ

				//クリック対象要素が表示されるまで待つ(ナビゲーションバーの採用情報)
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.cssSelector(
								"#navbarDropdownRecruit > span")));

				//クリック(ナビゲーションバーの企業情報)
				driver.findElement(By
						.cssSelector("#navbarDropdownRecruit > span"))
						.click();
				System.out.println("採用情報クリック");

				//クリック対象要素が表示されるまで待つ(ナビゲーションバーの募集一覧)
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.cssSelector(
								"#menu-item-21 > div > a.dropdown-item.hs-dropdown-item.mt-0")));

				//クリック(ナビゲーションバーの募集一覧)
				driver.findElement(By.cssSelector(
						"#menu-item-21 > div > a.dropdown-item.hs-dropdown-item.mt-0"))
						.click();
				System.out.println("募集一覧クリック");
	}

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
		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "トップページから募集一覧");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "トップページから募集一覧スクロール後");

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

		//クリック対象要素が表示されるまで待つ（募集一覧）
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(
						By.cssSelector("#menu-item-21 > div > a.dropdown-item.hs-dropdown-item.mt-0")));


		//クリック(ナビゲーションバーの募集一覧)
		driver.findElement(By
				.cssSelector("#menu-item-21 > div > a.dropdown-item.hs-dropdown-item.mt-0"))
				.click();

		//クリック対象要素が表示されるまで待つ（JobCategoryタイトル）
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(
						By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

	}

	//	会社概要からのアクセスキャプチャー
	protected void captureFromCompany(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "会社概要から募集一覧");

		Actions act = new Actions(driver);

		//スクロールさせる
				act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
				act.perform();

				//しばらく待って
				Thread.sleep(1000);

				//キャプチャー
				captureUtil.cupturePage(driver, saveFolder, "会社概要から募集一覧スクロール後");

	}

	//	理念からのアクセスキャプチャー
	protected void captureFromPhilosophy(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "理念から募集一覧");

		Actions act = new Actions(driver);

		//スクロールさせる
				act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
				act.perform();

				//しばらく待って
				Thread.sleep(1000);

				//キャプチャー
				captureUtil.cupturePage(driver, saveFolder, "理念から募集一覧スクロール後");

	}
//	パートナーシナジーからのアクセスキャプチャー
	public void captureFromPartnersynergy(WebDriver driver, WebDriverWait wait, String saveFolder) throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "パートナーシナジーから募集一覧");

		Actions act = new Actions(driver);

		//スクロールさせる
				act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
				act.perform();

				//しばらく待って
				Thread.sleep(1000);

				//キャプチャー
				captureUtil.cupturePage(driver, saveFolder, "パートナーシナジーから募集一覧スクロール後");
	}


	//	サービスからのアクセスキャプチャー
	public void captureFromService(WebDriver driver, WebDriverWait wait, String saveFolder) throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "サービスから募集一覧");

		Actions act = new Actions(driver);

		//スクロールさせる
				act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
				act.perform();

				//しばらく待って
				Thread.sleep(1000);

				//キャプチャー
				captureUtil.cupturePage(driver, saveFolder, "サービスから募集一覧スクロール後");

	}




}
