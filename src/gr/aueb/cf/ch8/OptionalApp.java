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
    public static Optional<int[]> getCopy(int[] arr) {
        if (arr == null) return Optional.empty();
        return Optional.of(Arrays.copyOf(arr, arr.length));
    }

    public static Optional<String> getStringCopy(String s) {
        return Optional.ofNullable(s);
    }
}
