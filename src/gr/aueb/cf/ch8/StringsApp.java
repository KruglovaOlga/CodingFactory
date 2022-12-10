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

    /**
     * Returns a string if it is found in an array of strings.
     * Otherwise, it returns null. Returning nulls, the caller is
     * exposed to NullPointer Exception. We should consider
     * the case of Optional class.
     *
     * @param strArray          the source array of Strings
     * @param str               the substring to search for
     * @return                  the string containing the substring
     */
    public static String getStringOrNull(String[] strArray, String str) {
        if ((strArray == null) || (str == null)) return null;

        for (String s : strArray) {
            if (s.contains(str)) {
                return s;
            }
        } return null;  //Returning nulls could lead to NullPointerException
                        // in caller / client
    }
}

