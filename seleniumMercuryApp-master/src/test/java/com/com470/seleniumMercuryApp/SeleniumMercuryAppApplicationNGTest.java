package com.com470.seleniumMercuryApp;

import com.com470.seleniumMercuryApp.Pagina.Complejos;
import com.com470.seleniumMercuryApp.Pagina.Simple;
import java.sql.Driver;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumMercuryAppApplicationNGTest {

    private WebDriver driver;
    
    public SeleniumMercuryAppApplicationNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception 
    {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://localhost:8080/calculadora");
        Refactor ref=new Refactor();
        ref.Pausar(5);
    }
    @Test
    public void TestSimple() throws Exception 
    {
        Simple simple=new Simple(driver);
        simple.Suma("1","1");
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("Resultado: 2"),"Cuando la Suma es 1 + 1=2");
        
        simple.Borrar();
        
        simple.Resta("1","1");
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("Resultado: 0"),"Cuando la Resta es 1 - 1=0");
        
        simple.Borrar();
        
        simple.Multiplicacion("3","2");
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("Resultado: 6"),"Cuando la Multiplicacion es 3*2=6");
        
        simple.Borrar();
        
        simple.Division("10","2");
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("Resultado: 5.0"),"Cuando la Division es 10/2=5.0");
        
        /*simple.Borrar();
        
        simple.Borrars();
        assertTrue(driver.findElement(By.id("a")).getText().contains("0"),"Cuando la se borran los campos 'a' y 'b' ");
        assertTrue(driver.findElement(By.id("b")).getText().contains("0"),"Cuando la se borran los campos 'a' y 'b' ");*/
    }
    @Test
    public void TestComplejos() throws Exception 
    {
        Complejos complejo=new Complejos(driver);
        
        complejo.Fibonacci("5");
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("Resultado: 5"));
        
        complejo.BorrarComplejo();
        
        complejo.Factorial("5");
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("Resultado: 120"));
        
        complejo.BorrarComplejo();
        
        complejo.Raiz2("9");
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("Resultado: 3.0"));
        
        complejo.BorrarComplejo();
        
        complejo.Potencia("9");
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("Resultado: 81"));
        
        /*complejo.BorrarComplejo();
        
        complejo.BorrarComplejoO();
        assertTrue(driver.findElement(By.id("c")).getText().contains("0"));*/
        
    }
 
    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }

}
