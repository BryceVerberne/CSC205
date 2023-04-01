# Recursion Graphic Display

A Java program that demonstrates the use of recursion, loops, and a direct formula to solve a problem and display the result graphically.

## Description

This program, composed of three classes, calculates the number of squares in a pattern using a formula, loop, and recursion. The console-based and graphical outputs are provided by `Assignment5RecursionConsoleDriver` and `Assignment5RecursionGraphicDriver` classes, respectively.

## Classes

- **Assignment5Recursion**: The `Assignment5Recursion.java` class contains the methods for solving the problem using the formula, loop, and recursion techniques.
- **Assignment5RecursionConsoleDriver**: The `Assignment5RecursionConsoleDriver.java` class is a console-based driver that calls the methods in the Assignment5Recursion class and displays the results.
- **Assignment5RecursionGraphicDriver**: The `Assignment5RecursionGraphicDriver.java` class is a graphical driver that creates a JFrame with input fields and a panel to display the pattern.

## Usage

1. Compile the Java Classes (e.g., `javac Assignment5Recursion.java Assignment5RecursionConsoleDriver.java Assignment5RecursionGraphicDriver.java`).
2. Run `Assignment5RecursionConsoleDriver.java` to see console results for various n values using formula, loop, and recursion methods.
3. Run `Assignment5RecursionGraphicDriver.java`, input n in "Iteration" field, click "Graph" to display pattern and method results.

## Example

When running the Assignment5RecursionConsoleDriver, you will see the following output:

```plaintext
puzzleFormula(1) returns: 5
puzzleLoop(1) returns: 5
puzzleRecurse(1) returns: 5

puzzleFormula(2) returns: 13
puzzleLoop(2) returns: 13
puzzleRecurse(2) returns: 13

puzzleFormula(3) returns: 25
puzzleLoop(3) returns: 25
puzzleRecurse(3) returns: 25

puzzleFormula(7) returns: 113
puzzleLoop(7) returns: 113
puzzleRecurse(7) returns: 113
```
The output displays problem results for n values (1, 2, 3, 7) using formula, loop, and recursion methods. Identical results across methods confirm their correctness in solving the problem.
