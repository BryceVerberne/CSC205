import java.io.*;
public class RecursionConsoleDriver
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("puzzleFormula(1) returns: " +
                Recursion.puzzleFormula(1));
        System.out.println("puzzleLoop(1) returns: " +
                Recursion.puzzleLoop(1));
        System.out.println("puzzleRecurse(1) returns: " +
                Recursion.puzzleRecurse(1));
        System.out.println("\npuzzleFormula(2) returns: " +
                Recursion.puzzleFormula(2));
        System.out.println("puzzleLoop(2) returns: " +
                Recursion.puzzleLoop(2));
        System.out.println("puzzleRecurse(2) returns: " +
                Recursion.puzzleRecurse(2));
        System.out.println("\npuzzleFormula(3) returns: " +
                Recursion.puzzleFormula(3));
        System.out.println("puzzleLoop(3) returns: " +
                Recursion.puzzleLoop(3));
        System.out.println("puzzleRecurse(3) returns: " +
                Recursion.puzzleRecurse(3));
        System.out.println("\npuzzleFormula(7) returns: " +
                Recursion.puzzleFormula(7));
        System.out.println("puzzleLoop(7) returns: " +
                Recursion.puzzleLoop(7));
        System.out.println("puzzleRecurse(7) returns: " +
                Recursion.puzzleRecurse(7));
    }
}