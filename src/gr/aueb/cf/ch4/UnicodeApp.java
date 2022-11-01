package gr.aueb.cf.ch4;

/**
 * prints unicode chars greater than
 * 4 Hex digits by using surrogate pairs
 * http://russellcottrell.com/greek/utilities/SurrogatePairCalculator.htm
 */
public class UnicodeApp {

    public static void main(String[] args) {
        int codePoint = 0x1F600;

        System.out.println("Smiley: \uD83D\uDE00");

        System.out.println("smiley: ");
        System.out.println(Character.toChars(codePoint));
    }
}
