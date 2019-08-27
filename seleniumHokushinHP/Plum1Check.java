package seleniumHokushinHP;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Plum1Check {

	protected void clickAndCaptureFromHome(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

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

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "梅アイコンから会社概要");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "梅アイコンから会社概要スクロール後");

	}

}
