# Tic-Tac-Toe

A multi-player Tic-Tac-Toe game implemented in Java, where two players can play against each other on the command line.

## Description

This Java implementation of the classic game [Tic-Tac-Toe](https://en.wikipedia.org/wiki/Tic-tac-toe) provides a simple and intuitive command-line interface for two players to engage in a friendly match. The program sets up a 3x3 Tic-Tac-Toe board and takes input from both players, who alternate marking their symbols (X or O) on the board. The game features error handling for invalid inputs and checks for a win or draw after each move. The game continues until one player wins by aligning three of their symbols in a row, column, or diagonal, or the board is filled, resulting in a draw. After each game, players can choose to start a new match.

## Classes

- **TicTacToe**: `TicTacToe.java` is the main class that extends the Board abstract class and handles the game logic.
- **Board**: `Board.java` is an abstract class that defines the board structure and provides a method to print the board.

## Usage

1. Compile the Java classes (e.g., `javac TicTacToe.java Board.java`).
2. Run the compiled Java program (e.g.,`java TicTacToe`).
3. Follow the on-screen prompts to play the game with another player.

## Example

In the example, I demonstrate a sample Tic-Tac-Toe game between two players, where Player X wins by forming a diagonal line with their symbols.

```plaintext
Welcome to Multi-Player Tic-Tac-Toe!!!
--------------------------------------
/---|---|---\
| 1 | 2 | 3 |
|-----------|
| 4 | 5 | 6 |
|-----------|
| 7 | 8 | 9 |
\---|---|---/

X plays first. Enter a space number to place X in:
1

/---|---|---\
| X | 2 | 3 |
|-----------|
| 4 | 5 | 6 |
|-----------|
| 7 | 8 | 9 |
\---|---|---/

O's turn; Enter a space number to place O in:
5

/---|---|---\
| X | 2 | 3 |
|-----------|
| 4 | O | 6 |
|-----------|
| 7 | 8 | 9 |
\---|---|---/

X's turn; Enter a space number to place X in:
9

/---|---|---\
| X | 2 | 3 |
|-----------|
| 4 | O | 6 |
|-----------|
| 7 | 8 | X |
\---|---|---/

Congratulations! X's have won! Thanks for playing.

Do you want to do the greatest rematch of all time?
no
```
