public class CreditPaymentService {
    public int calculate(int credit, double rate, int month) {

        double rateInMonth = rate / 12 / 100;
        double a = 1 + rateInMonth;

        int result = (int) (credit * (rateInMonth * Math.pow(a, month) / (Math.pow(a, month) - 1)));

        return result;
    }

}
