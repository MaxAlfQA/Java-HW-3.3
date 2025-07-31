public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int FullCredit = 1000000; // Сумма кредита
        int period = 1; // Срок кредита. В годах
        double percent = 9.99; // Процентная ставка

        int MouthPay = service.calculate(FullCredit, period, percent);
        System.out.println(MouthPay);


    }
}
