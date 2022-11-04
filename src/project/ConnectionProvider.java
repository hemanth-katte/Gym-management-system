/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
//import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author Hemanth
 */
public class ConnectionProvider {
    public static Connection getCon(){
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms","root","0000");
           return con;
       } 
       catch(ClassNotFoundException | SQLException e){
           return null;
       } 
    }
}
