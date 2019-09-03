package seleniumHokushinHP;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopCheckIE {

	//IEトップページからIEトップページへ遷移→キャプチャー
	public void toTop(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		int windowWidth = driver.manage().window().getSize().getWidth();

		if (windowWidth < (992 + 16)) {
			System.out.println("ハンバーガーメニュー");

			//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー）
			waitAndClick(driver, wait, "body > header > nav > div.w-100 > button", "ハンバーガーメニュー");

			//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第一レベル）
			waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-4.mb-2 > a", "メニューホーム");

		} else {

			//通常メニュー
			System.out.println("通常メニュー");

			//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
			waitAndClick(driver, wait,
					"#menu-item-18 > a", "メニューホーム");

		}

		//IEトップページキャプチャー
		waitAndCapture(driver, wait, "#main-copy",
				"IEトップページからIEトップページ",
				saveFolder);

		//画面下部までスクロール
		((JavascriptExecutor) driver).executeScript("scroll(0,20000);");

		//IEトップページキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "IEトップページからIEトップページスクロール後", saveFolder);

	}

	protected void waitAndClick(WebDriver driver, WebDriverWait wait, String cssSelector, String targetName) {

		//クリック対象要素が表示されるまで待つ
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(cssSelector)));

		//クリック
		driver.findElement(By.cssSelector(cssSelector)).click();

		//コンソール出力
		System.out.println(targetName + " クリック");
	}

	protected void waitAndCapture(WebDriver driver, WebDriverWait wait, String cssSelector, String targetName,
			String saveFolder) throws IOException {
		//クリック対象要素が表示されるまで待つ
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));

		//キャプチャー準備
		CaptureUtil captureUtil = new CaptureUtil();

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, targetName);
	}

}
