import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String args[]) {
        String token = "Bearer f6e187929041567e247df6563df029";
        Pattern p = Pattern.compile("[B|b]earer\\s");
        Matcher m = p.matcher(token);
        if (m.find()) {
            System.out.println(token.substring(m.end()));
        }
    }
}

