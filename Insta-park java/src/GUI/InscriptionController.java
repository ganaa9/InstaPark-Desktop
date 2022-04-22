/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static java.awt.PageAttributes.MediaType.C;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Bourguiba
 */
public class InscriptionController implements Initializable {

    @FXML
    private AnchorPane inscr;
    @FXML
    private Button back;
    @FXML
    private VBox validation;
    @FXML
    private Label labnumero;
    @FXML
    private TextField Code;
    @FXML
    private Button terminer;
    @FXML
    private VBox pageinscription;
    @FXML
    private Label invalid;
    @FXML
    private TextField Nom;
    @FXML
    private TextField Prenom;
    private TextField Email;
    @FXML
    private TextField num;
    @FXML
    private TextField matricule;
    @FXML
    private SplitMenuButton Role;
    @FXML
    private MenuItem client;
    @FXML
    private MenuItem agentservice;
    @FXML
    private PasswordField mdp;
    @FXML
    private PasswordField Cmdp;
    @FXML
    private Label generatedString;
    @FXML
    private TextField text;
    @FXML
    private SplitMenuButton question;
    @FXML
    private MenuItem q1;
    @FXML
    private MenuItem q2;
    @FXML
    private MenuItem q3;
    @FXML
    private MenuItem q4;
    @FXML
    private MenuItem q5;
    @FXML
    private TextField Reponse;
    @FXML
    private Button inscription;
    @FXML
    private TextField email;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void back(ActionEvent event) {
    }

    @FXML
    private void terminer(ActionEvent event) {
    }

    @FXML
    private void client(ActionEvent event) {
    }

    @FXML
    private void client(Event event) {
    }

    @FXML
    private void agentservice(ActionEvent event) {
    }

    @FXML
    private void agentservice(Event event) {
    }

    @FXML
    private void Role(ActionEvent event) {
    }

    @FXML
    private void q1(ActionEvent event) {
        question.setText("Nom de votre grande mére ? ");
    }

    @FXML
    private void q1(Event event) {
        question.setText("Nom de votre grande mére ? ");
    }

    @FXML
    private void q2(ActionEvent event) {
        question.setText("Votre Langue matérnelle ? ");
    }

    @FXML
    private void q2(Event event) {
        question.setText("Votre Langue matérnelle ? ");
    }

    @FXML
    private void q3(ActionEvent event) {
        question.setText("Nombre de votre famille ?");
    }

    @FXML
    private void q3(Event event) {
        question.setText("Nombre de votre famille ?");
    }

    @FXML
    private void q4(ActionEvent event) {
        question.setText("Combien de soeur avez vous ?");
    }

    @FXML
    private void q4(Event event) {
        question.setText("Combien de soeur avez vous ?");
    }

    @FXML
    private void q5(ActionEvent event) {
        question.setText("Votre serie préférée ");
    }

    @FXML
    private void q5(Event event) {
        question.setText("Votre serie préférée ");
    }

    @FXML
    private void Sexe(ActionEvent event) {
    }

    @FXML
    private void inscription(ActionEvent event) {
         if (email.getText().isEmpty() == false
                && Nom.getText().isEmpty() == false  
                && Prenom.getText().isEmpty() == false
                && matricule.getText().isEmpty() == false && num.getText().isEmpty() == false  
                && mdp.getText().isEmpty() == false
                && Reponse.getText().isEmpty() == false && question.getText().isEmpty() == false
                && Cmdp.getText().isEmpty() == false && text.getText().isEmpty() == false
                && num.getText().isEmpty() == false) {
      
           if  (Nom.getText().equals(Prenom.getText())){
                 invalid.setText("Nom et prenom doivent être différents "); }   
           else if (verifemail(email.getText())== false)
        {
            invalid.setText("Cette Email est invalid ");
        }  else if (mdp.getText().length()<8 ) {
            invalid.setText("Le mot de passe ne doit pas étre inferieur à 8 caractere");}
        
        
        else if((mdp.getText().equals(Cmdp.getText()))==false ) {
           
     invalid.setText("Les mots de passe ne sont pas identiques");}
         
           else if ((text.getText().equals(C)==false)){
          invalid.setText("Les Deux chaines ne sont pas identiques!");
         }  else if ((num.getText().length()!=8) && ( num.getText().substring(1, 2) !="90") &&(num.getText().substring(1, 2)!="91") &&(num.getText().substring(1, 2)!="92") &&(num.getText().substring(1, 2)!="93") &&(num.getText().substring(1, 2)!="94") &&(num.getText().substring(1, 2)!="95")&&(num.getText().substring(1, 2)!="96") &&(num.getText().substring(1, 2)!="97") &&(num.getText().substring(1, 2)!="98") &&(num.getText().substring(1, 2)!="99")
                   &&(num.getText().substring(1, 2)!="40")&&(num.getText().substring(1, 2)!="41")&&(num.getText().substring(1, 2)!="42")&&(num.getText().substring(1, 2)!="44")
                   &&(num.getText().substring(1, 2)!="50")&&(num.getText().substring(1, 2)!="51") && (num.getText().substring(1, 2)!="52") &&(num.getText().substring(1, 2)!="53") &&(num.getText().substring(1, 2)!="54") &&(num.getText().substring(1, 2)!="55")  &&(num.getText().substring(1, 2)!="58")  
                   &&(num.getText().substring(1, 2)!="29") &&(num.getText().substring(1, 2)!="28") &&(num.getText().substring(1, 2)!="27")&&(num.getText().substring(1, 2)!="26") &&(num.getText().substring(1, 2)!="25") &&(num.getText().substring(1, 2)!="24") &&(num.getText().substring(1, 2)!="23") &&(num.getText().substring(1, 2)!="22")&&(num.getText().substring(1, 2)!="21")&&(num.getText().substring(1, 2)!="20") )
           {
              invalid.setText("Numéro est invalide");
            }
                }else {
                 Alert alert = new Alert (Alert.AlertType.ERROR);
                 alert.setContentText("Remplir Tous les cases s'il vous plaît ");
                 alert.show();
          
                 }
         
         
       
        
    }

    private boolean verifemail(String email) {
String e ="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
       Pattern em = Pattern.compile(e, Pattern.CASE_INSENSITIVE);
       Matcher matcher = em.matcher(email);
        return matcher.find();    }
    
}
