package HotelBooking;

	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;

//	import org.apache.commons.io.FileUtils;
	import org.jspecify.annotations.Nullable;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class BaseClassss {
		
		public static WebDriver driver;
		Select select;
		JavascriptExecutor executor;
		Actions actions; 
		TakesScreenshot screenshot;
		
		public void navigateRefresh() {
			driver.navigate().refresh();

		}
		public void jsclick(WebElement element) {
			executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", element);

		}

		public void acceptAlert() {
			driver.switchTo().alert().accept();
		}

		public void switchToChildWindow() {
			String windowHandle = driver.getWindowHandle();
			Set<String> windowHandles = driver.getWindowHandles();

			for (String eachWindowId : windowHandles) {
				if (!windowHandle.equals(eachWindowId)) {
					driver.switchTo().window(eachWindowId);
					break;
				}
			}

		}

		public void clearTexbox(WebElement element) {
			element.clear();
		}

		public void visibilityOfElement(WebElement element) {
			WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
			driverWait.until(ExpectedConditions.visibilityOf(element));
		}
		
		

		public static void implicitWait(int secs) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secs));
		}

		public static void implicitWait() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}

//		public void screenshot(File destFile, WebElement element) throws IOException {
//			File sourceFile = element.getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(sourceFile, destFile);
//		}
//
//		public void screenshot(File destFile) throws IOException {
//			screenshot = (TakesScreenshot) driver;
//			File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(sourceFile, destFile);
//		}

		public void dragAndDrop(WebElement source, WebElement target) {
			actions = new Actions(driver);
			actions.dragAndDrop(source, target).perform();
		}

		public void sendKeysElementJs(WebElement element, String data) {
			executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
		}

		public List<String> getAllOptionsText(WebElement element) {
			List<String> allOptionsText = new ArrayList<String>();
			select = new Select(element);
			List<WebElement> options = select.getOptions();
			for (WebElement webElement : options) {
				String text = webElement.getText();
				allOptionsText.add(text);

			}
			return allOptionsText;
		} 

		public void selectOptionByIndex(WebElement element, int index) {
			select = new Select(element);
			select.selectByIndex(index);
		}

		public void selectOptionByValue(WebElement element, String value) {
			select = new Select(element);
			select.selectByValue(value);
		}

		public void selectOptionByText(WebElement element, String text) {
			select = new Select(element);
			select.selectByVisibleText(text);
		}
		public List<WebElement> findElementsByXpath(String xpath) {
	        return driver.findElements(By.xpath(xpath));
	    }
		
		public void selectAllOptions(WebElement element) {
			List<WebElement> options = select.getOptions();
			for (int i = 0; i < options.size(); i++) {
				select.selectByIndex(i);
				
			}

		}
		
		public void frameSwitch() {
			driver.switchTo().frame(0);

		}

		public  static void browserLaunch() {
			driver = new ChromeDriver();
		}

		public static void  enterApplicationUrl(String url) {
			driver.get(url);
		}

		public static void maximizeWindow() {
			driver.manage().window().maximize();
		}

		public void sendKeysElement(WebElement element, String data) {
			if (isEnabledElement(element) && isDisplayedElement(element)) {
				clearTexbox(element);
				element.sendKeys(data);}
			}
		public void sendKeysElementKeys(WebElement element, String data) {
			if (isEnabledElement(element) && isDisplayedElement(element)) {
				clearTexbox(element);
				element.sendKeys(data,Keys.ENTER);}
			}
			

		
		public void clickElement(WebElement element) {
			if (isEnabledElement(element) && isDisplayedElement(element)) {
				element.click();
			}
		}

		public String getApplicationTitle() {
			@Nullable
			String title = driver.getTitle();
			return title;
		}

		public WebElement findLocatorById(String attributeValue) {
			WebElement element = driver.findElement(By.id(attributeValue));
			return element;
		}

		public WebElement findLocatorByName(String attributeValue) {
			WebElement element = driver.findElement(By.name(attributeValue));
			return element;
		}

		public WebElement findLocatorByClassName(String attributeValue) {
			WebElement element = driver.findElement(By.className(attributeValue));
			return element;
		}

		public WebElement findLocatorByXpath(String exp) {
			WebElement element = driver.findElement(By.xpath(exp));
			return element;
		}
		
		public void clickElement(String exp) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(exp)));
	        element.click();
	    }

		public String getApplicationUrl() {
			@Nullable
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
		}

		public String getTextElement(WebElement element) {
			String text = element.getText();
			return text;
		}

		public String getDomPropertyValue(WebElement element) {
			@Nullable
			String domProperty = element.getDomProperty("value");
			return domProperty;
		}

		public String getDomPropertyValue(WebElement element, String attributeName) {
			@Nullable
			String domProperty = element.getDomProperty("value");
			return domProperty;
		}

		public void closeWindow() {
			driver.close();
		}

		public static void closeAllWindow() {
			driver.quit();
		}

		public boolean isDisplayedElement(WebElement element) {
			boolean displayed = element.isDisplayed();
			return displayed;
		}

		public boolean isEnabledElement(WebElement element) {
			boolean enabled = element.isEnabled();
			return enabled;
		}

		public boolean isSelectedElement(WebElement element) {
			boolean selected = element.isSelected();
			return selected;
		}
		public boolean isMultiple() {
			boolean multiple = select.isMultiple();
			return multiple;

		}
		public void thread(int seconds) throws InterruptedException {
			Thread.sleep(seconds);
			

		}
		
//		public void takeScreenAfter() throws IOException {
//			screenshot = (TakesScreenshot)driver;
//			File f = screenshot.getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(f, new File("C:\\Users\\Shyamala\\eclipse-workspace\\Theva\\FrameWork\\Screenshots\\after_" + System.currentTimeMillis() + ".png"));
//
//		}
//		
//		public void takeScreenBefore() throws IOException {
//			screenshot = (TakesScreenshot)driver;
//			File f = screenshot.getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(f, new File("C:\\Users\\Shyamala\\eclipse-workspace\\Theva\\FrameWork\\Screenshots\\before_" + System.currentTimeMillis() + ".png"));
//
//		}

	}
