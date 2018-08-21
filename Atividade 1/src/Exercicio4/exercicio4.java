/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1294318
 */
public class exercicio4 {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        List<Thread> threads = new ArrayList<Thread>();
        for (i=0; i<5; i++){
            Thread t = new Thread( ()->{
                while(true){
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        break;
                    }
                    
                }
                
            });
            t.start();
            threads.add(t);
            
        }
        
        ThreadoVerifica v = new ThreadoVerifica(threads);
        v.start();
        
        Thread.sleep(3000);
        
            threads.get(1).interrupt();
            threads.get(3).interrupt();
        
    }
    
}
