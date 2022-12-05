package gr.aueb.cf.ch8;

public class NullPointerExceptionApp {

    public static void main(String[] args) {
        String s = null;

        if (s != null) {
            if (s.equals("coding plus")){
                System.out.println("coding+");
            } else {
                System.out.println("no coding plus");
            }
//        }else {
//            System.out.println("Null");
        }
    }
}
