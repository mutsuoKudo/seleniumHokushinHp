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
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "トップページから会社概要",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(
				By.cssSelector("#privacymark-logo")));
		act.perform();

		//企業概要キャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "トップページから会社概要スクロール後", saveFolder);

	}

	//会社概要→理念→キャプチャー
	public void companyToPhilosophy(WebDriver driver, WebDriverWait wait, String saveFolder)
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
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "会社概要から理念",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//理念キャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "会社概要から理念スクロール後", saveFolder);

		//理念追加処理
		//クリック対象要素が表示されるまで待つ→クリックぷろくま
		waitAndClick(driver, wait,
				"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div > a:nth-child(8)","ぷろくま");

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

		//クリック対象要素が表示されるまで待つ→クリックセキュリティポリシー
		waitAndClick(driver, wait, "#home-pol > a:nth-child(1)", "セキュリティポリシー");

		//セキュリティポリシーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "セキュリティポリシー",
				saveFolder);

		//戻る
		driver.navigate().back();

		//クリック対象要素が表示されるまで待つ→プライバシーポリシー
		waitAndClick(driver, wait, "#home-pol > a:nth-child(2)", "プライバシーポリシー");

		//プライバシーポリシーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "プライバシーポリシー",
				saveFolder);

		//戻る
		driver.navigate().back();

	}


	//理念→パートナーシナジー→キャプチャー
	public void philosophyToPartnerSynergy(WebDriver driver, WebDriverWait wait, String saveFolder) throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		int windowWidth = driver.manage().window().getSize().getWidth();

		if (windowWidth < (992 + 16)) {

			System.out.println("ハンバーガーメニュー");

			//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー）
			waitAndClick(driver, wait, "body > header > nav > div.w-100 > button", "ハンバーガーメニュー");

			//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第一レベル）
			waitAndClick(driver, wait, "#dropdownMenuButtonCompany", "メニュー企業情報");

			//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第二レベル）
			waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li:nth-child(3) > a",
					"メニューパートナーシナジー");

		} else {

			//通常メニュー
			System.out.println("通常メニュー");

			//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
			waitAndClick(driver, wait, "#navbarDropdownCompany > span", "メニュー企業情報");

			//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第二レベル）
			waitAndClick(driver, wait, "#menu-item-22 > div > a:nth-child(3)", "メニューパートナーシナジー");

		}

		//パートナーシナジーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "理念からパートナーシナジー",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//パートナーシナジーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "理念からパートナーシナジースクロール後", saveFolder);


//		//パートナーシナジー追加処理
//
//		//中小企業協同組合とは？まで画面を移動
//		act.moveToElement(driver.findElement(By.cssSelector("#ICT01 > article > map > area:nth-child(1)")));
//		act.perform();
//
//		System.out.println("中小企業協同組合とは？まで画面を移動");
//
//				//クリック対象要素が表示されるまで待つ→クリックホクシンシステム企業ロゴ
//				waitAndClick(driver, wait,
//						"#ICT01 > article > map > area:nth-child(1)","ﾎｸｼﾝｼｽﾃﾑ企業ロゴ");
//
//				//しばらく待って
//				Thread.sleep(1000);
//
//				//キャプチャー準備
//				CaptureUtil captureUtil = new CaptureUtil();
//
//				//キャプチャ
//				captureUtil.cupturePage(driver, saveFolder, "パートナーシナジーマップ（ﾎｸｼﾝｼｽﾃﾑ）");
//
//				//別タブで開いて戻れないので、パートナーシナジーに飛ぶ。
//				driver.navigate().to("https://ae1036569i.smartrelease.jp/partner-synergy");
//
//
//				//クリック対象要素が表示されるまで待つ→クリックjicoo企業ロゴ
//				waitAndClick(driver, wait,
//						"#ICT01 > article > map > area:nth-child(2)","jicoo企業ロゴ");
//
//				//しばらく待って
//				Thread.sleep(1000);
//
//				//キャプチャ
//				captureUtil.cupturePage(driver, saveFolder, "パートナーシナジーマップ（jicoo）");
//
//				//別タブで開いて戻れないので、パートナーシナジーに飛ぶ。
//				driver.navigate().to("https://ae1036569i.smartrelease.jp/partner-synergy");
//
//
//				//クリック対象要素が表示されるまで待つ→クリックIBS企業ロゴ
//				waitAndClick(driver, wait,
//						"#ICT01 > article > map > area:nth-child(3)","IBS企業ロゴ");
//
//				//しばらく待って
//				Thread.sleep(1000);
//
//				//キャプチャ
//				captureUtil.cupturePage(driver, saveFolder, "パートナーシナジーマップ（IBS）");
//
//				//別タブで開いて戻れないので、パートナーシナジーに飛ぶ。
//				driver.navigate().to("https://ae1036569i.smartrelease.jp/partner-synergy");
//
//
//				//クリック対象要素が表示されるまで待つ→クリック横浜ﾏﾘﾝｼｽﾃﾑ企業ロゴ
//				waitAndClick(driver, wait,
//						"#ICT01 > article > map > area:nth-child(4)","横浜ﾏﾘﾝｼｽﾃﾑ企業ロゴ");
//
//				//しばらく待って
//				Thread.sleep(1000);
//
//				//キャプチャ
//				captureUtil.cupturePage(driver, saveFolder, "パートナーシナジーマップ（ｼｰｻｰﾈｯﾄ）");
//
//				//別タブで開いて戻れないので、パートナーシナジーに飛ぶ。
//				driver.navigate().to("https://ae1036569i.smartrelease.jp/partner-synergy");
//
//
//				//クリック対象要素が表示されるまで待つ→クリック横浜ﾏﾘﾝｼｽﾃﾑ企業ロゴ
//				waitAndClick(driver, wait,
//						"#ICT01 > article > map > area:nth-child(4)","ｼｰｻｰﾈｯﾄ企業ロゴ");
//
//				//しばらく待って
//				Thread.sleep(1000);
//
//				//キャプチャ
//				captureUtil.cupturePage(driver, saveFolder, "パートナーシナジーマップ（横浜ｼｰｻｰﾈｯﾄ）");
//
//				//別タブで開いて戻れないので、パートナーシナジーに飛ぶ。
//				driver.navigate().to("https://ae1036569i.smartrelease.jp/partner-synergy");

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
