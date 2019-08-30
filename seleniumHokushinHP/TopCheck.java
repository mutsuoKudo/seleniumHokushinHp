package seleniumHokushinHP;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopCheck {

	//トップページからトップページへ遷移→キャプチャー
		public void toTop(WebDriver driver, WebDriverWait wait, String saveFolder)
				throws IOException, InterruptedException {

			//画面をスクロールさせるためActionクラスのインスタンスを作成
			Actions act = new Actions(driver);

			//ウィンドウサイズ確認
			int windowWidth = driver.manage().window().getSize().getWidth();

			//企業情報への遷移
			if (windowWidth < (768 + 16)) {

				System.out.println("ハンバーガーメニュー");

				//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー）
				waitAndClick(driver, wait, "body > div.hs-base-container > nav > div.w-100 > button", "ハンバーガーメニュー");

				//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第一レベル）
				waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-4.mb-2 > a", "メニューホーム");


			} else {

				//通常メニュー
				System.out.println("通常メニュー");

				//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
				waitAndClick(driver, wait,
						"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(1) > a", "メニューホーム");

			}

			//トップページキャプチャー
			waitAndCapture(driver, wait, "body > div.hs-base-container > nav > div.w-100 > a > img", "トップページからトップページ",
					saveFolder);

			//フッターのロゴまで画面を移動
			act.moveToElement(driver.findElement(
					By.cssSelector("#privacymark-logo")));
			act.perform();

			//トップページキャプチャースクロール後
			waitAndCapture(driver, wait, "#privacymark-logo", "トップページからトップページスクロール後", saveFolder);

			//フッターのロゴまで画面を移動
			act.moveToElement(driver.findElement(
					By.cssSelector("body > div.hs-base-container > nav > div.w-100 > a > img")));
			act.perform();

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
