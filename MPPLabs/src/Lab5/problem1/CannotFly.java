package Lab5.problem1;

public class CannotFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("\tcannot fly");
    }
}
