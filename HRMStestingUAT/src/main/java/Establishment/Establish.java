
package Establishment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Establish extends login {
	@BeforeMethod
	public void setup() throws InterruptedException {
		intialize();
	}

	/*
	 * @AfterMethod public void tear down() {driver.quit();}
	 */
	
	@Test(enabled = false)
	//(priority=1)
	public void Update_Establishment() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/app-portal-dash/div/div[2]/div[5]/button/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Establishment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Establish']")).click();
		Thread.sleep(2000);
		Actions Actions1 = new Actions(driver);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[2]"))).click();
		WebElement element1 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"));
		Actions1.moveToElement(element1).click().build().perform();
		driver.findElement(By.xpath("//button[normalize-space()='Add/Update Establishment']")).click();
		Thread.sleep(2000);
		///////////////////// xpath problem
		/*
		 * Actions Actions1=new Actions(driver); WebDriverWait wait1=new
		 * WebDriverWait(driver, Duration.ofSeconds(30));
		 * wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[1]/div[6]/div[2]/ng-select[1]/div[1]/span[1]"
		 * ))).click(); WebElement element1 = driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[1]/div[6]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]"
		 * )); Actions1.moveToElement(element1).click().build().perform();
		 */
		driver.findElement(By.xpath("//div[@id='cdk-step-content-1-0']//button[@type='submit'][normalize-space()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='cdk-step-content-1-1']//button[@type='submit'][normalize-space()='Next'] ")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		Thread.sleep(2000);
	}

	@Test(enabled = false)
	//(priority=2)
	void ADD_Establishment() throws InterruptedException {
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Establishment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Establish']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add/Update Establishment']")).click();
		Thread.sleep(2000);
		/*
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[1]"
		 * )).click();Thread.sleep(2000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[1]/div[2]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"
		 * )).click();Thread.sleep(2000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[1]/div[3]/div[2]/input[1]"
		 * )).sendKeys("03-04-2022");Thread.sleep(2000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[1]/div[4]/div[2]/input[1]"
		 * )).sendKeys("01-05-2022");Thread.sleep(2000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[1]/div[5]/div[2]/ng-select[1]/div[1]/span[1]"
		 * )).click();Thread.sleep(2000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[1]/div[5]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]"
		 * )).click();Thread.sleep(2000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[1]/div[6]/div[2]/input[1]"
		 * )).sendKeys("12");Thread.sleep(2000); driver.findElement(By.xpath(
		 * "(//button[@type='submit'][normalize-space()='Next'])[1]")).click();Thread.
		 * sleep(2000);
		 */
		// ESTABLISHMENT DETAIL//
		// Class//
		Actions Actions1 = new Actions(driver);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//ng-select[@class='ng-select ng-select-single ng-select-searchable ng-select-clearable ng-valid ng-select-bottom ng-dirty ng-touched ng-select-focused ng-select-opened']//span[@class='ng-arrow-wrapper']"))).click();
		WebElement element1 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[1]/div[2]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]"));
		Actions1.moveToElement(element1).click().build().perform();

		// Cadre//
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[1]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		// Designation//
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[4]/div[2]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[4]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		// Designation Group//
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[5]/div[2]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[5]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		// Retirement Age//
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[1]/div[6]/div[2]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[1]/div[6]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		// Increment Month
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[7]/div[2]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[7]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(2000);
		// Notice Period in Days
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("10");
		Thread.sleep(2000);
		// Employment Type
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[10]/div[2]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[10]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		// Pay Commission
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[11]/div[2]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[11]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[7]")).click();
		Thread.sleep(2000);
		// Pay Band
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[12]/div[2]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[12]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		// Grade Pay
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[13]/div[2]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[13]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		// Level
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[14]/div[2]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[14]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		// Basic Pay
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/ div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[15]/div[2]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[1]/div[15]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		// Conveyance Type
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[16]/div[2]/ng-select[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[16]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		// Uniform Given :
		@SuppressWarnings("unused")
		String labelText = driver.findElement(By.xpath("//div[@for='text']")).getText();
		System.out.println("Label Missing");
	}
	// Uniform Given :

	// driver.findElement(By.xpath("")).click();Thread.sleep(2000);
	// Work City:
	/*
	 * driver.findElement(By.xpath("")).click();Thread.sleep(2000);
	 * driver.findElement(By.xpath("")).click();Thread.sleep(2000);*/
	

	 @Test(enabled = false)
	 //(priority=3)
	 public	void variable_pay() throws InterruptedException {
		 driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[normalize-space()='Establishment']")).click();
		 ////////////////////////Variable Pay
		 driver.findElement(By.xpath("//a[@routerlink='/hrms/payroll/fixed-pay']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[6]/ul[1]/li[2]/a[1]")).click();
		 Thread.sleep(2000);
		 ///////////////////////Select Employee//////////////////////////////////////////////////
		 Actions Actions1 =new Actions(driver);
		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-payroll[1]/app-fixed-pay[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"))).click();
		 WebElement element1 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-payroll[1]/app-fixed-pay[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]"));
		 Actions1.moveToElement(element1).click().build().perform();
		 driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		 Thread.sleep(2000);
		 //////////////////////////////ADD Variable Pay////////////////////////////////////////
		 Actions Actions11 =new Actions(driver);
		 WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ng-select-container']//input[@role='combobox']"))).click();
		 WebElement element11 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-payroll[1]/app-fixed-pay[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]"));
		 Actions11.moveToElement(element11).click().build().perform();
		 driver.findElement(By.xpath("(//input[@type='date'])[1]")).sendKeys("07-09-1997");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//button[normalize-space()='SUBMIT'])[1]")).click();
		 Thread.sleep(2000);}

	 /////// String actualString
	 /////// =driver.findElement(By.xpath("//input[@type='date']")).getText();
	 /////// String expectedString="Null";
	 /////// Assert.assertEquals(actualString, expectedString);
	 ////// System.out.println("Test Case failed__Box is null");
	 
	//(priority=4)
	 @Test(enabled = false)
	 public void update() throws InterruptedException {
		 driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[normalize-space()='Establishment']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[normalize-space()='Establish']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@routerlink='/hrms/payroll/fixed-pay']")).click();
		 Thread.sleep(2000);
		 Actions Actions1 = new Actions(driver);
		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(""))).click();
		 WebElement element1 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-establishment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[19]"));
		 Actions1.moveToElement(element1).click().build().perform();
		 driver.findElement(By.xpath("(//button[contains(text(),'Update')])[1]")).click();
		 Thread.sleep(2000);
	 }

	//(priority=5)
	 @Test(enabled = false)
	 public void posting() throws InterruptedException {
		 driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[normalize-space()='Establishment']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@routerlink='/hrms/arr/posting']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-posting[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/button[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		 Thread.sleep(2000);
	 }

	//(priority=6)
	 @Test(enabled =true)
	 public void promotion() throws InterruptedException {
		 driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[normalize-space()='Establishment']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class='active']")).click();
	 }

	 /*
	  * @Test public void Termination() throws InterruptedException {
	  * driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).
	  * click(); Thread.sleep(2000);
	  * driver.findElement(By.xpath("//span[normalize-space()='Establishment']")).
	  * click(); Thread.sleep(2000);
	  * driver.findElement(By.xpath("//a[@routerlink='/hrms/arr/termination']")).
	  * click(); Thread.sleep(2000);
	  * driver.findElement(By.xpath("//i[@class='ti-settings']")).click();
	  * Thread.sleep(2000); driver.findElement(By.xpath(
	  * "/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-termination[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/div[1]/span[1]"
	  * )).click(); Thread.sleep(2000); driver.findElement(By.xpath(
	  * "/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-termination[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[6]/span[1]"
	  * )).click(); Thread.sleep(2000); driver.findElement(By.xpath(
	  * "/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-termination[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/input[1]"
	  * )).sendKeys("23-09-2022"); Thread.sleep(2000); driver.findElement(By.
	  * xpath("//input[@class='form-control ng-untouched ng-pristine ng-valid']")).
	  * sendKeys("23"); Thread.sleep(2000);
	  * driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	  * Thread.sleep(2000);} ////////////////NOT
	  * WORKING//////////////////////////////////////////////////////////////////////
	  * /////////////////////////////////////////////////////////////////////////////
	  * ////////////////////////////////////////////////////////}
	  */
	 
	//(priority=7)
	 @Test(enabled = false)
	 public void Retirement() throws InterruptedException {
		 driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[normalize-space()='Establishment']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@routerlink='/hrms/arr/death']")).click();
		 Thread.sleep(2000);
	 }

	//(priority=8)
	 @Test(enabled = false)
	 void death() throws InterruptedException {
		 driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[normalize-space()='Establishment']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[6]/ul[1]/li[11]/a[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class='nav-link active']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//i[@class='ti-settings']")).click();
		 Thread.sleep(2000);
		 Actions Actions1 = new Actions(driver);
		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-death[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/div[1]/span[1]"))).click();
		 WebElement element1 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-death[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]"));
		 Actions1.moveToElement(element1).click().build().perform();
		 driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-valid ng-star-inserted']")).sendKeys("12");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@type='date']")).sendKeys("12-09-2021");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-death[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-death[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-death[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/button[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[normalize-space()='Yes, Submit it!']")).click();
		 Thread.sleep(2000);
	 }

	//(priority=9)
	 @Test(enabled = false)
	 public void Reappointment() throws InterruptedException {
		 driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[normalize-space()='Establishment']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[normalize-space()='Reappointment']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath( "/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-reappointment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-reappointment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		 Thread.sleep(2000);
		 /////////////////// NOT WORKING///////////////
	 }

	//(priority=10)
	 @Test(enabled = false)
	 public void Resign() throws InterruptedException {
		 driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[normalize-space()='Establishment']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[normalize-space()='Resign']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[normalize-space()='Apply For Employee Resignation']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='ng-select-container']//span[@class='ng-arrow-wrapper']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-emp-resign[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-emp-resign[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/input[1]")).sendKeys("Unknown");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//textarea[@id='res']")).sendKeys("Personal");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='tab-2']//button[@class='btn btn-primary'][normalize-space()='Submit']"))
		 .click();
	 }

	//(priority=11)
	 @Test(enabled = false)
	 public void Update_Emp_Resign() throws InterruptedException {
		 driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[normalize-space()='Establishment']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[normalize-space()='Resign']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class='nav-link active']")).click();
		 Thread.sleep(2000);
		 // driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-emp-resign[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]")).sendKeys("001");Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@class='btn btn-outline-primary']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-emp-resign[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[2]/input[1]")).sendKeys("25-06-2022");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-emp-resign[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[4]/div[2]/input[1]")).clear();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-emp-resign[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[4]/div[2]/input[1]")).sendKeys("30");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='tab-3']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
		 Thread.sleep(2000);
	 }

	//(priority=12)
	 @Test(enabled =false)
	 public void Transfer() throws InterruptedException {
		 driver.findElement(By.xpath("/html/body/div[2]/div[1]/app-portal-dash/div/div[2]/div[5]/button/img")).click();
		 Thread.sleep(2000);
		 /*
		  * Actions Actions1 =new Actions(driver); WebDriverWait wait1 = new
		  * WebDriverWait(driver, Duration.ofSeconds(30));
		  * wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
		  * "/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[6]/a[1]/span[1]")));
		  * WebElement element1 = driver.findElement(By.xpath(
		  * "//body/div[2]/nav[1]/div[1]/ul[1]/li[6]/ul[1]/li[1]/a[1]"));
		  * Actions1.moveToElement(element1).click().build().perform();
		  */
		 driver.findElement(By.xpath("//*[@id=\"sidebar-collapse\"]/ul/li[6]/a/span")).click();
		 driver.findElement(By.xpath("//a[normalize-space()='Transfer']")).click();
		 Thread.sleep(2000);

		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-emp-transfer[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-emp-transfer[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/div[1]/span[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-emp-transfer[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		 driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-valid ng-star-inserted']")).sendKeys("12");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
		 Thread.sleep(2000);

		 String actualErrorMessage = driver.findElement(By.xpath("//div[contains(text(),':')]")).getText();
		 String expectedErrorMessage = "A Specified Date";
		 Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "");
		 // Assert.AreEqual(5.2, result.RealPart, "Real part");

	 }

}
