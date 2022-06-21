package Lab3.prob3;

public class Cylinder {

    private double height;
    protected double radius;

    Cylinder(double radius, double height) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight()  {
        return height;
    }

    public double computeVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
