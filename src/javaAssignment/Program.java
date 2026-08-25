package javaAssignment;
import java.util.Scanner;

public class Program {

     // Prints the numbers from 10 down to 1.
     public static void printNumbersDescending() {
        for (int number = 10; number >= 1; number--) {
            System.out.println(number);
        }
    }
     // Prints numbers from 1 to 10 and shows whether each number is even or odd.
     public static void printEvenOrOdd() {
        for (int number = 1; number <= 10; number++) {
            if (number % 2 == 0) {
                System.out.println(number + " -> Even");
            } else {
                System.out.println(number + " -> Odd");
            }
        }
    }
     // Checks the type of number based on its value.
    public static String checkNumberType(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }
     // Adds two numbers together and returns their sum.
    public static int calculateSum(int number1, int number2) {
        return number1 + number2;
    }
        static void main( ) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=========================");
            System.out.println("Number Analyzer Menu");
            System.out.println("=========================");
            System.out.println("1 - Print Numbers 10 to 1");
            System.out.println("2 - Print Even/Odd Report");
            System.out.println("3 - Check Number Type");
            System.out.println("4 - Calculate Sum Between Two Numbers");
            System.out.println("5 - Exit");
            System.out.println("=========================");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printNumbersDescending();
                    break;
                case 2:
                    printEvenOrOdd();
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();
                    String result = checkNumberType(number);
                    System.out.println(result);
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    int number1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int number2 = scanner.nextInt();
                    int sum = calculateSum(number1, number2);
                    System.out.println("Sum = " + sum);
                    break;
                case 5:
                    System.out.println("Thank you for using Number Analyzer.");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 5);
        scanner.close();
    }
}