module com.practice.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.practice.tictactoe to javafx.fxml;
    exports com.practice.tictactoe;
}