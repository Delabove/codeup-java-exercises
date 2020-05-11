import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class ArraysExercises {



    public static void main(String[] args){

//      What happens when you run the following code? Why
//      is Arrays.toString necessary?

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));



//
////     Create an array that holds 3 Person objects.
       String[] personArray = {"DeLayne", "Jacques", "Grayson"};
//       System.out.println(Arrays.toString(personArray));


//
////
////      Assign a new instance of the Person class to each element.
        Person delayne = new Person("DeLayne");
        Person jacques = new Person("Jacques");
        Person grayson = new Person("Grayson");

        System.out.println(Arrays.toString(personArray));
//
//
////      Iterate through the array and print out the name of each
////      person in the array.
//

        for (int i = 0; i < personArray.length; i += 1) {
            System.out.println(personArray[i]);
        }

//        1.3 It should return an array whose length is 1 greater than the
//    passed array, with the passed person object at the end of the array.


        String[] newAddedPersonArray = addPerson(personArray, "Jade");
        System.out.println(Arrays.toString(newAddedPersonArray));

    }

//   1.3 Create a static method named addPerson.
//    It should accept an array of Person objects,
//    as well as a single person object to add to the passed array.
//

    public static String[] addPerson(String[] personArray, String aName){


        String[] addedPersonArray = Arrays.copyOf(personArray, personArray.length + 1);

        addedPersonArray[3]= aName;

        for(String n : addedPersonArray){
            System.out.println(n);
        }
        return addedPersonArray;
    }


}
