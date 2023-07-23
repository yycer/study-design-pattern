public class DefaultNotifierImpl implements Notifier {
    @Override
    public void sendMsg(String userName, String msg) {
        System.out.printf("Send '%s' to '%s' through APP.%n", msg, userName);
    }
}
