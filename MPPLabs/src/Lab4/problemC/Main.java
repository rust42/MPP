package Lab4.problemC;

public class Main {

    public static void main(String[] args) {
        Salaried salaried = new Salaried("123", 1000);
        System.out.println(salaried.calcGrossPay(1, 2));
        System.out.println(salaried.calcCompensation(1, 2).getNetPay());

    }
}
