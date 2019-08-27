package seleniumHokushinHP;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopCheck {

	//トップからのアクセス
	public void clickAndCaptureFromHome(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

		//クリック対象要素が表示されるまで待つ(ナビゲーションバーホーム)
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(
						"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(1) > a > span")));

		//クリック(ナビゲーションバーホーム)
		driver.findElement(
				By.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(1) > a > span"))
				.click();
		System.out.println("ホームクリック");

		//クリック対象要素が表示されるまで待つ（トップページ）
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("#privacymark-logo")));

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "トップからトップ");

	}

	//	会社概要・理念からのアクセス
	protected void clickAndCaptureFromOther(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

		//クリック対象要素が表示されるまで待つ(ナビゲーションバーホーム)
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("#menu-item-18 > a > span")));

		//クリック(ナビゲーションバーホーム)
		driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
		System.out.println("プライバシーマーク");

		//クリック対象要素が表示されるまで待つ（トップページ）
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("#privacymark-logo")));

	}

	//	会社概要からのアクセスキャプチャー
	protected void captureFromCompany(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "会社概要からトップ");

	}

	//	理念からのアクセスキャプチャー
	protected void captureFromPhilosophy(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "理念からトップ");

	}


//	パートナーシナジーからのアクセスキャプチャー
	public void captureFromPartnersynergy(WebDriver driver, WebDriverWait wait, String saveFolder)throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "パートナーシナジーからトップ");

	}
//	サービスからのアクセスキャプチャー
	public void captureFromService(WebDriver driver, WebDriverWait wait, String saveFolder) throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "サービスからトップ");

	}
//	募集一覧からのアクセスキャプチャー
	public void captureFromJobcategory(WebDriver driver, WebDriverWait wait, String saveFolder)throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "募集一覧からトップ");

	}
}
