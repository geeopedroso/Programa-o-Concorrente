/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaçãoconcorrente;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author a1294318
 */
public class Exercicio2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader arquivo = new FileReader("arquivo.txt");
        BufferedReader conteudoDoArquivo = new BufferedReader(arquivo);
        String linha = conteudoDoArquivo.readLine();
        System.out.println(linha);
    }

}
