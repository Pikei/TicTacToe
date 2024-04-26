module com.practice.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.practice.tictactoe to javafx.fxml;
    exports com.practice.tictactoe;
}