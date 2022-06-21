package Lab5.problem1;

public class MallardDuck extends Duck {

    MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    void display() {
        System.out.println("\tdisplay");
    }
}
