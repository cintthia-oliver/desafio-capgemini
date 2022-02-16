/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

/**
 *
 * @author Cinthia
 */
public class avaliarString {
    
    public int avaliarProxString(String s, int cont){
        int num = 0;
        
        for(int i = 0; i < cont; i++){
            
            for(int j = 0; j < cont; j++){
                
                if(i != j){
                    if(s.charAt(i) == s.charAt(j)){
                        num++;
                    }
                }
                
            }
        }
        num=num/2;
        return num;
    }
    
    public int avaliarString2(String s, int n){
       int cont = 0, j =0;
       
       if(n > 2){
           
           for(int i = 0; i < n; i++){
               j=i+2;
               
               if(n > j){
                   if(s.charAt(i) == s.charAt(j)){
                        cont++;
                   }
               }else{
                   i = j;
               }
               
           }
           
       } 
        cont = cont*2;
        return cont;
    }
    
    public int avaliarString3(String s, int n){
       int cont = 0, j =0;
       
       if(n > 3){
           
           for(int i = 0; i < n; i++){
               j=i+3;
               
               if(n > j){
                   if(s.charAt(i) == s.charAt(j)){
                        cont++;
                   }
               }else{
                   i = j;
               }
               
           }
           
       }
        return cont;
    }
}
