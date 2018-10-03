/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

import java.util.concurrent.Semaphore;

/**
 *
 * @author a1294318
 */
public class ex2 {
    Semaphore semaphore;
  

    public ex2() {
        this.semaphore = new Semaphore(1);
     
    }
    
    public void executando(String msg, int trecho) throws InterruptedException{
        
            this.semaphore.acquire();
            System.out.println("Trecho"+ msg +"."+trecho+ "  -- está executando");
            this.semaphore.release();
    }
}
