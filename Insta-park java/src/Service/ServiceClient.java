

package Service;

import Entite.Client;
import java.sql.*;
import Utils.Connexion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Bourguiba
 */
public class ServiceClient {

    private Connection con = Connexion.getInstance().getConnection();
    private Statement ste;

    public ServiceClient() {
        try {
            ste = con.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void ajout(Client p) throws SQLException {
         try {
        String req = "INSERT INTO client VALUES ( " + p.getNom() + "," + p.getPrenom()+ "," + p.getNumtel() + "," + p.getVoitmat() + ","+ p.getLogin()+ ","+ p.getPassword() +","+ ")";
        Statement st = con.createStatement();
        st.executeUpdate(req);
        JOptionPane.showMessageDialog(null, "Client ajoutée ");
        System.out.println("Client Ajoutée");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
 
    public List<Client> afficher() throws SQLException {
        List<Client> list = new ArrayList<>();

        try {
            String req ="select * from client";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(req);
        while (rs.next()) {
            Client s = new Client ();
            s.setId(rs.getInt(1));
            int id = rs.getInt(1);
            s.setNom(rs.getString("nom"));
            s.setPrenom(rs.getString("prenom"));
            s.setNumtel(rs.getString("numtel"));
            s.setVoitmat(rs.getString("voitmat"));
            s.setLogin(rs.getString("login"));
            s.setPassword(rs.getString("password"));
            
            list.add(s);}
       
        
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    return list;
    }
   
    public void supprimer(int id) throws SQLException {
        try {
            String query = "DELETE FROM client WHERE id=?";
            PreparedStatement ste = con.prepareStatement(query);
            ste.setInt(1, id);
            ste.executeUpdate();
            int rowsDeleted = ste.executeUpdate();
            if (rowsDeleted > 0) {
                  System.out.println("Client supprimé!");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
      
    }
    public void modifier(Client t) {
        try {
            String req = "update client set nom=?,prenom=?,numtel=?,voitmat=?,login=?,password=? where id = ?";
            PreparedStatement ps = con.prepareStatement(req);
            ps.setString(1, t.getNom());
            ps.setString(2, t.getPrenom());
            ps.setString(3, t.getNumtel());
            ps.setString(4, t.getVoitmat()); 
            ps.setString(6, t.getLogin());
            ps.setString(7, t.getPassword());
           
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

   
}


