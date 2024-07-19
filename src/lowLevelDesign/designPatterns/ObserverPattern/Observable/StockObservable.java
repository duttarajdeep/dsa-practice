package lowLevelDesign.designPatterns.ObserverPattern.Observable;

import lowLevelDesign.designPatterns.ObserverPattern.Observer.NotificationObserver;

public interface StockObservable {
    void add(NotificationObserver obj);

    void remove(NotificationObserver obj);

    void notifySubscribers();

    void setStock(int stock);

    int getStock();

    void clearStock();
}
