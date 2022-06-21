package Lab5.problem2;

public final class Triangle implements IGeometricShape {
    private final double base;

    public double getBase() {
        return base;
    }

    private final double height;

    public double getHeight() {
        return height;
    }

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return 0.5 * base * height;
    }
}
