package Shapes;

import org.w3c.dom.ls.LSOutput;
import util.Input;

import java.util.Scanner;


public class CircleApp {

    public static void main(String[] args) {
        Input userInput = new Input();

        System.out.println("Enter the radius of the circle.");

        Circle aCircle = new Circle(userInput.getDouble());

            System.out.println("The circumference of this circle is = " + aCircle.getCircumference());
            System.out.println("The area of this circle is = " + aCircle.getArea());

    }
















}





//    public static void main(String[] args) {
//        Input input = new Input();
//        Circle aCircle;
//
//        while(input.yesNo()){
//            aCircle = new Circle(input.getDouble());
//            System.out.println(aCircle.getArea());
//            System.out.println("aCircle.getCircumference() = " + aCircle.getCircumference());
//
//        }
//
//        System.out.println("Circle.getCount() = " + Circle.getCount());
//
//    }
//
//}


