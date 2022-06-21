package Lab5.problem2;

public final class Circle implements IGeometricShape {

    private final double radius;

    public double getRadius() {
        return radius;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

