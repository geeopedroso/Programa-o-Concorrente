/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

import Exercicio1.ThreadDorme;
import Exercicio2.ThreadFrases;

/**
 *
 * @author a1294318
 */
public class exercicio3 {
    
    public static void main(String[] args)throws Exception {
        
       Thread t1 = new ThreadFrases(1);
       Thread t2 = new ThreadDorme(2);
       
       
       t1.start();
       t2.start();
       
       Thread.sleep(2000);
       t1.interrupt();
       t2.interrupt();
    
    }
    
}
