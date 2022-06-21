package Lab5.problem1;

public abstract class Duck {

    private final FlyBehavior flyBehavior;
    private final QuackBehavior quackBehavior;


    Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    void quack() {
        quackBehavior.quack();
    }

    void fly() {
        flyBehavior.fly();
    }

    void swim() {
        System.out.println("\tswimming");
    }

    abstract void display();

}
