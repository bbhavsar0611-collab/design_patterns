package strategy;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        // 1. Validate command-line arguments
        if (args.length != 2) {
            System.out.println(
                    "Usage: java com.rewards.Main "
                            + "<STANDARD|PREMIUM> <purchaseAmount>");
            return;
        }

        // 2. Read membership type and purchase amount
        MembershipType membershipType;
        double purchaseAmount;

        try {
            membershipType = MembershipType.valueOf(
                    args[0].trim().toUpperCase(Locale.ROOT));

            purchaseAmount = Double.parseDouble(args[1].trim());

            if (!Double.isFinite(purchaseAmount)
                    || purchaseAmount < 0) {
                throw new IllegalArgumentException(
                        "Purchase amount must be finite and non-negative");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
            System.out.println(
                    "Membership must be STANDARD or PREMIUM.");
            return;
        }

        // 3. Select the appropriate strategy
        PointsStrategy strategy = switch (membershipType) {
            case STANDARD -> new StandardPointsStrategy();
            case PREMIUM -> new PremiumPointsStrategy();
        };

        // 4. Inject the strategy into the service
        RewardsService rewardsService =
                new RewardsService(strategy);

        // 5. Calculate and display rewards
        int points =
                rewardsService.calculateRewards(purchaseAmount);

        System.out.println("Membership: " + membershipType);
        System.out.println("Purchase amount: $" + purchaseAmount);
        System.out.println("Points earned: " + points);
    }
}