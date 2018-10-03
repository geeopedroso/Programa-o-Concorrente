/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1294318
 */
public class Tread extends Thread{
    ex1 e;
    String name;

    public Tread(ex1 e, String name) {
        this.e = e;
        this.name = name;
    }
    
    @Override
    public void run() {
        while(true){
            try {
                this.e.executando(this.name);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tread.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                Tread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
