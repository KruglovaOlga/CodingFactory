package gr.aueb.cf.ch4;

/**
 * αέναο loop
 */
public class InfiniteForApp {

    public static void main(String[] args) {
        int count = 0;

        for (;;) {
            System.out.print("love coding forever ");
            count++;
            if(count % 20 == 0) System.out.println();

            if(count == 100) break;
        }
    }
}
