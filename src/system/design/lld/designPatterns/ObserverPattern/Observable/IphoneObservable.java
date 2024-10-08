package system.design.lld.designPatterns.ObserverPattern.Observable;

import system.design.lld.designPatterns.ObserverPattern.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable {

    public List<NotificationObserver> observers = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(NotificationObserver obj) {
        observers.add(obj);
    }

    @Override
    public void remove(NotificationObserver obj) {
        observers.remove(obj);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public int getStock() {
        return stockCount;
    }

    @Override
    public void setStock(int stock) {
        if (stockCount == 0) {
            stockCount += stock;
            notifySubscribers();
        } else {
            stockCount += stock;
        }
    }

    @Override
    public void clearStock() {
        this.stockCount = 0;
    }
}
