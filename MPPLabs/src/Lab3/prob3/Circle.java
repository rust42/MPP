package Lab3.prob3;

public class Circle extends Cylinder {

    public Circle(double radius) {
        super(radius, 0);
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
