package com.mycompany.atividade_01;

/**
 *
 * @author Felipe
 */
public class Atividade_01 {

    public static void main(String[] args) {
            //declarando variaveis
        int i, count, j;
        
        i  = j = count = 0;
     
        while( i <= 1000 ) {
                //se a divisão do número  na posição I for diferente  de  0
            if(i % 2 != 0){     
                
               //System.out.println(i);
               count = count + i;   
               
               //verificando quantos numeros impares existem 
               //System.out.println("Interação:" + j); 
               //j++;
            }
            i++;
           
        }
       int media = count / 500;
       System.out.println("|---------------------------Resultados---------------------------------|");
       System.out.println("  A soma dos números impares de 1 até 1000 é -> : "  + count);
       System.out.println("|----------------------------------------------------------------------|");
       System.out.println("  A média da soma dos números impares entre de 1 e 100 é ->: "  + media);
       System.out.println("|----------------------------------------------------------------------|");
       
       
    
       

    }
}
