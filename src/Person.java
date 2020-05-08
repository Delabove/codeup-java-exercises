public class Person {

//    Create Person class inside of src that has a private
//    name property that is a string, and the following methods:
//    The class should have a constructor that accepts a String value
//    and sets the person's name to the passed string.
//    Create a main method on the class that creates a new Person
//    object and tests the above methods.



    private String name;


//     returns the person's name
    public String getName(){
        return String.format("My name is %s!", name) ;
    }
//
    // changes the name property to the passed value
    public void setName(String name){
        System.out.println("My name is " + name + "!");

    }
//
//    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.printf("My name is %s!", name);

    }

     public static void main(String[] args) {
    Person delayne = new Person();
    delayne.name = "DeLayne";

         delayne.sayHello();
         System.out.println(delayne.getName());
         delayne.setName(delayne.name);

//         Person person1 = new Person();
//         Person person2 = new Person();
//         System.out.println(person1.getName().equals(person2.getName()));
//         System.out.println(person1 == person2);

//         Person person1 = new Person();
//         Person person2 = person1;
//         System.out.println(person1 == person2);

//         Person person1 = new Person();
//         Person person2 = person1;
//         System.out.println(person1.getName());
//         System.out.println(person2.getName());
//         person2.setName("Jane");
//         System.out.println(person1.getName());
//         System.out.println(person2.getName());

    }




}
