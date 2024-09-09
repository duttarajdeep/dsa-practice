package lld.designPatterns.ObserverPattern.Observer;

import lld.designPatterns.ObserverPattern.Observable.StockObservable;

public class SMSAlertObserver implements NotificationObserver {

    StockObservable observable;
    String phoneNum;

    public SMSAlertObserver(StockObservable observable, String phoneNum) {
        this.observable = observable;
        this.phoneNum = phoneNum;
    }

    @Override
    public void update() {
        int currentStock = observable.getStock();
        sendSMS(currentStock);
    }

    private void sendSMS(int currentStock) {
        System.out.println("SMS notification sent to: " + this.phoneNum + ". Current stock is: " + currentStock);
    }
}
