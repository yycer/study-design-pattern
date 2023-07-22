public class WechatPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.printf("Pay %.2f using Wechat.%n", amount);
    }
}
