import java.util.ArrayList;
import java.util.List;

public class PayPalStock {

    private double price;
    private final List<Observer> observers = new ArrayList<>();

    public PayPalStock(double price) {
        this.price = price;
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifySubscribers() {
        observers.forEach(o -> o.update(price));
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
