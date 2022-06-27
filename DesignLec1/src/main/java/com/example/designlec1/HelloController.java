package com.example.designlec1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class HelloController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Button button;

    @FXML
    private TextField username;

    @FXML
    private TextField fullName;

    @FXML
    private PasswordField password;

    @FXML
    private Label wrongLogin;

    @FXML
    private Button loadLoginForm;

    @FXML
    private Button loadRegistrationForm;

//    public void userLogin(ActionEvent event)
//    {
//        checkLogin();
//    }

    public void checkLogin(ActionEvent event) throws IOException
    {

        if (username.getText().isEmpty() || password.getText().isEmpty() || fullName.getText().isEmpty())
        {
            wrongLogin.setText("Data Missing...");
        }
        else
        {
            wrongLogin.setText("Login Success!");

            Parent root = FXMLLoader.load(getClass().getResource("LoginForm.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
        }

    }



    public void switchToRegistrationForm(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("RegistrationForm.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

    }

    public void switchToLoginForm(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("LoginForm.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

    }



}