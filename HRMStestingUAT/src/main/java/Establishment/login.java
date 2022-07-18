
package Establishment;

import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public void intialize() throws InterruptedException {
		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();

		// System.setProperty("webdriver.chrome.driver",
		// "src/test/resources/Driver/chromedriver_linux64/chromedriver");
		
		
		
		 //Setting up capabilities to run our test script
		
		/* @Parameters(value= {"browser","version"})
		
		@BeforeClass public void setUp(String browser, String version) throws
		 Exception { DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability("browserName", browser);
		 capabilities.setCapability("version", version);
		 capabilities.setCapability("platform", "win10"); // If this cap isn't
		 specified, it will just get any available one
		 capabilities.setCapability("build", "LambdaTestSampleApp");
		 capabilities.setCapability("name", "LambdaTestJavaSample");
		 capabilities.setCapability("network", true); // To enable network logs
		 capabilities.setCapability("visual", true); // To enable step by step
		 screenshot capabilities.setCapability("video", true); // To enable video
		 recording capabilities.setCapability("console", true); // To capture console
		 logs try { driver = new RemoteWebDriver(new URL("https://" + username + ":" +
		 accesskey + gridURL), capabilities); } catch (MalformedURLException e) {
		 System.out.println("Invalid grid URL"); } catch (Exception e) {
		 System.out.println(e.getMessage()); }
		
		}*/
		
		 
	//	System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
	//	ChromeOptions options = new ChromeOptions();
	//	options.addArguments("start-maximized"); // open Browser in maximized mode
	//	 options.addArguments("disable-infobars"); // disabling infobars
	//	options.addArguments("--disable-extensions"); // disabling extensions
	//	options.addArguments("--disable-gpu"); // applicable to windows os only
	//	 options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
	//	options.addArguments("--no-sandbox"); // Bypass OS security model
	//	driver = new ChromeDriver(options);
		 
		
			
			 
		
			String downloadFilepath = System.getProperty("/usr/local/bin/chromedriver");
			HashMap<String, Object> chromePrefs = new HashMap<>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("download.default_directory", downloadFilepath);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", chromePrefs);
			options.addArguments("--no-sandbox");
			options.addArguments("--headless"); //should be enabled for Jenkins
			options.addArguments("--disable-dev-shm-usage"); //should be enabled for Jenkins
			options.addArguments("--window-size=1920x1080"); //should be enabled for Jenkins
			driver = new ChromeDriver(options);
			 

	       
		 
		 
		 
		//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.setHeadless(true);

		//System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		//driver = new ChromeDriver(chromeOptions);
		
		
		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		driver.get("https://uat.erp2.upda.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("7778889999");
		driver.findElement(By.id("password")).sendKeys("User@1");
		driver.findElement(By.cssSelector("div[class='col-5 ng-star-inserted'] button[type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.elementToBeClickable(By.name("b_acct_id"))).click();

		WebElement element = driver.findElement(By.xpath("//span[normalize-space()='92 - Automated Testing Account']"));
		actions.moveToElement(element).click().build().perform();
		driver.findElement(
				By.xpath("//div[@id='multi_account']//button[@class='btn btn-primary'][normalize-space()='Submit']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		// driver.findElement(By.xpath("/html/body/div[2]/div[1]/app-portal-dash/div/div[2]/div[5]/button/img")).click();
		// Thread.sleep(2000);
		System.out.println("come here 1");

	}
}
