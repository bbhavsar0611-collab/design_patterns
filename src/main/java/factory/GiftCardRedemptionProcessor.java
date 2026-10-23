package factory;

public class GiftCardRedemptionProcessor implements RedemptionProcessor{
    @Override
    public void redeem(String rewardId) {

        System.out.println("Redeeming" + rewardId + " using a gift card");
    }
}
