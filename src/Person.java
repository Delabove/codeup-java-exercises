public class Person {

//    Create Person class inside of src that has a private
//    name property that is a string, and the following methods:
//    The class should have a constructor that accepts a String value
//    and sets the person's name to the passed string.
//    Create a main method on the class that creates a new Person
//    object and tests the above methods.



    private String name;

    public Person(String aName){
        this.setName(aName);
    }

//     returns the person's name
    public String getName(){
        return this.name;
    }
//
    // changes the name property to the passed value
    public void setName(String aName){
        this.name = aName;

    }
//
//    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.printf("Hello from " + getName());

    }

     public static void main(String[] args) {
    Person delayne = new Person("DeLayne");
//    delayne.name = "DeLayne";

         delayne.sayHello();
         System.out.println(delayne.getName());
         delayne.setName("Jacques");
         delayne.sayHello();

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
