package Lab3.prob3;

public class ComposedCircle {

    private Cylinder cylinder;

    public ComposedCircle(double radius) {
        this.cylinder = new Cylinder(radius, 0);
    }

    public double getRadius() {
        return this.cylinder.radius;
    }

    public double computeArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
