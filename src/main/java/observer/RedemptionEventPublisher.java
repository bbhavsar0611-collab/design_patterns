
package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RedemptionEventPublisher {

    //This is the central part of the pattern. It maintains a list of subscribers and notifies each one when an event is published.

    private final List<RedemptionObserver> observers =
            new ArrayList<>();

    public void subscribe(RedemptionObserver observer) {
        observers.add(Objects.requireNonNull(observer));
    }

    public void unsubscribe(RedemptionObserver observer) {
        observers.remove(observer);
    }

    public void publish(RedemptionEvent event) {
        Objects.requireNonNull(event);

        for (RedemptionObserver observer : observers) {
            observer.onRedemption(event);
        }
    }
}
