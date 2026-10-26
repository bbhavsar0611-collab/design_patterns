
package adapter;

public class Main {

    public static void main(String[] args) {

        // The incompatible third-party service
        ExternalEmailService externalService =
                new ExternalEmailService();

        // Wrap it with the adapter
        NotificationProvider notificationProvider =
                new EmailNotificationAdapter(externalService);

        // Use the application's expected interface
        notificationProvider.send(
                "customer@example.com",
                "Your reward redemption was successful!");
    }
}
