public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.printf("Pay %.2f using PayPal.%n", amount);
    }
}
