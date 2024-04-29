package com.practice.tictactoe;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class TicTacToeController {

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
    @FXML
    private Pane difficulty;
    @FXML
    private RadioButton easyRadioBtn;
    @FXML
    private RadioButton hardRadioBtn;
    @FXML
    private Label winLabel;
    private OpponentController opponentController;
    private boolean gameActive;
    private boolean difficultySelected = false;


    @FXML
    protected void onButton1Click() {
        if (button1.getText().isEmpty() && !gameOver()) {
            button1.setText("X");
            opponentController.setGameOver(gameOver());
            opponentController.checkArea();
            opponentController.setGameOver(gameOver());
        }
    }

    @FXML
    protected void onButton2Click() {
        if (button2.getText().isEmpty() && !gameOver()) {
            button2.setText("X");
            opponentController.setGameOver(gameOver());
            opponentController.checkArea();
            opponentController.setGameOver(gameOver());
        }
    }

    @FXML
    protected void onButton3Click() {
        if (button3.getText().isEmpty() && !gameOver()) {
            button3.setText("X");
            opponentController.setGameOver(gameOver());
            opponentController.checkArea();
            opponentController.setGameOver(gameOver());
        }
    }

        @FXML
    protected void onButton4Click() {
        if (button4.getText().isEmpty() && !gameOver()) {
            button4.setText("X");
            opponentController.setGameOver(gameOver());
            opponentController.checkArea();
            opponentController.setGameOver(gameOver());
        }
    }

    @FXML
    protected void onButton5Click() {
        if (button5.getText().isEmpty() && !gameOver()) {
            button5.setText("X");
            opponentController.setGameOver(gameOver());
            opponentController.checkArea();
            opponentController.setGameOver(gameOver());
        }
    }

    @FXML
    protected void onButton6Click() {
        if (button6.getText().isEmpty() && !gameOver()) {
            button6.setText("X");
            opponentController.setGameOver(gameOver());
            opponentController.checkArea();
            opponentController.setGameOver(gameOver());
        }
    }

        @FXML
    protected void onButton7Click() {
        if (button7.getText().isEmpty() && !gameOver()) {
            button7.setText("X");
            opponentController.setGameOver(gameOver());
            opponentController.checkArea();
            opponentController.setGameOver(gameOver());
        }
    }

    @FXML
    protected void onButton8Click() {
        if (button8.getText().isEmpty() && !gameOver()) {
            button8.setText("X");
            opponentController.setGameOver(gameOver());
            opponentController.checkArea();
            opponentController.setGameOver(gameOver());
        }
    }

    @FXML
    protected void onButton9Click() {
        if (button9.getText().isEmpty() && !gameOver()) {
            button9.setText("X");
            opponentController.setGameOver(gameOver());
            opponentController.checkArea();
            opponentController.setGameOver(gameOver());
        }
    }

    @FXML
    protected void startButton() {
        if (difficultySelected) {
            start.setVisible(!gameActive);
            grid.setVisible(gameActive);
            difficulty.setVisible(!gameActive);
        } else {
            start.setVisible(true);
            grid.setVisible(false);
            difficulty.setVisible(true);
        }
    }

    @FXML
    protected void onStartClick() {
        Button[] buttons = new Button[]{button1, button2, button3, button4, button5, button6, button7, button8, button9};
        winLabel.setVisible(false);
        difficultySelected = easyRadioBtn.isSelected() || hardRadioBtn.isSelected();
        if (easyRadioBtn.isSelected()) {
                opponentController = new EasyOpponentController(gameOver(), buttons);
        } else if (hardRadioBtn.isSelected()) {
                opponentController = new HardOpponentController(gameOver(), buttons);
        }
        easyRadioBtn.setSelected(false);
        hardRadioBtn.setSelected(false);
        for (Button button : buttons) {
            button.setText("");
            button.setStyle("-fx-background-color: white");
        }
        gameActive = true;
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
            if (winCondition(combination[0], combination[1], combination[2], "X")) {
                win(combination);
                return true;

            } else if (winCondition(combination[0], combination[1], combination[2], "O")) {
                lose(combination);
                return true;
            }
        }
        return tie();
    }

    private void win(Button[] combination) {
        for (Button button : combination) {
            button.setStyle("-fx-background-color: green");
        }
        start.setVisible(true);
        winLabel.setVisible(true);
        winLabel.setText("You win!");
        winLabel.setAlignment(Pos.CENTER);
    }

    private void lose(Button[] combination) {
        for (Button button : combination) {
            button.setStyle("-fx-background-color: red");
            start.setVisible(true);
        }
        start.setVisible(true);
        winLabel.setVisible(true);
        winLabel.setText("Opponent wins!");
        winLabel.setAlignment(Pos.CENTER);
    }

    private boolean tie() {
        Button[] buttons = new Button[]{button1, button2, button3, button4, button5, button6, button7, button8, button9};
        int count = 0;
        for (Button button : buttons) {
            if (!button.getText().isEmpty()) count++;
        }
        if (count == 9) {
            start.setVisible(true);
            winLabel.setVisible(true);
            winLabel.setText("Tie!");
            winLabel.setAlignment(Pos.CENTER);
            return true;
        }
        return false;
    }

    private boolean winCondition(Button a, Button b, Button c, String s) {
        return a.getText().equals(s) && b.getText().equals(s) && c.getText().equals(s);
    }
}