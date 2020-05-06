

import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(1, 2));
//        System.out.println(multiplication(1, 2));
//        System.out.println(division(4, 2));
//        System.out.println(modulus(4, 2));
////        System.out.println(divideByZero(4, 0));
//        System.out.println(getInteger(1, 10));
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        long userInput = scanner.nextInt();
//        System.out.println("You Entered " + userInput);
        System.out.println("How many sides of the dice? ");
        System.out.println(rollOfTheDice());


//        factorial test
//
//        while(true){
//            System.out.println("factorial test");
//            factorial();
//            System.out.println("Do you wish to continue? y/n");
//            String answer = scanner.nextLine();
//            if(answer.toLowerCase().equals("n")) {
//                break;
//            }
//        }
    }


//Create four separate methods. Each will perform an arithmetic operation:
//
//Addition
//
//    public static int addition(int a, int b) {
//        return a + b;
//    }
//
//    //Subtraction
//    public static int subtraction(int a, int b) {
//        return a - b;
//    }
//
//    //Multiplication
//    public static int multiplication(int a, int b) {
//        return a * b;
//    }
//
//    //Division
//    public static int division(int a, int b) {
//        return a / b;
//    }
//
//    //Modulus
//    public static int modulus(int a, int b) {
//        return a % b;
//    }
//
//    //Division
//    public static int divideByZero(int a, int b) {
//        return a / b;
//    }
//
//
////    Create a method that validates that user input is in a certain range
////    The method signature should look like this:
////    public static int getInteger(int min, int max);
////    and is used like this:
////            System.out.print("Enter a number between 1 and 10: ");
////    int userInput = getInteger(1, 10);
////    If the input is invalid, prompt the user again.
////    Hint: recursion might be helpful here!
//
//
//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = scanner.nextInt();
//
//        if (min <= userInput && max >= userInput) {
//
//            System.out.println("Your number was within range!");
//
//        } else {
//
//            System.out.println("Please re-enter a valid number.");
//
//            userInput = getInteger(min, max);
//        }
//
//        return userInput;
//
//    }
//
//
//
//    public static void factorial(){
//        int userInput = getInteger(1,10);
//        long sum = 1;
//        for (int fa = userInput; fa > 0; fa--){
//            sum *= fa;
//        }
//        System.out.println("factorial of " + userInput +" = " + sum);
//    }
//




//    Create an application that simulates dice rolling.
//

    public static int rollOfTheDice() {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("How many sides are there to a dice ");
        int userInput = scanner.nextInt();

        String again = "y";

        while (again.equalsIgnoreCase("y")) {
            System.out.println("Rolling the dice...");
            int die1 = (int)(Math.random()*6) + 1;
            int die2 = (int)(Math.random()*6) + 1;
            int roll = die1 + die2;

            System.out.println("Their values are:");
            System.out.println(die1 + " " + die2);
            System.out.println("Your total roll is " + roll);

            System.out.print("Roll them again (y = yes)? ");
            again = scanner.nextLine();
            userInput = rollOfTheDice();
//           rollOfTheDice();
        }
        return userInput;
    }
}






