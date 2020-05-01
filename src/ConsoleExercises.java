import java.util.Scanner;

public class ConsoleExercises {
    public static void main( String args []){
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        System.out.printf("The value of pi is %.2f%n", pi);


//        System.out.println("Enter a number.");
//        int userInput = scanner.nextInt();
//        System.out.format("The value of user input is %s", userInput);

        System.out.println("Enter 3 words");
//
        String userInput1 = scanner.nextLine();
        String userInput2 = scanner.nextLine();
        String userInput3 = scanner.nextLine();

        System.out.println(" My 1st word is " + userInput1);
        System.out.println(" My 2nd word is " + userInput2);
        System.out.println(" My 3rd word is" +  userInput3);


        System.out.println("Enter a sentence.");
        String userSentence = scanner.nextLine();
//
        System.out.println(" My sentence is " +  userSentence);
//
        System.out.println("Please enter the width of Codeup's classroom.");
        float width = Float.parseFloat(scanner.nextLine());
        System.out.println("Please enter the length of Codeup's classroom.");
        float length= Float.parseFloat(scanner.nextLine());


        float area = width * length;
        float perimeter = (width * 2) + (length * 2);

        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);
    }

}
