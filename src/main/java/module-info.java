module dev.lpa.udemy422hboxlayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.lpa.udemy422hboxlayout to javafx.fxml;
    exports dev.lpa.udemy422hboxlayout;
}