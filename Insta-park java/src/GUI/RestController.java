/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Bourguiba
 */
public class RestController implements Initializable {

    @FXML
    private Button annuler;
    @FXML
    private TextField email;
    @FXML
    private TextField question;
    @FXML
    private TextField reponse;
    @FXML
    private PasswordField mdp;
    @FXML
    private Button modifier;
    @FXML
    private Button chercher;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void annuler(ActionEvent event) {
         
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../GUI/Connexion.fxml"));
            Parent root = loader.load();
            annuler.getScene().setRoot(root);
           } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }
    
    }

    @FXML
    private void modifier(ActionEvent event) {
    }

    @FXML
    private void chercher(ActionEvent event) {
    }
    
}
