package observerPattern;

import observerPattern.observable.IphoneStockObservableImpl;
import observerPattern.observable.StockObservable;
import observerPattern.observer.EmailAlertObserverImpl;
import observerPattern.observer.NotificationAlertObserver;
import observerPattern.observer.SmsAlertObserverImpl;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Observer PAttern");

        StockObservable stockObservable = new IphoneStockObservableImpl();

        NotificationAlertObserver observer= new EmailAlertObserverImpl("mohit@gmail.com", stockObservable);
        NotificationAlertObserver observer1 = new SmsAlertObserverImpl(8077012345L, stockObservable);

        stockObservable.add(observer);
        stockObservable.add(observer1);
        stockObservable.setStockCount(10);
        System.out.println("Stock count : " +stockObservable.getStockCount());

    }
}
