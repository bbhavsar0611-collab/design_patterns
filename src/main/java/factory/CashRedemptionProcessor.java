package factory;

public class CashRedemptionProcessor implements RedemptionProcessor{
    @Override
    public void redeem(String rewardId) {

        System.out.print("Redeeming" + rewardId + " using Cash");
    }
}
