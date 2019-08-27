package seleniumHokushinHP;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompanyCheck {

	protected void clickAndCaptureFromHome(WebDriver driver, WebDriverWait wait, String saveFolder, String saimoku)
			throws IOException, InterruptedException {

		//CSSSelector格納用
		String cssSelector = null;

		//細目によるCSSSelectorの切り替え
		switch (saimoku) {
		case "会社概要":
			cssSelector = "body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a";
			break;
		case "理念":
			cssSelector = "body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(2) > a";
			break;
		case "パートナーシナジー":
			cssSelector = "body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(3) > a";
			break;
		default:
			System.out.println("エラー：企業情報に存在しない細目を処理しようとしました。");
			return;
		}

		//クリック対象要素が表示されるまで待つ
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(
						"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span")));

		//クリック
		driver.findElement(
				By.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span"))
				.click();

		//クリック対象要素が表示されるまで待つ
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(cssSelector)));

		//クリック
		driver.findElement(By.cssSelector(cssSelector))
				.click();

		//クリック対象要素が表示されるまで待つ
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(
						By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

		CaptureUtil captureUtil = new CaptureUtil();

		captureUtil.cupturePage(driver, saveFolder, saimoku);

		//スクロールさせたい場合（例）;
		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(
				By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, saimoku + "スクロール後");

	}
}
