package observerPattern;

import observerPattern.observable.IphoneStockObservable;
import observerPattern.observable.StockObservable;
import observerPattern.observer.EmailAlertObserver;
import observerPattern.observer.NotificationAlertObserver;
import observerPattern.observer.SmsAlertObserver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Observer PAttern");

        StockObservable stockObservable = new IphoneStockObservable();

        NotificationAlertObserver observer= new EmailAlertObserver("mohit@gmail.com", stockObservable);
        NotificationAlertObserver observer1 = new SmsAlertObserver(8077012345L, stockObservable);

        stockObservable.add(observer);
        stockObservable.add(observer1);
        stockObservable.setStockCount(10);
        System.out.println("Stock count : " +stockObservable.getStockCount());

    }
}
