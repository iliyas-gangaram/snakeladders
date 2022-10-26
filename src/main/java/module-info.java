module com.example.snakeladders {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snakeladders to javafx.fxml;
    exports com.example.snakeladders;
}