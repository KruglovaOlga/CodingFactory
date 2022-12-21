package gr.aueb.cf.ch11.bank;

public class Holder {
    private final Long id;
    private final String firstname;
    private final String lastname;
    private final String ssn;

    public Holder() {
        id = 0L;
        firstname = "";
        lastname = "";
        ssn = "";
    }

    public Holder(Long id, String firstname, String lastname, String ssn) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSsn() {
        return ssn;
    }


}
