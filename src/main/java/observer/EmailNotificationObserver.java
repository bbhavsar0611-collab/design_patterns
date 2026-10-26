
package observer;

public class EmailNotificationObserver
        implements RedemptionObserver {

    @Override
    public void onRedemption(RedemptionEvent event) {
        System.out.println(
                "EMAIL: Customer " + event.customerId()
                        + " redeemed reward " + event.rewardId()
                        + " using " + event.pointsSpent() + " points.");
    }
}
