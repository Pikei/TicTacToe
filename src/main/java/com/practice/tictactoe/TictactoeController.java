package com.practice.tictactoe;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

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
    private Button start;
    @FXML
    private GridPane grid;

    private boolean gameActive;
    private boolean endGame = false;


    @FXML
    protected void onButton1Click() {
        if (button1.getText().isEmpty() && !endGame) {
            button1.setText("X");
            endGame = gameOver();
        }
    }

    @FXML
    protected void onButton2Click() {
        if (button2.getText().isEmpty() && !endGame) {
            button2.setText("X");
            endGame = gameOver();
        }
    }

    @FXML
    protected void onButton3Click() {
        if (button3.getText().isEmpty() && !endGame) {
            button3.setText("X");
            endGame = gameOver();
        }
    }

        @FXML
    protected void onButton4Click() {
        if (button4.getText().isEmpty() && !endGame) {
            button4.setText("X");
            endGame = gameOver();
        }
    }

    @FXML
    protected void onButton5Click() {
        if (button5.getText().isEmpty() && !endGame) {
            button5.setText("X");
            endGame = gameOver();
        }
    }

    @FXML
    protected void onButton6Click() {
        if (button6.getText().isEmpty() && !endGame) {
            button6.setText("X");
            endGame = gameOver();
        }
    }

        @FXML
    protected void onButton7Click() {
        if (button7.getText().isEmpty() && !endGame) {
            button7.setText("X");
            endGame = gameOver();
        }
    }

    @FXML
    protected void onButton8Click() {
        if (button8.getText().isEmpty() && !endGame) {
            button8.setText("X");
            endGame = gameOver();
        }
    }

    @FXML
    protected void onButton9Click() {
        if (button9.getText().isEmpty() && !endGame) {
            button9.setText("X");
            endGame = gameOver();
        }
    }

    @FXML
    protected void startButton() {
        start.setVisible(!gameActive);
        grid.setVisible(gameActive);
    }

    @FXML
    protected void onStartClick() {
        Button[] buttons = new Button[]{button1, button2, button3, button4, button5, button6, button7, button8, button9};
        for (Button button : buttons) {
            button.setText("");
            button.setStyle("-fx-background-color: white");
        }
        gameActive = true;
        endGame = false;
        startButton();
    }

    @FXML
    protected boolean gameOver() {
        Button[][] winningCombinations = {
                {button1, button2, button3},
                {button4, button5, button6},
                {button7, button8, button9},
                {button1, button4, button7},
                {button2, button5, button8},
                {button3, button6, button9},
                {button1, button5, button9},
                {button3, button5, button7}
        };
        for (Button[] combination : winningCombinations) {
            if (endCondition(combination[0], combination[1], combination[2], "X")) {
                for (Button button : combination) {
                    button.setStyle("-fx-background-color: green");
                    start.setVisible(true);
                }
                return true;

            } else if (endCondition(combination[0], combination[1], combination[2], "O")) {
                for (Button button : combination) {
                    button.setStyle("-fx-background-color: red");
                }
                return true;

            }
        }
        return false;
    }

    protected boolean endCondition(Button a, Button b, Button c, String s) {
        return a.getText().equals(s) && b.getText().equals(s) && c.getText().equals(s);
    }
}