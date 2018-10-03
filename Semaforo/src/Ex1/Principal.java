/*
Faça um código que uma thread t1 e t2 são inicializadas simultaneamente, mas a t2 pode somente
continuar a execução após a sinalização de t1.
 */
package Ex1;

/**
 *
 * @author a1294318
 */
public class Principal {

    public static void main(String[] args) {

        ex1 e = new ex1();
        Tread t1 = new Tread(e, "t1");
        t1.start();
        Tread t2 = new Tread(e, "t2");
        t2.start();
    }
}
