module com.example.task3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.task3 to javafx.fxml;
    exports com.example.task3;
}