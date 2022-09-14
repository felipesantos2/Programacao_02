package com.mycompany.strings_01;

/**
 *
 * @author Felipe
 */
public class Strings_01 {

    public static void main(String[] args) {
        
        //charAt();substring();
        
       //String texto = "Frase de testes";
       
//        for(int i = 0; i < texto.length(); i++) {
//            char caracter = texto.charAt(i);
//            System.out.println(caracter);
//        }
//   


    
    
//    String sustr_1 = texto.substring(4);
//    String sustr_2 = texto.substring(1, 7);
//    
//    System.out.println(sustr_1);
//    System.out.println(sustr_2);



    //equals();
    
//    String texto_2 = "Nova Frase";
//    
//    if(texto.equals(texto_2)) {
//        System.out.println("OS textos são iguais"); 
//    }
//    if(texto.equals(texto_2) == false) {
//        System.out.println("OS textos não são iguais"); 
//    }
//    

    
    //concat
        String um = "Felipe ";
        String dois = "Pinheiro";

        String jucao = um.concat(dois);
        System.out.println(jucao.concat(" dos Santos"));
        
    //indexOf
//        int posicao = um.indexOf('i');
//        int posicao2 = um.lastIndexOf('i');
//        System.out.println(posicao);
//        System.out.println(posicao);
        
    //inEmpty(); 
//        if(um.isEmpty()){
//            System.out.println("Sim");
//        } else {
//            System.out.println("Não");
//        }

    //toIpperCase(); toLowerCase(); 
    //trim(); --> remove espações no inicio e no fim
    
    String texto = "Frase de testes de string em java";
    
        if(texto.contains("Java")){
            System.out.println("Contém - Verdade");
        } else {
           System.out.println("Não contém -  Falso");
        }
        System.out.println(texto.replace("a", "-"));

    }
    
    
}
