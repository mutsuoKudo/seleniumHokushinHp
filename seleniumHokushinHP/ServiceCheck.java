package seleniumHokushinHP;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ServiceCheck {

	protected void clickAndCaptureFromHome(WebDriver driver, WebDriverWait wait, String saveFolder) throws IOException, InterruptedException {
		//サービス
		//クリック対象要素が表示されるまで待つ
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(
						"body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(3) > a > span")));

		//クリック準備
		//driver.findElement(By.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(3) > a > span")).sendKeys(Keys.CONTROL);

		//クリック
		driver.findElement(
				By.cssSelector("body > div.hs-base-container > div.hs-nav > nav > div > div:nth-child(3) > a > span"))
				.click();

		//クリック対象要素が表示されるまで待つ
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(
						By.cssSelector("body > div.page-contenet.content-out-box.w-max > div > h1 > span")));


		CaptureUtil captureUtil = new CaptureUtil();

		captureUtil.cupturePage(driver,  saveFolder,"サービス");

		Actions act = new Actions(driver);

//		act.sendKeys(Keys.PAGE_DOWN);

		act.moveToElement(driver.findElement(
				By.cssSelector("#privacymark-logo")));
		act.perform();

		//しばらく待って
        Thread.sleep(1000);

		captureUtil.cupturePage(driver,  saveFolder,"サービススクロール後");

//		//キャプチャ
//		File sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//		//コピー先の指定→ファイル名に時刻付加
//		LocalDateTime nowLocalDt = LocalDateTime.now();
//		String localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
//		String destFileName = saveFolder + localTimeStr1 + "会社概要画面.png";
//		System.out.println("ファイル名" + destFileName);
//
//		//キャプチャ一時画像を消える前にコピー
//		Path sourcePath = Paths.get(sfile.getAbsolutePath());
//		Path targetPath = Paths.get(destFileName);
//		Files.move(sourcePath, targetPath);
	}

}
