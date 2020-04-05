import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple calculator");
        System.out.println("What do you want to do?");

        System.out.println("Type 1 to do addition");
        System.out.println("Type 2 to do subtraction");
        System.out.println("Type 3 to do multiplication");
        System.out.println("Type 4 to do division");

        int userChoice = scanner.nextInt();

        System.out.println("Type first number");
        double first = scanner.nextDouble();
        System.out.println("Type second number");
        double second = scanner.nextDouble();

        switch (userChoice){
            case 1:{
                System.out.println("Result is "+add(first, second));
            }
            case 2:{
                System.out.println("Result is "+subtract(first, second));
            }
            case 3:{
                System.out.println("Result is "+multiply(first, second));
            }
            case 4:{
                System.out.println("Result is "+divide(first, second));
            }
        }

    }

    public static double add(double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }

    public static double divide(double firstNumber, double secondNumber){
        if(secondNumber != 0){
            return firstNumber / secondNumber;
        }
        return 0;
    }

    public static double multiply(double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }

    public static double subtract(double firstNumber, double secondNumber){
        return firstNumber - secondNumber;
    }
}
