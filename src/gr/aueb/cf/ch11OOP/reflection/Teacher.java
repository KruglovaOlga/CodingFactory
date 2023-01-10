package gr.aueb.cf.ch11OOP.reflection;

public class Teacher {
    private Long id;
    private String firstname;
    private String lastname;

    public Teacher(){}
    public Teacher(Long id) {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void saySomething(String message) {
        System.out.println(message);
    }
}
