/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author suporte
 */
public class Treads extends Thread {

    public Treads(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 4; i++ ){
            try {
                //int n = (int) (Math.random() * (3000 - 1000) + 1000);
               int n = 2000;
                System.out.println(this.getName() + ":  vou dormir " + n + " segundos");

                Thread.sleep(n);

                System.out.println(this.getName() + ": Acordei ");
            } catch (InterruptedException ex) {
                Logger.getLogger(Treads.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception e) {//Catch exception if any
                System.err.println("Error: " + e.getMessage());
            }

        }
    }

}
