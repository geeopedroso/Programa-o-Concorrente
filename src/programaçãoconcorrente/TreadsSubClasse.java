/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaçãoconcorrente;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1294318
 */
public class TreadsSubClasse extends Thread {
    int id;

    public TreadsSubClasse(int id) {
        this.id = id;
    }
    
           
    @Override
    public void run() {
        System.out.println("thread "+ this.id + " disse:  Olar");
       int n = (int) (Math.random() * (10000 - 5000) + 5000);
        try {
            Thread.sleep(n);
        } catch (InterruptedException ex) {
            Logger.getLogger(TreadsSubClasse.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(this.id + "disse:  vorti");
        
        
    }
    
    
    
}
