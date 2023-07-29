public class ShortTermObserver implements Observer {
    @Override
    public void update(double price) {
        String className = this.getClass().getName();
        if (price > 80.0) {
            System.out.printf("%s: The price=%.2f is greater than 80, sell it!%n", className, price);
        } else {
            System.out.printf("%s: The price=%.2f is less than 80, keep it!%n", className, price);
        }
    }
}
