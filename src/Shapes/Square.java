package Shapes;

public class Square extends Rectangle {
    public double side;

    public Square(double side){
    super(side, side);
    }

    public double getArea(){
        return Math.pow(super.width, 2);
    }

    public double getPerimeter(){
        return 4 * super.length;
    }

//
//    public static void main(String[] args) {
//        Square sq1 = new Square(5);
//        System.out.println("sq1.getPerimeter() = " + sq1.getPerimeter());
//    }

}
