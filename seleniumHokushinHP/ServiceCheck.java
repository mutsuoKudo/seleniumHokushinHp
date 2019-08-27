package seleniumHokushinHP;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ServiceCheck {

	protected void clickAndCaptureFromHome(WebDriver driver, WebDriverWait wait, String saveFolder) throws IOException, InterruptedException {
		//サービス

		//ウィンドウサイズ確認
				int windowWidth = driver.manage().window().getSize().getWidth();

		//ホーム画面のメニュー選択
		if (windowWidth < (768 + 16)) {
			//クリック対象要素が表示されるまで待つ（ハンバーガーメニュー）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > nav > div.w-100 > button")));

			//クリック（ハンバーガーメニュー）
			driver.findElement(
					By.cssSelector("body > div.hs-base-container > nav > div.w-100 > button"))
					.click();

			//クリック対象要素が表示されるまで待つ（ハンバーガーメニュー第一レベル）
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#Navbar > ul > li:nth-child(3) > a")));

			//クリック（ハンバーガーメニュー第一レベル）
			driver.findElement(
					By.cssSelector("#Navbar > ul > li:nth-child(3) > a")).click();
		}else {
			//通常メニュー
			//クリック対象要素が表示されるまで待つ
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(3) > a > span")));

			//クリック
			driver.findElement(
					By.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(3) > a > span"))
					.click();
		}

		//クリック対象要素が表示されるまで待つ
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(
						By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));


		CaptureUtil captureUtil = new CaptureUtil();

		captureUtil.cupturePage(driver,  saveFolder,"サービス");

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
		captureUtil.cupturePage(driver,  saveFolder,"サービススクロール後");


	}

}
