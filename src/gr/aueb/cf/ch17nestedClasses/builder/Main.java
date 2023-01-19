package gr.aueb.cf.ch17nestedClasses.builder;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book.Builder(1, "123").build();
        Book book2 = new Book.Builder(2, "3445")
                .author("Th.")
                .title("Java I")
                .build();

    }
}
