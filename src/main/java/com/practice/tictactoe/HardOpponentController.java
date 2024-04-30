package com.practice.tictactoe;

import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.Arrays;
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
        String[][] currentBoard = {
                {buttons[0].getText(), buttons[1].getText(), buttons[2].getText()},
                {buttons[3].getText(), buttons[4].getText(), buttons[5].getText()},
                {buttons[6].getText(), buttons[7].getText(), buttons[8].getText()}
        };
        move(currentBoard, "O");
    }

    private void move(String[][] currentBoard, String s) {
        List<int[]> possibleMoves = new ArrayList<>();
        for (int i = 0; i < currentBoard.length; i++) {
            for (int j = 0; j < currentBoard[i].length; j++) {
                if (currentBoard[i][j].isEmpty()) {
                    possibleMoves.add(new int[]{i, j});
                }
            }
        }

//        String[][] futureBoard = new String[3][3];
//        Arrays.setAll(futureBoard, i -> Arrays.copyOf(currentBoard[i], 3));
//        for (int[] coordinate : possibleMoves) {
//            futureBoard[coordinate[0]][coordinate[1]] = s;
//            move(futureBoard, s.equals("O")?"X":"O");
//            System.out.println();
//        }
    }

    private void win(String[][] currentBoard) {

    }

    private boolean winCondition(String a, String b, String c, String s) {
        return a.equals(s) && b.equals(s) && c.equals(s);
    }
}

