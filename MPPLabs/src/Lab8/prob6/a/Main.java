package Lab8.prob6.a;

import Lab8.prob2.A.EmployeeNameComparator;
import Lab8.prob2.A.Employee;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Main {
    enum Apple {
        Apple() {};
        double getWeight() {
            return 1.0;
        }
    }

    public static void main(String[] args) {
        EmployeeNameComparator comp = new EmployeeNameComparator();
        Function<Employee, String> a =  Employee::getName; // (Employee e) -> e.getName();
        BiConsumer<Employee, String> b =  Employee::setName; // (Employee e, String s) -> e.setName(s);
        BiFunction<String, String, Integer> c = String::compareTo; // (String s1, String s2) -> s1.compareTo(s2);
        BiFunction<Integer, Integer, Double> d = Math::pow; //  (Integer x,Integer y) -> Math.pow(x,y);
        Function<Apple, Double> e = Apple::getWeight; // (Apple apple) -> apple.getWeight();
        ToIntFunction<String> f = Integer::parseInt; // (String x) -> Integer.parseInt(x);
        BiFunction<Employee, Employee, Integer> g = comp::compare; // (Employee e1, Employee e2) -> comp.compare(e1,e2);

    }
}
