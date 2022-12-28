package gr.aueb.cf.ch13seminar;

public class User {
    private String firstname;
    private String lastname;
    private UserCredentials userCredentials;

    public User(){}

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public UserCredentials getUserCredentials() {
        return userCredentials;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUserCredentials(UserCredentials userCredentials) {
        this.userCredentials = userCredentials;
    }
}
