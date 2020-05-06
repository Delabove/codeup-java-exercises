import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        System.out.println(addition(1, 2));
        System.out.println(subtraction(1, 2));
        System.out.println(multiplication(1, 2));
        System.out.println(division(4, 2));
        System.out.println(modulus(4, 2));
//        System.out.println(divideByZero(4, 0));
        System.out.println(getInteger(1, 10));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        long userInput = scanner.nextInt();
        System.out.println("You Entered " + userInput);

        long i,fact=1;
        long number=5;//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
            if(i <= userInput && number >= userInput){
                System.out.println("Factorial of "+number+" is: "+fact);
            }
        }

    }



//Create four separate methods. Each will perform an arithmetic operation:
//
//Addition

    public static int addition(int a, int b) {
        return a + b;
    }

    //Subtraction
    public static int subtraction(int a, int b) {
        return a - b;
    }

    //Multiplication
    public static int multiplication(int a, int b) {
        return a * b;
    }

    //Division
    public static int division(int a, int b) {
        return a / b;
    }

    //Modulus
    public static int modulus(int a, int b) {
        return a % b;
    }

    //Division
    public static int divideByZero(int a, int b) {
        return a / b;
    }


//    Create a method that validates that user input is in a certain range
//    The method signature should look like this:
//    public static int getInteger(int min, int max);
//    and is used like this:
//            System.out.print("Enter a number between 1 and 10: ");
//    int userInput = getInteger(1, 10);
//    If the input is invalid, prompt the user again.
//    Hint: recursion might be helpful here!


    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();

        if (min <= userInput && max >= userInput) {

            System.out.println("Your number was within range!");

        } else {

            System.out.println("Please re-enter a valid number.");

//        getInteger(min, max);
            userInput = getInteger(min, max);
        }

        return userInput;

    }
//
//    public static int factorial(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = scanner.nextInt();
//        System.out.println("You Entered " + userInput);
//
//        int i, fact = 1;
//        int number = 10;//It is the number to calculate factorial
//        for (i = 1; i <= number; i++) {
//            fact = fact * i;
//        }
//        return userInput;
//
//    }


}






