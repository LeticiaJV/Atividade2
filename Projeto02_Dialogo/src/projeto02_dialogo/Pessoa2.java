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
public class Pessoa2 extends PessoaPadrao
{  
    private String dialogo3 = "Olá, como você está?";
    
    public Pessoa2(){
        nomePessoa = "Pessoa2";
        dialogo1 = "O meu é " + nomePessoa;
        dialogo2 = "Estou bem também. Qual o seu nome?";
        dialogo3 = "Olá, como você está?";
    } 

    /**
     * @return the cumprimento
     */
    public String getDialogo3() {
        return dialogo3;
    }
}
