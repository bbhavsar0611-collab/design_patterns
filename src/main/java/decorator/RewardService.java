package decorator;

/*Use Decorator when you want to add optional responsibilities without changing the original implementation.

Examples include:
- Logging and timing.
- Caching a service result.
- Adding metrics.
- Wrapping an output stream with compression.

*/


public interface RewardService {

    String redeemReward(String customerId, String rewardId);
}
