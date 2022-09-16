
package com.mycompany.mapa;

import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class MAPA {
    
    //FELIPE PINHEIRO DOS SANTOS 
    //16/09/2022  

    public static void main(String[] args) {
        // declarando as variaveis;
        int a ,b , c;
        double delta, x1, x2;
        
        try{
            
            a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de A que seja diferente de 0 : "));
            b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de B : "));
            c = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de C : "));
            
            
            
            if(a == 0 ){
                JOptionPane.showMessageDialog(null, "Execute novamente A = " + a);
                System.exit(0);

            }
          
            delta = calcularDelta(a, b, c);
            //delta = (b * b) - 4 * a * c;
            
            JOptionPane.showMessageDialog(null, delta);
            
            if(delta < 0) {
                JOptionPane.showMessageDialog(null, "A equação não apresentará raízes reais");
                System.exit(0);
            }
  
           
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            
            JOptionPane.showMessageDialog(null, "O Valor de Delta é: " +  delta);
            JOptionPane.showMessageDialog(null, "O valor de X1 é: " + x1);
            JOptionPane.showMessageDialog(null, "O valor de X2 é: " + x2);
       
           
        } catch (Exception erro){
            // pegando a exceção
            //ex: tipo de dado inserido nas variaveis a , b e c;
            JOptionPane.showMessageDialog(null, "insira informações corretas por favor.");
            System.out.println(erro.getMessage());
    
        } finally {
            JOptionPane.showMessageDialog(null, "Fim de Execução");
        }
               
    }
    
        private static double calcularDelta(int a, int b, int c) throws IllegalArgumentException{
            double delta = (b * b) - 4 * a * c;
        return delta;
    }
    
}
