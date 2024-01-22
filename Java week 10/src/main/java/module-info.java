module com.example.java_week_10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_week_10 to javafx.fxml;
    exports com.example.java_week_10;
}