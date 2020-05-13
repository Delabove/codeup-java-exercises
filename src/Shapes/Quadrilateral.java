package Shapes;

abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;
    public Quadrilateral(double length, double width){
        this.length;
        this.width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public abstract setLength(double length) {
        return length;
    }

    public abstract setWidth(double width) {
        return width;
    }
}
