package basee_de_donnee;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Valtsua
 */
public class Connecter {
    Connection con;
    public Connecter() {
       try{
         Class.forName("com.mysql.jdbc.Driver");
       
       } catch(ClassNotFoundException e){
          System.err.println(e);//pour affiche l erreur
       }
        
       try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/caissestation","root","");
       } catch(SQLException e){
          System.err.println(e);
       }
       
    }
   Connection obtenirconnexion(){return con;} 
    
}
