package gr.aueb.cf.ch20.regexApp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExNonCapturingApp {

    public static void main(String[] args) {
        String s = "HelloCF HelloCFCF";

        Pattern pattern = Pattern.compile("(Hello)(CF)+");
        Pattern pattern1 = Pattern.compile("(Hello)(?:CF)+"); // non-capturing group CF, zero length assertion
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            for(int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println(matcher.group(i) + " ");
            }
            System.out.println();
        }
    }
}
