public class Client {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // 1. Test with PayPal payment
        context.setStrategy(new PayPalPayment());
        context.pay(99.80);

        // 2. Test with WeChat payment
        context.setStrategy(new WechatPayment());
        context.pay(20.39);
    }
}
