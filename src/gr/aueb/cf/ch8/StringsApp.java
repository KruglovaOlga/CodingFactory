package gr.aueb.cf.ch8;

public class StringsApp {

    public static void main(String[] args) {
        String s;
        String[] tokens = {};
        String subStr = "Plus";

        s = getStringOrNull(tokens, subStr);

        if (s.equals("Plus")) {
            System.out.println("Plus");
        }
    }
    public static String getStringOrNull(String[] strArray, String str) {
        if ((strArray == null) || (str == null)) return null;

        for (String s : strArray) {
            if (s.contains(str)) {
                return s;
            }
        }return null;
    }
}

