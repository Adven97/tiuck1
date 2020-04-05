import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Simple calculator");
    System.out.println("-----------------------");
    System.out.println("Type first number");
    double first = scanner.nextDouble();
    System.out.println("Type second number");
    double second = scanner.nextDouble();

    System.out.println("What do you want to do?");
    System.out.println("-----------------------");
    System.out.println("Type 1 to do addition");
    System.out.println("Type 2 to do subtraction");
    System.out.println("Type 3 to do multiplication");
    System.out.println("Type 4 to do division");

    int userChoice = scanner.nextInt();

    switch (userChoice) {
      case 1:
        {
          showAddition(first, second);
          break;
        }
      case 2:
        {
          showSubtraction(first, second);
          break;
        }
      case 3:
        {
          showMultiplication(first, second);
          break;
        }
      case 4:
        {
          showDivision(first, second);
          break;
        }
      default:
        {
          System.out.println("No such action");
        }
    }
  }

  public static void showAddition(double firstNumber, double secondNumber) {
    double result = firstNumber + secondNumber;
    System.out.println("Result is " + result);
  }

  public static void showDivision(double firstNumber, double secondNumber) {
    double result = firstNumber + secondNumber;
    if (secondNumber != 0) {
      System.out.println("Result is " + result);
    } else {
      System.out.println("Can't divide by 0");
    }
  }

  public static void showMultiplication(double firstNumber, double secondNumber) {
    double result = firstNumber * secondNumber;
    System.out.println("Result is " + result);
  }

  public static void showSubtraction(double firstNumber, double secondNumber) {
    double result = firstNumber - secondNumber;
    System.out.println("Result is " + result);
  }
}
