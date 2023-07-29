public class Client {
    public static void main(String[] args) {
        Observer shortTermObserver = new ShortTermObserver();
        Observer longTermObserver = new LongTermObserver();

        PayPalStock stock = new PayPalStock(70.20);
        stock.subscribe(shortTermObserver);
        stock.subscribe(longTermObserver);
        stock.notifySubscribers();

        stock.unsubscribe(shortTermObserver);
        stock.setPrice(102.35);
        stock.notifySubscribers();
    }
}
