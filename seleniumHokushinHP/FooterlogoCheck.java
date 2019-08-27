package seleniumHokushinHP;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FooterlogoCheck {

	protected void clickAndCaptureFromHome(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

		//クリック対象要素が表示されるまで待つ(トップページフッターロゴ)
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("body > div.hs-base-container > nav > div.w-100 > a")));

		//クリック(トップページフッターロゴ)
		driver.findElement(By.cssSelector("#footer-comtent-comp-left > a")).click();
		System.out.println("トップページフッターロゴ");

		//クリック対象要素が表示されるまで待つ（トップページフッターロゴimg）
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("#footer-logo")));

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "トップページフッターロゴからトップ画面");

	}

}
