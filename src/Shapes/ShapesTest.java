package Shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        Measurable myShape;


        Measurable myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Rectangle(2, 4);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());



//        Rectangle box1 = new Rectangle(4, 5);
////        box1.length = 4;
////        box1.width = 5;
//
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

    }


}
