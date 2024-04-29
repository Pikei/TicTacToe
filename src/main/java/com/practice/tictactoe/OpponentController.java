package com.practice.tictactoe;

import javafx.scene.control.Button;

public abstract class OpponentController {
    boolean gameOver;
    Button[] buttons;

    public OpponentController(boolean gameOver, Button[] buttons) {
        this.gameOver = gameOver;
        this.buttons = buttons;
    }

    abstract void checkArea();

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
}
