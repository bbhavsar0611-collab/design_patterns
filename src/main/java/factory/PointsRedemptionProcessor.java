package factory;

public class PointsRedemptionProcessor implements RedemptionProcessor
{
    @Override
    public void redeem(String rewardId) {
        System.out.println("Redeeming " + rewardId + "using points");
    }
}
