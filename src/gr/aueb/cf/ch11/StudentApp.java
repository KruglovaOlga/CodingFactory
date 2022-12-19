package gr.aueb.cf.ch11;

public class StudentApp {

    public static void main(String[] args) {
        Student alice = new Student();
        Student bob = new Student(2, "Bob", "Dylan");

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("W.");

        System.out.println("ID: " + bob.getId());
        System.out.println("Firstname: " + bob.getFirstname());
        System.out.println("Lastname: " + bob.getLastname());

        System.out.println("ID: " + alice.getId());
        System.out.println("Firstname: " + alice.getFirstname());
        System.out.println("Lastname: " + alice.getLastname());
 /*
        //Set
        alice.id = 1;
        alice.firstname = "Alice";
        alice.lastname = "W.";

        //Get
        System.out.println("ID: " + alice.id);
        System.out.println("Firstname: " + alice.firstname);
        System.out.println("Lastname: " + alice.lastname);

  */
    }

}
