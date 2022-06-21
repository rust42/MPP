package Lab5.problem2;

public final class Rectangle implements IGeometricShape {
    private final double width;

    public double getWidth() {
        return width;
    }

    private final double length;

    public double getLength() {
        return length;
    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double computeArea() {
        return width * length;
    }
}
