import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        double paymentPeriodYears = service.calculate(1000000.0, 12);
        System.out.printf("Выплата период 1 год = %.0f%n ", paymentPeriodYears);

        double paymentPeriodTwoYears = service.calculate(1000000.0, 24);
        System.out.printf("Выплата период 2 года= %.0f%n", paymentPeriodTwoYears);

        double paymentPeriodThreeYears = service.calculate(1000000.0, 36);
        System.out.printf("Выплата период 3 года = %.0f%n ", paymentPeriodThreeYears);
    }
}