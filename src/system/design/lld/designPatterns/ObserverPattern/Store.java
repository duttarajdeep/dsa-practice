package system.design.lld.designPatterns.ObserverPattern;

import system.design.lld.designPatterns.ObserverPattern.Observable.IphoneObservable;
import system.design.lld.designPatterns.ObserverPattern.Observable.StockObservable;
import system.design.lld.designPatterns.ObserverPattern.Observer.EmailAlertObserver;
import system.design.lld.designPatterns.ObserverPattern.Observer.NotificationObserver;
import system.design.lld.designPatterns.ObserverPattern.Observer.SMSAlertObserver;

public class Store {
    public static void main(String[] args) {
        // Create observable
        StockObservable iphoneObservable = new IphoneObservable();

        // Create the observers
        NotificationObserver obs1 = new EmailAlertObserver(iphoneObservable, "abc@xyz.com");
        NotificationObserver obs2 = new EmailAlertObserver(iphoneObservable, "def@xyz.com");
        NotificationObserver obs3 = new SMSAlertObserver(iphoneObservable, "0000099999");

        // Add subscribers via Notify me button
        iphoneObservable.add(obs1);
        iphoneObservable.add(obs2);
        iphoneObservable.add(obs3);

        iphoneObservable.setStock(10);
        iphoneObservable.clearStock();
        iphoneObservable.setStock(100);
    }
}
