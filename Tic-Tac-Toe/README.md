# Tic-Tac-Toe

A multi-player Tic-Tac-Toe game implemented in Java, where two players can play against each other on the command line.

## Description

This Java program allows two players to play a game of Tic-Tac-Toe on the command line. It sets up a Tic-Tac-Toe board and takes user input for each player's move. The game continues until a winner is found or the game ends in a draw.

Programmers: Bryce Verberne, Jordan Haddad, Josh Tribble, and Khang Nguyen

Date: 06/10/2022

## Classes

- `TicTacToe.java`: The main class that extends the Board abstract class and handles the game logic.
- `Board.java`: An abstract class that defines the board structure and provides a method to print the board.

## Usage

1. Compile the Java classes (e.g., `javac TicTacToe.java Board.java`).
2. Run the compiled Java program (e.g.,`java TicTacToe`).
3. Follow the on-screen prompts to play the game with another player.

## Example
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
In the example, I demonstrate a sample Tic-Tac-Toe game between two players, where Player X wins by forming a diagonal line with their symbols.
