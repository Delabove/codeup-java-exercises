

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        rollOfDice(scan);



//        more dynamic to ask if user wants to continue
        while (true){
            System.out.println("Factorial test");
            factorial();
            System.out.println("Do you wish to continue? y/n ");
            String answer = scan.nextLine();
            if(answer.toLowerCase().equals("n")){
                break;

            }
        }

        System.out.println("getInteger test: ");
        getInteger(1,10);

//        System.out.println(getInteger(1, 10));
//        getInteger(1, 10);
        System.out.println(addition(2, 3));
//        output: 5
        System.out.println(subtraction(4, 2));
//        output: 2
        System.out.println(multiplication(10, 10));
//        output: 100
        System.out.println(division(10, 2));
//        output: 5
        System.out.println(modulus(20, 6));
//        output: 2\\

        System.out.println(multiplyLoop(2, 10));





//        System.out.println("Divide by Zero: " + division(2, 0));
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at MethodsExercises.division(MethodsExercises.java:30)
//        at MethodsExercises.main(MethodsExercises.java:49)

//        System.out.println(factorial(5));

    }

//basic arithmetic methods

    public static double addition(int num1, int num2) {
        return num1 + num2;
    }

    public static double subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static double multiplication(int num1, int num2) {
        return num1 * num2;


    }

    //    BONUS EXERCISE 1 MULTIPLY USING LOOP:
    public static int multiplyLoop(int num1, int num2) {
        int result = 1;
        for (int i = 1; i <= num2; i++) {
            result = result + num1;
        }
        return result - 1;
    }

    public static double division(int num1, int num2) {
        if(num2 == 0){
            System.out.println("Division by 0 is not possible.");
            return 0;
        }
        return num1 / num2;
    }

    public static double modulus(int num1, int num2) {
        return num1 % num2;
    }

    //    a method that validates that user input is w/in a certain range
    public static int getInteger(int min, int max) {
//    /    to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10: ");
        int userInput = Integer.parseInt(scanner.nextLine());

//            set condition or boundary

        if (userInput < min || userInput > max) {
            System.out.println("Please try again.. ");
            return getInteger(min, max);
        } else {
//            how to stop
            System.out.println("Number is within range!");

            return userInput;
        }

    }
//    recursion note -base case:

//            public static int factorial(int n){
//                if(n == 1){
//                    return 0;
//                }else{
//                    return 0;
//
//                }

//            Calculate the factorial of a number.
//            EXAMPLE: (factorial of 5 =) 5! = 5 * 4 * 3
//            * 2 * 1 = 120

    public static void factorial() {
        int userInput = getInteger(1, 10);
        long sum = 1;
        for (int fac = userInput; fac > 0; fac--) {
            sum *= fac;
        }
        System.out.printf("%d! = " + sum + "\n", userInput);
    }

    public static void rollOfDice(Scanner scan) {
        while (true){
            System.out.println("rollOfDice test");

            System.out.println("Enter the number of sides for a pair of dice.");
            short n = Short.parseShort(scan.nextLine());
    //             INITIALIZED VARIABLE FOR RANDOM NUMBER BASED ON N INPUT
            int range = n -1 + 1;
            System.out.println("roll die 1 = " +  ((int)(Math.random()*range) + 1));
            System.out.println("roll die 2 = " +  ((int)(Math.random()*range) + 1));

            System.out.println("Do you wish to continue? y/n ");

            if(scan.nextLine().toLowerCase().equals("n")){
                break;

            }
        }
    }












}


































//
//    public static void main(String[] args) {
//
////        System.out.println(addition(1, 2));
////        System.out.println(subtraction(1, 2));
////        System.out.println(multiplication(1, 2));
////        System.out.println(division(4, 2));
////        System.out.println(modulus(4, 2));
//////      System.out.println(divideByZero(4, 0));
////        System.out.println(getInteger(1, 10));
////
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Enter a number between 1 and 10: ");
////        long userInput = scanner.nextInt();
////        System.out.println("You Entered " + userInput);
//          System.out.println("How many sides of the dice? ");
//          System.out.println(rollOfTheDice());
//
//
////        factorial test
////
////        while(true){
////            System.out.println("factorial test");
////            factorial();
////            System.out.println("Do you wish to continue? y/n");
////            String answer = scanner.nextLine();
////            if(answer.toLowerCase().equals("n")) {
////                break;
////            }
////        }
//    }
//
//
////Create four separate methods. Each will perform an arithmetic operation:
////
////Addition
////
////    public static int addition(int a, int b) {
////        return a + b;
////    }
////
////    //Subtraction
////    public static int subtraction(int a, int b) {
////        return a - b;
////    }
////
////    //Multiplication
////    public static int multiplication(int a, int b) {
////        return a * b;
////    }
////
////    //Division
////    public static int division(int a, int b) {
////        return a / b;
////    }
////
////    //Modulus
////    public static int modulus(int a, int b) {
////        return a % b;
////    }
////
////    //Division
////    public static int divideByZero(int a, int b) {
////        return a / b;
////    }
////
////
//////    Create a method that validates that user input is in a certain range
//////    The method signature should look like this:
//////    public static int getInteger(int min, int max);
//////    and is used like this:
//////            System.out.print("Enter a number between 1 and 10: ");
//////    int userInput = getInteger(1, 10);
//////    If the input is invalid, prompt the user again.
//////    Hint: recursion might be helpful here!
////
////
////    public static int getInteger(int min, int max) {
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Enter a number between 1 and 10: ");
////        int userInput = scanner.nextInt();
////
////        if (min <= userInput && max >= userInput) {
////
////            System.out.println("Your number was within range!");
////
////        } else {
////
////            System.out.println("Please re-enter a valid number.");
////
////            userInput = getInteger(min, max);
////        }
////
////        return userInput;
////
////    }
////
////
////
////    public static void factorial(){
////        int userInput = getInteger(1,10);
////        long sum = 1;
////        for (int fa = userInput; fa > 0; fa--){
////            sum *= fa;
////        }
////        System.out.println("factorial of " + userInput +" = " + sum);
////    }
////
//
//
//
//
////    Create an application that simulates dice rolling.
////
//
//    public static int rollOfTheDice() {
////        Scanner scanner = new Scanner(System.in);
////
////        int userInput = scanner.nextInt();
////
////        String again = "y";
////
////        while (again.equalsIgnoreCase("y")) {
////            System.out.println("Rolling the dice...");
////            int die1 = (int)(Math.random()*6) + 1;
////            int die2 = (int)(Math.random()*6) + 1;
////            int roll = die1 + die2;
////
////            System.out.println("Their values are:");
////            System.out.println(die1 + " " + die2);
////            System.out.println("Your total roll is " + roll);
////
////            System.out.print("Roll them again (y = yes)? ");
////            again = scanner.nextLine();
////            userInput = rollOfTheDice();
////
////        }
////        return userInput;
//    }
//}
//
//




