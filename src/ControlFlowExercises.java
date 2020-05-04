import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String args[]) {

//        System.out.println("Control Flow Exercise");

//        int i = 5;
//
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }
//
//        int counter = 0;
//
//        do {
//            System.out.println(counter);
//            counter += 2;
//        } while (counter <= 100);

//        int counter = 100;
//
//        do {
//            System.out.println(counter);
//            counter -= 5;
//        } while (counter <= 100);

//
//        int counter = 2L;
//        do{
//            System.out.println(counter);
//            counter *= counter;
//        } while (counter < 1000000L);
//        for(int counter =100; counter >= -10; counter -=5){
//            System.out.println(counter);
//        }

//        for(long counter = 2L; counter < 1000000L; counter *= counter){
//            System.out.println(counter);
//        }


        for(int i = 1; i <= 100; i++) {

                 System.out.println(i);

            if(i % 3 == 0 && i % 5 == 0){

                System.out.println("FizzBuzz");

            }else if(i % 3 == 0){

                System.out.println("Fizz");

            } else if(i % 5 == 0){

                System.out.println("Buzz");


            }

        }

        Scanner sc = new Scanner(System.in);

        System.out.println("What number would you like to go up to?");

        int number = sc.nextInt();

        System.out.println("Here's your table!");

        int tableColumn = 3;
        double userMax = number;

        for (int n = 1; n <= tableColumn; n++) {

        }
        System.out.println();

        for (int n = 1; n <= tableColumn; n++) {


        }
        System.out.println();

        for (double x = 1; x <= userMax; x++) {
            for (int n = 1; n <= tableColumn; n++) {
                System.out.printf("%10.0f", Math.pow(x, n));

            }
            System.out.println();
        }



        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your score from 0 to 100.");

        int numberGrade = userInput.nextInt();

        System.out.println("You chose " + numberGrade + ".");

        System.out.println("Would you like to continue? [y/n]");

        if (numberGrade >= 90) {
            System.out.println("Your score is " + numberGrade + " which is an A");
        } else if (numberGrade >= 80){
            System.out.println("Your score is " + numberGrade + " which is an B");
        } else if (numberGrade >= 67){
            System.out.println("Your score is " + numberGrade + " which is an C");
        } else if (numberGrade >= 60){
            System.out.println("Your score is " + numberGrade + " which is an D");
        }else if (numberGrade >= 0){
            System.out.println("Your score is " + numberGrade + " which is an F.");
        }


    }
}
