package Lab5.problem1;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("\tcannot quack");
    }
}
