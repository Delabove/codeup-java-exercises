import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String args[]) {

//        System.out.println("Hello");


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
        int number =  sc.nextInt();
        System.out.println("Here's your table!");
            int NMAX = 3;
            double userMax = number;

            for(int n = 1; n<= NMAX; n++){
//                System.out.printf("%10d", n);
            }
        System.out.println();
            for (int n = 1; n <= NMAX;n++){
//                System.out.printf("%10s", "x ");

            }
        System.out.println();

            for(double x = 1; x <= userMax; x++){
                for(int n = 1; n <= NMAX; n++) {
                    System.out.printf("%10.0f", Math.pow(x, n));

                }
                System.out.println();
            }


    }
}
