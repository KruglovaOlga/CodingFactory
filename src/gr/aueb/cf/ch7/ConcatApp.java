package gr.aueb.cf.ch7;

public class ConcatApp {

    public static void main(String[] args) {
        String firstname = "Athanasios";
        String lastname = "Androutsos";
        String title = "Dr.";
        String fullname1 = "";
        String fullname2 = "";
        String fullname3 = "";
        String fullname4 = "";

        fullname1 = firstname + " " + lastname;
        fullname2 = title + " " + firstname+ " " + lastname;
        fullname3 = title.concat(firstname).concat(lastname);
        fullname4 = firstname.concat(" ").concat(lastname);

        System.out.println(fullname1);
        System.out.println(fullname2);
        System.out.println(fullname3);
        System.out.println(fullname4);
    }
}
