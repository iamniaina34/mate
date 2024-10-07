module org.iamniaina34.mate {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.iamniaina34.mate to javafx.fxml;
    exports org.iamniaina34.mate;
}