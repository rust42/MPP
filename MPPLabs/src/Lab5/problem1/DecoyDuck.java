package Lab5.problem1;

public class DecoyDuck extends Duck {

    DecoyDuck() {
        super(new CannotFly(), new MuteQuack());
    }

    @Override
    void display() {
        System.out.println("\tdisplaying");
    }
}
