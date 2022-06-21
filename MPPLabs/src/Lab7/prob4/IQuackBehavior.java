package Lab7.prob4;

public interface IQuackBehavior {
    default public void quack() {
        System.out.println("\tDefault Quacking");
    }
}
