/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.seleniumMercuryApp.Pagina;
import com.com470.seleniumMercuryApp.Refactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 *
 * @author Vic
 */
public class Complejos 
{
    private WebDriver driver;
    public Complejos(WebDriver driver)
    {
        this.driver=driver;
    }
    public void llenar(String c)
    {
        driver.findElement(By.name("c")).sendKeys(c);
    }
    public void BorrarComplejo()
    {
         driver.findElement(By.name("c")).clear();
    }
    public void BorrarComplejoO()
    {
         driver.findElement(By.xpath("/html/body/form/p[2]/input[5]")).click();
         Refactor ref=new Refactor();
         ref.Pausar(2);
    }
    public void Fibonacci(String c)
    {
        llenar(c);
        driver.findElement(By.xpath("/html/body/form/p[2]/input[1]")).click();
        Refactor ref=new Refactor();
        ref.Pausar(2);
    }
    public void Factorial(String c)
    {
        llenar(c);
        driver.findElement(By.xpath("/html/body/form/p[2]/input[2]")).click();
        Refactor ref=new Refactor();
        ref.Pausar(2);
    }
    public void Raiz2(String c)
    {
        llenar(c);
        driver.findElement(By.name("sqrt")).click();
        Refactor ref=new Refactor();
        ref.Pausar(2);
    }
    public void Potencia(String c)
    {
        llenar(c);
        driver.findElement(By.name("power")).click();
        Refactor ref=new Refactor();
        ref.Pausar(2);
    }
}
