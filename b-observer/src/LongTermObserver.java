public class LongTermObserver implements Observer {
    @Override
    public void update(double price) {
        String className = this.getClass().getName();
        if (price > 100.0) {
            System.out.printf("%s: The currentPrice=%.2f is greater than 100, sell it!%n", className, price);
        } else {
            System.out.printf("%s: The currentPrice=%.2f is less than 100, keep it!%n", className, price);
        }
    }
}
