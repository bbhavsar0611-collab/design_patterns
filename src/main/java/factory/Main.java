package factory;

public class Main {

    public static void main(String[] args) {

        RedemptionProcessorFactory factory =
                new RedemptionProcessorFactory();

        RedemptionProcessor processor =
                factory.create(RedemptionType.POINTS);

        processor.redeem("REWARD-101");

        RedemptionProcessor cashProcessor =
                factory.create(RedemptionType.CASH);

        cashProcessor.redeem("REWARD-102");

        RedemptionProcessor giftCardProcessor =
                factory.create(RedemptionType.GIFT_CARD);

        giftCardProcessor.redeem("REWARD-103");
    }
}
