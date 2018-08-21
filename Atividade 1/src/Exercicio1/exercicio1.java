/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import static java.lang.Double.max;
import java.util.Random;

/**
 *
 * @author a1294318
 */
public class exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Thread t1 = new ThreadDorme(1);
       Thread t2 = new ThreadDorme(2);
       Thread t3 = new ThreadDorme(3);
       
       t1.start();
       t2.start();
       t3.start();
       
       
       
        
        
    }
    
}
