/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafx_fantasy_translator;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button btnTranslate;
    @FXML
    private ComboBox<String> cmLingue;
    @FXML
    private TextField fieldTesto;
    @FXML
    private HBox hbContainer;

    private Image image;
    @FXML
    private ImageView imTraduzione0;
    private ImageView imTraduzione[] = new ImageView[10];
    @FXML
    private ImageView imTraduzione1;
    @FXML
    private ImageView imTraduzione2;
    @FXML
    private ImageView imTraduzione3;
    @FXML
    private ImageView imTraduzione4;
    @FXML
    private ImageView imTraduzione5;
    @FXML
    private ImageView imTraduzione6;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
            imTraduzione[0]=imTraduzione0;
            imTraduzione[1]=imTraduzione1;
            imTraduzione[2]=imTraduzione2;
            imTraduzione[3]=imTraduzione3;
        
       cmLingue.getItems().addAll(
               "Draconico",
               "Elfico",
               "Nanico"
       );
    }

    @FXML
    private void Action_traduci(ActionEvent event) {
        String s = fieldTesto.getText();
        for (int i=0; i<s.length(); i++){
            Image image = new Image("images/" +s.charAt(i) +".png");
            imTraduzione[i].setImage(image);
        }
    }

}


