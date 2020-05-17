package Shapes;

public class Circle {
    private double radius;


    public Circle(double radius){
        this.radius = radius;

    }

    public double getArea(){
        return Math.PI * (Math.pow(this.radius, 2));
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;

    }








}
























//    private double radius;
//    static private int count = 0;
//
//    public Circle(double aRadius){
//        this.radius = aRadius;
//        count++;
//    }
//
//    public static int getCount(){
//        return count;
//    }
//    public double getArea(){
//       return Math.PI * (Math.pow(this.radius, 2));
//    }
//    public double getCircumference(){
//        return  2 * Math.PI * this.radius;
//    }
//}
