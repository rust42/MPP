package Lab5.problem1;

public class RubberDuck extends Duck {

    RubberDuck() {
        super(new CannotFly(), new Squeak());
    }

    @Override
    void display() {
        System.out.println("\tdisplaying");
    }

}
