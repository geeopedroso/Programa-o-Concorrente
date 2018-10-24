/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author a1294318
 */
public class Principal {

    int contador;
    ReentrantLock lock;

    public Principal() {
        this.contador = 0;
        this.lock = new ReentrantLock();
    }

    public void Atualiza(boolean incrementa) {
        this.lock.lock();
        try {
            if (incrementa) {
                this.contador++;
            } else {
                this.contador--;
            }
        } finally {
            this.lock.unlock();
        }

    }

    public void print() {
        System.out.println("contador: " + this.contador);
    }

    public void init() {

        Tread t1 = new Tread(true, this);

        Tread t2 = new Tread(false, this);

        t1.start();
        t2.start();
    }

}
