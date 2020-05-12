package Shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double aLength, double aWidth){
        this.length = aLength;
        this.width = aWidth;

    }

    public  double getArea(){
        return this.length * this.width;

    }
    public double getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    }

//
//    public static void main(String[] args) {
//        Rectangle rec1 = new Rectangle();
//        rec1.width = 5;
//        rec1.length =10;
//        System.out.println(rec1.getArea());
//        System.out.println(rec1.getPerimeter());
//    }

}