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

    public static void main(String[] args) {
            // metodos são executados
            // fluxo principal
        try{
            String nome = JOptionPane.showInputDialog("Digite seu nome:");
          
            if( nome == "Felipe") {
                System.out.println("O nome é Felipe");
                System.out.println("---------------------------");
            }
            
      
        } catch(Exception e) {
            
            //tratandos as exceções
            // evitar problema de uma forma diferente   
            System.out.println( "Excerption ->  " +  e);
            
        } finally{
            
        System.out.println("Finally");
        System.out.println("---------------------------");

        
        }
        
    }
}
