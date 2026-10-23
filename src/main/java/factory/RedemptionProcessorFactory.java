package factory;

public class RedemptionProcessorFactory {

    public RedemptionProcessor create(RedemptionType type) {


        if (type == null) {
            throw new IllegalArgumentException("Redemption type cannot be null");
        }
        switch (type) {
            case POINTS:
                return new PointsRedemptionProcessor();

            case CASH:
                return new CashRedemptionProcessor();

            case GIFT_CARD:
                return new GiftCardRedemptionProcessor();

            default:
                throw new IllegalArgumentException(
                        "Unsupported redemption type: " + type);
        }
    }


    }

