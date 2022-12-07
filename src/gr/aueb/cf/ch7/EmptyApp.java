package gr.aueb.cf.ch7;

public class EmptyApp {
    public static void main(String[] args) {
        String s1 = "CodingFactory";
        String s2 = "";

        boolean isEmpty;

        System.out.printf("String: %s, Length: %d\n", s1, s1.length());

        //Empty -> length == 0
        isEmpty = s2.isEmpty();
            System.out.printf("s2 is empty: %s, s2 length is: %d", isEmpty, s2.length());
        }
    }

