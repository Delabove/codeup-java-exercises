package Shapes;

public class Square extends Rectangle {
    public int side;
    public Square(int side){
    this.length = side;
    this.width = side;
    }

    public int getArea(){
        return side ^ 2;
    }

    public int getPerimeter(){
        return 4 * side;
    }

//
//    public static void main(String[] args) {
//        Square sq1 = new Square(5);
//        System.out.println("sq1.getPerimeter() = " + sq1.getPerimeter());
//    }

}
