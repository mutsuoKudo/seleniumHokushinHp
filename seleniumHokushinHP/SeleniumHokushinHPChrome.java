package seleniumHokushinHP;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHokushinHPChrome {

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

		//現在時刻格納用
		LocalDateTime nowLocalDt = null;
		//現在時刻の文字列化用
		String localTimeStr1 = null;
		//スクリーンショット保存フォルダ+ファイル名共通部
		String saveFolder = "./screenShots/";

		//カレントウインドウを最大化する
		driver.manage().window().maximize();

		//driverはchromeがはいっている→index.phpに遷移しろというている
		//        driver.get("http://192.168.71.208/hokushin_util/index.php");
		driver.get("https://ae1036569i.smartrelease.jp/");

		try {
			//カレントウインドウを最大化する
			driver.manage().window().maximize();
			//ちょっとだけ待つ
			Thread.sleep(10);// Let the user actually see something!!
			TopCheck topCheck = new TopCheck();
			CompanyCheck companyCheck = new CompanyCheck();
			PhilosophyCheck philosophyCheck = new PhilosophyCheck();
			PartnersynergyCheck partnersynergyCheck = new PartnersynergyCheck();
			ServiceCheck serviceCheck = new ServiceCheck();
			JobcategoryCheck jobcategoryCheck = new JobcategoryCheck();
			WelfareCheck welfareCheck = new WelfareCheck();
			TrainingCheck trainingCheck = new TrainingCheck();
			VoicesCheck voicesCheck = new VoicesCheck();
			EntryCheck entryCheck = new EntryCheck();
			ContactCheck contactCheck = new ContactCheck();

			//トップページについてここから
			//	//トップページのナビゲーションバーここから

			//						//トップページからトップページ
			//						topCheck.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページから会社概要
			////						CompanyCheck companyCheck = new CompanyCheck();
			//						companyCheck.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページに戻る
			//						driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			//
			//						//トップページから理念
			//						philosophyCheck.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページに戻る
			//						driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			//
			//						//トップページからパートナーシナジー
			//						partnersynergyCheck.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページに戻る
			//						driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			//
			//						//トップページからサービス
			//						ServiceCheck serviceCheck = new ServiceCheck();
			//						serviceCheck.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページに戻る
			//						driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();

			//						//トップページから募集一覧
			//						jobcategoryCheck.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページに戻る
			//						driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			//
			//						//トップページから福利厚生
			//						welfareCheck.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページに戻る
			//						driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			//
			//						//トップページから教育・研修
			//						trainingCheck.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページに戻る
			//						driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			//
			//						//トップページから社員の声
			//						voicesCheck.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページに戻る
			//						driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			//
			//						//トップページからエントリー
			//						entryCheck.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページに戻る
			//						driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			//
			//						//トップページからお問合せ
			//						contactCheck.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページに戻る
			//						driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			//
			//						//トップページのナビゲーションバーここまで
			//
			//						//トップページの梅アイコンここから
			//
			//						//梅アイコン左から一番目
			//						Plum1Check plum1Check = new Plum1Check();
			//						plum1Check.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページに戻る
			//						driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			//
			//						//梅アイコン左から二番目
			//						Plum2Check plum2Check = new Plum2Check();
			//						plum2Check.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページに戻る
			//						driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			//
			//						//梅アイコン左から三番目
			//						Plum3Check plum3Check = new Plum3Check();
			//						plum3Check.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページに戻る
			//						driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			//
			//						//梅アイコン左から四番目
			//						Plum4Check plum4Check = new Plum4Check();
			//						plum4Check.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページに戻る
			//						driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			//
			//						//梅アイコン左から五番目
			//						Plum5Check plum5Check = new Plum5Check();
			//						plum5Check.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページに戻る
			//						driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			//
			//						//梅アイコン左から六番目
			//						Plum6Check plum6Check = new Plum6Check();
			//						plum6Check.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページに戻る
			//						driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			//
			//						//梅アイコン左から七番目
			//						Plum7Check plum7Check = new Plum7Check();
			//						plum7Check.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページに戻る
			//						driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			//
			//						//梅アイコン左から八番目
			//						Plum8Check plum8Check = new Plum8Check();
			//						plum8Check.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページに戻る
			//						driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			//
			//						//トップページの梅アイコンここまで
			//
			//						//トップページヘッダーロゴここから
			//
			//						HeaderlogoCheck headerlogoCheck = new HeaderlogoCheck();
			//						headerlogoCheck.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページに戻る
			////						driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			//
			//						//トップページヘッダーロゴここまで
			//
			//						//トップページフッターここから
			//						//トップページフッターロゴ
			//
			//						FooterlogoCheck footerlogoCheck = new FooterlogoCheck();
			//						footerlogoCheck.clickAndCaptureFromHome(driver, wait, saveFolder);
			//
			//						//トップページに戻る
			//						driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
			//
			//						//トップページフッターここまで
			//						//トップページについてここまで
//
//			//会社概要についてここから
//			//トップページから会社概要へとぶ
//			companyCheck.toCompany(driver, wait, saveFolder);
//
//			//会社概要からトップページ
//			topCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			topCheck.captureFromCompany(driver, wait, saveFolder);
//
//			//トップページから会社概要に戻る(トップページから会社概要へとぶ)
//			companyCheck.toCompany(driver, wait, saveFolder);
//
//			//会社概要から会社概要
//			companyCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			companyCheck.captureFromCompany(driver, wait, saveFolder);
//
//			//会社概要に戻る
//			companyCheck.backToCompany(driver, wait, saveFolder);
//
//			//会社概要から理念
//			philosophyCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			philosophyCheck.captureFromCompany(driver, wait, saveFolder);
//
//			//会社概要に戻る
//			companyCheck.backToCompany(driver, wait, saveFolder);
//
//			//会社概要からパートナーシナジー
//			partnersynergyCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			partnersynergyCheck.captureFromCompany(driver, wait, saveFolder);
//
//			//会社概要に戻る
//			companyCheck.backToCompany(driver, wait, saveFolder);
//
//			//会社概要からサービス
//
//			serviceCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			serviceCheck.captureFromCompany(driver, wait, saveFolder);
//
//			//会社概要に戻る
//			companyCheck.backToCompany(driver, wait, saveFolder);
//
			//						//会社概要から募集一覧
			//						jobcategoryCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			//						jobcategoryCheck.captureFromCompany(driver, wait, saveFolder);
			//
			//						//会社概要に戻る
			//						companyCheck.backToCompany(driver, wait, saveFolder);
			//
			//						//会社概要から福利厚生
			//						welfareCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			//						welfareCheck.captureFromCompany(driver, wait, saveFolder);
			//
			//						//会社概要に戻る
			//						companyCheck.backToCompany(driver, wait, saveFolder);
			//
			//						//会社概要から教育・研修
			//						trainingCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			//						trainingCheck.captureFromCompany(driver, wait, saveFolder);
			//
			//						//会社概要に戻る
			//						companyCheck.backToCompany(driver, wait, saveFolder);
			//
			//						//会社概要から社員の声
			//						voicesCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			//						voicesCheck.captureFromCompany(driver, wait, saveFolder);
			//
			//						//会社概要に戻る
			//						companyCheck.backToCompany(driver, wait, saveFolder);
			//
			//						//会社概要からエントリー
			//						entryCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			//						voicesCheck.captureFromCompany(driver, wait, saveFolder);
			//
			//						//会社概要に戻る
			//						companyCheck.backToCompany(driver, wait, saveFolder);
//
//			//会社概要からお問合せ
//			contactCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			contactCheck.captureFromCompany(driver, wait, saveFolder);
//
//			//会社概要に戻る
//			companyCheck.backToCompany(driver, wait, saveFolder);
//
//			//トップページに戻る
//			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
//
//			//会社概要についてここまで
//
//			//理念についてここから
//			//トップページから理念へとぶ
//			philosophyCheck.toPhilosophy(driver, wait, saveFolder);
//
//			//理念からトップページ
//			topCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			topCheck.captureFromPhilosophy(driver, wait, saveFolder);
//
//			//トップページから理念に戻る(トップページから理念へとぶ)
//			philosophyCheck.toPhilosophy(driver, wait, saveFolder);
//
//			//理念から会社概要
//			companyCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			companyCheck.captureFromPhilosophy(driver, wait, saveFolder);
//
//			//理念に戻る
//			philosophyCheck.backToPhilosophy(driver, wait, saveFolder);
//
//			//理念から理念
//			//			PhilosophyCheck philosophyCheck = new PhilosophyCheck();
//			philosophyCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			philosophyCheck.captureFromPhilosophy(driver, wait, saveFolder);
//
//			//理念に戻る
//			philosophyCheck.backToPhilosophy(driver, wait, saveFolder);
//
//			//理念からパートナーシナジー
//			partnersynergyCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			partnersynergyCheck.captureFromPhilosophy(driver, wait, saveFolder);
//
//			//理念に戻る
//			philosophyCheck.backToPhilosophy(driver, wait, saveFolder);
//
//			//理念からサービス
//			serviceCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			serviceCheck.captureFromPhilosophy(driver, wait, saveFolder);
//
//			//理念に戻る
//			philosophyCheck.backToPhilosophy(driver, wait, saveFolder);
//
			//						//理念から募集一覧
			//						jobcategoryCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			//						jobcategoryCheck.captureFromPhilosophy(driver, wait, saveFolder);
			//
			//						//理念に戻る
			//						philosophyCheck.backToPhilosophy(driver, wait, saveFolder);
			//
			//						//理念から福利厚生
			//
			//						welfareCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			//						welfareCheck.captureFromPhilosophy(driver, wait, saveFolder);
			//
			//						//理念に戻る
			//						philosophyCheck.backToPhilosophy(driver, wait, saveFolder);
			//
			//						//理念から教育・研修
			//						trainingCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			//						trainingCheck.captureFromPhilosophy(driver, wait, saveFolder);
			//
			//						//理念に戻る
			//						philosophyCheck.backToPhilosophy(driver, wait, saveFolder);
			//
			//						//理念から社員の声
			//						voicesCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			//						voicesCheck.captureFromPhilosophy(driver, wait, saveFolder);
			//
			//						//理念に戻る
			//						philosophyCheck.backToPhilosophy(driver, wait, saveFolder);
			//
			//						//理念からエントリー
			//						entryCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			//						entryCheck.captureFromPhilosophy(driver, wait, saveFolder);
			//
			//						//理念に戻る
			//						philosophyCheck.backToPhilosophy(driver, wait, saveFolder);
//
//			//理念からお問合せ
//			contactCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			contactCheck.captureFromPhilosophy(driver, wait, saveFolder);
//
//			//理念に戻る
//			philosophyCheck.backToPhilosophy(driver, wait, saveFolder);
//
//			//トップページに戻る
//			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
//
//			//理念についてここまで
//
//			//パートナーシナジーについてここから
//			//トップページからパートナーシナジーへとぶ
//			partnersynergyCheck.toPartnersynergy(driver, wait, saveFolder);
//
//			//パートナーシナジーからトップページ
//			topCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			topCheck.captureFromPartnersynergy(driver, wait, saveFolder);
//
//			//トップページから理念に戻る(トップページから理念へとぶ)
//			partnersynergyCheck.toPartnersynergy(driver, wait, saveFolder);
//
//			//パートナーシナジーから会社概要
//			companyCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			companyCheck.captureFromPartnersynergy(driver, wait, saveFolder);
//
//			//パートナーシナジーに戻る
//			partnersynergyCheck.backToPartnersynergy(driver, wait, saveFolder);
//
//			//パートナーシナジーから理念
//			philosophyCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			philosophyCheck.captureFromPartnersynergy(driver, wait, saveFolder);
//
//			//パートナーシナジーに戻る
//			partnersynergyCheck.backToPartnersynergy(driver, wait, saveFolder);
//
//			//パートナーシナジーからパートナーシナジー
//			//			PartnersynergyCheck partnersynergyCheck = new PartnersynergyCheck();
//			partnersynergyCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			partnersynergyCheck.captureFromPartnersynergy(driver, wait, saveFolder);
//
//			//パートナーシナジーに戻る
//			partnersynergyCheck.backToPartnersynergy(driver, wait, saveFolder);
//
//			//パートナーシナジーからサービス
//			serviceCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			serviceCheck.captureFromPartnersynergy(driver, wait, saveFolder);
//
//			//パートナーシナジーに戻る
//			partnersynergyCheck.backToPartnersynergy(driver, wait, saveFolder);
//
			//			//パートナーシナジーから募集一覧
			//
			//			jobcategoryCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			//			jobcategoryCheck.captureFromPartnersynergy(driver, wait, saveFolder);
			//
			//			//パートナーシナジーに戻る
			//			partnersynergyCheck.backToPartnersynergy(driver, wait, saveFolder);
			//
			//			//パートナーシナジーから福利厚生
			//			welfareCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			//			welfareCheck.captureFromPartnersynergy(driver, wait, saveFolder);
			//
			//			//パートナーシナジーに戻る
			//			partnersynergyCheck.backToPartnersynergy(driver, wait, saveFolder);
			//
			//			//パートナーシナジーから教育・研修
			//			trainingCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			//			trainingCheck.captureFromPartnersynergy(driver, wait, saveFolder);
			//
			//			//パートナーシナジーに戻る
			//			partnersynergyCheck.backToPartnersynergy(driver, wait, saveFolder);
			//
			//			//パートナーシナジーから社員の声
			//			voicesCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			//			voicesCheck.captureFromPartnersynergy(driver, wait, saveFolder);
			//
			//			//パートナーシナジーに戻る
			//			partnersynergyCheck.backToPartnersynergy(driver, wait, saveFolder);
			//
			//			//パートナーシナジーからエントリー
			//			entryCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			//			entryCheck.captureFromPartnersynergy(driver, wait, saveFolder);
			//
			//			//パートナーシナジーに戻る
			//			partnersynergyCheck.backToPartnersynergy(driver, wait, saveFolder);

//			//パートナーシナジーからお問合せ
//			contactCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			contactCheck.captureFromPartnersynergy(driver, wait, saveFolder);
//
//			//パートナーシナジーに戻る
//			partnersynergyCheck.backToPartnersynergy(driver, wait, saveFolder);
//
//			//トップページに戻る
//			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
//			//パートナーシナジーについてここまで
//
//			//サービスについてここから
//			//トップページからサービスへとぶ
//			serviceCheck.toService(driver, wait, saveFolder);
//
//			//サービスからトップページ
//			topCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			topCheck.captureFromService(driver, wait, saveFolder);
//
//			//トップページからサービスに戻る(トップページから理念へとぶ)
//			serviceCheck.toService(driver, wait, saveFolder);
//
//			//サービスから会社概要
//			companyCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			companyCheck.captureFromService(driver, wait, saveFolder);
//
//			//サービスに戻る
//			serviceCheck.backToService(driver, wait, saveFolder);
//
//			//サービスから理念
//			philosophyCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			philosophyCheck.captureFromService(driver, wait, saveFolder);
//
//			//サービスに戻る
//			serviceCheck.backToService(driver, wait, saveFolder);
//
//			//サービスからパートナーシナジー
//			partnersynergyCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			partnersynergyCheck.captureFromService(driver, wait, saveFolder);
//
//			//サービスに戻る
//			serviceCheck.backToService(driver, wait, saveFolder);
//
//			//サービスからサービス
//			serviceCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			serviceCheck.captureFromService(driver, wait, saveFolder);

//			//サービスに戻る（これいらない）
//			serviceCheck.backToService(driver, wait, saveFolder);

			//			//サービスから募集一覧
			//			jobcategoryCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			//			jobcategoryCheck.captureFromService(driver, wait, saveFolder);
			//
			//			//サービスに戻る
			//			serviceCeck.backToService(driver, wait, saveFolder);
			//
			//			//サービスから福利厚生
			//			welfareCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			//			welfareCheck.captureFromService(driver, wait, saveFolder);
			//
			//			//サービスに戻る
			//			serviceCeck.backToService(driver, wait, saveFolder);
			//
			//			//サービスから教育・研修
			//			trainingCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			//			trainingCheck.captureFromService(driver, wait, saveFolder);
			//
			//			//サービスに戻る
			//			serviceCeck.backToService(driver, wait, saveFolder);
			//
			//			//サービスから社員の声
			//			voicesCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			//			voicesCheck.captureFromService(driver, wait, saveFolder);
			//
			//			//サービスに戻る
			//			serviceCeck.backToService(driver, wait, saveFolder);
			//
			//
			//			//サービスからエントリー
			//			entryCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			//			entryCheck.captureFromService(driver, wait, saveFolder);
			//
			//			//サービスに戻る
			//			serviceCeck.backToService(driver, wait, saveFolder);
//
//			//サービスからお問合せ
//			contactCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			contactCheck.captureFromServuce(driver, wait, saveFolder);
//
//			//サービスに戻る
//			serviceCheck.backToService(driver, wait, saveFolder);
//
//			//トップページに戻る
//			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
//			//サービスについてここまで


			//募集一覧についてここから
			//トップページから募集一覧へとぶ
			jobcategoryCheck.toJobcategory(driver, wait, saveFolder);

			//募集一覧からトップページ
			topCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			topCheck.captureFromJobcategory(driver, wait, saveFolder);

			//トップページから募集一覧に戻る(トップページから理念へとぶ)
			jobcategoryCheck.toJobcategory(driver, wait, saveFolder);

			//募集一覧から会社概要
			companyCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			companyCheck.captureFromJobcategory(driver, wait, saveFolder);

			//募集一覧に戻る
			jobcategoryCheck.backToJobcategory(driver, wait, saveFolder);

			//募集一覧から理念
			philosophyCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			philosophyCheck.captureFromJobcategory(driver, wait, saveFolder);

			//募集一覧に戻る
			jobcategoryCheck.backToJobcategory(driver, wait, saveFolder);

			//募集一覧からパートナーシナジー
			partnersynergyCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			partnersynergyCheck.captureFromJobcategory(driver, wait, saveFolder);

			//募集一覧に戻る
			jobcategoryCheck.backToJobcategory(driver, wait, saveFolder);

			//募集一覧からサービス
			serviceCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
			serviceCheck.captureFromJobcategory(driver, wait, saveFolder);

			//募集一覧に戻る
			jobcategoryCheck.backToJobcategory(driver, wait, saveFolder);

//			//サービスから募集一覧
//			jobcategoryCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			jobcategoryCheck.captureFromService(driver, wait, saveFolder);
//
//			//募集一覧に戻る
//			jobcategoryCheck.backToJobcategory(driver, wait, saveFolder);
//
//			//募集一覧から福利厚生
//			welfareCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			welfareCheck.captureFromService(driver, wait, saveFolder);
//
//			//募集一覧に戻る
//			jobcategoryCheck.backToJobcategory(driver, wait, saveFolder);
//
//			//募集一覧から教育・研修
//			trainingCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			trainingCheck.captureFromService(driver, wait, saveFolder);
//
//			//募集一覧に戻る
//			jobcategoryCheck.backToJobcategory(driver, wait, saveFolder);
//
//			//募集一覧から社員の声
//			voicesCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			voicesCheck.captureFromService(driver, wait, saveFolder);
//
//			//募集一覧に戻る
//			jobcategoryCheck.backToJobcategory(driver, wait, saveFolder);
//
//
//			//募集一覧からエントリー
//			entryCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			entryCheck.captureFromService(driver, wait, saveFolder);
//
//			//募集一覧に戻る
//			jobcategoryCheck.backToJobcategory(driver, wait, saveFolder);
//
//			//募集一覧からお問合せ
//			contactCheck.clickAndCaptureFromOther(driver, wait, saveFolder);
//			contactCheck.captureFromServuce(driver, wait, saveFolder);
//
//			//募集一覧に戻る
//			jobcategoryCheck.backToJobcategory(driver, wait, saveFolder);
//
//			//トップページに戻る
//			driver.findElement(By.cssSelector("#menu-item-18 > a > span")).click();
//			//募集一覧についてここまで









































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

}
