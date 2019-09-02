package seleniumHokushinHP;

import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class seleniumHokushinHPMicrosoft {

	public static LocalDateTime nowLocalDt = LocalDateTime.now();;

	public static void main(String[] args) {

		WebDriver driver;

	    // IEDriverServerの起動
	    System.setProperty("webdriver.ie.driver", "./exe/MicrosoftWebDriver.exe");
	    driver = new InternetExplorerDriver();

	    // Googleに遷移する。
	    driver.get("http://www.google.co.jp");

	    // タイトルをコンソールに出してみる。
	    System.out.println(driver.getTitle());

	    // 画面を終了
	    //driver.quit();

	}
}