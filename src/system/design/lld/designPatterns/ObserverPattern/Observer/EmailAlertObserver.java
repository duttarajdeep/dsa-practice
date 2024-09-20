package system.design.lld.designPatterns.ObserverPattern.Observer;

import system.design.lld.designPatterns.ObserverPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationObserver {
    StockObservable observable;
    String emailId;

    public EmailAlertObserver(StockObservable obj, String emailId) {
        this.observable = obj;
        this.emailId = emailId;
    }


    @Override
    public void update() {
        int currentStock = observable.getStock();
        sendEmail(currentStock);
    }

    private void sendEmail(int currentStock) {
        System.out.println("Email notification sent to: " + this.emailId + ". Current stock is: " + currentStock);
    }
}
