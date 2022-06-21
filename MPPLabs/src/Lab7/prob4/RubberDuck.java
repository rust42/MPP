package Lab7.prob4;

public class RubberDuck extends Duck {

    RubberDuck() {
        super(new CannotIFly(), new Squeak());
    }

    @Override
    void display() {
        System.out.println("\tdisplaying");
    }

}
