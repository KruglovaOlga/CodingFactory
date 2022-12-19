package gr.aueb.cf.ch11;

public class User {
    private static int usersCount;
    private long id;
    private String username;
    private String password;

    static {
        usersCount = 0;
    }

    public User() {}

    public User(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        usersCount++;
    }

    public static int getUsersCount() {
        return usersCount;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
