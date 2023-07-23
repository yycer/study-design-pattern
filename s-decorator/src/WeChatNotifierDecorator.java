public class WeChatNotifierDecorator extends BasicNotifierDecorator {
    public WeChatNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMsg(String userName, String msg) {
        super.sendMsg(userName, msg);
        System.out.printf("Send '%s' to '%s' through WeChat.%n", msg, userName);
    }
}
