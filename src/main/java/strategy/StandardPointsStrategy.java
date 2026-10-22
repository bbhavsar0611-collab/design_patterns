package strategy;

public class StandardPointsStrategy implements PointsStrategy{
    @Override
    public int calculatePoints(double purchaseAmount) {
        return (int) purchaseAmount;
    }
}
