/*
Faça um código que uma thread t1 e t2 são inicializadas e t1 espera por t2 e vice-versa.
Exemplo:
t1:
trecho1.1
trecho1.2
t2:
trecho2.1
trecho2.2
thecho1.1 ocorre antes trecho2.2 e threcho2.1 ocorre antes de trecho1.2.
 */
package Ex2;

/**
 *
 * @author a1294318
 */
public class Principal {
    public static void main(String[] args) throws InterruptedException {
        ex2 e = new ex2();
        Tread t1 = new Tread(e, "1");
        t1.start();
        Tread.sleep(500);
        Tread t2 = new Tread(e, "2");
        t2.start();
    }
    
}
