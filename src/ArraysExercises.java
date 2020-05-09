import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args){

//        What happens when you run the following code? Why
//        is Arrays.toString necessary?
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

//        Create an array that holds 3 Person objects.
//    String[] person;
//
//    person = new String[3];
//
//    person[0] = "DeLayne";
//    person[1] = "Jacques";
//    person[2] = "Gray";

    String[] PersonArray = {"DeLayne", "Jacques", "Grayson"};


        for (String person : PersonArray) {
            System.out.println(Arrays.toString(PersonArray));
        }

//        System.out.println(PersonArray.length);
//        System.out.println("PersonArray[0] = " + PersonArray[0]);
//        System.out.println("PersonArray[1] = " + PersonArray[1]);
//        System.out.println("PersonArray[2] = " + PersonArray[2]);

//        Assign a new instance of the Person class to each element.


//        Iterate through the array and print out the name of each
//        person in the array.



    }
}
