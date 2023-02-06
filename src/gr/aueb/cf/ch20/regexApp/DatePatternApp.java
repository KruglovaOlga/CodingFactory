package gr.aueb.cf.ch20.regexApp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DatePatternApp {

    public static void main(String[] args) {
        String s = "20/04/2022";

        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher matcher = pattern.matcher(s);

        if (matcher.matches()) {
            String day = matcher.group(1);
            String month = matcher.group(2);
            String year = matcher.group(3);

            String engDate = month + "/" + day + "/" + year;
            System.out.println(engDate);
        } else {
            System.out.println("Pattern not matches");
        }
    }
}
