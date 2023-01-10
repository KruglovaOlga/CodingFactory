package gr.aueb.cf.ch11OOP.model;



public class Main {

    public static void main(String[] args) {
        UserCredentials chrisCredentials = new UserCredentials(67L, "chris", "chris67");
        User chris = new User(3L, "Chris", "R.");

        System.out.println("User 1 {" + chris.getId() + ", " + chris.getFirstname() + ", " + chris.getLastname() + "}");
        System.out.println("User 1 Credentials {" + chrisCredentials.getId() + ", " + chrisCredentials.getUsername() + ", " + chrisCredentials.getPassword() + "}");

    }
}
