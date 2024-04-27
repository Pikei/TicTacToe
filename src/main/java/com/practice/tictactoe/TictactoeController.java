package com.practice.tictactoe;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TictactoeController {

    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;


    @FXML
    protected void onButton1Click() {
        if (button1.getText().isEmpty()) {
            button1.setText("X");
        }
    }

    @FXML
    protected void onButton2Click() {
        if (button2.getText().isEmpty()) {
            button2.setText("X");
        }
    }

    @FXML
    protected void onButton3Click() {
        if (button3.getText().isEmpty()) {
            button3.setText("X");
        }
    }

        @FXML
    protected void onButton4Click() {
        if (button4.getText().isEmpty()) {
            button4.setText("X");
        }
    }

    @FXML
    protected void onButton5Click() {
        if (button5.getText().isEmpty()) {
            button5.setText("X");
        }
    }

    @FXML
    protected void onButton6Click() {
        if (button6.getText().isEmpty()) {
            button6.setText("X");
        }
    }

        @FXML
    protected void onButton7Click() {
        if (button7.getText().isEmpty()) {
            button7.setText("X");
        }
    }

    @FXML
    protected void onButton8Click() {
        if (button8.getText().isEmpty()) {
            button8.setText("X");
        }
    }

    @FXML
    protected void onButton9Click() {
        if (button9.getText().isEmpty()) {
            button9.setText("X");
        }
    }

    @FXML
    protected void onStartClick() {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
    }
}