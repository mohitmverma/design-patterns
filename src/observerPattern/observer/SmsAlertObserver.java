package observerPattern.observer;

import observerPattern.observable.StockObservable;

public class SmsAlertObserver implements NotificationAlertObserver {

    long mobileNumber;
    StockObservable stockObservable;

    public SmsAlertObserver(long mobileNumber, StockObservable stockObservable) {
        this.mobileNumber = mobileNumber;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Sms sent to : " + mobileNumber);
    }
}
