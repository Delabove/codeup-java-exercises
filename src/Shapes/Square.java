package Shapes;

public class Square extends Quadrilateral {

    protected double side;
public Square(double side){
    super(side,side);
}

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.setLength(width);
    }

    @Override
    public double getPerimeter() {
        return 4 * super.length;
    }

    @Override
    public double getArea() {
        return Math.pow(super.width, 2);

    }
}
//    public double side;
//
//    public Square(double side){
//        super(side, side);
//    }
//
//    public double getArea(){
//        return Math.pow(super.width, 2);
//    }
//
//    public double getPerimeter(){
//        return 4 * super.length;
//    }
//
////
////    public static void main(String[] args) {
////        Square sq1 = new Square(5);
////        System.out.println("sq1.getPerimeter() = " + sq1.getPerimeter());
////    }
