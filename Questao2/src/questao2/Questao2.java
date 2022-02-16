/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

import java.util.Scanner;

/**
 *
 * @author Cinthia
 */

//Código para analisar se a senha obtida está dentro dos critérios exigidos
public class Questao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Digite seu nome de usuário: ");
        Scanner n = new Scanner(System.in);
        String nome = n.next();
        
        System.out.println("\nDigite sua senha: ");
        Scanner s = new Scanner(System.in);
        String senha = s.next();
        
        Login obj = new Login(nome, senha);
        obj.avaliarSenha();
        
    }
    
}
