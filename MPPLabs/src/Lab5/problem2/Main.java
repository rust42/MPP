package Lab5.problem2;

public class Main {

    public static void main(String[] args) {
        IGeometricShape[] shapes = {
                new Triangle(4, 3),
                new Circle(5),
                new Rectangle(10, 20),
                new Triangle(8, 10),
                new Rectangle(20, 5),
                new Circle(8),
        };

        double sumOfAreas = 0;


        for (IGeometricShape shape: shapes) {
            sumOfAreas += shape.computeArea();
        }

        System.out.printf("Sum of Areas = %.2f%n",sumOfAreas);
    }
}
