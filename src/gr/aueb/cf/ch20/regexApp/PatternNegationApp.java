package gr.aueb.cf.ch20.regexApp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternNegationApp {

    public static void main(String[] args) {
        String s = "B!@@:K555:D12!:";

        //negation
        Pattern pattern = Pattern.compile("[A-Z&&[^ADX]].*?:");

        //Intersect
        Pattern pattern1 = Pattern.compile("[A-Z&&[ADX]].*?:");

        //Union
        Pattern pattern2 = Pattern.compile("[A-D[M-P]].*?:");
        Matcher matcher = pattern.matcher(s);
        Matcher matcher1 = pattern1.matcher(s);
        Matcher matcher2 = pattern2.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }

        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }
    }
}
