/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1294318
 */
public class SharedFifoQueue {
    
    ArrayList<Integer> lista;
    int tamLista;
    Lock lock;
    Condition notFull;
    Condition notEmpty;

    public SharedFifoQueue(int tamLista) {
        this.lista = new ArrayList<>();
        this.tamLista = tamLista;
        this.lock = new ReentrantLock();
        this.notFull = lock.newCondition();
        this.notEmpty = lock.newCondition();
    }
    
    
    
    public void put(int valor) {
        this.lock.lock();
        try {
            while (this.lista.size() >= this.tamLista) {
                System.out.println("Produtor");
                this.notFull.await();
            }

            this.tamLista++;
            this.lista.add(valor);
            this.notEmpty.signal();

        } catch (InterruptedException ex) {
        } finally {
            this.lock.unlock();
        }
    }
    
    public int take() {
        int valor=-1;
        this.lock.lock();
        
        try {
            while(this.lista.size() <= 0){
                System.out.println("Consumidor");
                this.notEmpty.await();
            }
            
            valor = this.lista.get(0);
            this.lista.remove(0);
            this.tamLista--;
            this.notFull.signal();
            
        } catch (InterruptedException ex) {
        } finally {
            this.lock.unlock();
        }
        return valor; 
    }
    
    public void init(){
        Produtor p = new Produtor(this);
        Consumidor c = new Consumidor(this);
        p.start();
        c.start();
    }
    
}
