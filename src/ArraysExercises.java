import oop.Person;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

//        Person1[] newPeople = new Person1[3];
//        System.out.println("newPeople = " + Arrays.toString(newPeople));

//        newPeople[0] = new Person1("Jacques");
//        newPeople[1] = new Person1("Chuckie");
//        newPeople[2] = new Person1("Tandy");

        Person1[] newPeople = {new Person1("Jacques"), new Person1("Chuckie"), new Person1("Tandy")};

        newPeople = addPerson(newPeople, new Person1("Grayson"));

        for (Person1 person : newPeople) {
            System.out.println(person.getName());
        }
    }

    public static Person1[] addPerson(Person1[] newPeople, Person1 person) {
        Person1[] newPerson = Arrays.copyOf(newPeople, newPeople.length + 1);
        newPerson[newPerson.length - 1] = person;
        return newPerson;
    }


}


//
//
//
//    public static void main(String[] args){
//
////      What happens when you run the following code? Why
////      is Arrays.toString necessary?
//
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//
//
//
////
//////     Create an array that holds 3 Person objects.
////       String[] personArray = {"DeLayne", "Jacques", "Grayson"};
////       System.out.println(Arrays.toString(personArray));
//
//
//        Person[] people = new Person [3];
//////
//////      Assign a new instance of the Person class to each element.
//        people [0] = new Person("DeLayne");
//        people[1] = new Person("Jacques");
//        people[2] = new Person("Grayson");
//
////        System.out.println(people[i].sayHello());
////
////
//////      Iterate through the array and print out the name of each
//////      person in the array.
////
//////
//        for (int i = 0; i < people.length; i++) {
//            System.out.println(people[i].getName());
//        }
//
////        1.3 It should return an array whose length is 1 greater than the
////    passed array, with the passed person object at the end of the array.
//
//
//       people = addPerson(people, new Person("Jade"));
////        System.out.println(Arrays.toString(newAddedPersonArray));
//
//    }
//
////   1.3 Create a static method named addPerson.
////    It should accept an array of Person objects,
////    as well as a single person object to add to the passed array.
////
//
//    public static Person[] addPerson(Person[] people, Person person){
//
////
////        String[] addedPersonArray = Arrays.copyOf(people, personArray.length + 1);
////
////        addedPersonArray[3]= person;
////
////        for(String n : addedPersonArray){
////            System.out.println(n);
//        Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);
//        newPeopleArray[newPeopleArray.length - 1] = person;
//
//        return newPeopleArray;
//        }
//
//    }
//
//
//
