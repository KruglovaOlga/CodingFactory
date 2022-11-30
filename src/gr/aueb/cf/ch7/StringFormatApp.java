package gr.aueb.cf.ch7;

public class StringFormatApp {

    public static void main(String[] args) {
        char row = 'A';
        int column = 3;
        String theaterSeat;

        theaterSeat = String.format("%c %02d", row, column);
        System.out.println(theaterSeat);
    }
}
