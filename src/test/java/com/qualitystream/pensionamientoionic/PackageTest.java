package com.qualitystream.pensionamientoionic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PackageTest {
	private WebDriver driver;
	
	@Before

	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8100");}
@Test
public void login()  {
	WebElement email = driver.findElement(By.xpath("//input [@name='ion-input-0']"));
	email.sendKeys("adminofi@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input [@name='ion-input-1']"));
	password.sendKeys("admin-123");
	WebElement boton=driver.findElement(By.name("sub"));
	boton.click();
	System.out.println("no da");
	//assertEquals(driver.getTitle(), "Ionic App");
	//<div _ngcontent-ajq-c3 id="mis_paquetes">
	if(driver.findElement(By.xpath("//form[@class='form ng-touched ng-dirty ng-valid']")).isDisplayed()){
		System.out.println("funciona");
	}
	else{System.out.println("NO funciona");}
}
/*
@Test
public void registro()throws InterruptedException{
	if(driver.findElement(By.id("mis_paquetes")).isDisplayed()){
		System.out.println("si da");
		WebElement boton=driver.findElement(By.xpath("//a[@routerlink='/dashboard/add']"));
		boton.click();	
	}
}
	*/
	@After
	public void tearDown() throws Exception {
		//driver.quit();
		}


}
