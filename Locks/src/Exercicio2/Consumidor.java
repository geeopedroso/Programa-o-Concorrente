/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1294318
 */
public class Consumidor extends Thread {

    SharedFifoQueue s;

    public Consumidor(SharedFifoQueue s) {
        this.s = s;
    }

    @Override
    public void run() {

        int valor;
        while (true) {
            valor = this.s.take();
            System.out.println("Removido: " + valor);
            try {
                Thread.sleep(valor);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
