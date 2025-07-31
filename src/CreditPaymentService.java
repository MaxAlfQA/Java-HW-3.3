public class CreditPaymentService {
    public int calculate(int fullCredit, int period, double percent) {


        int perMonth = period * 12;
        double percentMouth = percent / (100 * 12);

        double base1 = 1 + percentMouth;
        double expon1 = -perMonth;
        double result1 = Math.pow(base1, expon1);

        int result;
        result = (int) ((int) fullCredit * percentMouth / (1 - result1));


        return result;


    }
}
