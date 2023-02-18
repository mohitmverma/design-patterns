package observerPattern.observable;

import observerPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StockObservable{

    private List<NotificationAlertObserver> observerList = new ArrayList<>();
    private int count=0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer: observerList) {
            observer.update();
        }
    }

    public void setStockCount(int newStockAdded) {
        if(count == 0) {
            notifySubscribers();
        }
        count+=newStockAdded;
    }

    public int getStockCount() {
        return count;
    }
}
