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
public class Produtor extends Thread {

    Monitor monitor;

    public Produtor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        while (true) {

           monitor.put("mensagem");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Produtor.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }

}
