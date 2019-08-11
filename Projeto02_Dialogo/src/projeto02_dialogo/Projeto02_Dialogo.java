/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto02_dialogo;
/**
 *
 * @author 081170044
 */
public class Projeto02_Dialogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Pessoa1 p1 = new Pessoa1();
        Pessoa2 p2 = new Pessoa2();
        
        System.out.print("Iniciaremos a conversação\n\n");
        Thread.sleep(1000);
        
        System.out.print(p2.getDialogo3()+ "\n\n");
        Thread.sleep(1000);
        System.out.print("       " + p1.getDialogo2() + "\n\n");
        Thread.sleep(1000);
        
        System.out.print(p2.getDialogo2() + "\n\n");
        Thread.sleep(1000);
        System.out.print("       " + p1.getDialogo1() + "\n\n");
        Thread.sleep(1000);
        
        System.out.print(p2.getDialogo1() + "\n\n");
        Thread.sleep(1000);
        System.out.print("FIM\n");        
    }
    
}
