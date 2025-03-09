// Java code for a simple calculator application
import javax.swing.*;

public class Calculator {
  public static void main(String[] args) {
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number:"));
    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number:"));
    String operator = JOptionPane.showInputDialog("Enter an operation (+, -, x, /):");
    switch (operator) {
      case "+":
        System.out.println("Sum: " + (num1 + num2));
        break;
      case "-":
        System.out.println("Difference: " + (num1 - num2));
        break;
      case "*":
        System.out.println("Product: " + (num1 * num2));
        break;
      case "/":
        if (num2 == 0) {
          JOptionPane.showMessageDialog(null, "Cannot divide by zero!");
        } else {
          System.out.println("Quotient: " + (num1 / num2));
        }
        break;
      default:
        JOptionPane.showMessageDialog(null, "Invalid operator");
    }
  }
}
