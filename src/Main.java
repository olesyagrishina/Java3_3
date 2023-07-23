// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        double rate = 9.99;
        int month = 12;
        int payment = service.calculate(credit, rate, month);
        System.out.println("Ежемесячный платеж / срок кредита 1 год");
        System.out.println(payment);

        System.out.println();
        System.out.println("Ежемесячный платеж / срок кредита 2 года");
        System.out.println(service.calculate(1_000_000, 9.99, 24));

        System.out.println();
        System.out.println("Ежемесячный платеж / срок кредита 3 года");
        System.out.println(service.calculate(1_000_000, 9.99, 36));

    }
}

