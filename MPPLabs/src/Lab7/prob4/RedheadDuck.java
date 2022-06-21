package Lab7.prob4;

public class RedheadDuck extends Duck {
    RedheadDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    void display() {
        System.out.println("\tdisplaying");
    }

}
