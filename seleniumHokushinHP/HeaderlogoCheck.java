package seleniumHokushinHP;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderlogoCheck {

	protected void clickAndCaptureFromHome(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

		//クリック対象要素が表示されるまで待つ(トップページヘッダーロゴ)
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("body > div.hs-base-container > nav > div.w-100 > a")));

		//クリック(トップページヘッダーロゴ)
		driver.findElement(By.cssSelector("body > div.hs-base-container > nav > div.w-100 > a")).click();
		System.out.println("トップページヘッダーロゴ");

		//クリック対象要素が表示されるまで待つ（トップページヘッダーロゴimg）
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(
						By.cssSelector("body > div.hs-base-container > nav > div.w-100 > a > img")));

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "トップページヘッダーロゴからトップ画面");

	}

}
