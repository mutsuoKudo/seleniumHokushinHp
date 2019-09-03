package seleniumHokushinHP;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactCheckIE {

	//エントリーからお問合せへ遷移→キャプチャー
			protected void entryToContact(WebDriver driver, WebDriverWait wait, String saveFolder)
					throws IOException, InterruptedException {

				//画面をスクロールさせるためActionクラスのインスタンスを作成
				Actions act = new Actions(driver);

				//ウィンドウサイズ確認
				int windowWidth = driver.manage().window().getSize().getWidth();

				//サービスへの遷移
				if (windowWidth < (992 + 16)) {

					System.out.println("ハンバーガーメニュー");

					//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー）
					waitAndClick(driver, wait, "body > header > nav > div.w-100 > button", "ハンバーガーメニュー");

					//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第一レベル）
					waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-2.mb-4 > a", "メニューお問合せ");


				} else {

					//通常メニュー
					System.out.println("通常メニュー");

					//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
					waitAndClick(driver, wait,
							"#menu-item-19 > a", "メニューお問合せ");

				}

				//お問合せキャプチャー
				waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "エントリーからお問合せ",
						saveFolder);

				//画面下部までスクロール
				((JavascriptExecutor) driver).executeScript("scroll(0,20000);");

				//お問合せキャプチャースクロール後
				waitAndCapture(driver, wait, "#privacymark-logo", "エントリーからお問合せスクロール後", saveFolder);

			}

		//トップページから会社概要へ遷移→キャプチャー
		protected void toContact(WebDriver driver, WebDriverWait wait, String saveFolder)
				throws IOException, InterruptedException {

			//画面をスクロールさせるためActionクラスのインスタンスを作成
			Actions act = new Actions(driver);

			//ウィンドウサイズ確認
			int windowWidth = driver.manage().window().getSize().getWidth();

			//サービスへの遷移
			if (windowWidth < (992 + 16)) {

				System.out.println("ハンバーガーメニュー");

				//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー）
				waitAndClick(driver, wait, "body > header > nav > div.w-100 > button", "ハンバーガーメニュー");

				//クリック対象要素が表示されるまで待つ→クリック（ハンバーガーメニュー第一レベル）
				waitAndClick(driver, wait, "#Navbar > ul > li.nav-item.mt-2.mb-4 > a", "メニューお問合せ");


			} else {

				//通常メニュー
				System.out.println("通常メニュー");

				//クリック対象要素が表示されるまで待つ→クリック（通常メニュー第一レベル）
				waitAndClick(driver, wait,
						"#menu-item-19 > a > span", "メニューお問合せ");

			}

			//お問合せキャプチャー
			waitAndCapture(driver, wait, "body > div.page-contenet.content-out-box.w-max > div > h1 > span", "IEトップページからお問合せ",
					saveFolder);

			//画面下部までスクロール
			((JavascriptExecutor) driver).executeScript("scroll(0,20000);");

			//お問合せキャプチャースクロール後
			waitAndCapture(driver, wait, "#privacymark-logo", "IEトップページからお問合せスクロール後", saveFolder);

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

