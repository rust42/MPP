package Lab7.prob4;

public abstract class Duck {

    private final IFlyBehavior IFlyBehavior;
    private final IQuackBehavior quackBehavior;


    Duck(IFlyBehavior IFlyBehavior, IQuackBehavior quackBehavior) {
        this.IFlyBehavior = IFlyBehavior;
        this.quackBehavior = quackBehavior;
    }

    void quack() {
        quackBehavior.quack();
    }

    void fly() {
        IFlyBehavior.fly();
    }

    void swim() {
        System.out.println("\tswimming");
    }

    abstract void display();

}
