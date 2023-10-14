module com.example.clubspd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clubspd to javafx.fxml;
    exports com.example.clubspd;
}