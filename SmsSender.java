// Install the Java helper library from twilio.com/docs/libraries/java
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import java.util.*;

public class SmsSender {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            "AC8c5bf22dcbd00180f8b9d4a8f50eaafb";
    public static final String AUTH_TOKEN =
            "d1069fcd90cfdb60f3f10ce4b594d734";
    public static void main(String[] args) {
 	System.out.println("Enter Your Phone Number:");
	Scanner sc = new Scanner(System.in);
	String he = sc.nextLine();
	System.out.println("Enter Your Message:");
	String txt = sc.nextLine();
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
          Message message = Message
                .creator(new PhoneNumber(he), // to
                        new PhoneNumber("+12566125563"), // from
                        txt)
                .create();

        System.out.println(message.getSid());
    }
}
