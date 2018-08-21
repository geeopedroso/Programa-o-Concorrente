/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1294318
 */
public class ThreadDorme extends Thread {

    int id;

    public ThreadDorme(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        Dormir();
    }

    public void Dormir() {
        System.out.println("thread " + this.id + " disse:  Olar");
        int n = (int) (Math.random() * (10000 - 5000) + 5000);
        try {
            System.out.println(n);
            Thread.sleep(n);
        }catch(InterruptedException e){
            
        }
        System.out.println(this.id + "disse:  vorti");
    }

   
}
