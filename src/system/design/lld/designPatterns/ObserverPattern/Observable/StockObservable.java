package system.design.lld.designPatterns.ObserverPattern.Observable;

import system.design.lld.designPatterns.ObserverPattern.Observer.NotificationObserver;

public interface StockObservable {
    void add(NotificationObserver obj);

    void remove(NotificationObserver obj);

    void notifySubscribers();

    int getStock();

    void setStock(int stock);

    void clearStock();
}
