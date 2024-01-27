import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;
        while (condition) {

            System.out.println("Enter your number below:");
            int menuNumber = scanner.nextInt();
            printMenu();
            int result = 1;
            switch (menuNumber) {
                case 0:
                    condition = false;
                    System.out.println("Thanks for using our calculator and have a nice day!");
                    break;
                case 1:
                    int[] numbers = inputNumbers(2, scanner);
                    result = addition(numbers);
                    break;
                case 2:
                    inputNumbers(2, scanner);
                    subtraction();
                    break;
                case 3:
                    inputNumbers(2, scanner);
                    multiplication();
                    break;
                case 4:
                    inputNumbers(2, scanner);
                    division();
                    break;
                case 5:
                    inputNumbers(1, scanner);
                    square();
                    break;
                default:
                    System.out.println("Please select numbers from menu");

            }
            System.out.println("Result: " + result);
        }


    }

    public static int addition(int[] n1) {
        int result = n1[0] + n1[1];
        return result;
    }

    public static int subtraction(int[] n1) {
        int result = n1[0] - n1[1];
        System.out.println("Result: " + result);
        return result;
    }

    public static int multiplication(int[] n1) {
        int result = n1[0] * n1[1];
        System.out.println("Result: " + result);
        return result;
    }

    public static int division(int[] n1) {
        int result = n1[0] / n1[1];
        System.out.println("Result: " + result);
        return result;
    }

    public static int square(int[] n1) {
        int result = n1[0] * n1[0];
        System.out.println("Result: " + result);
        return result;

    }
    public static void printMenu(){
        System.out.println("Calculator menu:");
        System.out.println("For addition press 1");
        System.out.println("For subtraction press 2");
        System.out.println("For multiplication press 3");
        System.out.println("For division press 4");
        System.out.println("For square press 5");
    }
    public static int[] inputNumbers(int numberCount, Scanner scanner){
        System.out.printf("Please enter %d number(s)", numberCount);
        int[] myArray = new int[numberCount];
        for (int i = 0; i < numberCount; i++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }
}
