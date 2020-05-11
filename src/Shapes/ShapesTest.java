package Shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle();
        box1.length = 4;
        box1.width = 5;

        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.println(box2.getArea());
        System.out.println(box2.getPerimeter());

    }


}
