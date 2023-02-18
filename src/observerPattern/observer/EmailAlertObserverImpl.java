package observerPattern.observer;

import observerPattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;
    StockObservable stockObservable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable) {
        this.emailId = emailId;
        stockObservable = observable;
    }

    @Override
    public void update() {
        System.out.println("Sent Email : " + emailId);
    }
}
