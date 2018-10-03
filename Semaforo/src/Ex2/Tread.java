/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1294318
 */
public class Tread extends Thread{
    ex2 e;
    String name;
    int trecho;

    public Tread(ex2 e, String name) {
        this.e = e;
        this.name = name;
        this.trecho = 0;
    }
    
    @Override
    public void run() {
        while(true){
            try {
                this.trecho++;
                this.e.executando(this.name, this.trecho);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tread.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(this.trecho==2){
                this.trecho = 0;
            }
            try {
                Tread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
    

