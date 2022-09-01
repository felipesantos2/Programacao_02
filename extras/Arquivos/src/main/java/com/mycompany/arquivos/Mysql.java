/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arquivos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class Mysql{
    
    //coneção com database mysql

    public static Connection ConectaDB (){
        
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/sakila?user=root&password=";
            conn = DriverManager.getConnection(url);   
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null," O erro está na classe de conexão Mysql " + e.getMessage());
            
        }
        return conn;
    }
    
     
}
