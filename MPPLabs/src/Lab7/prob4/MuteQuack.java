package Lab7.prob4;

public class MuteQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("\tcannot quack");
    }
}
