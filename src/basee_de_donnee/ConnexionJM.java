/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basee_de_donnee;
import java.sql.*;
/**
 *
 * @author Finaritra
 */
public class ConnexionJM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection c=connecterDB();
        // TODO code application logic here
    }
    public static Connection connecterDB(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver ok");
           String url="jdbc:mysql://localhost:3306/caissestation";
           String user="root";
           String passwrd="";
           Connection c=DriverManager.getConnection(url,user,passwrd);
           System.out.println("Connexion etablie");
           return c;
       } catch(Exception e){
          e.printStackTrace();
          
         return null; 
       }
       
        
    }
}
