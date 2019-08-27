package seleniumHokushinHP;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureUtil {

	protected void cupturePage(WebDriver driver, String saveFolder,String gamenName) throws IOException {
		//キャプチャ
		File sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		//コピー先の指定→ファイル名に時刻、画面名付加
		LocalDateTime nowLocalDt = LocalDateTime.now();
		String localTimeStr1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(nowLocalDt);
		String destFileName = saveFolder + localTimeStr1 + gamenName + "画面.png";
		System.out.println("ファイル名:" + destFileName);

		//キャプチャ一時画像を消える前にコピー
		Path sourcePath = Paths.get(sfile.getAbsolutePath());
		Path targetPath = Paths.get(destFileName);
		Files.move(sourcePath, targetPath);
	}

}
