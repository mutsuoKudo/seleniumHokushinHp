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

		//CSSSelector格納用(サブメニュー）
		String cssSelectorSub = null;

		//ウィンドウサイズ確認
		int windowWidth = driver.manage().window().getSize().getWidth();

		//細目によるCSSSelectorの切り替え
		if (windowWidth < (768 + 16)) {
			switch (saimoku) {
			case "会社概要":
				cssSelectorSub = "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li:nth-child(1) > a";
				break;
			case "理念":
				cssSelectorSub = "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li:nth-child(2) > a";
				break;
			case "パートナーシナジー":
				cssSelectorSub = "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li:nth-child(3) > a";
				break;
			default:
				System.out.println("エラー：企業情報に存在しない細目を処理しようとしました。");
				return;
			}
		} else {
			switch (saimoku) {
			case "会社概要":
				cssSelectorSub = "body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a";
				break;
			case "理念":
				cssSelectorSub = "body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(2) > a";
				break;
			case "パートナーシナジー":
				cssSelectorSub = "body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(3) > a";
				break;
			default:
				System.out.println("エラー：企業情報に存在しない細目を処理しようとしました。");
				return;
			}
		}

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
					.visibilityOfElementLocated(By.cssSelector("#dropdownMenuButtonCompany")));

			//クリック（ハンバーガーメニュー第一レベル）
			driver.findElement(
					By.cssSelector("#dropdownMenuButtonCompany")).click();
		} else {
			//通常メニュー
			//クリック対象要素が表示されるまで待つ
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span")));

			//クリック
			driver.findElement(
					By.cssSelector(
							"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span"))
					.click();
		}

		//メニュー細目
		//クリック対象要素が表示されるまで待つ
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelectorSub)));

		//クリック
		driver.findElement(By.cssSelector(cssSelectorSub)).click();

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

		//理念の場合のみ
		if (saimoku == "理念") {
			//			//デフォルトのwindowHandleを格納
			//			String mainWindowHandle = driver.getWindowHandle();
			//
			//クリック対象要素が表示されるまで待つ
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div > a:nth-child(7)")));

			//クリック
			driver.findElement(By.cssSelector(
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div > a:nth-child(7)"))
					.click();
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "ぷろくま");

			driver.navigate().refresh();
			//
			//			//デフォルトのwindowHandleにスイッチ
			//			driver.switchTo().window(mainWindowHandle);

			//			act.sendKeys(Keys.ESCAPE);
			//			act.perform();

			;

			//			//クリック対象要素が表示されるまで待つ
			//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#purokuma-modal")));
			//			//クリック
			//			driver.findElement(By.cssSelector("#purokuma-modal")).click();

			//セキュリティポリシーまで画面を移動
			act.moveToElement(driver.findElement(
					By.cssSelector("#home-pol > a:nth-child(1)")));
			act.perform();

			//クリック
			driver.findElement(By.cssSelector("#home-pol > a:nth-child(1)")).click();

			//クリック対象要素が表示されるまで待つ
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "セキュリティポリシー");

			//戻る
			driver.navigate().back();

			//クリック対象要素が表示されるまで待つ
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#home-pol > a:nth-child(2"
					+ ")")));

			//クリック
			driver.findElement(By.cssSelector("#home-pol > a:nth-child(2)")).click();

			//クリック対象要素が表示されるまで待つ
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "プライバシーポリシー");

		}
	}
}
