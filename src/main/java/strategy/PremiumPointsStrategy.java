package strategy;

public class PremiumPointsStrategy implements PointsStrategy{
    @Override
    public int calculatePoints(double purchaseAmount) {
        return  (int) (purchaseAmount * 2);
    }
}
