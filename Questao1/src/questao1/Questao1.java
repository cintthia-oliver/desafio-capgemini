/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

import javax.swing.JOptionPane;

/**
 *
 * @author Cinthia
 */

//Código para construção de 'escada' com base no número inserido pelo usuário
public class Questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, c = 0;
        int m = 1;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja para a base e altura da sua escada!"));
        c = n;
        
        for(int i = 0; i < n; i++){
            
            if(c > 0){
                espacoEscada(c);
                c--;
            }
            
            if(m <= n){
                construirEscada(m);
                m++;
            }
        }
    }
    
    private static void construirEscada(int x){
        int cont = 0;
        int num = x-1;
        
        while (cont < x){
            
            if(cont == num){
                System.out.print("*\n");
            }else{
                System.out.print("*");
            }
            
            cont++;
        }
        
    }
    
    private static void espacoEscada(int c){
        int cont = c-1;
        while(cont > 0){
            System.out.print(" ");
            cont--;
        }
    }
    
}
