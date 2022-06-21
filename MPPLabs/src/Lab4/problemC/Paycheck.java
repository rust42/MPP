package Lab4.problemC;

public class Paycheck {
    private final double grossPay;
    private final double fica;
    private final double state;
    final private double local;
    final private double medicare;
    final private double socialSecurity;

    Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
    }

    void print() {

    }

    double getNetPay() {
        return grossPay - grossPay * fica
                - grossPay * state
                - grossPay * local
                - grossPay * medicare
                - grossPay * socialSecurity;
    }
}
