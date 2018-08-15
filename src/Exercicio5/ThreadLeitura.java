/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author a1294318
 */
public class ThreadLeitura extends Thread {

    List<Double> numeros = new ArrayList<>();
    @Override
    public void run() {
        verifica();
    }
     
    public void verifica(){
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Digite um numero ou digite 'fim' para somar");
            String t =  s.nextLine();
           
           if (t.equals("fim")) break;
           
           Double n = Double.parseDouble(t);
            numeros.add(n);
        }
    }
    
    
}
