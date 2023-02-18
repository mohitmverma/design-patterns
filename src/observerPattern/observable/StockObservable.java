package observerPattern.observable;

import observerPattern.observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver notificationAlertObserver);
    public void remove(NotificationAlertObserver notificationAlertObserver);
    public void notifySubscribers();
    public void setStockCount(int count);
    public int getStockCount();

}
