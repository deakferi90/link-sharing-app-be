module com.deakferi {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.deakferi to javafx.fxml;
    exports com.deakferi;
}
