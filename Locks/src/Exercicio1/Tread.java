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
 * @author a1294318
 */
public class Tread extends Thread{
    boolean incrementa;
    Principal p;

    public Tread(boolean incrementa, Principal p) {
        this.incrementa = incrementa;
        this.p = p;
    }
    
    @Override
    public void run() {
        while(true){
            this.p.Atualiza(this.incrementa);
            this.p.print();
           
            
        }
    }
    
}
