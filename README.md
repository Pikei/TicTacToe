# Tic-Tac-Toe
This is project of tic-tac-toe game using **JavaFX** and **FXML**.
Content about to change

### Assumptions
1. game is for one player
2. there is two modes to play: easy and hard
3. easy mode is simply choosing random area
4. hard mode is implementation of minimax method
5. after each game player is choosing level of difficulty
6. game stops if one of players wins or there is a tie


### Code
_Source code is inside [src/main/java/com.practice.tictactoe](https://github.com/Pikei/TicTacToe/blob/f8b50543c75291a2c5c2d652bf492ec35ef3a462/src/main/java/com/practice/tictactoe)_

_Layout is inside [src/main/resources/com.practice.tictactoe](https://github.com/Pikei/TicTacToe/tree/f8b50543c75291a2c5c2d652bf492ec35ef3a462/src/main/resources/com/practice/tictactoe)_
1. [TicTacToeApplication](https://github.com/Pikei/TicTacToe/blob/f8b50543c75291a2c5c2d652bf492ec35ef3a462/src/main/java/com/practice/tictactoe/TicTacToeApplication.java) - this is a entry point of application.
2. [TicTacToeController](https://github.com/Pikei/TicTacToe/blob/f8b50543c75291a2c5c2d652bf492ec35ef3a462/src/main/java/com/practice/tictactoe/TicTacToeController.java) - this class dictates how game works
3. [OpponentController](https://github.com/Pikei/TicTacToe/blob/f8b50543c75291a2c5c2d652bf492ec35ef3a462/src/main/java/com/practice/tictactoe/OpponentController.java) - abstract class, blueprint to easy and hard opponent
4. [EasyOpponentController](https://github.com/Pikei/TicTacToe/blob/f8b50543c75291a2c5c2d652bf492ec35ef3a462/src/main/java/com/practice/tictactoe/EasyOpponentController.java) - basic opponent, selecting random areas, if possible until one of players wins or there is a tie.
5. [HardOpponentController](https://github.com/Pikei/TicTacToe/blob/f8b50543c75291a2c5c2d652bf492ec35ef3a462/src/main/java/com/practice/tictactoe/HardOpponentController.java) - **(content about to be changed)** this class will implement minimax algorithm to choose the best area
6. [tictactoe-view](https://github.com/Pikei/TicTacToe/blob/f8b50543c75291a2c5c2d652bf492ec35ef3a462/src/main/resources/com/practice/tictactoe/tictactoe-view.fxml) - this is a layout file