/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arquivos;

import java.nio.file.*;


/**
 *
 * @author Felipe
 */
public class Arquivos {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Path diretorio = Paths.get("C:/laragon/www/100days/php/14-api-clima-xml");
        
        if(Files.isDirectory(diretorio)){
            System.out.print("Diretorio Existe\n");
        } else {
            System.out.println("O caminho não existe");
        }
        
        if(Files.exists(diretorio)){
            System.out.print("O arquivo existe");
        }
    }
}
