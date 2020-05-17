package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);


    public String getString(){
        return " ";
    }

    public boolean yesNo(){
        System.out.println("Select y/n");
        String userInput = scanner.nextLine();
//        if(userInput.equals("y") || userInput.equals("yes")){
//            return true;
//        }else{
//            return false;
//        }
        return userInput.equals("y") ? true : false;

    }

    public int getInt(int min, int max){
//        System.out.println("Enter a number between 1-10");
        int userInput = Integer.parseInt(scanner.nextLine());

            if (userInput < min || userInput > max) {
                System.out.println("Out of range.");
                return getInt(min, max);
            }
            return userInput;

    }

    public int getInt(){
        System.out.println("Give me an integer:");
        return Integer.parseInt(scanner.nextLine());
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a number between " + min + "and" + max);
        double userInput = Double.parseDouble(scanner.nextLine());

        if(userInput < min || userInput > max){
            System.out.println("Out of range.");
            return getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble(){
//        System.out.println("Give me a decimal:");
        return Double.parseDouble(scanner.nextLine());
    }
//
//    public double getRadius(double radius){
//        return radius;
//    }











}
//
//    private Scanner scanner = new Scanner(System.in);
//
//
//    public String getString() {
//        System.out.println("Type something: ");
//        return scanner.nextLine();
//
//    }
//
//    public boolean yesNo() {
//        System.out.println("Select y/n");
//        String answer = scanner.nextLine();
//        return answer.equals("y") ? true: false;
//    }
//
//
//
//    public int getInt(int min, int max) {
//        System.out.println("Give me a number between " + min + " and " + max + ":");
//        int aNumber = Integer.parseInt(getString());
//        if (aNumber < min || aNumber > max) {
//            System.out.println("Number is outside of the range, try again.");
//            return getInt(min, max);
//        }
//        return aNumber;
//    }
//
//    public int getInt() {
//        System.out.println("Give me an integer: ");
//        return Integer.parseInt(getString());
//
//    }
//
//    public double getDouble(double min, double max) {
//        System.out.println("Give me a decimal between " + min + " and " + max);
//        double aDecimal = Double.parseDouble(getString());
//        if (aDecimal < min || aDecimal > max) {
//            System.out.println("Number is outside of the range, try again.");
//            return getDouble(min, max);
//        }
//        return aDecimal;
//    }
//
//    public double getDouble() {
//        System.out.println("Give me a decimal: ");
//        return Double.parseDouble(getString());
//    }
//}