package CollectionsLec;
import oop.Person;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLec {
    public static void main(String[] args) {
        String [] names = {"fer", "stacey"};

//      Array List is its own datatype. "Native array" above is the same as below. Command
//        click takes us to the definitions.
//        "NamesList is an Array list of strings"

        ArrayList<String> namesList = new ArrayList<>();
        
//       We will use array list instead of primitive array because easier 
//        to manage.
//        arrayList methods:
        namesList.add("stacey");
        namesList.add("fer");
        namesList.add("stacey");

//      when you use collections you lose a lot of cool things but you just use methods;

//      boolean
        System.out.println(namesList.contains("fer"));

//      boolean
        System.out.println("namesList.isEmpty(): " + namesList.isEmpty());


//        to get element at an  index  use .get

        System.out.println("namesList.get(0): " +  namesList.get(0));

//        index of the an object, use .indexOf
        System.out.println("namesList.indexOf(\"stacey\"):" + namesList.indexOf("stacey"));

//        .size is the same as .length for collections

        System.out.println("namesList.size() = " + namesList.size());
        
//        when you add new element, theres a counter behind the scenes that
//        increments by one each time an element is added


//      if you.....  namesList.remove("stacey"); you still see it if it's duplicated.
//      It only removes the first instance. So if you use .remove(index)

        System.out.println(namesList.remove("namesList.lastIndexOf"  + namesList.remove(namesList.lastIndexOf("stacey"))));

        if(!namesList.isEmpty()){

//        FOR EACH IN JAVA: before colon -datatype and
            for(String name : namesList ){
                System.out.println("name = " + name);
//           name = fer
//           name = stacey
            }


            hashMapTest();




        }


        
        
        
    }
   
public static void personTest(){

//        string is not good enough for the datatype for objects you
//        create and customize like the Person class we created.
    ArrayList<Person> people = new ArrayList<>();

//    waste of memory to create a variable so do the following
//    primitive: people[0] = new Person ("fer", "Mendoza", true);

    people.add(new Person("Fer", "Mendoza", true));


//    verify if working: for each loop;

    for (Person person : people){
        System.out.println("person.getFirstName = " + person.getFirstName());
    }




}




public static void hashMapTest(){
//
//    HashMap<Long, String> users = new HashMap<>();
////    add element to map; put will adjust in datatypes defined in definition
//    users.put(1L, "fermendozaro");
//
////    get a string in return; object will always be generic but the return is
////    dynamic
//    System.out.println("Users.get = " + users.get(1L));
//
//    System.out.println("Users.get = " + users.get("fermendodaro"));
//
////    GETS NULL. IF YOU DONT LIKE NULL USE DEFAULT VALUE KEY BELOW:
//
//    System.out.println("Users.get = " + users.getOrDefault("fermendodaro", "No record found with this id."));
//

HashMap<Long, Person> githubUsernames = new HashMap<>();
    githubUsernames.putIfAbsent(1L, new Person("Jacques", "Boutte", true ));
    githubUsernames.putIfAbsent(2L, new Person("DeLayne", "LaBove", false ));
    
    
//    print the id and full name of each person; long doesnt have to exactly match Long will
//    explain later


//    loop through to get a list of keys
    for(long id : githubUsernames.keySet()){
        System.out.println("id = " + id);
    }

//loops through to get a list of values

    for(Person person : githubUsernames.values()){
        System.out.println("first name = " + person.getFirstName());
    }


//  print it all information of each element (Person); Hashmap does not have index values so you cant
//    use one loop for all information

for(Long key : githubUsernames.keySet()){
    System.out.println("key = " + key);
    System.out.println("githubUsernames = " + githubUsernames.get(key).getFirstName());
}


}


}
