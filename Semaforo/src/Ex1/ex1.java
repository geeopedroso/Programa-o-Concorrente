/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author geovani
 */
public class ex1 {
    Semaphore semaphore;
    

    public ex1() {
        this.semaphore = new Semaphore(1);
      
    }

    
    public void executando(String msg) throws InterruptedException{
        
            this.semaphore.acquire();
            System.out.println(msg + "  -- está executando");
            this.semaphore.release();
    }
    
   
}
