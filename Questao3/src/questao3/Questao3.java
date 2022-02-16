/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import java.util.Scanner;

/**
 *
 * @author Cinthia
 */

//Código para encontrar o número de anagramas pares dentro de uma string
public class Questao3 {
    
    int num = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=0, a = 0, b = 0, c=0, total=0;
        
        System.out.println("Digite uma palavra: ");
        Scanner p = new Scanner(System.in);
        String palavra = p.next();
        
        cont = palavra.length();
        
        avaliarString v = new avaliarString();
        a = v.avaliarProxString(palavra, cont);
        b = v.avaliarString2(palavra, cont);
        c = v.avaliarString3(palavra, cont);
        
        total = a + b + c;
        System.out.println("\nO total de anagramas pares correspondentes na palavra é de: " + total);
        
    }
    
}
