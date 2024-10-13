import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2, addResult, subtResult, multiplResult, divisionResult;


        System.out.print("Enter first number: ");
        while (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            input.next();
        }
        n1 = input.nextDouble();
        System.out.print("Enter second number: ");
        while (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            input.next();
        }
        n2 = input.nextDouble();

        while (true) {
            System.out.print("\nAddition(1)\nSubtraction(2)\nMultiplication(3)\nDivision(4)\nExit(5)\n");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            if (choice > 5 || choice < 1) {
                System.out.println("You entered an invalid number");
                continue;
            }
            switch (choice) {
                case 1:
                    addResult = n1 + n2;
                    System.out.println("Result: " + addResult);
                    break;
                case 2:
                    subtResult = n1 - n2;
                    System.out.println("Result: " + subtResult);
                    break;
                case 3:
                    multiplResult = n1 * n2;
                    System.out.println("Result: " + multiplResult);
                    break;
                case 4:
                    System.out.println("Which number should be division? (1)-(2)");
                    int enter = input.nextInt();
                    if (enter <= 0 || enter > 2) {
                        System.out.println("You entered an invalid number");
                    } else {
                        if (enter == 1) {
                            if (n1 == 0) {
                                System.out.println("Your number must be greater than 0 ");
                            } else {
                                divisionResult = n2 / n1;
                                System.out.println("Result: " + divisionResult);
                            }
                        } else {
                            if (n2 == 0) {
                                System.out.println("Your number must be greater than 0 ");
                            } else {
                                divisionResult = n1 / n2;
                                System.out.println("Result: " + divisionResult);
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting..");
                    input.close();
                    return;
            }
            System.out.println("Do you want to continue? Press 'Y' or 'N'");
            String c1 = input.next();
            if (c1.equalsIgnoreCase("N")) {
                System.out.println("Exiting..");
                break;
            }
        }
    }
}