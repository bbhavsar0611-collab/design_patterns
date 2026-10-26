
package observer;

//Every observer must implement the same method.
public interface RedemptionObserver {

    void onRedemption(RedemptionEvent event);
}


//This is the abstraction that allows the publisher to work with different observer types.