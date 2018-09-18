/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtorconsumidor;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1294318
 */
public class Consumidor extends Thread {
    Monitor monitor;

    public Consumidor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        String message = monitor.take();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
