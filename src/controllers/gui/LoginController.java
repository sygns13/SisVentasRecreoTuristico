package controllers.gui;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

import GUI.mdiPrincipal.DrapoDashboard;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import serviceImp.service.InicioSesionServiceImp;

import javax.swing.*;

public class LoginController implements Initializable{

    InicioSesionServiceImp iniciosesion = new InicioSesionServiceImp();
    DrapoDashboard FrmPrincipal = new DrapoDashboard();

    @FXML
    private Label label;

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtPassword;

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
    private void handleBtnAcceder(ActionEvent event){
        acceder();
    }

    @FXML
    private void handleBtnSalir(ActionEvent event){
        System.exit(0);
    }

    public void handletxtPassword(KeyEvent evt) {
        if (evt.getCode() == KeyCode.ENTER) {
            if (txtPassword.getText().trim().length() > 0) {
                if(acceder()){
                    Stage stage = (Stage)((Node)(evt.getSource())).getScene().getWindow();
                    stage.close();
                    //((Node)(evt.getSource())).getScene().getWindow().hide();
                }

            }
        }
    }

    public void handletxtUsuario(KeyEvent evt) {
        if (evt.getCode() == KeyCode.ENTER && txtUsuario.getText().trim().length() > 0) {
            txtPassword.requestFocus();
        }
    }

    public void handleBtnAccederEnter(KeyEvent evt) {
        if (evt.getCode() == KeyCode.ENTER) {
            if (txtPassword.getText().trim().length() > 0) {
                if(acceder()){
                    Stage stage = (Stage)((Node)(evt.getSource())).getScene().getWindow();
                    stage.close();
                    //((Node)(evt.getSource())).getScene().getWindow().hide();
                }
            }
        }
    }

    public void handleBtnSalirEnter(KeyEvent evt) {
        if (evt.getCode() == KeyCode.ENTER) {
            if (txtPassword.getText().trim().length() > 0) {
                System.exit(0);
            }
        }
    }


    private boolean acceder()
    {
        boolean b=false;
        HashMap<String, String> resultado = iniciosesion.controlAcceso(txtUsuario.getText(),txtPassword.getText());

        //JOptionPane.showMessageDialog(null,resultado.get("msj"));

        if(resultado.get("key").equals("1")){
            b=true;
           // FrmPrincipal.start(miE);
            System.out.println("resultado = " + resultado.get("msj"));

            try {
                Stage stage= new Stage();
                FrmPrincipal.start(stage);

            }catch (Exception e)
            {

                System.out.println("e = " + e);
            }
        }else
        {
            JOptionPane.showMessageDialog(null,resultado.get("msj"));
        }
    return b;
    }
}
