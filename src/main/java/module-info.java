module calculator10 {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    exports org.example.calculator10;
    opens org.example.calculator10 to javafx.fxml;
}