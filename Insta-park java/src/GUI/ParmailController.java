/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Bourguiba
 */
public class ParmailController implements Initializable {

    @FXML
    private VBox parametre;
    @FXML
    private VBox nvmdp;
    @FXML
    private VBox code;
    @FXML
    private TextField codenvmdp;
    @FXML
    private TextField Cnvmdpmodif;
    @FXML
    private Button modifier;
    @FXML
    private TextField nvmdpmodif1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void codenvmdp(ActionEvent event) {
    }

    @FXML
    private void modifier(ActionEvent event) {
    }
    
}