package gr.aueb.cf.ch6;

public class UnsizedInitApp {

    public static void main(String[] args) {
        int[] ages = {21, 18, 33, 25, 32,45};

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);
        System.out.println(ages[5]);
//or
        for (int age : ages) {
            System.out.println(age + " ");
        }
    }
}
