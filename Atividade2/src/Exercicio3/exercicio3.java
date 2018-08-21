/*
Geovani Pedroso  da Mata
 Fa ̧ca um programa em Java com threads que exiba os
n ́umeros primos entre 0 e 100000.
*/
package Exercicio3;

import Exercicio1.Treads;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a1294318
 */
public class exercicio3 extends Thread {
    int inicio, fim;
    List<Integer> vetor;
    List<Integer> saida;

    public exercicio3(int inicio, int fim, List<Integer> vetor, List<Integer> saida) {
        this.inicio = inicio;
        this.fim = fim;
        this.vetor = vetor;
        this.saida = saida;
    }

    public boolean isPrimo(int numero){
      int flag = 0;
      for(int i = 1; i< numero+1; i++){
          if(numero%i==0){
              flag++;
          }
      }
      if(flag==2){
          return true;
      }
    return false;
    }
    
    @Override
    
    public void run() {
        
        for(int i = inicio; i<fim; i++){
            if(isPrimo(i)){
                saida.add(i);
            }
        }
    }
   
    
    
}

class Principal{
    public static void main(String[] args) {
        List<Integer> vetor = new ArrayList<>();
        List<Integer> saida = new ArrayList<>();
                
        for(int i=0; i<100; i++){
            vetor.add(i);
        }
        int inicio = 0;
        int tam = 100;
        int fim = 100 /5;
        for(int i = 0; i<5; i++){
            exercicio3 thread = new exercicio3(inicio, fim, vetor, saida);
            inicio += fim;
            fim += fim;
                    
        }
        System.out.println("rola");
        for(Integer i: saida){
            System.out.println(i.toString()s);
        }
        
    }
         
    
}
