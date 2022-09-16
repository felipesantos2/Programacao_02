/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mapa;

import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class MAPA {
    
    

    public static void main(String[] args) {
        // declarando as variaveis;
        int a ,b , c;
        double delta, x1, x2;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de A : "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de B : "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de C : "));
       // System.out.println("O valor de a é: "+ a +"-" + b + "-" + c);
        
        if(a == 0) {
            JOptionPane.showMessageDialog(null, "O número correspondente a letra `A` tem que ser diferente de ZERO -> "
                    + " a != 0 ");
        }
   
        if(a != 0){
            
            delta = (b * b) - 4 * a * c;
            
            //System.out.println("O Valor de Delta é: " +  delta);
         
            /// usando Bhaskara
                if( delta > 0){

                    x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    x2 = (-b - Math.sqrt(delta)) / (2 * a);

                    System.out.println("O valor de X1 é: " + x1);
                    System.out.println("O valor de X1 é: " + x2);


                }
                

        }
        
    } 
    
}
