package gr.aueb.cf.ch20.regexApp;

public class Main {

    public static void main(String[] args) {
        String s = "Red";
        String s1 = "Green";
        String s2 = "green";
        String s3 = "trying";
        String s4 = "Annoying";
        System.out.println(isRed(s));
        System.out.println(isRedOrGreen(s1));
        System.out.println(isRredOrGgreen(s2));
        System.out.println(hasOneUpperCaseEndWithIng(s4));
        System.out.println(hasOneUpperLowerCaseEndWithIng(s3));


    }


    public static boolean isRed(String s) {
        return s.matches("Red");
    }

    public static boolean isRedOrGreen(String s) {
        return s.matches("Red|Green");
    }

    public static boolean isRredOrGgreen(String s) {
        return s.matches("[Rr]ed|[Gg]reen");
    }

    //begin with one uppercase letter and then ending with "ing"
    public static boolean hasOneUpperCaseEndWithIng(String s) {
        return s.matches("[A-Z]ing");
    }

    public static boolean hasOneUpperLowerCaseEndWithIng(String s) {
        return s.matches("[a-zA-Z]ing");
    }

    /*
    . οποιοσδήποτε χαρακτήρας
    ^ αρχή String
    $ τέλος String
    \w χαραρακτήρας λέξης a-zA-Z0-9
    \W οποιοςδήποτε χαραρακτήρας εκτός από χαραρακτήρα λέξης
    \s whitespace
    \d οποιοδηποτε ψηφίο
    \D οποιοδηποτε χαραρακτήρας εκτός από ψηφίο
     */

    //one space, then one digit
    public static boolean isAnySpaceDigit(String s) {
        return s.matches("\\s\\d");
    }

    //one letter then one digit
    public static boolean isLetterDigit(String s) {
        return s.matches("^\\w\\d$");
    }

    public static boolean isLetterDigitAnywhere(String s) {
        return s.matches(".*\\w\\d.*");
    }

    //letter-digit as a whole word
    public static boolean isLetterDigitAsWord(String s) {
        return s.matches(".*\\b\\w\\d\\b.*");
    }

    /*
    ? μηδέν ή μία εμφάνηση
    + μια ή περισσότερες εμφανίσεις ..+
    * μηδέν ή περισσότερες φορές
    {n} n εμφανίσεις ακριβώς
    {n, m} μεταξύ n και m εμφανίσεων
    {n, } τουλάχιστον n
    { ,m} το πολύ m εμφανίσεις
     */

    //e-mail
    public static boolean isValidEmail(String s) {
        return s.matches("[\\w*\\.?\\w+@\\w+\\.(com|gr]");

    }

    //two uppercase letterDashSevenDigits
    public static boolean isTwoUppercaseLetterDashSevenDigits(String s) {
        return s.matches("[A-Z]{2}-\\d{7}");
    }

    //an array of tokens delimited by one or more spaces
    public static String[] getTokens(String s) {
        return s.split("\\s+");
    }

    //replaces one or more spaces with one space
    public static String normilizeStr(String s) {
        return s.replaceAll("\\s+", " ");

    }

    public static String mutuallyChange(String s) {
        return s.replaceAll("(.*)\\s+(.*)", "$2 $1");
    }
}
