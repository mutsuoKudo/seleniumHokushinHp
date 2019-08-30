package seleniumHokushinHP;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlumCheck {

	//梅アイコン一番左から会社概要へ遷移→キャプチャー
	public void toCompany(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		int windowWidth = driver.manage().window().getSize().getWidth();

		//企業情報への遷移
		if (windowWidth < (1200 + 16)) {

			System.out.println("梅アイコンは表示されてません");

		} else {

			//梅アイコン一番左
			System.out.println("梅アイコン左から一番目");

			//クリック対象要素が表示されるまで待つ→クリック（梅アイコン一番左）
			waitAndClick(driver, wait,
					"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(1) > div > p.hs-icon > a",
					"梅アイコン左から一番目");

			//会社概要キャプチャー
			waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
					"梅アイコンから会社概要",
					saveFolder);

			//フッターのロゴまで画面を移動
			act.moveToElement(driver.findElement(
					By.cssSelector("#privacymark-logo")));
			act.perform();

			//会社概要キャプチャースクロール後
			waitAndCapture(driver, wait, "#privacymark-logo", "梅アイコンから会社概要スクロール後", saveFolder);

			SeleniumHokushinHPChrome seleniumHokushinHPChrome = new SeleniumHokushinHPChrome();
			seleniumHokushinHPChrome.backHomeFromChild(driver, wait);

		}

	}

	//梅アイコン左から二番目から理念へ遷移→キャプチャー
	public void toPhilosophy(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		int windowWidth = driver.manage().window().getSize().getWidth();

		//企業情報への遷移
		if (windowWidth < (1200 + 16)) {

			System.out.println("梅アイコンは表示されてません");

		} else {

			//梅アイコン左から二番目
			System.out.println("梅アイコン左から二番目");

			//クリック対象要素が表示されるまで待つ→クリック（梅アイコン一番左）
			waitAndClick(driver, wait,
					"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(2) > div > p.hs-icon > a",
					"梅アイコン左から二番目");

			//理念キャプチャー
			waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
					"梅アイコンから理念",
					saveFolder);

			//フッターのロゴまで画面を移動
			act.moveToElement(driver.findElement(
					By.cssSelector("#privacymark-logo")));
			act.perform();

			//理念キャプチャースクロール後
			waitAndCapture(driver, wait, "#privacymark-logo", "梅アイコンから理念スクロール後", saveFolder);

			SeleniumHokushinHPChrome seleniumHokushinHPChrome = new SeleniumHokushinHPChrome();
			seleniumHokushinHPChrome.backHomeFromChild(driver, wait);

		}
	}

	//梅アイコン左から三番目からパートナーシナジーへ遷移→キャプチャー
	public void toPartnerSynergy(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		int windowWidth = driver.manage().window().getSize().getWidth();

		//企業情報への遷移
		if (windowWidth < (1200 + 16)) {

			System.out.println("梅アイコンは表示されてません");

		} else {

			//梅アイコン左から三番目
			System.out.println("梅アイコン左から三番目");

			//クリック対象要素が表示されるまで待つ→クリック（梅アイコン左から三番目）
			waitAndClick(driver, wait,
					"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(3) > div > p.hs-icon > a",
					"梅アイコン左から三番目");

			//パートナーシナジーキャプチャー
			waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
					"梅アイコンからパートナーシナジー",
					saveFolder);

			//フッターのロゴまで画面を移動
			act.moveToElement(driver.findElement(
					By.cssSelector("#privacymark-logo")));
			act.perform();

			//パートナーシナジーキャプチャースクロール後
			waitAndCapture(driver, wait, "#privacymark-logo", "梅アイコンからパートナーシナジースクロール後", saveFolder);

			SeleniumHokushinHPChrome seleniumHokushinHPChrome = new SeleniumHokushinHPChrome();
			seleniumHokushinHPChrome.backHomeFromChild(driver, wait);

		}
	}

	//梅アイコン左から四番目からサービスへ遷移→キャプチャー
	public void toService(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		int windowWidth = driver.manage().window().getSize().getWidth();

		//企業情報への遷移
		if (windowWidth < (1200 + 16)) {

			System.out.println("梅アイコンは表示されてません");

		} else {

			//梅アイコン左から四番目
			System.out.println("梅アイコン左から四番目");

			//クリック対象要素が表示されるまで待つ→クリック（梅アイコン左から四番目）
			waitAndClick(driver, wait,
					"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(4) > div > p.hs-icon > a",
					"梅アイコン左から四番目");

			//サービスキャプチャー
			waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
					"梅アイコンからサービス",
					saveFolder);

			//フッターのロゴまで画面を移動
			act.moveToElement(driver.findElement(
					By.cssSelector("#privacymark-logo")));
			act.perform();

			//サービスキャプチャースクロール後
			waitAndCapture(driver, wait, "#privacymark-logo", "梅アイコンからサービススクロール後", saveFolder);

			SeleniumHokushinHPChrome seleniumHokushinHPChrome = new SeleniumHokushinHPChrome();
			seleniumHokushinHPChrome.backHomeFromChild(driver, wait);

		}
	}

	//梅アイコン左から五番目から募集一覧へ遷移→キャプチャー
	public void toJobcategory(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		int windowWidth = driver.manage().window().getSize().getWidth();

		//企業情報への遷移
		if (windowWidth < (1200 + 16)) {

			System.out.println("梅アイコンは表示されてません");

		} else {

			//梅アイコン左から五番目
			System.out.println("梅アイコン左から五番目");

			//クリック対象要素が表示されるまで待つ→クリック（梅アイコン左から五番目）
			waitAndClick(driver, wait,
					"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(4) > div > p.hs-icon > a",
					"梅アイコン左から五番目");

			//募集一覧キャプチャー
			waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
					"梅アイコンから募集一覧",
					saveFolder);

			//フッターのロゴまで画面を移動
			act.moveToElement(driver.findElement(
					By.cssSelector("#privacymark-logo")));
			act.perform();

			//募集一覧キャプチャースクロール後
			waitAndCapture(driver, wait, "#privacymark-logo", "梅アイコンから募集一覧スクロール後", saveFolder);

			SeleniumHokushinHPChrome seleniumHokushinHPChrome = new SeleniumHokushinHPChrome();
			seleniumHokushinHPChrome.backHomeFromChild(driver, wait);

		}
	}

	//梅アイコン左から六番目から福利厚生へ遷移→キャプチャー
	public void toWelfare(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		int windowWidth = driver.manage().window().getSize().getWidth();

		//企業情報への遷移
		if (windowWidth < (1200 + 16)) {

			System.out.println("梅アイコンは表示されてません");

		} else {

			//梅アイコン左から五番目
			System.out.println("梅アイコン左から六番目");

			//クリック対象要素が表示されるまで待つ→クリック（梅アイコン左から六番目）
			waitAndClick(driver, wait,
					"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(4) > div > p.hs-icon > a",
					"梅アイコン左から六番目");

			//福利厚生キャプチャー
			waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
					"梅アイコンから福利厚生",
					saveFolder);

			//フッターのロゴまで画面を移動
			act.moveToElement(driver.findElement(
					By.cssSelector("#privacymark-logo")));
			act.perform();

			//福利厚生キャプチャースクロール後
			waitAndCapture(driver, wait, "#privacymark-logo", "梅アイコンから福利厚生スクロール後", saveFolder);

			SeleniumHokushinHPChrome seleniumHokushinHPChrome = new SeleniumHokushinHPChrome();
			seleniumHokushinHPChrome.backHomeFromChild(driver, wait);

		}
	}

	//梅アイコン左から七番目から教育・研修へ遷移→キャプチャー
	public void toTraining(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		int windowWidth = driver.manage().window().getSize().getWidth();

		//企業情報への遷移
		if (windowWidth < (1200 + 16)) {

			System.out.println("梅アイコンは表示されてません");

		} else {

			//梅アイコン左から五番目
			System.out.println("梅アイコン左から七番目");

			//クリック対象要素が表示されるまで待つ→クリック（梅アイコン左から七番目）
			waitAndClick(driver, wait,
					"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(4) > div > p.hs-icon > a",
					"梅アイコン左から七番目");

			//教育・研修キャプチャー
			waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
					"梅アイコンから教育・研修",
					saveFolder);

			//フッターのロゴまで画面を移動
			act.moveToElement(driver.findElement(
					By.cssSelector("#privacymark-logo")));
			act.perform();

			//教育・研修キャプチャースクロール後
			waitAndCapture(driver, wait, "#privacymark-logo", "梅アイコンから教育・研修スクロール後", saveFolder);

			SeleniumHokushinHPChrome seleniumHokushinHPChrome = new SeleniumHokushinHPChrome();
			seleniumHokushinHPChrome.backHomeFromChild(driver, wait);

		}
	}

	//梅アイコン左から八番目から社員の声へ遷移→キャプチャー
	public void toVoices(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		int windowWidth = driver.manage().window().getSize().getWidth();

		//企業情報への遷移
		if (windowWidth < (1200 + 16)) {

			System.out.println("梅アイコンは表示されてません");

		} else {

			//梅アイコン左から八番目
			System.out.println("梅アイコン左から八番目");

			//クリック対象要素が表示されるまで待つ→クリック（梅アイコン左から八番目）
			waitAndClick(driver, wait,
					"body > div.hs-base-container > div:nth-child(3) > div > div:nth-child(4) > div > p.hs-icon > a",
					"梅アイコン左から八番目");

			//社員の声キャプチャー
			waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
					"梅アイコンから社員の声",
					saveFolder);

			//フッターのロゴまで画面を移動
			act.moveToElement(driver.findElement(
					By.cssSelector("#privacymark-logo")));
			act.perform();

			//社員の声キャプチャースクロール後
			waitAndCapture(driver, wait, "#privacymark-logo", "梅アイコンから社員の声スクロール後", saveFolder);

			SeleniumHokushinHPChrome seleniumHokushinHPChrome = new SeleniumHokushinHPChrome();
			seleniumHokushinHPChrome.backHomeFromChild(driver, wait);

		}
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
