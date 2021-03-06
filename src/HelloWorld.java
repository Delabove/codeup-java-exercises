public class HelloWorld {
    public static void main( String args []){
        System.out.println("Hello Java World!");

//        Create an int variable named myFavoriteNumber and assign your favorite
//        number to it, then print it out to the console.

        int myFavoriteNumber = 1128;
        System.out.println("My favorite number is " + myFavoriteNumber);

     //Create a String variable named myString and assign a string value
        // to it, then print the variable out to the console.

        String myString = "This is my string.";
        System.out.println("This is my string value: " + myString);

        //Change your code to assign a character value to myString. What do you notice?
//        char myString = "This is my string.";
//        System.out.println("This is my string value: " + myString);
        //Red squiggly lines -will not work because it is a string.

        //Change your code to assign the value 3.14159 to myString.
        // What happens?

//        String myString = 3.14159;
//        System.out.println("This is my string value: " + myString);
//           //Red squiggly lines -will not work because it requires a string not a double.


        //Declare an long variable named myNumber, but do not assign
        // anything to it.Next try to print out myNumber to the console.
        // What happens?

//        Error:(34, 25) java: illegal start of expression

//        Change your code to assign the value 3.14 to myNumber.
//        What do you notice?
//        stays red because we did no add L

//        Change your code to assign the value 123L (Note the 'L'
//        at the end) to myNumber.



//        long myNumber = 123L;
//        System.out.println("This is my number value: " + myNumber);

//        Change your code to assign the value 123 to myNumber.
//        long myNumber = 123;
//        System.out.println("This is my number value: " + myNumber);

//        Why does assigning the value 3.14 to a variable declared as a
//        long not compile, but assigning an integer value does?

//        Because it is a short integer and does not have a decimal
//                value;


        //Change your code to declare myNumber as a float. Assign the value
        // 3.14 to it.What happens? What are two ways we could fix this?

//        stays red because we need to use casting.. put float on opposite
//        sidt of variable

       float myNumber = (float)3.14;

        System.out.println("This is my number value: " + myNumber);


//        Copy and paste the following code blocks one at a time and
//        execute them.

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

//        What is the difference between the above code blocks?
//        Explain why the code outputs what it does.
//        in the first block we are incrementing after the variable which
//                does not change the original value;
//        in the last block, we are incrementing before the variable which
//                changes the value of the variable.

//        Try to create a variable named class. What happens?
//        class myClass = 123;
//        Says local class never used

//         Object is the most generic type in Java. You can assign any
//         value to a variable of type Object. What do you think
//         will happen when the following code is run?

        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;

//        Exception in thread "main" java.lang.ClassCastException: class
//        java.lang.String cannot be cast to class java.lang.Integer (java.lang.String
//                and java.lang.Integer are in module java.base of loader
//    'bootstrap')at HelloWorld.main(HelloWorld.java:98)


//        How is the above example different from the code block below?
//        int three = (int) "three";

//         the quotations make it a string.

//        What are the two different types of errors we are observing?
//            cannot cast a strin to an integer and
//            cannot cast a string to a class;
//        Rewrite the following expressions using the relevant shorthand
//        assignment operators:

//        int x = 5;
        System.out.println(++x);

//        int three = Integer.parseInt("456");

        x = 10;
//        x += 5;
        int y = 2;
//        y *= x;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

        x = Integer.MAX_VALUE;
        x++;
        System.out.println("MAXVAL + 1 " + x);
    }
}
