
package Pidesk;

import Entite.Parking;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author malek
 */
public class Instaparkjava  {
    
   
    private static String url = "jdbc:mysql://localhost:3306/pi";
    private static String login = "root";
    private static String pwd = "";
    private static Connection con;
    private static Statement ste;

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            con = DriverManager.getConnection(url, login, pwd);
            System.out.println("Connexion établie");
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        try {
            ste = con.createStatement();
            String req = "INSERT INTO `parking` (`nomp`, `nbplace`, `platitude`, `plongitude`) VALUES " + "('parking marsa', '5','14','6');";
            ste.executeUpdate(req);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        try {
            ResultSet rs = ste.executeQuery("select * from parking");
            while (rs.next()) {
                int id = rs.getInt(1);
                String nomp = rs.getString("nomp");
                String nbplace = rs.getString("nbplace");
                String plongitude = rs.getString("plongitude");
                String platitude = rs.getString("platitude");
            

                System.out.println("id:" + id + " nomp:" + nomp + " nbplace:" + nbplace + " plongitude:" + plongitude + " platitude:"+ platitude  );

            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    
     try {
            ste = con.createStatement();
            String req = "DELETE FROM parking WHERE id=38";
            //ste.setString(36, 'Cherif', 'Ahmed','21202121','TN200','20dt','ahmed@esprit.tn','cherif123','1'");
            ste.executeUpdate(req);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

//try{
           //  ste = con.createStatement();
            // String req = "update parking set Nomp = ? , Nbplace= ? ,  where Id = 8";
            //// ste.setString('park1','15');
             //ste.executeUpdate(req);
         //} catch (SQLException ex) {
            //System.out.println(ex);
        //}
        
      try
      { 
      //étape 3: créer l'objet statement 
       ste = con.createStatement();
      //étape 4: exécuter la requête
      System.out.println("Mise à jour...");
      String sql = "UPDATE parking SET Nomp = 'park' WHERE id = 8";
       ste.executeUpdate(sql);
      System.out.println("parking a été mis à jour avec succès");
      //étape 5: fermez l'objet de connexion
      con.close();
    }
    catch(SQLException ex){ 
      System.out.println(ex);
    }
  }
        
        
        
        
}

