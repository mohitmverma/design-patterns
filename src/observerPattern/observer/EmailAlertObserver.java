package observerPattern.observer;

import observerPattern.observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    String emailId;
    StockObservable stockObservable;

    public EmailAlertObserver(String emailId, StockObservable observable) {
        this.emailId = emailId;
        stockObservable = observable;
    }

    @Override
    public void update() {
        System.out.println("Sent Email : " + emailId);
    }
}
