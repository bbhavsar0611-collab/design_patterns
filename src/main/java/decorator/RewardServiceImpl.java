package decorator;

public class RewardServiceImpl implements RewardService{
    @Override
        public String redeemReward(String customerId, String rewardId) {
            return "Redeemed " + rewardId + " for " + customerId;
        }
}
