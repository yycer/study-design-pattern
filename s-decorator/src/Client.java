public class Client {
    public static void main(String[] args) {
        Notifier notifier = new SMSNotifierDecorator(new WeChatNotifierDecorator(new DefaultNotifierImpl()));
        notifier.sendMsg("Coffee is ready", "Frankie");
    }
}
