module com.example.designlec1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.designlec1 to javafx.fxml;
    exports com.example.designlec1;
}