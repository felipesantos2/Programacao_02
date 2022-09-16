/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula_02;

import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class Aula_02 {
       int[] array;
       array = new int[10];
       
       String saida = "Índice\tValor\n";
   
       for (int i = 0; i < array.length; i++) {
           saida += i + "\t" + array[i] + "\n";
       }
   
      System.out.println(saida);
  
}
