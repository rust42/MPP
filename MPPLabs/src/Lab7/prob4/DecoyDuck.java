package Lab7.prob4;

public class DecoyDuck extends Duck {

    DecoyDuck() {
        super(new CannotIFly(), new MuteQuack());
    }

    @Override
    void display() {
        System.out.println("\tdisplaying");
    }
}
