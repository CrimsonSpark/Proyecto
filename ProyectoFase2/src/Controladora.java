/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joni_
 */ import java.sql.*;
 
public class Controladora {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Abrir conexion con la bd
        Class.forName("oracle.jdbc.OracleDriver");

        String login="JONATHAN";
        String password= "java";
        String url = "jdbc:oracle:thin:@SrvOracle :1521:orcl";
        Connection con =DriverManager.getConnection(url,login ,password);
    }
    
}
