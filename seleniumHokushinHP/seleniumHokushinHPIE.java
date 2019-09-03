package seleniumHokushinHP;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumHokushinHPIE {

	//現在時刻格納用
			public static LocalDateTime nowLocalDt = LocalDateTime.now();;

		public static void main(String[] args) {
			// TODO 自動生成されたメソッド・スタブ
			System.setProperty("webdriver.ie.driver","./exe/IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();

			//待ち時間を設定 今回は22秒
			WebDriverWait wait = new WebDriverWait(driver, 22);

			Actions act = new Actions(driver);

			//スクリーンショット保存フォルダ+ファイル名共通部
			String saveFolder = "./screenShots/";

			//カレントウインドウを最大化する
//			driver.manage().window().maximize();

			// 指定のウィンドウサイズに変更
//			int width = 1200 + 15;
			//ハンバーガーメニュー表示させるウィンドウサイズ
			int width = 991 + 15;

			int height = 1000;
			driver.manage().window().setSize(new Dimension(width, height));


			//driverはchromeがはいっている
			driver.get("http://hokusys.jp/");



			try {

				//ちょっとだけ待つ
				Thread.sleep(10);// Let the user actually see something!!

				//ホームェック用インスタンス作成
				TopCheckIE topCheckIE = new TopCheckIE();

				//ホームからホームへ→キャプチャー
				topCheckIE.toTop(driver, wait, saveFolder);


				//企業情報チェック用インスタンス作成
				CompanyCheckIE companyCheckIE = new CompanyCheckIE();

				//企業情報チェック実行
				//ホームから会社概要へ→キャプチャー
				companyCheckIE.toCompany(driver, wait, saveFolder);

				//会社概要から理念へ→キャプチャー
				companyCheckIE.companyToPhilosophy(driver, wait, saveFolder) ;

				//理念からパートナーシナジーへ→キャプチャー
				companyCheckIE.philosophyToPartnerSynergy(driver, wait, saveFolder) ;




				//サービスチェック用インスタンス作成
				ServiceCheckIE serviceCheckIE = new ServiceCheckIE();

				//サービスチェック実行
				//パートナーシナジーからサービスへ→キャプチャー
				serviceCheckIE.partnerSynergyToService(driver, wait, saveFolder);



				//採用情報チェック用インスタンス作成
				JobcategoryCheckIE jobcategoryCheckIE = new JobcategoryCheckIE();

				//採用情報チェック実行
				//サービスから募集一覧へ→キャプチャー
				jobcategoryCheckIE.serviceToJobcategory(driver, wait, saveFolder);

				//募集一覧からエントリーへ→キャプチャー
				jobcategoryCheckIE.jobcategoryToEntry(driver, wait, saveFolder);

				//募集一覧から未経験者PHPへ→キャプチャー
				jobcategoryCheckIE.jobcategoryToNewPHP(driver, wait, saveFolder);

				//未経験者PHPからエントリー（上下のボタン）へ→キャプチャー
				jobcategoryCheckIE.newPHPToEntry(driver, wait, saveFolder) ;

				//募集一覧から未経験者Javaへ→キャプチャー
				jobcategoryCheckIE.jobcategoryToNewJava(driver, wait, saveFolder);

				//未経験者Javaからエントリー（上下のボタン）へ→キャプチャー
				jobcategoryCheckIE.newJavaToEntry(driver, wait, saveFolder) ;

				//募集一覧から未経験者C言語Linuxへ→キャプチャー
				jobcategoryCheckIE.jobcategoryToNewCLinux(driver, wait, saveFolder);

				//未経験者C言語Linuxからエントリー（上下のボタン）へ→キャプチャー
				jobcategoryCheckIE.newCLinuxToEntry(driver, wait, saveFolder) ;

				//募集一覧から経験者PHPへ→キャプチャー
				jobcategoryCheckIE.jobcategoryToExPHP(driver, wait, saveFolder);

				//経験者PHPからエントリー（上下のボタン）へ→キャプチャー
				jobcategoryCheckIE.exPHPToEntry(driver, wait, saveFolder) ;

				//募集一覧から経験者Javaへ→キャプチャー
				jobcategoryCheckIE.jobcategoryToExJava(driver, wait, saveFolder);

				//経験者Javaからエントリー（上下のボタン）へ→キャプチャー
				jobcategoryCheckIE.exJavaToEntry(driver, wait, saveFolder) ;

				//募集一覧から経験者C言語Linuxへ→キャプチャー
				jobcategoryCheckIE.jobcategoryToExCLinux(driver, wait, saveFolder);

				//経験者C言語Linuxからエントリー（上下のボタン）へ→キャプチャー
				jobcategoryCheckIE.exCLinuxToEntry(driver, wait, saveFolder) ;

				//募集一覧から経験者C++C#へ→キャプチャー
				jobcategoryCheckIE.jobcategoryToExC(driver, wait, saveFolder);

				//経験者C言語Linuxからエントリー（上下のボタン）へ→キャプチャー
				jobcategoryCheckIE.exCToEntry(driver, wait, saveFolder) ;

				//募集一覧から経験者ネットワーク管理へ→キャプチャー
				jobcategoryCheckIE.jobcategoryToExNetwork(driver, wait, saveFolder);

				//経験者ネットワーク管理からエントリー（上下のボタン）へ→キャプチャー
				jobcategoryCheckIE.exNetworkToEntry(driver, wait, saveFolder) ;

				//募集一覧から経験者営業へ→キャプチャー
				jobcategoryCheckIE.jobcategoryToExManagement(driver, wait, saveFolder);

				//経験者営業からエントリー（上下のボタン）へ→キャプチャー
				jobcategoryCheckIE.exManagementToEntry(driver, wait, saveFolder) ;

				//募集一覧から福利厚生へ→キャプチャー
				jobcategoryCheckIE.jobcategoryToWelfare(driver, wait, saveFolder);

				//福利厚生からエントリーへ→キャプチャー
				jobcategoryCheckIE.welfareToEntry(driver, wait, saveFolder);

				//福利厚生から教育・研修へ→キャプチャー
				jobcategoryCheckIE.welfareToTraining(driver, wait, saveFolder);

				//教育・研修からエントリーへ→キャプチャー
				jobcategoryCheckIE.trainingToEntry(driver, wait, saveFolder);

				//教育・研修から社員の声へ→キャプチャー
				jobcategoryCheckIE.trainingToVoices(driver, wait, saveFolder);

				//社員の声からモーダル→キャプチャー
				jobcategoryCheckIE.voicesToModal(driver, wait, saveFolder);

				//社員の声からエントリーへ→キャプチャー
				jobcategoryCheckIE.voicesToEntry(driver, wait, saveFolder);


				//お問合せ用インスタンス作成
				ContactCheckIE contactCheckIE = new ContactCheckIE();

				//お問合せチェック実行
				//ホームからお問合せへ→キャプチャー
				contactCheckIE.entryToContact(driver, wait, saveFolder);

				//ホームに戻る
				//クリック
				backHomeFromChild(driver, wait);


				//ホームからサービスへ→キャプチャー
				serviceCheckIE.toService(driver, wait, saveFolder);

				//ホームに戻る
				//クリック
				backHomeFromChild(driver, wait);

				//ホームから採用情報へ→キャプチャー
				jobcategoryCheckIE.toJobcategory(driver, wait, saveFolder);

				//ホームに戻る
				//クリック
				backHomeFromChild(driver, wait);

				//ホームからお問合せへ→キャプチャー
				contactCheckIE.toContact(driver, wait, saveFolder);

				//ホームに戻る
				//クリック
				backHomeFromChild(driver, wait);






































				//終了のためしばらく待って
				Thread.sleep(500); // Let the user actually see something!

				//chrome終了
				driver.quit();

				JOptionPane pane = new JOptionPane("処理が終了しました。", JOptionPane.INFORMATION_MESSAGE);
				JDialog dialog = pane.createDialog(null, "seleniumHokushinHp");
				dialog.setAlwaysOnTop(true);
				dialog.setVisible(true);
				System.out.println("*** 終了メッセージ表示終了");
				dialog.dispose();

			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}

		private static CompanyCheck CompanyCheck() {
			// TODO 自動生成されたメソッド・スタブ
			return null;
		}

		protected static void backHomeFromChild(WebDriver driver, WebDriverWait wait) {
			//ウィンドウサイズ確認
			int windowWidth = driver.manage().window().getSize().getWidth();
			//クリック
			if (windowWidth < (992 + 16)) {
				//（ハンバーガーメニュー）
				driver.findElement(
						By.cssSelector("body > header > nav > div.w-100 > button > span"))
						.click();

				//クリック対象要素が表示されるまで待つ（ハンバーガー→ホーム）
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.cssSelector(
								"#Navbar > ul > li.nav-item.mt-4.mb-2 > a")));
				//クリック
				driver.findElement(By.cssSelector("#Navbar > ul > li.nav-item.mt-4.mb-2 > a")).click();
			} else {
				//通常メニュー
				driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();

			}

		}

	}
