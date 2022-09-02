/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.basico;

import java.util.Locale;

/**
 *
 * @author Felipe
 */
public class Basico {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
       // tipos primitivos
       // int,
       // float,
       // double,
       // byte,
       //char,
       
       // variaveis de referencia
       
       String nome = "Felipe";
       
       String sobrenome = "Pinheiro";
       
       String nome_completo = nome + " " + sobrenome;
       
       System.out.println(nome_completo.toUpperCase());
       //System.out.println(nome_completo.charAt(1));
       
       for(int i = 0; i < nome_completo.length(); i++){
           
           //System.out.println(i);
           System.out.println(nome_completo.charAt(i));
       
       }
      System.out.println("----------------------------");
      int i = 0; 
      
      while(i < nome_completo.length()){
          
          System.out.println(nome_completo.charAt(i));
          
          i++;
      }
      do {
        i = 0;
            System.out.println(nome_completo.charAt(i));
      }while(i < nome_completo.charAt(i) );
      
      

    }
}
