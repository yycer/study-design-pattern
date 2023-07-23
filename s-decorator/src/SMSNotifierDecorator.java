public class SMSNotifierDecorator extends BasicNotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMsg(String userName, String msg) {
        super.sendMsg(userName, msg);
        System.out.printf("Send '%s' to '%s' through SMS.%n", msg, userName);
    }
}
