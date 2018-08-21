/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author suporte
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
        List<Treads> lista = new ArrayList<>();
        Thread t = new Thread(() -> {
            while (true) {
                System.out.println("ativas: "+ grupo.activeCount());

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(exercicio1.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });
        t.run();

    }

}
