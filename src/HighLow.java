import java.awt.*;
import java.util.Scanner;

public class HighLow {

//    int randomNum = (int)(Math.random() * 101);


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        higherLower(scanner);

    }


public static void higherLower(Scanner scanner){

        int range = 100 - 1 + 1;
        int randomNum = ((int)(Math.random() * range) + 1);

        while(true) {
            System.out.println("Pick a number from 1 to 100: ");
            int userInput = Integer.parseInt(scanner.nextLine());
            System.out.printf("You chose %d.\n", userInput);

            while(true) {
                if (userInput > randomNum) {
                    System.out.printf("LOWER! The random number was %d!\n", randomNum);
                    higherLower(scanner);

                } else if (userInput < randomNum) {
                    System.out.printf("HIGHER! The random number was %d!\n ", randomNum);
                    higherLower(scanner);
                } else if (userInput < range || userInput > range) {
                    System.out.printf("\n%d is not an option. Please try again.\n", userInput);
                    higherLower(scanner);
                } else if (userInput == randomNum) {
                    System.out.printf("Wow! The random number was %d! GOOD GUESS!\n", randomNum);
                    break;
                }
            }
        }
}













}
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        validateCurrency(input);
//
//        countdownRecursion(10);
//        countdown();
//        System.out.println(sayHello("Fernando", "Mendoza"));
//        System.out.println(sayHello());
//        System.out.println("sum() " + sum(1, 2));
//        System.out.println("decimal sum() " + sum(3.4, 6.7));
//        System.out.println("sayHello() = " + sayHello("Douglas"));
//        System.out.println();
//    }
//
//    public static String sayHello(){
//        return "Hello world";
//    }
//
//    public static String sayHello(String name){
//        return "Hello " + name;
//    }
//
//    public static String sayHello(String firstName, String lastName){
//        return "Hello " + firstName + " " + lastName;
//    }
//
//    public static int sum(int num1, int num2){
//        return num1 + num2;
//    }
//
//    public static double sum(double num1, double num2){
//        return num1 + num2;
//    }
//
//    // counting from 5 to 1 using a loop
//    public static void countdown(){
//        for (byte x = 5; x >= 0 ;x--){
//            System.out.println("for loop = " + x);
//        }
//    }
//
//    // n a variable number
//    public static void countdownRecursion(int n){
//        System.out.println("recursion = " + n);
//        // how to stop
//        if(n < 1){
//            return;
//        }
//        // how to proceed
//        n = n - 1;
//        // how to try again with new data
//        countdownRecursion(n);
//    }
//
//
//    // that only looks for $
//    public static void validateCurrency(Scanner scan){
//        System.out.println("Give me an amount: ");
//        String amount = scan.nextLine();
//        // how to stop
//        if(amount.startsWith("$")){
//            System.out.println("It's valid money format");
//            return;
//        }
//        // how to proceed, how to run process again?
//        System.out.println("Invalid money format, try again");
//        validateCurrency(scan);
//    }
