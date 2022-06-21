package Lab8.prob6.b;

import Lab8.prob2.A.EmployeeNameComparator;
import Lab8.prob2.A.Employee;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Main {
    enum Apple {
        WEIGHT(2.0);

        private double weight;
        Apple(double weight) {
            this.weight = weight;
        };
        double getWeight() {
            return weight;
        }
    }

    static class PowerFunction implements BiFunction<Double, Double, Double> {
        @Override
        public Double apply(Double aDouble, Double aDouble2) {
            return Math.pow(aDouble, aDouble2);
        }
    }

    private EmployeeNameComparator comp = new EmployeeNameComparator();
    private  Function<Employee, String> a =  Employee::getName; // (Employee e) -> e.getName();
    private BiConsumer<Employee, String> b =  Employee::setName; // (Employee e, String s) -> e.setName(s);
    private BiFunction<String, String, Integer> c = String::compareTo; // (String s1, String s2) -> s1.compareTo(s2);
    private BiFunction<Double, Double, Double> d = Math::pow; //  (Integer x,Integer y) -> Math.pow(x,y);
    private Function<Apple, Double> e = Apple::getWeight; // (Apple apple) -> apple.getWeight();
    private ToIntFunction<String> f = Integer::parseInt; // (String x) -> Integer.parseInt(x);
    private BiFunction<Employee, Employee, Integer> g = comp::compare; // (Employee e1, Employee e2) -> comp.compare(e1,e2);

    public static void main(String[] args) {
        Main main = new Main();
        main.evaluator();
    }

    public void evaluator() {
        Employee employee = new Employee("Sandeep", 6000);

        System.out.println(a.apply(employee));
        b.accept(employee, "Sandy");
        System.out.println(a.apply(employee));
        System.out.println(c.apply("Sandeep", "Sandy"));
        System.out.println(d.apply(10.0, 2.0));
        System.out.println(e.apply(Apple.WEIGHT));
        System.out.println(f.applyAsInt("234"));
        System.out.println(g.apply(new Employee("Saroz", 6000), new Employee("Sandeep", 5500)));
    }
}