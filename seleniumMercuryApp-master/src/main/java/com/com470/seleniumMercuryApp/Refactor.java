/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.seleniumMercuryApp;


public class Refactor 
{
    public void Pausar(int Seg)
    {
        try {
            Thread.sleep(Seg*1000);
        } catch (InterruptedException e) {
        }
    }
}
