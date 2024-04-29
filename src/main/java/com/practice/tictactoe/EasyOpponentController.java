package com.practice.tictactoe;

import javafx.scene.control.Button;

import java.util.Random;

public class EasyOpponentController extends OpponentController {

    public EasyOpponentController(boolean gameOver, Button[] buttons) {
        super(gameOver, buttons);
    }

    @Override
    void checkArea() {
        if (gameOver) return;
        Random random = new Random();
        while(true) {
            int temp = random.nextInt(9);
            if (buttons[temp].getText().isEmpty()) {
                buttons[temp].setText("O");
                break;
            }
        }
    }
}
