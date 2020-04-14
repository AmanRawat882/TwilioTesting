import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class whatsapp{
   // Replace these placeholders with your Account Sid and Auth Token
   public static final String ACCOUNT_SID = "AC8c5bf22dcbd00180f8b9d4a8f50eaafb";
   public static final String AUTH_TOKEN = "d1069fcd90cfdb60f3f10ce4b594d734";

   public static void main(String[] args) {
       Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
       Message message = Message.creator(
               new com.twilio.type.PhoneNumber("whatsapp:+919670136726"),
               new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
               "Hello from your friendly neighborhood Java application!")
           .create();
   }
}
