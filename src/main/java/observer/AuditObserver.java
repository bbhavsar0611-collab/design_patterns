
package observer;

public class AuditObserver implements RedemptionObserver {

    @Override
    public void onRedemption(RedemptionEvent event) {
        System.out.println(
                "AUDIT: Redemption recorded for customer "
                        + event.customerId()
                        + ", reward " + event.rewardId()
                        + ", points spent " + event.pointsSpent());
    }
}
