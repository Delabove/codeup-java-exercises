package Shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public int Rectangle(int aLength, int aWidth){
        this.length = aLength;
        this.width = aWidth;

        return aLength + aWidth;

    }

    public  int getArea(){
        return this.length * this.width;

    }
    public int getPerimeter(){
        return 2 * this.length + 2 * this.width;
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