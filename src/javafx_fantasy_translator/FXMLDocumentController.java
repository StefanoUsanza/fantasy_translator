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
    private ImageView imTraduzione;
    @FXML
    private HBox hbContainer;

    private Image image;
    private String name = "elf";
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       cmLingue.getItems().addAll(
               "Draconico",
               "Elfico",
               "Nanico"
       );
       Image image = new Image(name +".png");
       imTraduzione.setImage(image);
    }

}


