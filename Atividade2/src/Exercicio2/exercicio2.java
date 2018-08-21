/*
Geovani Pedroso da Mata
Faca um programa em Java para testar um conjunto de
operacoes sobre um grupo de threads.  Use o ThreadGroup.
*/
package Exercicio2;

import Exercicio1.Treads;
import Exercicio1.exercicio1;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Geovani
 */
public class exercicio2 extends Thread {

    ThreadGroup grupo = new ThreadGroup("meu grupo");
    Treads t1;
    Treads t2;
    Treads t3;
    Treads t4;
    public void CriaThreads() {
        

         t1 = new Treads(grupo, "t1");
         t2 = new Treads(grupo, "t2");
         t3 = new Treads(grupo, "t3");
         t4 = new Treads(grupo, "t4");

        t1.start();

        t2.start();

        t3.start();

        t4.start();
    }
    public void executa(){
        System.out.println("Threads ativas: "+ grupo.activeCount());
        Treads [] lista = new Treads[grupo.activeCount()];
        grupo.enumerate(lista);
        
        for(Treads t: lista){
            System.out.println("thread: "+ t.getName()+ ", estado: "+ t.getState());
        }
            
    }
    @Override
    public void run() {
        CriaThreads();
        while(true){
            try {
                Thread.sleep(3000);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(exercicio2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(grupo.activeCount() == 0){
                CriaThreads();
            }
            executa();
        }
        
    }

}

class Principal{
    
    public static void main(String[] args) {
        exercicio2 e = new exercicio2();
        e.start();
    }

}
