/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Utils.Connexion;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Bourguiba
 */
public class ConnexionController implements Initializable {

    @FXML
    private AnchorPane fenetreprofil;
    @FXML
    private Button profil;
    @FXML
    private Button Accu;
    @FXML
    private Button parametre;
    @FXML
    private Button deco;
    @FXML
    private Button Reclamation;
    @FXML
    private Button event;
    @FXML
    private Label email1;
    @FXML
    private Label labelprenom;
    @FXML
    private AnchorPane fenetreconnexion;
    @FXML
    private TextField email;
    @FXML
    private PasswordField mdp;
    @FXML
    private Label invalid;
    @FXML
    private Button connexionn;
    @FXML
    private Hyperlink mdpoublié;
    @FXML
    private Hyperlink inscription;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void inscri(ActionEvent event) {
          try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../GUI/inscription.fxml"));
            Parent root = loader.load();
            inscription.getScene().setRoot(root);
           } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }
    }
    @FXML
    private void profil(ActionEvent event) {
    }

    @FXML
    private void accueil(ActionEvent event) {
    }

    @FXML
    private void parametre(ActionEvent event) {
    }

    @FXML
    private void deco(ActionEvent event) {
    }

    @FXML
    private void reclamation(ActionEvent event) {
    }

    @FXML
    private void event(ActionEvent event) {
    }

    @FXML
    private void connexion(ActionEvent event) {
       
        
       
    }

   public void mdpoublié(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../GUI/methode.fxml"));
            Parent root = loader.load();
            inscription.getScene().setRoot(root);
           } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }
        
        
    }

    private Object cryptage(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
