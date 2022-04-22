/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entite.Parking;
import Utils.DataSource;
import java.sql.*;
import Utils.DataSource;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 *
 * @author malek
 */
public class ServiceParking {

    private Connection con = DataSource.getInstance().getConnection();
    private Statement ste;

    public ServiceParking() {
        try {
            ste = con.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void ajouter(Parking p) throws SQLException {//khedmt
         try {
        String req = "INSERT INTO `parking` (`nomp`, `nbplace`,`plongitude`,`platitude`) VALUES "
                + "('" + p.getNomp() + "', '" + p.getNbplace() + "');";
        ste.executeUpdate(req);
        System.out.println("Parking Ajouté");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
  
    


    public List<Parking> readAll() throws SQLException {//tekhdem
        List<Parking> list = new ArrayList<>();

        ResultSet rs = ste.executeQuery("select * from parking");
        while (rs.next()) {
            int id = rs.getInt(1);
            String nomp = rs.getString("nomp");
            String nbplace = rs.getString("nbplace");
            String platitude = rs.getString("platitude");
            String plongitude = rs.getString("plongitude");
            
            
            Parking p;
            p = new Parking(id, nomp,nbplace,platitude,plongitude);
            list.add(p);
        }

        return list;
    } 
    
    
     public boolean delete(Parking p) throws SQLException {//tekhdem
        try {
            String query = "DELETE FROM parking WHERE id=38";
            PreparedStatement ste = con.prepareStatement(query);
            //ste.setString(1, 'lll', ','11','TN200','20dt');
            int rowsDeleted = ste.executeUpdate();
            if (rowsDeleted > 0) {
                  System.out.println("parking supprimé!");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
      
    }
     
     public boolean Update (Parking p) throws SQLException {//tekhdem 
      try
      {
       ste = con.createStatement();
      System.out.println("Mise à jour...");
      String sql = "UPDATE parking SET Nomp = 'park' WHERE id = 8";
       ste.executeUpdate(sql);
      System.out.println("parking a été mis à jour avec succès");
      con.close();
      }
    catch(SQLException ex){ 
      System.out.println(ex.getMessage());
    }
        return false;
     }
     
     
     
     
     
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
  
}