package gr.aueb.cf.ch8;

import java.util.Arrays;
import java.util.Optional;

public class OptionalApp {

    public static void main(String[] args) {
        String s = "Coding Plus";
        Optional<String> opt = getStringCopy(s);
        if(opt.isPresent()) System.out.println(opt.get());
        else System.out.println("NULL");

        //opt.ifPresent(token -> System.out.println(token));
    }

    /**
     * Returns a copy of a given array of ints
     * Instead of null, it returns Optional.
     * Since the array is mutable we return not just
     * a reference but a copy of the array.
     *
     * @param arr       the source array
     * @return          an Optional, null or empty
     */
    public static Optional<int[]> getCopy(int[] arr) {
        if (arr == null) return Optional.empty();
        return Optional.of(Arrays.copyOf(arr, arr.length));
    }

    /**
     * It echoes the given string back to the caller.
     * Since strings are immutable we can just get the
     * reference back
     * @param s         the source string
     * @return          the source string as Optional object
     */
    public static Optional<String> getStringCopy(String s) {

        return Optional.ofNullable(s);
    }
}
