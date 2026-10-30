package decorator;

public class LoggingTimingRewardService implements  RewardService{

    private final RewardService delegate;

    public LoggingTimingRewardService(RewardService delegate) {
        this.delegate = delegate;
    }


    @Override
    public String redeemReward(String customerId, String rewardId) {
        long start = System.nanoTime();

        System.out.println("Starting redemption");

        try {
            return delegate.redeemReward(customerId, rewardId);
        } finally {
            long elapsed = System.nanoTime() - start;
            System.out.println("Elapsed time: " + elapsed + " ns");
        }
    }    }

