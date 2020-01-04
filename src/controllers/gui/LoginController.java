package controllers.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class LoginController implements Initializable{
    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handletxtUsuario(ActionEvent event){
        System.exit(0);
    }

    @FXML
    private void handletxtPassword(ActionEvent event){
        System.exit(0);
    }

    @FXML
    private void handleBtnAcceder(ActionEvent event){
        System.exit(0);
    }

    @FXML
    private void handleBtnSalir(ActionEvent event){
        System.exit(0);
    }
}
