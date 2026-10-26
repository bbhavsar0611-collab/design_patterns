1. First principles: What problem does Adapter solve?
   Imagine your rewards application needs to send an email notification.
   Your application expects this interface:
   public interface NotificationProvider {
   void send(String recipient, String message);
   }


But an external email provider gives you a class with a different API:
public class ExternalEmailService {
public void sendMessage(String emailAddress, String content) {
System.out.println(
"External provider sending to " + emailAddress
+ ": " + content);
}
}


Both can send emails, but their method names and parameters differ.
You cannot simply use ExternalEmailService wherever your application expects NotificationProvider.
The Adapter Pattern solves this mismatch by translating one interface into another.
Rewards application
Calls send(recipient, message)

EmailNotificationAdapter
Translates the interface and parameters

ExternalEmailService
Calls sendMessage(emailAddress, content)


The application doesn't need to know the external provider's method names.