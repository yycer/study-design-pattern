public class BasicNotifierDecorator implements Notifier {
    private final Notifier notifier;

    public BasicNotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void sendMsg(String userName, String msg) {
        notifier.sendMsg(userName, msg);
    }
}
