package Lab7.prob4;

public class CannotIFly implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("\tcannot fly");
    }
}
