
package adapter;

public class EmailNotificationAdapter
        implements NotificationProvider {

    private final ExternalEmailService externalEmailService;

    public EmailNotificationAdapter(
            ExternalEmailService externalEmailService) {
        this.externalEmailService = externalEmailService;
    }

    @Override
    public void send(String recipient, String message) {

        // Translate our interface into the provider's API
        externalEmailService.sendMessage(recipient, message);
    }
}
