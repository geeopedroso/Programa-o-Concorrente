/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a1294318
 */
public class ThreadBusca extends Thread {

    int numero;
    List<Integer> vetor;
    int saida;
    int inicio;
    int fim;

    public ThreadBusca(int numero, List<Integer> vetor, int inicio, int fim, int saida) {
        this.numero = numero;
        this.vetor = vetor;
        this.saida = saida;
        this.inicio = inicio;
        this.fim = fim;
    }

    public void Campear() {
        for (int i = inicio; i < fim; i++) {
            if (vetor.get(i).equals(numero)) {
                this.saida = i;
                break;
            }

        }
    }

    @Override
    public void run() {
        Campear();
    }

}

class Principal {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> vetor = new ArrayList<>();
        List<ThreadBusca> listaThreads = new ArrayList<>();
        int tamanho = 100;
        int nThreads = 5;
        for (int i = 0; i < tamanho; i++) {
            vetor.add(i);

        }
        int numero = 5;
        
        int inicio = 0;
        int fim = tamanho /nThreads;
        
        
        for(int i = 0; i<nThreads; i++){
            ThreadBusca t = new ThreadBusca(numero, vetor,inicio, fim, -1);
            inicio += tamanho/nThreads;
            fim += tamanho/nThreads;
            t.start();
            listaThreads.add(t);
        }
        
        for(ThreadBusca t : listaThreads){
            t.join();
        }
          for(ThreadBusca t : listaThreads){
            if(t.saida != -1){
                System.out.println("numero está na posicao : ["+ t.saida +"] do vetor");
            }
        }
        
        
            
        
        
    }
}
