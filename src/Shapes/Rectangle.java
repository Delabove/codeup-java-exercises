package Shapes;

public class Rectangle extends Quadrilateral implements Measurable {

        public Rectangle(double length, double width){
        super(length, width);

    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
//
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}
//
//    protected double length;
//    protected double width;
//
//    public Rectangle(double aLength, double aWidth){
//        this.length = aLength;
//        this.width = aWidth;
//
//    }
//
//    public  double getArea(){
//        return this.length * this.width;
//
//    }
//    public double getPerimeter(){
//        return (2 * this.length) + (2 * this.width);
//    }
//
////
////    public static void main(String[] args) {
////        Rectangle rec1 = new Rectangle();
////        rec1.width = 5;
////        rec1.length =10;
////        System.out.println(rec1.getArea());
////        System.out.println(rec1.getPerimeter());
////    }
