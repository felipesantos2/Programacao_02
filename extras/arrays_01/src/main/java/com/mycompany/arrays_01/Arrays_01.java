package com.mycompany.arrays_01;

/**
 *
 * @author Felipe
 */
public class Arrays_01 {

    public static void main(String[] args){
        //System.out.println("Olá mundo");
        String nome1 = "João";
        String nome2 = "Felipe";
        String nome3 = "Miguel";
        // array 
        String[] alunos;
        alunos = new String[10];
        
        alunos[0] = "Felipe";
        alunos[1] = "miguel";
        alunos[2] = "Léia";
        alunos[3] = "Felipe2";
        
        //System.out.println("O nome é " + alunos[3]);
        
        //array - dimensão e seus Índices
        String[] alunos2 = {
                "Felipe", 
                "Santos", 
                "marcela",
                "ana",
                "Leia",
                "miguel",
                "Flor"
        };
        
        //System.out.println(alunos2[3]);
        
        
        for(int i = alunos2.length-1; i >=0; i--) {
            //System.out.println(alunos2[i]);
        }
        
        
        // foreach
        
        for (String item: alunos2){
           System.out.println(item);
        }
    }
}
