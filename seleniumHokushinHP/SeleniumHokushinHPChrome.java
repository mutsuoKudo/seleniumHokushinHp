package seleniumHokushinHP;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHokushinHPChrome {

	//現在時刻格納用
		public static LocalDateTime nowLocalDt = LocalDateTime.now();;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//chromeドライバの設定 Chromeを使用するよという設定
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();

		//実行する前にメモリをクリアさせる
		options.addArguments("--purge-memory-button");

		//        見えないところでやる
		//        options.addArguments("--headless");

		WebDriver driver = new ChromeDriver(options);
		//待ち時間を設定 今回は22秒
		WebDriverWait wait = new WebDriverWait(driver, 22);

		Actions act = new Actions(driver);

		//スクリーンショット保存フォルダ+ファイル名共通部
		String saveFolder = "./screenShots/";

		//カレントウインドウを最大化する
//		driver.manage().window().maximize();

		// 指定のウィンドウサイズに変更
//		int width = 1200 + 15;
		int width = 768 + 15;
		// 梅アイコン表示させるウィンドウサイズ
//		int width = 1201 + 15;
		int height = 1000;
		driver.manage().window().setSize(new Dimension(width, height));

		//driverはchromeがはいっている
		driver.get("http://hokusys.jp/");

		try {

			//ちょっとだけ待つ
			Thread.sleep(10);// Let the user actually see something!!


			//ホームチェック用インスタンス作成
			TopCheck topCheck = new TopCheck();
			topCheck.toTop(driver, wait, saveFolder);

			//企業情報チェック用インスタンス作成
			CompanyCheck companyCheck = new CompanyCheck();

			//企業情報チェック実行
			//ホームから会社概要へ→キャプチャー
			companyCheck.toCompany(driver, wait, saveFolder);

			//会社概要から理念へ→キャプチャー
			companyCheck.companyToPhilosophy(driver, wait, saveFolder) ;

			//理念からパートナーシナジーへ→キャプチャー
			companyCheck.philosophyToPartnerSynergy(driver, wait, saveFolder) ;


			//サービスチェック用インスタンス作成
			ServiceCheck serviceCheck = new ServiceCheck();

			//サービスチェック実行
			//パートナーシナジーからサービスへ→キャプチャー
			serviceCheck.partnerSynergyToService(driver, wait, saveFolder);

			//採用情報チェック用インスタンス作成
			JobcategoryCheck jobcategoryCheck = new JobcategoryCheck();

			//採用情報チェック実行
			//サービスから募集一覧へ→キャプチャー
			jobcategoryCheck.serviceToJobcategory(driver, wait, saveFolder);

			//募集一覧からエントリーへ→キャプチャー
			jobcategoryCheck.jobcategoryToEntry(driver, wait, saveFolder);

			//募集一覧から未経験者PHPへ→キャプチャー
			jobcategoryCheck.jobcategoryToNewPHP(driver, wait, saveFolder);

			//未経験者PHPからエントリー（上下のボタン）へ→キャプチャー
			jobcategoryCheck.newPHPToEntry(driver, wait, saveFolder) ;

			//募集一覧から未経験者Javaへ→キャプチャー
			jobcategoryCheck.jobcategoryToNewJava(driver, wait, saveFolder);

			//未経験者Javaからエントリー（上下のボタン）へ→キャプチャー
			jobcategoryCheck.newJavaToEntry(driver, wait, saveFolder) ;

			//募集一覧から未経験者C言語Linuxへ→キャプチャー
			jobcategoryCheck.jobcategoryToNewCLinux(driver, wait, saveFolder);

			//未経験者C言語Linuxからエントリー（上下のボタン）へ→キャプチャー
			jobcategoryCheck.newCLinuxToEntry(driver, wait, saveFolder) ;

			//募集一覧から経験者PHPへ→キャプチャー
			jobcategoryCheck.jobcategoryToExPHP(driver, wait, saveFolder);

			//経験者PHPからエントリー（上下のボタン）へ→キャプチャー
			jobcategoryCheck.exPHPToEntry(driver, wait, saveFolder) ;

			//募集一覧から経験者Javaへ→キャプチャー
			jobcategoryCheck.jobcategoryToExJava(driver, wait, saveFolder);

			//経験者Javaからエントリー（上下のボタン）へ→キャプチャー
			jobcategoryCheck.exJavaToEntry(driver, wait, saveFolder) ;

			//募集一覧から経験者C言語Linuxへ→キャプチャー
			jobcategoryCheck.jobcategoryToExCLinux(driver, wait, saveFolder);

			//経験者C言語Linuxからエントリー（上下のボタン）へ→キャプチャー
			jobcategoryCheck.exCLinuxToEntry(driver, wait, saveFolder) ;

			//募集一覧から経験者C++C#へ→キャプチャー
			jobcategoryCheck.jobcategoryToExC(driver, wait, saveFolder);

			//経験者C言語Linuxからエントリー（上下のボタン）へ→キャプチャー
			jobcategoryCheck.exCToEntry(driver, wait, saveFolder) ;

			//募集一覧から経験者ネットワーク管理へ→キャプチャー
			jobcategoryCheck.jobcategoryToExNetwork(driver, wait, saveFolder);

			//経験者ネットワーク管理からエントリー（上下のボタン）へ→キャプチャー
			jobcategoryCheck.exNetworkToEntry(driver, wait, saveFolder) ;

			//募集一覧から経験者営業へ→キャプチャー
			jobcategoryCheck.jobcategoryToExManagement(driver, wait, saveFolder);

			//経験者営業からエントリー（上下のボタン）へ→キャプチャー
			jobcategoryCheck.exManagementToEntry(driver, wait, saveFolder) ;

			//募集一覧から福利厚生へ→キャプチャー
			jobcategoryCheck.jobcategoryToWelfare(driver, wait, saveFolder);

			//福利厚生からエントリーへ→キャプチャー
			jobcategoryCheck.welfareToEntry(driver, wait, saveFolder);

			//福利厚生から教育・研修へ→キャプチャー
			jobcategoryCheck.welfareToTraining(driver, wait, saveFolder);

			//教育・研修からエントリーへ→キャプチャー
			jobcategoryCheck.trainingToEntry(driver, wait, saveFolder);

			//教育・研修から社員の声へ→キャプチャー
			jobcategoryCheck.trainingToVoices(driver, wait, saveFolder);

			//社員の声からモーダル→キャプチャー
			jobcategoryCheck.voicesToModal(driver, wait, saveFolder);

			//社員の声からエントリーへ→キャプチャー
			jobcategoryCheck.voicesToEntry(driver, wait, saveFolder);


			//お問合せ用インスタンス作成
			ContactCheck contactCheck = new ContactCheck();

			//お問合せチェック実行
			//ホームからお問合せへ→キャプチャー
			contactCheck.entryToContact(driver, wait, saveFolder);

			//ホームに戻る
			//クリック
			backHomeFromChild(driver, wait);

			//梅アイコンチェック用インスタンス作成
			PlumCheck plumCheck = new PlumCheck();

			//梅アイコンチェック実行
			//梅アイコンから会社概要へ→キャプチャー
			plumCheck.toCompany(driver, wait, saveFolder);

			//梅アイコンから理念へ→キャプチャー
			plumCheck.toPhilosophy(driver, wait, saveFolder);

			//梅アイコンからパートナーシナジーへ→キャプチャー
			plumCheck.toPartnerSynergy(driver, wait, saveFolder);

			//梅アイコンからサービスへ→キャプチャー
			plumCheck.toService(driver, wait, saveFolder);

			//梅アイコンから募集一覧へ→キャプチャー
			plumCheck.toJobcategory(driver, wait, saveFolder);

			//梅アイコンから福利厚生へ→キャプチャー
			plumCheck.toWelfare(driver, wait, saveFolder);

			//梅アイコンから教育・研修へ→キャプチャー
			plumCheck.toTraining(driver, wait, saveFolder);

			//梅アイコンから社員の声へ→キャプチャー
			plumCheck.toVoices(driver, wait, saveFolder);
			//※梅アイコンが表示されている場合、plumCheck.toVoicestoVoicesの中でホームに戻り済み
			//※梅アイコンが表示されていない場合、ホームのままなので戻る動作いらない


			//ホームからサービスへ→キャプチャー
			serviceCheck.toService(driver, wait, saveFolder);

			//ホームに戻る
			//クリック
			backHomeFromChild(driver, wait);

			//ホームから採用情報へ→キャプチャー
			jobcategoryCheck.toJobcategory(driver, wait, saveFolder);

			//ホームに戻る
			//クリック
			backHomeFromChild(driver, wait);

			//ホームからお問合せへ→キャプチャー
			contactCheck.toContact(driver, wait, saveFolder);

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
