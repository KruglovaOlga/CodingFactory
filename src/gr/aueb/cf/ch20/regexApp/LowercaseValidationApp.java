package gr.aueb.cf.ch20.regexApp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//gets as input a string containing any 6 chars
//and asserts that the string includes at least
//one lowercase letter
public class LowercaseValidationApp {

    public static void main(String[] args) {
        String s = "s123145";

        Pattern pattern = Pattern.compile("^(?=.*?[a-z]).{6,}$");//"^(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9]).{6,}$"
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
