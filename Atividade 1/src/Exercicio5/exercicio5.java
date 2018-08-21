/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio5;

/**
 *
 * @author a1294318
 */
public class exercicio5 {
    public static void main(String[] args) throws InterruptedException {
        ThreadLeitura t = new ThreadLeitura();
        t.start();
        t.join();
        Double soma = 0.0;
        for(Double a: t.numeros){
            soma+=a;
        }
        System.out.println(soma);
    }
    
}
