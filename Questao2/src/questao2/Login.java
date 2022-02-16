/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author Cinthia
 */
public class Login {
    String nome;
    String senha;

    public Login(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public void avaliarSenha(){
        int maiusculo = 0, minusculo = 0, digito = 0, especial = 0, i = 0, cont=0; 
        
        cont=senha.length();
        
        if(cont >= 6){
            
            while(i < cont){
                
                if(Character.isUpperCase(senha.charAt(i))){
                    maiusculo++;
                }else if(Character.isLowerCase(senha.charAt(i))){
                    minusculo++;
                }else if(Character.isDigit(senha.charAt(i))){
                    digito++;
                }else{
                    especial = especial + charEspecial(senha.charAt(i));
                }
                
                i++;
            }
                        
            if(maiusculo >= 1 && minusculo >= 1 && digito >= 1 && especial >= 1){
                System.out.println("\nSenha Válida!");
            }else{
                System.out.println("\nSenha Inválida!\n\n"
                    + "A senha deve seguir os seguintes critérios:\n"
                    + "Conter no mínimo 1 digito.\n" 
                    + "Conter no mínimo 1 letra em minúsculo.\n" 
                    + "Conter no mínimo 1 letra em maiúsculo.\n" 
                    + "Conter no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+");
            }
            
        }else{
            cont = 6 - cont;
            System.out.println("\nSenha Inválida! "
                    + "Adicione a sua senha pelo menos mais " + cont + " caracteres."
                    + "\nA senha deve possuir no mínimo 6 caracteres.\n" );
        }
        
    }
    
    public int charEspecial(char c){
        if(c=='!' || c=='@' || c=='#' || c=='$' || c=='%' || c=='^' || c=='&' || c=='*' || c=='(' || c==')' || c=='-' || c=='+'){
            return 1;
        }else{
            return 0;
        }
    }
    
    
}
