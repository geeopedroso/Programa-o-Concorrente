/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1294318
 */
public class Produtor extends Thread {
    SharedFifoQueue s;

    public Produtor(SharedFifoQueue s) {
        this.s = s;
    }
    
    
     @Override
    public void run() {
        
        while (true) {
            Random r = new Random();
            int n = r.nextInt(9)+1;
            this.s.put(n);
            System.out.println("Inserido: "  +n);
            try {
                Thread.sleep(n);
            } catch (InterruptedException ex) {
                Logger.getLogger(Produtor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
}
