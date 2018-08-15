/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1294318
 */
public class ThreadoVerifica extends Thread {

    List<Thread> threads;

    public ThreadoVerifica(List<Thread> threads) {
        this.threads = threads;
    }

    @Override
    public void run() {
        try {
            Verifica(threads);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadoVerifica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Verifica(List<Thread> threads) throws InterruptedException {
        while (true) {
            System.out.println("Verificando");

            for (int i = 0; i < threads.size(); i++) {
                Thread t = threads.get(i);
                if (!t.isAlive()) {
                    System.out.println("Thread #" + i + ":  recebeu interrupt");

                }
            }
            Thread.sleep(1000);
        }
    }

}
