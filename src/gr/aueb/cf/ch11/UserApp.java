package gr.aueb.cf.ch11;

public class UserApp {

    public static void main(String[] args) {
        System.out.println(User.getUsersCount());
        User alice = new User();
        User bob = new User();
        User chris = new User(3L,"Chris","R.");
    }
}
