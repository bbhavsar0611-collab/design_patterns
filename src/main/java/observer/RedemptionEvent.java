package observer;


//This object carries the information that observers need.
public record RedemptionEvent(
        String customerId,
        String rewardId,
        int pointsSpent) {
}