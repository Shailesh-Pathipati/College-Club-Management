package com.example.clubspd;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class HelloController {

    @FXML
    private TextField usernameField;

    @FXML
    private TextField adminuserField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField adminpasswordField;

    @FXML
    private Label loginStatus;

    @FXML
    protected void onLoginButtonClick() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // In this simplified example, assume login is always successful
        loadDashboardPage();
    }

    @FXML
    protected void onAdminLoginButtonClick() {
        String username = adminuserField.getText();
        String password = adminpasswordField.getText();

        // In this simplified example, assume admin login is always successful
        loadDashboardPage2();
    }

    // Helper method to load the user dashboard page
    private void loadDashboardPage() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dashboard-view.fxml"));
            Pane dashboardPane = fxmlLoader.load();
            Scene scene = new Scene(dashboardPane, 640, 480);
            Stage stage = (Stage) usernameField.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("User Dashboard");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Helper method to load the admin dashboard page
    private void loadDashboardPage2() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dashboard-admin.fxml"));
            Pane dashboardPane = fxmlLoader.load();
            Scene scene = new Scene(dashboardPane, 640, 480);
            Stage stage = (Stage) adminuserField.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Admin Dashboard");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


