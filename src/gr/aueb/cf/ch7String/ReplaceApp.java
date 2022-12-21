package gr.aueb.cf.ch7String;

public class ReplaceApp {

    public static void main(String[] args) {
        String firstname = "Maria-Hellen";
        String nickname = "";
        String simpleName = "";

        nickname = firstname.replace("-Hellen", "");
        simpleName = firstname.replace("-","");

        System.out.println(firstname);
        System.out.println(nickname);
        System.out.println(simpleName);
    }
}
