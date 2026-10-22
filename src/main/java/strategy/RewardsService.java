package strategy;

public class RewardsService {

    private final PointsStrategy pointsStrategy;

    public RewardsService(PointsStrategy pointsStrategy) {

        if (pointsStrategy == null) {
            throw new IllegalArgumentException("Points strategy cannot be null");
        }
        this.pointsStrategy = pointsStrategy;
    }

    public int calculateRewards(double purchaseAmount) {
        if (!Double.isFinite(purchaseAmount)
                || purchaseAmount < 0) {
            throw new IllegalArgumentException("Purchase amount must be finite and non negative");
        }

        return pointsStrategy.calculatePoints(purchaseAmount);

    }


}
