public class Person1 {

    private String name;

    public static void main(String[] args) {
        Person1 dee = new Person1("DeLayne");
        dee.sayHello();

    }

    public Person1(String aName){
        this.setName(aName);
    }

    // returns the person's name
    public String getName(){
        return this.name;
    }
    // changes the name property to the passed value
    public void setName(String aName){
        this.name = aName;
    }

    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.println("Hello from " + this.getName());
    }

}
