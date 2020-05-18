package Shapes;

public class ShapesTest {

        public static void main(String[] args) {

            Measurable myShape= new Square(5);

//            myShape = new Square();
            myShape = new Rectangle(2, 3);

            System.out.println(myShape.getPerimeter());
            System.out.println(myShape.getArea());
//
        Rectangle box1 = new Rectangle(5, 4);
            System.out.println("Area = "+box1.getArea());
            System.out.println("Perimeter = "+box1.getPerimeter());


           Square box2 = new Square(5);
            System.out.println("Area = "+box2.getArea());
            System.out.println("Perimeter = "+box2.getPerimeter());
//
        }
}