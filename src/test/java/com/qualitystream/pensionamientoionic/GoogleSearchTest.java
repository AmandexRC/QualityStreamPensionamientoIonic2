package com.qualitystream.pensionamientoionic;


// PRUEBA DE GOOGLE
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	private WebDriver driver;
	@Before
	public void setUp(){
		
	//System.setProperty("webdriver.chrome.driver","./src/test/resources/driver79/chromedriver.exe");	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	@Test
	public void verifyTest() {
		WebElement searchbox=driver.findElement(By.name("q"));
		//para limpiar cualquier texto que este en la caja de busqueda
		searchbox.clear();
		//envia el texto a la caja de busqueda
		searchbox.sendKeys("quality-stream");
		//para que envie esa informacion
		searchbox.submit();
		//tiempo de espera, tiempo de carga de busqueda
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//chequear resultados de la busqueda, el nombre estara en el titulo de pagina 
		assertEquals("quality-stream - Buscar con Google",driver.getTitle());
	}
	
	@After
	
	public void tearDown(){
		//para que cierre el navegador
		driver.quit();
	}
	
}
