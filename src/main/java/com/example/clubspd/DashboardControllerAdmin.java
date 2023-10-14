package com.example.clubspd;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import java.io.IOException;
import java.io.InputStream;

public class DashboardControllerAdmin {
    @FXML
    private TextField nameField;
    @FXML
    private TextField rollNumberField;

    @FXML
    private TextField queryField;

    @FXML
    private Label loginStatus;

    @FXML
    protected void onRegisterForEventsButtonClick() {
//        String name = nameField.getText();
//        String rollNumber = rollNumberField.getText();
//
//        // Perform the registration logic here (e.g., save the data, show a confirmation).
//        showAlert("Registered for events:\nName: " + name + "\nRoll Number: " + rollNumber);
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("reg-admin.fxml"));
            VBox registrationLayout = loader.load();
            Stage registrationStage = new Stage();
            registrationStage.initModality(Modality.APPLICATION_MODAL);
            registrationStage.setTitle("Register for Events");
            registrationStage.setScene(new Scene(registrationLayout));
            registrationStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onViewNoticesButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("notices-admin.fxml"));
            VBox registrationLayout = loader.load();
            Stage registrationStage = new Stage();
            registrationStage.initModality(Modality.APPLICATION_MODAL);
            registrationStage.setTitle("Register for Events");
            registrationStage.setScene(new Scene(registrationLayout));
            registrationStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onClubPreviousProjectsButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("projects-admin.fxml"));
            VBox registrationLayout = loader.load();
            Stage registrationStage = new Stage();
            registrationStage.initModality(Modality.APPLICATION_MODAL);
            registrationStage.setTitle("Register for Events");
            registrationStage.setScene(new Scene(registrationLayout));
            registrationStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onAskQueryButtonClick() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("query-admin.fxml"));
            VBox queryLayout = loader.load();
            Stage queryStage = new Stage();
            queryStage.initModality(Modality.APPLICATION_MODAL);
            queryStage.setTitle("Ask a Query");
            queryStage.setScene(new Scene(queryLayout));
            queryStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}