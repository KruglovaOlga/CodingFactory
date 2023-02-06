package gr.aueb.cf.ch20.regexApp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyPatternApp {

    public static void main(String[] args) {
        String s = "login:thanos;pass:12345;";

        //greedy match
        Pattern pattern = Pattern.compile(".*;");

        //reluctant match
        Pattern pattern1 = Pattern.compile(".*?;");
        Matcher matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}
