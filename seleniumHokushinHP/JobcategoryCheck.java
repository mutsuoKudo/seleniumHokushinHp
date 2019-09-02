package seleniumHokushinHP;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JobcategoryCheck {

	//	サービスから募集一覧へ遷移→キャプチャー
		public void serviceToJobcategory(WebDriver driver, WebDriverWait wait, String saveFolder)
				throws IOException, InterruptedException {
			// TODO 自動生成されたメソッド・スタブ

			//画面をスクロールさせるためActionクラスのインスタンスを作成
			Actions act = new Actions(driver);

			//ウィンドウサイズ確認
			int windowWidth = driver.manage().window().getSize().getWidth();

			//募集一覧への遷移
			if (windowWidth < (992 + 16)) {

				System.out.println("ハンバーガーメニュー");

				//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー）
				waitAndClick(driver, wait, "body > header > nav > div.w-100 > button", "ハンバーガーメニュー");

				//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第一レベル）
				waitAndClick(driver, wait, "#dropdownMenuButtonc", "メニュー採用情報");

				//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第二レベル）
				waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li.text-center.hs-a.mt-2 > a",
						"募集一覧");

			} else {

				//通常メニュー
				System.out.println("通常メニュー");

				//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
				waitAndClick(driver, wait,
						"#navbarDropdownRecruit", "メニュー採用情報");

				//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第二レベル）
				waitAndClick(driver, wait,
						"#menu-item-21 > div > a.dropdown-item.hs-dropdown-item.mt-0",
						"メニュー募集一覧");

			}

			//募集一覧キャプチャー
			waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "サービスから募集一覧",
					saveFolder);

			//フッターのロゴまで画面を移動
			act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
			act.perform();

			//募集一覧キャプチャースクロール後
			waitAndCapture(driver, wait, "#privacymark-logo", "サービスから募集一覧スクロール後", saveFolder);

		}


	//トップページから募集一覧へ遷移→キャプチャー
	public void toJobcategory(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		int windowWidth = driver.manage().window().getSize().getWidth();

		//募集一覧への遷移
		if (windowWidth < (768 + 16)) {

			System.out.println("ハンバーガーメニュー");

			//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー）
			waitAndClick(driver, wait, "body > div.hs-base-container > nav > div.w-100 > button", "ハンバーガーメニュー");

			//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第一レベル）
			waitAndClick(driver, wait, "#dropdownMenuButtonRECRUIT", "メニュー採用情報");

			//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第二レベル）
			waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li.text-center.hs-a.mt-2 > a",
					"募集一覧");

		} else {

			//通常メニュー
			System.out.println("通常メニュー");

			//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
			waitAndClick(driver, wait,
					"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(4) > a > span", "メニュー採用情報");

			//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第二レベル）
			waitAndClick(driver, wait,
					"body > div.hs-base-container > div.hs-nav > nav > div > div.d-inline-block.show > ul > li:nth-child(1)",
					"メニュー募集一覧");

		}

		//募集一覧キャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "トップページから募集一覧",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//募集一覧キャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "トップページから募集一覧スクロール後", saveFolder);

	}

	//募集一覧からエントリーへ→キャプチャー
	public void jobcategoryToEntry(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		act.moveToElement(
				driver.findElement(By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));
		act.perform();

		//ウィンドウサイズ確認
		int windowWidth = driver.manage().window().getSize().getWidth();

		if (windowWidth < (768 + 16)) {

			System.out.println("エントリーボタン");

			//クリック対象要素が表示されるまで待つ→クリック（未経験者PHP）
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div.hs-a.text-center.mt-5.mb-3.col-12.d-block.d-md-none > a",
					"エントリーボタン");

		} else {

			//通常エントリーボタン
			System.out.println("通常エントリーボタン");

			//クリック対象要素が表示されるまで待つ→クリック（通常エントリーボタン第一レベル）
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(4) > div.hs-recruit-link-container.mt-5 > ul > li:nth-child(4) > div > a",
					"通常エントリーボタン");

		}

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "募集一覧からエントリー",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "募集一覧からエントリースクロール後", saveFolder);

		//戻る
		driver.navigate().back();
	}

	//募集一覧→未経験者PHP→キャプチャー
	public void jobcategoryToNewPHP(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		//		int windowWidth = driver.manage().window().getSize().getWidth();

		//		if (windowWidth < (992 + 16)) {

		//			System.out.println("ハンバーガーメニュー");

		//クリック対象要素が表示されるまで待つ→クリック（未経験者PHP）
		waitAndClick(driver, wait, "#inexperienced-person > ul > li:nth-child(1) > a:nth-child(1)", "未経験者PHP");

		//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第一レベル）
		//			waitAndClick(driver, wait, "#dropdownMenuButtonCompany", "メニュー企業情報");

		//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第二レベル）
		//			waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li:nth-child(2) > a",
		//					"メニュー理念");

		//		} else {

		//通常メニュー
		//			System.out.println("通常メニュー");

		//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
		//			waitAndClick(driver, wait, "#navbarDropdownCompany > span", "メニュー企業情報");

		//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第二レベル）
		//			waitAndClick(driver, wait, "#menu-item-22 > div > a:nth-child(2)", "メニュー理念");

		//		}

		//未経験者PHPキャプチャー
		waitAndCapture(driver, wait, "#inexperienced-person > div:nth-child(1) > h1", "募集一覧から未経験者PHP",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//未経験者PHPキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "募集一覧から未経験者PHPスクロール後", saveFolder);
	}

	//未経験者PHP（上のボタンから）→エントリー→キャプチャー→未経験者PHP（下のボタンから）→エントリー→キャプチャー
	public void newPHPToEntry(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		//		int windowWidth = driver.manage().window().getSize().getWidth();

		//		if (windowWidth < (992 + 16)) {
		//タイトル（プログラマーPHP）まで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#inexperienced-person > div:nth-child(1) > h1")));
		act.perform();

		System.out.println("上のエントリーボタン");

		//クリック対象要素が表示されるまで待つ→クリック（上のエントリーボタン）
		waitAndClick(driver, wait, "#inexperienced-person > div:nth-child(1) > div > a", "上のエントリーボタン");

		//		} else {

		//上のエントリーボタン
		//			System.out.println("上のエントリーボタン");

		//クリック対象要素が表示されるまで待つ→クリック（上のエントリーボタン）
		//			waitAndClick(driver, wait, "#inexperienced-person > div:nth-child(1) > div > a", "上のエントリーボタン");

		//		}

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
				"未経験者PHP（上ボタン）からエントリー",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "未経験者PHP（上ボタン）からエントリースクロール後", saveFolder);

		//戻る
		driver.navigate().back();

		//クリック対象要素が表示されるまで待つ→クリック（下のエントリーボタン）
		waitAndClick(driver, wait, "#inexperienced-person > div.text-center.mb-2 > div > a", "下のエントリーボタン");

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
				"未経験者PHP（下ボタン）からエントリー", saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "未経験者PHP（下ボタン）からエントリースクロール後", saveFolder);

		//募集一覧へ戻る
		driver.navigate().back();
		driver.navigate().back();

	}

	//募集一覧から未経験者Javaへ→キャプチャー
	public void jobcategoryToNewJava(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		//		int windowWidth = driver.manage().window().getSize().getWidth();

		//		if (windowWidth < (992 + 16)) {

		//			System.out.println("ハンバーガーメニュー");

		//クリック対象要素が表示されるまで待つ→クリック（未経験者Java）
		waitAndClick(driver, wait, "#inexperienced-person > ul > li:nth-child(2) > a:nth-child(1)", "未経験者Java");

		//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第一レベル）
		//			waitAndClick(driver, wait, "#dropdownMenuButtonCompany", "メニュー企業情報");

		//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第二レベル）
		//			waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li:nth-child(2) > a",
		//					"メニュー理念");

		//		} else {

		//通常メニュー
		//			System.out.println("通常メニュー");

		//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
		//			waitAndClick(driver, wait, "#navbarDropdownCompany > span", "メニュー企業情報");

		//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第二レベル）
		//			waitAndClick(driver, wait, "#menu-item-22 > div > a:nth-child(2)", "メニュー理念");

		//		}

		//未経験者Javaキャプチャー
		waitAndCapture(driver, wait, "#inexperienced-person > div:nth-child(1) > h1", "募集一覧から未経験者Java",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//未経験者Javaキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "募集一覧から未経験者Javaスクロール後", saveFolder);
	}

	//未経験者Java（上のボタンから）→エントリー→キャプチャー→未経験者Java（下のボタンから）→エントリー→キャプチャー
	public void newJavaToEntry(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		//		int windowWidth = driver.manage().window().getSize().getWidth();

		//		if (windowWidth < (992 + 16)) {
		//タイトル（プログラマーJava）まで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#inexperienced-person > div:nth-child(1) > h1")));
		act.perform();

		System.out.println("上のエントリーボタン");

		//クリック対象要素が表示されるまで待つ→クリック（上のエントリーボタン）
		waitAndClick(driver, wait, "#inexperienced-person > div:nth-child(1) > div > a", "上のエントリーボタン");

		//		} else {

		//上のエントリーボタン
		//			System.out.println("上のエントリーボタン");

		//クリック対象要素が表示されるまで待つ→クリック（上のエントリーボタン）
		//			waitAndClick(driver, wait, "#inexperienced-person > div:nth-child(1) > div > a", "上のエントリーボタン");

		//		}

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
				"未経験者Java（上ボタン）からエントリー",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "未経験者Java（上ボタン）からエントリースクロール後", saveFolder);

		//戻る
		driver.navigate().back();

		//クリック対象要素が表示されるまで待つ→クリック（下のエントリーボタン）
		waitAndClick(driver, wait, "#inexperienced-person > div.text-center.mb-2 > div > a", "下のエントリーボタン");

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
				"未経験者Java（下ボタン）からエントリー", saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "未経験者Java（下ボタン）からエントリースクロール後", saveFolder);

		//募集一覧へ戻る
		driver.navigate().back();
		driver.navigate().back();

	}

	//募集一覧から未経験者C言語Linuxへ→キャプチャー
	public void jobcategoryToNewCLinux(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		//		int windowWidth = driver.manage().window().getSize().getWidth();

		//		if (windowWidth < (992 + 16)) {

		//			System.out.println("ハンバーガーメニュー");

		//クリック対象要素が表示されるまで待つ→クリック（未経験者C言語Linux）
		waitAndClick(driver, wait, "#inexperienced-person > ul > li:nth-child(3) > a:nth-child(1)", "未経験者C言語Linux");

		//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第一レベル）
		//			waitAndClick(driver, wait, "#dropdownMenuButtonCompany", "メニュー企業情報");

		//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第二レベル）
		//			waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li:nth-child(2) > a",
		//					"メニュー理念");

		//		} else {

		//通常メニュー
		//			System.out.println("通常メニュー");

		//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
		//			waitAndClick(driver, wait, "#navbarDropdownCompany > span", "メニュー企業情報");

		//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第二レベル）
		//			waitAndClick(driver, wait, "#menu-item-22 > div > a:nth-child(2)", "メニュー理念");

		//		}

		//未経験者C言語Linuxキャプチャー
		waitAndCapture(driver, wait, "#inexperienced-person > div:nth-child(1) > h1", "募集一覧から未経験者C言語Linux",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//未経験者C言語Linuxキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "募集一覧から未経験者C言語Linuxスクロール後", saveFolder);

	}

	//未経験者C言語Linux（上のボタンから）→エントリー→キャプチャー→未経験者C言語Linux（下のボタンから）→エントリー→キャプチャー
	public void newCLinuxToEntry(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		//		int windowWidth = driver.manage().window().getSize().getWidth();

		//		if (windowWidth < (992 + 16)) {
		//タイトル（プログラマーC言語Linux）まで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#inexperienced-person > div:nth-child(1) > h1")));
		act.perform();

		System.out.println("上のエントリーボタン");

		//クリック対象要素が表示されるまで待つ→クリック（上のエントリーボタン）
		waitAndClick(driver, wait, "#inexperienced-person > div:nth-child(1) > div > a", "上のエントリーボタン");

		//		} else {

		//上のエントリーボタン
		//			System.out.println("上のエントリーボタン");

		//クリック対象要素が表示されるまで待つ→クリック（上のエントリーボタン）
		//			waitAndClick(driver, wait, "#inexperienced-person > div:nth-child(1) > div > a", "上のエントリーボタン");

		//		}

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
				"未経験者C言語Linux（上ボタン）からエントリー",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "未経験者C言語Linux（上ボタン）からエントリースクロール後", saveFolder);

		//戻る
		driver.navigate().back();

		//クリック対象要素が表示されるまで待つ→クリック（下のエントリーボタン）
		waitAndClick(driver, wait, "#inexperienced-person > div.text-center.mb-2 > div > a", "下のエントリーボタン");

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
				"未経験者C言語Linux（下ボタン）からエントリー", saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "未経験者C言語Linux（下ボタン）からエントリースクロール後", saveFolder);

		//募集一覧へ戻る
		driver.navigate().back();
		driver.navigate().back();

	}

	//募集一覧から経験者PHPへ→キャプチャー
	public void jobcategoryToExPHP(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		//			int windowWidth = driver.manage().window().getSize().getWidth();

		//			if (windowWidth < (992 + 16)) {

		//				System.out.println("ハンバーガーメニュー");

		//クリック対象要素が表示されるまで待つ→クリック（経験者PHP）
		waitAndClick(driver, wait, "#experienced-person > ul > li:nth-child(1) > a:nth-child(1)", "経験者PHP");

		//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第一レベル）
		//				waitAndClick(driver, wait, "#dropdownMenuButtonCompany", "メニュー企業情報");

		//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第二レベル）
		//				waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li:nth-child(2) > a",
		//						"メニュー理念");

		//			} else {

		//通常メニュー
		//				System.out.println("通常メニュー");

		//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
		//				waitAndClick(driver, wait, "#navbarDropdownCompany > span", "メニュー企業情報");

		//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第二レベル）
		//				waitAndClick(driver, wait, "#menu-item-22 > div > a:nth-child(2)", "メニュー理念");

		//			}

		//経験者PHPキャプチャー
		waitAndCapture(driver, wait, "#inexperienced-person > div:nth-child(1) > h1", "募集一覧から経験者PHP",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//経験者PHPキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "募集一覧から経験者PHPスクロール後", saveFolder);

	}

	//経験者PHP（上のボタンから）→エントリー→キャプチャー→経験者PHP（下のボタンから）→エントリー→キャプチャー
	public void exPHPToEntry(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		//			int windowWidth = driver.manage().window().getSize().getWidth();

		//			if (windowWidth < (992 + 16)) {
		//タイトル（プログラマーPHP）まで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#inexperienced-person > div:nth-child(1) > h1")));
		act.perform();

		System.out.println("上のエントリーボタン");

		//クリック対象要素が表示されるまで待つ→クリック（上のエントリーボタン）
		waitAndClick(driver, wait, "#inexperienced-person > div:nth-child(1) > div > a", "上のエントリーボタン");

		//			} else {

		//上のエントリーボタン
		//				System.out.println("上のエントリーボタン");

		//クリック対象要素が表示されるまで待つ→クリック（上のエントリーボタン）
		//				waitAndClick(driver, wait, "#inexperienced-person > div:nth-child(1) > div > a", "上のエントリーボタン");

		//			}

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
				"経験者PHP（上ボタン）からエントリー",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "経験者PHP（上ボタン）からエントリースクロール後", saveFolder);

		//戻る
		driver.navigate().back();

		//クリック対象要素が表示されるまで待つ→クリック（下のエントリーボタン）
		waitAndClick(driver, wait, "#inexperienced-person > div.text-center.mb-2 > div > a", "下のエントリーボタン");

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
				"経験者PHP（下ボタン）からエントリー", saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "経験者PHP（下ボタン）からエントリースクロール後", saveFolder);

		//募集一覧へ戻る
		driver.navigate().back();
		driver.navigate().back();

	}

	//募集一覧から経験者Javaへ→キャプチャー
	public void jobcategoryToExJava(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		//			int windowWidth = driver.manage().window().getSize().getWidth();

		//			if (windowWidth < (992 + 16)) {

		//				System.out.println("ハンバーガーメニュー");

		//クリック対象要素が表示されるまで待つ→クリック（経験者Java）
		waitAndClick(driver, wait, "#experienced-person > ul > li:nth-child(2) > a:nth-child(1)", "経験者Java");

		//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第一レベル）
		//				waitAndClick(driver, wait, "#dropdownMenuButtonCompany", "メニュー企業情報");

		//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第二レベル）
		//				waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li:nth-child(2) > a",
		//						"メニュー理念");

		//			} else {

		//通常メニュー
		//				System.out.println("通常メニュー");

		//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
		//				waitAndClick(driver, wait, "#navbarDropdownCompany > span", "メニュー企業情報");

		//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第二レベル）
		//				waitAndClick(driver, wait, "#menu-item-22 > div > a:nth-child(2)", "メニュー理念");

		//			}

		//経験者Javaキャプチャー
		waitAndCapture(driver, wait, "#inexperienced-person > div:nth-child(1) > h1", "募集一覧から経験者Java",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//経験者Javaキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "募集一覧から経験者Javaスクロール後", saveFolder);

	}

	//経験者Java（上のボタンから）→エントリー→キャプチャー→経験者Java（下のボタンから）→エントリー→キャプチャー
	public void exJavaToEntry(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		//			int windowWidth = driver.manage().window().getSize().getWidth();

		//			if (windowWidth < (992 + 16)) {
		//タイトル（プログラマーJava）まで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#inexperienced-person > div:nth-child(1) > h1")));
		act.perform();

		System.out.println("上のエントリーボタン");

		//クリック対象要素が表示されるまで待つ→クリック（上のエントリーボタン）
		waitAndClick(driver, wait, "#inexperienced-person > div:nth-child(1) > div > a", "上のエントリーボタン");

		//			} else {

		//上のエントリーボタン
		//				System.out.println("上のエントリーボタン");

		//クリック対象要素が表示されるまで待つ→クリック（上のエントリーボタン）
		//				waitAndClick(driver, wait, "#inexperienced-person > div:nth-child(1) > div > a", "上のエントリーボタン");

		//			}

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
				"経験者Java（上ボタン）からエントリー",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "経験者Java（上ボタン）からエントリースクロール後", saveFolder);

		//戻る
		driver.navigate().back();

		//クリック対象要素が表示されるまで待つ→クリック（下のエントリーボタン）
		waitAndClick(driver, wait, "#inexperienced-person > div.text-center.mb-2 > div > a", "下のエントリーボタン");

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
				"経験者Java（下ボタン）からエントリー", saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "経験者Java（下ボタン）からエントリースクロール後", saveFolder);

		//募集一覧へ戻る
		driver.navigate().back();
		driver.navigate().back();

	}

	//募集一覧から経験者C言語Linuxへ→キャプチャー
	public void jobcategoryToExCLinux(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		//			int windowWidth = driver.manage().window().getSize().getWidth();

		//			if (windowWidth < (992 + 16)) {

		//				System.out.println("ハンバーガーメニュー");

		//クリック対象要素が表示されるまで待つ→クリック（経験者C言語Linux）
		waitAndClick(driver, wait, "#experienced-person > ul > li:nth-child(3) > a:nth-child(1)", "経験者C言語Linux");

		//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第一レベル）
		//				waitAndClick(driver, wait, "#dropdownMenuButtonCompany", "メニュー企業情報");

		//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第二レベル）
		//				waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li:nth-child(2) > a",
		//						"メニュー理念");

		//			} else {

		//通常メニュー
		//				System.out.println("通常メニュー");

		//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
		//				waitAndClick(driver, wait, "#navbarDropdownCompany > span", "メニュー企業情報");

		//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第二レベル）
		//				waitAndClick(driver, wait, "#menu-item-22 > div > a:nth-child(2)", "メニュー理念");

		//			}

		//経験者C言語Linuxキャプチャー
		waitAndCapture(driver, wait, "#inexperienced-person > div:nth-child(1) > h1", "募集一覧から経験者C言語Linux",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//経験者C言語Linuxキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "募集一覧から経験者C言語Linuxスクロール後", saveFolder);

	}

	//経験者C言語Linux（上のボタンから）→エントリー→キャプチャー→経験者C言語Linux（下のボタンから）→エントリー→キャプチャー
	public void exCLinuxToEntry(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		//			int windowWidth = driver.manage().window().getSize().getWidth();

		//			if (windowWidth < (992 + 16)) {
		//タイトル（プログラマーJava）まで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#inexperienced-person > div:nth-child(1) > h1")));
		act.perform();

		System.out.println("上のエントリーボタン");

		//クリック対象要素が表示されるまで待つ→クリック（上のエントリーボタン）
		waitAndClick(driver, wait, "#inexperienced-person > div:nth-child(1) > div > a", "上のエントリーボタン");

		//			} else {

		//上のエントリーボタン
		//				System.out.println("上のエントリーボタン");

		//クリック対象要素が表示されるまで待つ→クリック（上のエントリーボタン）
		//				waitAndClick(driver, wait, "#inexperienced-person > div:nth-child(1) > div > a", "上のエントリーボタン");

		//			}

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
				"経験者C言語Linux（上ボタン）からエントリー",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "経験者C言語Linux（上ボタン）からエントリースクロール後", saveFolder);

		//戻る
		driver.navigate().back();

		//クリック対象要素が表示されるまで待つ→クリック（下のエントリーボタン）
		waitAndClick(driver, wait, "#inexperienced-person > div.text-center.mb-2 > div > a", "下のエントリーボタン");

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
				"経験者C言語Linux（下ボタン）からエントリー", saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "経験者C言語Linux（下ボタン）からエントリースクロール後", saveFolder);

		//募集一覧へ戻る
		driver.navigate().back();
		driver.navigate().back();

	}

	//募集一覧から経験者C++C#へ→キャプチャー
	public void jobcategoryToExC(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		//			int windowWidth = driver.manage().window().getSize().getWidth();

		//			if (windowWidth < (992 + 16)) {

		//				System.out.println("ハンバーガーメニュー");

		//クリック対象要素が表示されるまで待つ→クリック（経験者C++C#）
		waitAndClick(driver, wait, "#experienced-person > ul > li:nth-child(4) > a:nth-child(1)", "経験者C++C#");

		//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第一レベル）
		//				waitAndClick(driver, wait, "#dropdownMenuButtonCompany", "メニュー企業情報");

		//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第二レベル）
		//				waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li:nth-child(2) > a",
		//						"メニュー理念");

		//			} else {

		//通常メニュー
		//				System.out.println("通常メニュー");

		//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
		//				waitAndClick(driver, wait, "#navbarDropdownCompany > span", "メニュー企業情報");

		//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第二レベル）
		//				waitAndClick(driver, wait, "#menu-item-22 > div > a:nth-child(2)", "メニュー理念");

		//			}

		//経験者C++C#キャプチャー
		waitAndCapture(driver, wait, "#inexperienced-person > div:nth-child(1) > h1", "募集一覧から経験者C++C#",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//経験者C++C#キャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "募集一覧から経験者C++C#スクロール後", saveFolder);

	}

	//経験者C++C#（上のボタンから）→エントリー→キャプチャー→経験者C++C#（下のボタンから）→エントリー→キャプチャー
	public void exCToEntry(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		//			int windowWidth = driver.manage().window().getSize().getWidth();

		//			if (windowWidth < (992 + 16)) {
		//タイトル（プログラマーC++C#）まで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#inexperienced-person > div:nth-child(1) > h1")));
		act.perform();

		System.out.println("上のエントリーボタン");

		//クリック対象要素が表示されるまで待つ→クリック（上のエントリーボタン）
		waitAndClick(driver, wait, "#inexperienced-person > div:nth-child(1) > div > a", "上のエントリーボタン");

		//			} else {

		//上のエントリーボタン
		//				System.out.println("上のエントリーボタン");

		//クリック対象要素が表示されるまで待つ→クリック（上のエントリーボタン）
		//				waitAndClick(driver, wait, "#inexperienced-person > div:nth-child(1) > div > a", "上のエントリーボタン");

		//			}

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
				"経験者C++C#（上ボタン）からエントリー",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "経験者C++C#（上ボタン）からエントリースクロール後", saveFolder);

		//戻る
		driver.navigate().back();

		//クリック対象要素が表示されるまで待つ→クリック（下のエントリーボタン）
		waitAndClick(driver, wait, "#inexperienced-person > div.text-center.mb-2 > div > a", "下のエントリーボタン");

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
				"経験者C++C#（下ボタン）からエントリー", saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "経験者C++C#（下ボタン）からエントリースクロール後", saveFolder);

		//募集一覧へ戻る
		driver.navigate().back();
		driver.navigate().back();

	}

	//募集一覧から経験者ネットワーク管理へ→キャプチャー
	public void jobcategoryToExNetwork(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		//			int windowWidth = driver.manage().window().getSize().getWidth();

		//			if (windowWidth < (992 + 16)) {

		//				System.out.println("ハンバーガーメニュー");

		//クリック対象要素が表示されるまで待つ→クリック（経験者ネットワーク管理）
		waitAndClick(driver, wait, "#experienced-person > ul > li:nth-child(5) > a:nth-child(1)", "経験者ネットワーク管理");

		//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第一レベル）
		//				waitAndClick(driver, wait, "#dropdownMenuButtonCompany", "メニュー企業情報");

		//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第二レベル）
		//				waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li:nth-child(2) > a",
		//						"メニュー理念");

		//			} else {

		//通常メニュー
		//				System.out.println("通常メニュー");

		//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
		//				waitAndClick(driver, wait, "#navbarDropdownCompany > span", "メニュー企業情報");

		//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第二レベル）
		//				waitAndClick(driver, wait, "#menu-item-22 > div > a:nth-child(2)", "メニュー理念");

		//			}

		//経験者ネットワーク管理キャプチャー
		waitAndCapture(driver, wait, "#inexperienced-person > div:nth-child(1) > h1", "募集一覧から経験者ネットワーク管理",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//経験者ネットワーク管理キャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "募集一覧から経験者ネットワーク管理スクロール後", saveFolder);

	}

	//経験者ネットワーク管理（上のボタンから）→エントリー→キャプチャー→経験者ネットワーク管理（下のボタンから）→エントリー→キャプチャー
	public void exNetworkToEntry(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		//			int windowWidth = driver.manage().window().getSize().getWidth();

		//			if (windowWidth < (992 + 16)) {
		//タイトル（ネットワーク管理）まで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#inexperienced-person > div:nth-child(1) > h1")));
		act.perform();

		System.out.println("上のエントリーボタン");

		//クリック対象要素が表示されるまで待つ→クリック（上のエントリーボタン）
		waitAndClick(driver, wait, "#inexperienced-person > div:nth-child(1) > div > a", "上のエントリーボタン");

		//			} else {

		//上のエントリーボタン
		//				System.out.println("上のエントリーボタン");

		//クリック対象要素が表示されるまで待つ→クリック（上のエントリーボタン）
		//				waitAndClick(driver, wait, "#inexperienced-person > div:nth-child(1) > div > a", "上のエントリーボタン");

		//			}

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
				"経験者ネットワーク管理（上ボタン）からエントリー",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "経験者ネットワーク管理（上ボタン）からエントリースクロール後", saveFolder);

		//戻る
		driver.navigate().back();

		//クリック対象要素が表示されるまで待つ→クリック（下のエントリーボタン）
		//なぜか他のページとセレクタが違う
		waitAndClick(driver, wait, "#inexperienced-person > div > div.text-center.mb-2 > div > a", "下のエントリーボタン");

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
				"経験者ネットワーク管理（下ボタン）からエントリー", saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "経験者ネットワーク管理（下ボタン）からエントリースクロール後", saveFolder);

		//募集一覧へ戻る
		driver.navigate().back();
		driver.navigate().back();

	}

	//募集一覧から経験者営業へ→キャプチャー
	public void jobcategoryToExManagement(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		//			int windowWidth = driver.manage().window().getSize().getWidth();

		//			if (windowWidth < (992 + 16)) {

		//				System.out.println("ハンバーガーメニュー");

		//クリック対象要素が表示されるまで待つ→クリック（経験者営業）
		waitAndClick(driver, wait, "#experienced-person > ul > li:nth-child(6) > a:nth-child(1)", "経験者営業");

		//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第一レベル）
		//				waitAndClick(driver, wait, "#dropdownMenuButtonCompany", "メニュー企業情報");

		//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第二レベル）
		//				waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li:nth-child(2) > a",
		//						"メニュー理念");

		//			} else {

		//通常メニュー
		//				System.out.println("通常メニュー");

		//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
		//				waitAndClick(driver, wait, "#navbarDropdownCompany > span", "メニュー企業情報");

		//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第二レベル）
		//				waitAndClick(driver, wait, "#menu-item-22 > div > a:nth-child(2)", "メニュー理念");

		//			}

		//経験者営業キャプチャー
		waitAndCapture(driver, wait, "#inexperienced-person > div:nth-child(1) > h1", "募集一覧から経験者営業",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//経験者営業キャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "募集一覧から経験者営業スクロール後", saveFolder);

	}

	//経験者営業（上のボタンから）→エントリー→キャプチャー→経験者営業（下のボタンから）→エントリー→キャプチャー
	public void exManagementToEntry(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		//			int windowWidth = driver.manage().window().getSize().getWidth();

		//			if (windowWidth < (992 + 16)) {
		//タイトル（営業）まで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#inexperienced-person > div:nth-child(1) > h1")));
		act.perform();

		System.out.println("上のエントリーボタン");

		//クリック対象要素が表示されるまで待つ→クリック（上のエントリーボタン）
		waitAndClick(driver, wait, "#inexperienced-person > div:nth-child(1) > div > a", "上のエントリーボタン");

		//			} else {

		//上のエントリーボタン
		//				System.out.println("上のエントリーボタン");

		//クリック対象要素が表示されるまで待つ→クリック（上のエントリーボタン）
		//				waitAndClick(driver, wait, "#inexperienced-person > div:nth-child(1) > div > a", "上のエントリーボタン");

		//			}

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
				"経験者営業（上ボタン）からエントリー",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "経験者営業（上ボタン）からエントリースクロール後", saveFolder);

		//戻る
		driver.navigate().back();

		//クリック対象要素が表示されるまで待つ→クリック（下のエントリーボタン）
		waitAndClick(driver, wait, "#inexperienced-person > div.text-center.mb-2 > div > a", "下のエントリーボタン");

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span",
				"経験者営業（下ボタン）からエントリー", saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "経験者営業（下ボタン）からエントリースクロール後", saveFolder);

		//募集一覧へ戻る
		driver.navigate().back();
		driver.navigate().back();

	}

	//募集一覧から福利厚生へ→キャプチャー
	public void jobcategoryToWelfare(WebDriver driver, WebDriverWait wait, String saveFolder)
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
			waitAndClick(driver, wait, "#dropdownMenuButtonc", "メニュー採用情報");

			//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第二レベル）
			waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li:nth-child(2) > a",
					"メニュー福利厚生");

		} else {

			//通常メニュー
			System.out.println("通常メニュー");

			//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
			waitAndClick(driver, wait, "#navbarDropdownRecruit", "メニュー採用情報");

			//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第二レベル）
			waitAndClick(driver, wait, "#menu-item-21 > div > a:nth-child(2)", "メニュー福利厚生");

		}

		//福利厚生キャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "募集一覧から福利厚生",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//福利厚生キャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "募集一覧から福利厚生スクロール後", saveFolder);

	}

	//福利厚生からエントリーへ→キャプチャー→キャプチャー
	public void welfareToEntry(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		act.moveToElement(
				driver.findElement(By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));
		act.perform();

		//ウィンドウサイズ確認
		int windowWidth = driver.manage().window().getSize().getWidth();

		if (windowWidth < (768 + 16)) {

			System.out.println("エントリーボタン");

			//クリック対象要素が表示されるまで待つ→クリック
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div.hs-a.text-center.mt-5.col-12.d-block.d-md-none > a",
					"エントリーボタン");

		} else {

			//通常エントリーボタン
			System.out.println("通常エントリーボタン");

			//クリック対象要素が表示されるまで待つ→クリック（通常エントリーボタン第一レベル）
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div.hs-recruit-main-container1 > div > div > div > a",
					"通常エントリーボタン");

		}

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "福利厚生からエントリー",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "福利厚生からエントリースクロール後", saveFolder);

		//戻る
		driver.navigate().back();
	}

	//福利厚生から教育・研修へ→キャプチャー
	public void welfareToTraining(WebDriver driver, WebDriverWait wait, String saveFolder)
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
			waitAndClick(driver, wait, "#dropdownMenuButtonc", "メニュー採用情報");

			//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第二レベル）
			waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li:nth-child(3) > a",
					"メニュー教育・研修");

		} else {

			//通常メニュー
			System.out.println("通常メニュー");

			//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
			waitAndClick(driver, wait, "#navbarDropdownRecruit", "メニュー採用情報");

			//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第二レベル）
			waitAndClick(driver, wait, "#menu-item-21 > div > a:nth-child(3)", "メニュー教育・研修");

		}

		//教育・研修キャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "福利厚生から教育・研修",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//教育・研修キャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "福利厚生から教育・研修スクロール後", saveFolder);

	}

	//教育・研修からエントリーへ→キャプチャー→キャプチャー
	public void trainingToEntry(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		act.moveToElement(
				driver.findElement(By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));
		act.perform();

		//ウィンドウサイズ確認
		int windowWidth = driver.manage().window().getSize().getWidth();

		if (windowWidth < (768 + 16)) {

			System.out.println("エントリーボタン");

			//クリック対象要素が表示されるまで待つ→クリック
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div.hs-a.text-center.mt-5.col-12.d-block.d-md-none > a",
					"エントリーボタン");

		} else {

			//通常エントリーボタン
			System.out.println("通常エントリーボタン");

			//クリック対象要素が表示されるまで待つ→クリック（通常エントリーボタン第一レベル）
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(4) > div.hs-recruit-link-container.mt-5.row.w-100 > div > a",
					"通常エントリーボタン");

		}

		//エントリーキャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "教育・研修からエントリー",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//エントリーキャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "教育・研修からエントリースクロール後", saveFolder);

		//戻る
		driver.navigate().back();
	}

	//教育・研修から社員の声へ→キャプチャー
	public void trainingToVoices(WebDriver driver, WebDriverWait wait, String saveFolder)
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
			waitAndClick(driver, wait, "#dropdownMenuButtonc", "メニュー採用情報");

			//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第二レベル）
			waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li:nth-child(4) > a",
					"メニュー社員の声");

		} else {

			//通常メニュー
			System.out.println("通常メニュー");

			//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
			waitAndClick(driver, wait, "#navbarDropdownRecruit", "メニュー採用情報");

			//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第二レベル）
			waitAndClick(driver, wait, "#menu-item-21 > div > a:nth-child(4)", "メニュー社員の声");

		}

		//社員の声キャプチャー
		waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "教育・研修から社員の声",
				saveFolder);

		//フッターのロゴまで画面を移動
		act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
		act.perform();

		//社員の声キャプチャースクロール後
		waitAndCapture(driver, wait, "#privacymark-logo", "教育・研修から社員の声スクロール後", saveFolder);

	}

	//社員の声からモーダル→キャプチャー
	public void voicesToModal(WebDriver driver, WebDriverWait wait, String saveFolder)
			throws IOException, InterruptedException {

		//画面をスクロールさせるためActionクラスのインスタンスを作成
		Actions act = new Actions(driver);

		//ウィンドウサイズ確認
		int windowWidth = driver.manage().window().getSize().getWidth();

		if (windowWidth < (576 + 16)) {

			System.out.println("モーダル縦表示");

			//クリック対象要素が表示されるまで待つ→モーダル1
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(1) > div > a:nth-child(1)",
					"モーダル1");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャー準備
			CaptureUtil captureUtil = new CaptureUtil();
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル1");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル2
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(2) > div > a:nth-child(1)",
					"モーダル2");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル2");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル3
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(3) > div > a:nth-child(1)",
					"モーダル3");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル3");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル4
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(4) > div > a:nth-child(1)",
					"モーダル4");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル4");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル5
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(5) > div > a:nth-child(1)",
					"モーダル5");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル5");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル6
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(6) > div > a:nth-child(1)",
					"モーダル6");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル6");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル7
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(7) > div > a:nth-child(1)",
					"モーダル7");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル7");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル8
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(8) > div > a:nth-child(1)",
					"モーダル8");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル8");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル9
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(9) > div > a:nth-child(1)",
					"モーダル9");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル9");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル10
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(10) > div > a:nth-child(1)",
					"モーダル10");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル10");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル11
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(11) > div > a:nth-child(1)",
					"モーダル11");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル11");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル12
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(12) > div > a:nth-child(1)",
					"モーダル12");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル12");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル13
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(13) > div > a:nth-child(1)",
					"モーダル13");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル13");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル14
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(14) > div > a:nth-child(1)",
					"モーダル14");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル14");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル15
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(15) > div > a:nth-child(1)",
					"モーダル15");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル15");
			driver.navigate().refresh();

		} else {

			//クリック対象要素が表示されるまで待つ→モーダル1
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(1) > div > a:nth-child(1)",
					"モーダル1");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャー準備
			CaptureUtil captureUtil = new CaptureUtil();
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル1");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル2
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(2) > div > a:nth-child(1)",
					"モーダル2");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル2");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル3
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(3) > div > a:nth-child(1)",
					"モーダル3");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル3");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル4
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(4) > div > a:nth-child(1)",
					"モーダル4");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル4");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル5
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(5) > div > a:nth-child(1)",
					"モーダル5");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル5");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル6
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(6) > div > a:nth-child(1)",
					"モーダル6");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル6");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル7
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(7) > div > a:nth-child(1)",
					"モーダル7");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル7");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル8
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(8) > div > a:nth-child(1)",
					"モーダル8");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル8");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル9
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(9) > div > a:nth-child(1)",
					"モーダル9");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル9");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル10
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(10) > div > a:nth-child(1)",
					"モーダル10");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル10");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル11
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(11) > div > a:nth-child(1)",
					"モーダル11");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル11");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル12
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(12) > div > a:nth-child(1)",
					"モーダル12");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル12");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル13
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(13) > div > a:nth-child(1)",
					"モーダル13");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル13");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル14
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(14) > div > a:nth-child(1)",
					"モーダル14");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル14");
			driver.navigate().refresh();

			//クリック対象要素が表示されるまで待つ→モーダル14
			waitAndClick(driver, wait,
					"body > div.page-contenet.content-out-box.w-max > div > div:nth-child(3) > div.hs-recruit-main-container1.mt-5 > article > div:nth-child(15) > div > a:nth-child(1)",
					"モーダル15");
			//しばらく待って
			Thread.sleep(1000);
			//キャプチャ
			captureUtil.cupturePage(driver, saveFolder, "社員の声からモーダル15");
			driver.navigate().refresh();

		}

	}

	//社員の声からエントリーへ→キャプチャー
		public void voicesToEntry(WebDriver driver, WebDriverWait wait, String saveFolder)
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
				waitAndClick(driver, wait, "#dropdownMenuButtonc", "メニュー採用情報");

				//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第二レベル）
				waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-2.mb-2.show > ul > li.text-center.hs-a.mt-3.mb-2 > a",
						"メニューエントリー");

			} else {

				//通常メニュー
				System.out.println("通常メニュー");

				//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
				waitAndClick(driver, wait, "#navbarDropdownRecruit", "メニュー採用情報");

				//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第二レベル）
				waitAndClick(driver, wait, "#menu-item-21 > div > a:nth-child(5)", "メニューエントリー");

			}

			//エントリーキャプチャー
			waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "社員の声からエントリー",
					saveFolder);

			//フッターのロゴまで画面を移動
			act.moveToElement(driver.findElement(By.cssSelector("#privacymark-logo")));
			act.perform();

			//エントリーキャプチャースクロール後
			waitAndCapture(driver, wait, "#privacymark-logo", "社員の声からエントリースクロール後", saveFolder);

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
