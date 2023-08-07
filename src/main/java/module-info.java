module com.example.htmlcss {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.htmlcss to javafx.fxml;
    exports com.example.htmlcss;
}