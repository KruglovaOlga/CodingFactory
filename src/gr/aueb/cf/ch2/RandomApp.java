package gr.aueb.cf.ch2;

/**
 * Παράγει τυχαίες τιμές μεταξύ 1-6
 *
 */
public class RandomApp {

    public static void main(String[] args) {
        //min - max -> (Math.random() * (max - min + 1)) + min
        int die = (int) (Math.random() * 6) + 1;
        System.out.println(die);
    }
}
