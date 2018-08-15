/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author a1294318
 */
public class ThreadFrases extends Thread {

    int id;

    public ThreadFrases(int id) {
        this.id = id;
    }

    @Override
    public void run() {

        try {
            //OpenFile
            FileReader arquivo = new FileReader("arquivo.txt");
            BufferedReader conteudoDoArquivo = new BufferedReader(arquivo);
            String linha = conteudoDoArquivo.readLine();
            while (linha != null) {
                System.out.println(linha);
                Thread.sleep(10000);

                linha = conteudoDoArquivo.readLine();
            }
            conteudoDoArquivo.close();
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }

}
