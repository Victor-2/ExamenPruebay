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
public class Simple 
{
    private WebDriver driver;
   
    public Simple(WebDriver driver)
    {
        this.driver=driver;
        
    }
    public void llenar2Campos(String a,String b)
    {
        driver.findElement(By.name("a")).sendKeys(a);
        driver.findElement(By.id("b")).sendKeys(b);
    }
    public void Borrar()
    {
         driver.findElement(By.name("a")).clear();
        driver.findElement(By.id("b")).clear();
    }
    public void Borrars()
    {
        driver.findElement(By.xpath("/html/body/form/p[1]/input[5]")).click();
        Refactor ref=new Refactor();
        ref.Pausar(2);
    }
    public void Suma(String a, String b)
    {
        llenar2Campos(a,b);
        driver.findElement(By.xpath("/html/body/form/p[1]/input[1]")).click();
        Refactor ref=new Refactor();
        ref.Pausar(2);
    }
    public void Resta(String a, String b)
    {
        llenar2Campos(a,b);
        driver.findElement(By.name("subtract")).click();
        Refactor ref=new Refactor();
        ref.Pausar(2);
    }
    public void Multiplicacion(String a, String b)
    {
        llenar2Campos(a,b);
        driver.findElement(By.xpath("/html/body/form/p[1]/input[3]")).click();
        Refactor ref=new Refactor();
        ref.Pausar(2);
    }
    public void Division(String a, String b)
    {
        llenar2Campos(a,b);
        driver.findElement(By.xpath("/html/body/form/p[1]/input[4]")).click();
        Refactor ref=new Refactor();
        ref.Pausar(2);
    }
}
