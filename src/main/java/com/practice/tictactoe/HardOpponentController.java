package com.practice.tictactoe;

import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;

public class HardOpponentController extends OpponentController {

    Button[][] winningCombinations = {
            {buttons[0], buttons[1], buttons[2]},
            {buttons[3], buttons[4], buttons[5]},
            {buttons[6], buttons[7], buttons[8]},
            {buttons[0], buttons[3], buttons[6]},
            {buttons[1], buttons[4], buttons[7]},
            {buttons[2], buttons[5], buttons[8]},
            {buttons[0], buttons[4], buttons[8]},
            {buttons[2], buttons[4], buttons[6]}
    };

    public HardOpponentController(boolean gameOver, Button[] buttons) {
        super(gameOver, buttons);
    }

    @Override
    void checkArea() {
        if (gameOver) return;
        List<Button> possibleMoves = new ArrayList<>();
        for (Button button : buttons) {
            if (button.getText().isEmpty()) {
                possibleMoves.add(button);
            }
        }
        //temporary solution not working
        for (Button button : possibleMoves) {
            button.setText("O");
            for (Button[] combination : winningCombinations) {
                if (winCondition(combination[0], combination[1], combination[2], "O")) {
                    System.out.println("opponent wins!");
                    return;
                } else {
                    button.setText("");
                }
            }
        }
    }

    private boolean winCondition(Button a, Button b, Button c, String s) {
        return a.getText().equals(s) && b.getText().equals(s) && c.getText().equals(s);
    }
}
