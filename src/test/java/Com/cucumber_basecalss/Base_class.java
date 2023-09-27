package Com.cucumber_basecalss;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_class {


	private static final WebElement Integer = null;
	public static WebDriver driver;
	public static Actions A;
//	 public static Robot R ;
	public static Select S;
	public static JavascriptExecutor js;

	public static WebDriver launchbrowser() { /// >>>>> method creation

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Karthikeyan M\\eclipse-workspace\\Facebook\\project_driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;

	}

	public static void get_url(String string) {
		driver.get(string);

	}

	public static void send_keys(WebElement key, String value) {
		Actions A = new Actions(driver);
		A.sendKeys(key, value).build().perform();

	}

	public static void navicate() {
		driver.navigate().to("");
	}

	public static void navicate_back() {
		driver.navigate().back();
	}

	public static void navicate_forword() {
		driver.navigate().forward();
	}

	public static void selct_deselect(WebElement Raj) {
		S.deselectAll();

	}

// select>>> dropdown
	public static void select(WebElement webElement, String value) {
		Select S = new Select(webElement);
		S.selectByValue(value);

	}

	public static void navicate_refresh() {
		driver.navigate().refresh();
	}

	public void select_visbeltesxt() {
		S.deselectByVisibleText(null);
	}

	public static void alert_accept() {
		driver.switchTo().alert().accept();
	}

	public static void alert_dismis() {
		driver.switchTo().alert().dismiss();
	}

	public static void alert_send_keys() {
		driver.switchTo().alert().sendKeys("");
	}

	// single click
	public static void Action_clcik(WebElement webElement) {
		Actions A = new Actions(driver);
		A.click(webElement).build().perform();

	}

	public static void Action_method() throws AWTException {

	}

	public static void Action_contextlick() {
		A.contextClick().build().perform();
	}

	public static void Action_doubleclick() {
		A.doubleClick().build().perform();
	}

	public static void Action_moveto_element() {
		A.moveToElement(null, 0, 0).build().perform();
	}

	public static void drop() {
		A.dragAndDrop(null, null).build().perform();
	}

// frame
	public static void Frame() {
		driver.switchTo().frame(0);

	}

	public static void Frame_defalutcontent() {
		driver.switchTo().defaultContent();
	}

// robout 
	public static void Robout_keypress() throws AWTException {
//		R.keyPress(KeyEvent.VK_ENTER);
	}

	public static void Robout_keyrelese() {
//		R.keyRelease(KeyEvent.VK_ENTER);

	}

// window handle 
	public static void Window_handle() {
		driver.getWindowHandles();

	}

//  implicit wait 
	public static void implict_wait(int a, TimeUnit value) {
		driver.manage().timeouts().implicitlyWait(a, value);

	}

	// explicit wait
	public static void explicit_wait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 0);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void thread_sleep() {
		thread_sleep();
	}

	public static void get_title() {
		driver.getTitle();
	}

	public static void get_currentt_url() {
		driver.getCurrentUrl();

	}

// scroll
	public static void scroll_up(WebElement name) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", name);
	}

	public static void scroll_down() {
		Object window;
		js.executeScript("window.scrollby(0,-2000)", "");
	}

	public static void takescreen_shorts(String name) throws IOException {
		TakesScreenshot T = (TakesScreenshot) driver;
		File QA = T.getScreenshotAs(OutputType.FILE);
		File QC = new File("C:\\Users\\Karthikeyan M\\eclipse-workspace\\Facebook\\Screen_Shorts\\" + name + ".png");
		FileUtils.copyFile(QC, QC);

	}

 


}
