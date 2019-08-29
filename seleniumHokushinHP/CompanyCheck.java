package seleniumHokushinHP;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompanyCheck {

	//トップページから会社概要へ遷移→キャプチャー
	public void toCompany(WebDriver driver, WebDriverWait wait, String saveFolder)
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
			waitAndClick(driver, wait, "#dropdownMenuButtonCompany", "メニュー企業情報");

			//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第二レベル）
			waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li:nth-child(1) > a",
					"メニュー会社概要");

		} else {

			//通常メニュー
			System.out.println("通常メニュー");

			//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
			waitAndClick(driver, wait,
					"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span", "メニュー企業情報");

			//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第二レベル）
			waitAndClick(driver, wait,
					"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a",
					"メニュー会社概要");

		}

		//企業概要キャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "トップページから会社概要", saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(
				By.cssSelector("#privacymark-logo")));
		act.perform();

		//企業概要キャプチャースクロール後
				waitAndCapture(driver, wait, "#privacymark-logo", "トップページから会社概要スクロール後", saveFolder);


		//		//クリック対象要素が表示されるまで待つ(ナビゲーションバーの企業情報)
		//		wait.until(ExpectedConditions
		//				.visibilityOfElementLocated(By.cssSelector(
		//						"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span")));
		//
		//		//クリック(ナビゲーションバーの企業情報)
		//		driver.findElement(By
		//				.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span"))
		//				.click();
		//		System.out.println("企業情報クリック");

		//		//クリック対象要素が表示されるまで待つ(ナビゲーションバーの会社概要)
		//		wait.until(ExpectedConditions
		//				.visibilityOfElementLocated(By.cssSelector(
		//						"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a")));
		//
		//		//クリック(ナビゲーションバーの会社概要)
		//		driver.findElement(By.cssSelector(
		//				"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a"))
		//				.click();
		//		System.out.println("会社概要クリック");
	}

	//会社概要→理念→キャプチャー
	public void companyToPhilosophy(WebDriver driver, WebDriverWait wait, String saveFolder) throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		int windowWidth = driver.manage().window().getSize().getWidth();

		if (windowWidth < (768 + 16)) {

			System.out.println("ハンバーガーメニュー");

			//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー）
			waitAndClick(driver, wait, "body > div.hs-base-container > nav > div.w-100 > button", "ハンバーガーメニュー");

			//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第一レベル）
			waitAndClick(driver, wait, "#dropdownMenuButtonCompany", "メニュー企業情報");

			//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第二レベル）
			waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li:nth-child(2) > a",
					"メニュー理念");

		} else {

			//通常メニュー
			System.out.println("通常メニュー");

			//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
			waitAndClick(driver, wait, "#navbarDropdownCompany > span", "メニュー企業情報");

			//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第二レベル）
			waitAndClick(driver, wait, "#menu-item-22 > div > a:nth-child(2)", "メニュー理念");

		}

		//理念キャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "会社概要から理念", saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//理念キャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "会社概要から理念スクロール後", saveFolder);

		//理念追加処理
		//クリック対象要素が表示されるまで待つ→クリックぷろくま
		waitAndClick(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div > a:nth-child(7)", "ぷろくま");

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー準備
		CaptureUtil captureUtil = new CaptureUtil();

		//キャプチャ
		captureUtil.cupturePage(driver, saveFolder, "ぷろくま");

		driver.navigate().refresh();

		//セキュリティポリシーまで画面を移動
		act.moveToElement(driver.findElement(
				By.cssSelector("#home-pol > a:nth-child(1)")));
		act.perform();

		//クリック
		driver.findElement(By.cssSelector("#home-pol > a:nth-child(1)")).click();

		//クリック対象要素が表示されるまで待つ→クリックセキュリティポリシー
		waitAndClick(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "セキュリティポリシー");

		//セキュリティポリシーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "セキュリティポリシー", saveFolder);

		//戻る
		driver.navigate().back();

		//クリック対象要素が表示されるまで待つ→プライバシーポリシー
				waitAndClick(driver, wait, "#home-pol > a:nth-child(2)", "プライバシーポリシー");

		//プライバシーポリシーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "プライバシーポリシー", saveFolder);

	}


	//会社概要へ戻る
	public void backToCompany(WebDriver driver, WebDriverWait wait, String saveFolder) {
		// TODO 自動生成されたメソッド・スタブ

		//クリック対象要素が表示されるまで待つ(ナビゲーションバーの企業情報)
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(
						"#navbarDropdownCompany > span")));

		//クリック(ナビゲーションバーの企業情報)
		driver.findElement(By
				.cssSelector("#navbarDropdownCompany > span"))
				.click();
		System.out.println("企業情報クリック");

		//クリック対象要素が表示されるまで待つ(ナビゲーションバーの会社概要)
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(
						"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0")));

		//クリック(ナビゲーションバーの会社概要)
		driver.findElement(By.cssSelector(
				"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0"))
				.click();
		System.out.println("会社概要クリック");
	}

	//トップからのアクセス
	protected void clickAndCaptureFromHome(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

		//クリック対象要素が表示されるまで待つ(ナビゲーションバーの企業情報)
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(
						"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span")));

		//クリック(ナビゲーションバーの企業情報)
		driver.findElement(By
				.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(2) > a > span"))
				.click();
		System.out.println("企業情報クリック");

		//クリック対象要素が表示されるまで待つ(ナビゲーションバーの会社概要)
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(
						"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a")));

		//クリック(ナビゲーションバーの会社概要)
		driver.findElement(By.cssSelector(
				"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1) > a"))
				.click();
		System.out.println("会社概要クリック");

		//クリック対象要素が表示されるまで待つ（Companyタイトル）
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(
						By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "トップページから会社概要");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "トップページから会社概要スクロール後");

	}

	//会社概要・理念からのアクセス
	public void clickAndCaptureFromOther(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

		//クリック対象要素が表示されるまで待つ(ナビゲーションバーの企業情報)
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(
						"#navbarDropdownCompany > span")));

		//クリック(ナビゲーションバーの企業情報)
		driver.findElement(By
				.cssSelector("#navbarDropdownCompany > span"))
				.click();
		System.out.println("企業情報クリック");

		//クリック対象要素が表示されるまで待つ(ナビゲーションバーの会社概要)
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(
						"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0")));

		//クリック(ナビゲーションバーの会社概要)
		driver.findElement(By.cssSelector(
				"#menu-item-22 > div > a.dropdown-item.hs-dropdown-item.mt-0"))
				.click();
		System.out.println("会社概要クリック");

		//クリック対象要素が表示されるまで待つ（Companyタイトル）
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(
						By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));

	}

	//	会社概要からのアクセスキャプチャー
	protected void captureFromCompany(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "会社概要から会社概要");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "会社概要から会社概要スクロール後");

	}

	//	理念からのアクセスキャプチャー
	protected void captureFromPhilosophy(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "理念から会社概要");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "理念から会社概要スクロール後");

	}

	//	パートナーシナジーからのアクセスキャプチャー
	public void captureFromPartnersynergy(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "パートナーシナジーから会社概要");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "パートナーシナジーから会社概要スクロール後");

	}

	//	サービスからのアクセスキャプチャー
	public void captureFromService(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "サービスから会社概要");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "サービスから会社概要スクロール後");

	}

	//	募集一覧からのアクセスキャプチャー
	public void captureFromJobcategory(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

		//キャプチャー
		CaptureUtil captureUtil = new CaptureUtil();
		captureUtil.cupturePage(driver, saveFolder, "募集一覧から会社概要");

		Actions act = new Actions(driver);

		//スクロールさせる
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
		Thread.sleep(1000);

		//キャプチャー
		captureUtil.cupturePage(driver, saveFolder, "募集一覧から会社概要スクロール後");
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
