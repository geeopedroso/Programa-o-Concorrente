/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtorconsumidor;

/**
 *
 * @author a1294318
 */
public class ProdutorConsumidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        Produtor produtor = new Produtor(monitor);
        produtor.run();
        Consumidor consumidor = new Consumidor(monitor);
        consumidor.run();
        
    }
    
}
