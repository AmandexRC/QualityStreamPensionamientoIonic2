package com.qualitystream.pensionamientoionic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Pensionamiento_AutomatedTest {

	private WebDriver driver;
	By registerLinkLocator = By.xpath("//a[@routerlink='/pre-register']");
	
	//PRE-REGISTRO
	By pr_email=By.name("ion-input-2");	
/*	By sgteBtn=By.xpath("//ion-button [@class='submit-btn md button button-solid button-disabled ion-activatable ion-focusable hydrated']");	
	By BtnRestaurante=By.xpath("//ion-radio [@ng-reflect-name='register-restaurant' ]");
	By BtnCliente=By.xpath("//ion-radio [@ng-reflect-name='register-client' ]");

	By LoginTitle=By.xpath("//ion-title [@class='md title-md title-default hydrated']");
	By HomeTitle=By.xpath("//ion-toolbar [@class='in-toolbar md toolbar-title-default hydrated toolbar-searchbar']");
	By DashboardTitle=By.xpath("//ion-content [@class='md hydrated' ]");
	*/
	//RESTAURANTE
	/*By nombre_rest=By.xpath("//ion-input[@formcontrolname='name']");
	By desc_rest=By.xpath("//ion-input[@formcontrolname='description']");
	By dir_rest=By.xpath("//ion-input[@formcontrolname='address']");
	By rubro_rest=By.xpath("//ion-input[@formcontrolname='business']");
	By Registro_rest=By.xpath("//ion-button [@class='submit-btn md button button-solid button-disabled ion-activatable ion-focusable hydrated']");
	By login_rest=By.xpath("//a [@routerlink='/login']");
	By id=By.xpath("//p [@ class='go-to-login']");
	
	*/
	
	/*----------USUARIO CLIENTE----------
	driver.findElement(mailLocator).sendKeys("us_cli2@gmail.com");
	driver.findElement(passwordLocator).sendKeys("cliente-123");
	driver.findElement(confirmpassLocator).sendKeys("cliente-123");
	driver.findElement(BtnCliente).click();
	driver.findElement(sgteBtnLocator).click();
	//CLIENTE
	By nombrecliente =By.xpath("//ion-input[@formcontrolname='names'] ");
	By apellidocliente=By.xpath("//ion-input  [@formcontrolname='lastNames'] ");
	By fechanaccliente=By.xpath("//ion-datetime  [@formcontrolname='birthday'] ");
	By RegistroclienteBtn=By.xpath("//ion-button[ @class='submit-btn md button button-solid button-disabled ion-activatable ion-focusable hydrated' ]");
	By logincliente =By.xpath("//a [@routerlink='/login']");
	*/
//	WebElement emailx=driver.findElement(By.xpath("//input [@name='ion-input-5']"));
//	WebElement password = driver.findElement(By.xpath("//input [@name='ion-input-6']"));
//	WebElement confirmpass = driver.findElement(By.xpath("input [@name='ion-input-7']"));

	//WebElement email=driver.findElement(By.xpath("//input [@name='ion-input-2']"));
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8100");}

	
	@Test
	public void PreregisterRestaurant() throws InterruptedException {
	

	//	String preregisterTitle = driver.getTitle();	
	//    System.out.println("===>"+preregisterTitle);


		//1. click en Registrarse
		driver.findElement(registerLinkLocator).click();
		Thread.sleep(3000);
		System.out.println("no da");

		WebElement searchInput = driver.findElement(By.id("siguiente"));

		String value = searchInput.getText();

		System.out.println(value);

		Assert.assertEquals(value, "SIGUIENTE");




		if(driver.findElement(By.xpath("//form [@class='form ng-untouched ng-pristine ng-invalid']")).isDisplayed()){
    	
			//driver.findElement(pr_email).sendKeys("admin@gmail.com");
		
			
			//driver.findElement(By.xpath("//input[@name='ion-input-2']")).sendKeys("admin@gmail.com");
			
			//driver.findElement(mail_pr).sendKeys(x);
			//driver.findElement(email_pr).sendKeys("admin@gmail.com");
		//email.sendKeys("admin@gmail.com");
		/*WebElement password = driver.findElement(By.xpath("//input [@name='ion-input-6']"));
		WebElement confirmpass = driver.findElement(By.xpath("input [@name='ion-input-7']"));*/
		
				//2.Completar campos para registrar
		System.out.println("maso si da :o");
	    
		
		System.out.println("si da");
        //assertEquals(preregisterTitle, "Ionic App");
			}else
				{
			System.out.println("Pre-register page was not found");
			}
			
		
	}
	

/*	@Test
	public void RegisterRestaurant(){

		
		if(driver.findElement(id).isDisplayed()){
			driver.findElement(nombre_rest).sendKeys("Restaurant 1");
			driver.findElement(desc_rest).sendKeys("Restaurante");
			driver.findElement(dir_rest).sendKeys("Av 14 de Septiembre");
			driver.findElement(rubro_rest).sendKeys("Comida Rapida");
			driver.findElement(Registro_rest).click();
			System.out.println("Usuario registrado exitosamente");
		}else{System.out.println("Usuario no registrado");}
	}
	
	@Test
	public void LoginRestaurant() throws InterruptedException{
		if(driver.findElement(LoginTitle).isDisplayed()){
			driver.findElement(email).sendKeys("admin_res2@gmail.com");
			driver.findElement(pass).sendKeys("admin-123");
			driver.findElement(Btnlogin).click();
			Thread.sleep(2000);
			assertTrue(driver.findElement(LoginTitle).isDisplayed());
		}else{
			System.out.println("Usuario no encontrado");
		}
		
	}*/

//	@After
//	public void tearDown() throws Exception {driver.quit();}
}
