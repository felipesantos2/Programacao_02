/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_01;

/**
 *
 * @author Felipe
 */
public class Sobrecarga {
    
    private double maior;
    
       // método que verifica maior número entre 2 número digitados
    public double calculaNumeroMaior(double n1 , double n2) {
        
        if(n1 == n2) {
           maior = 0;
        }
        
        if(n1 > n2){
           maior = n1;
        }
        
        if(n2 > n1){
           maior = n2;  
        }
        return maior;     
    }
    
    // método que verifica maior número entre 3 número digitados
    public double calculaNumeroMaior(double n1 , double n2, double n3) {
        
        if((n1 > n2) && (n2 > n3)) {
           maior = n1;
           
        }else if((n2 > n1) && (n2 > n3)) {
             maior = n2;
            
        }else if((n3 > n3) && (n3 > n2)) {
           maior = n3;
           
        }else {
            maior = 0;
        }
        
        return maior;
             
    }
}
