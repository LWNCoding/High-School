import java.util.*;

/**
 * This program calculates the value of an expression consisting of numbers,
 * arithmetic operators, and parentheses.
 */
public class SimpleCalculator {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter an expression: ");
    // 3+4*5 23
    // (3+4)*5 35
    // (4+5)-5*3 -6
    // (3+4)*(5+6) 77
    // (3*(4+5)-2)/5 5
    // 2*3*4-9/3 21

    String input = in.nextLine().trim();
    Evaluator e = new Evaluator(input);
    int value = e.getExpressionValue();
    System.out.println(input + " = " + value);
  }
}
