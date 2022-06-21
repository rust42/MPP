package Lab7.prob4;

public interface IFlyBehavior {

    default public void fly() {
        System.out.println("\tDefault flying");
    }
}
