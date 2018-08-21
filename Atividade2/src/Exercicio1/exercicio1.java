/*
Geovani Pedroso da mata
Faça um programa em Java que consulte periodicamente o
estado de um conjunto de threads.
*/



package Exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author geovani
 */
public class exercicio1 {

    public static void main(String[] args) throws Exception {

        ThreadGroup grupo = new ThreadGroup("meu grupo");

        Treads t1 = new Treads(grupo, "t1");

        Treads t2 = new Treads(grupo, "t2");
        Treads t3 = new Treads(grupo, "t3");
        Treads t4 = new Treads(grupo, "t4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        Treads[] vetor = new Treads[4];
        grupo.enumerate(vetor);
        while (true) {
            
            for (Treads te : vetor) {
                System.out.println("tread " + te.getName() + ": " + te.getState());
            }
            Treads.sleep(500);

            

        }

    }

}
