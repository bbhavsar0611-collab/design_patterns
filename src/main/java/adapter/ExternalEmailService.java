
package adapter;

public class ExternalEmailService {

    public void sendMessage(
            String emailAddress,
            String content) {

        System.out.println(
                "External email sent to " + emailAddress
                        + ": " + content);
    }
}
