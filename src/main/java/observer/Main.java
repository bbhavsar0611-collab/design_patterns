
package observer;

public class Main {

    public static void main(String[] args) {

        // Create the publisher
        RedemptionEventPublisher publisher =
                new RedemptionEventPublisher();

        // Create the observers
        RedemptionObserver emailObserver =
                new EmailNotificationObserver();

        RedemptionObserver auditObserver =
                new AuditObserver();

        // Subscribe both observers
        publisher.subscribe(emailObserver);
        publisher.subscribe(auditObserver);

        // A customer redeems a reward
        RedemptionEvent event = new RedemptionEvent(
                "CUST-101",
                "REWARD-501",
                500);

        // Notify all registered observers
        publisher.publish(event);
    }
}
