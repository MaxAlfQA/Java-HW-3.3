public class CreditPaymentService {
    public int calculate(int a, int b, double c) {


        int osk = a;
        int pp = b * 12;
        double ps = c / (100 * 12);

        double base1 = 1 + ps;
        double expon1 = -pp;
        double result1 = Math.pow(base1, expon1);

        int result;
        result = (int) ((int) osk * ps / (1 - result1));


        return result;


    }
}
