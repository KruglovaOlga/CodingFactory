package gr.aueb.cf.ch16.functional;

public class Main {

    public static void main(String[] args) {
        Student[] students = {new Student(1,"Alice", "W."),
        new Student(2, "Bob", "M."),
        new Student(3,"Elon","M."),
        new Student(4,"Bill","G.")};

        printStudentsById(students, new IDChecker() {
            @Override
            public boolean checkID(Student student) {
                return student.getId() == 1;
            }

        });
        printStudentsById(students, student -> student.getId() <= 3);
    }

    public static void printStudentsById(Student[] students, IDChecker checker) {
        for (Student student : students) {
            if (checker.checkID(student)) {
                System.out.println(student);
            }
        }
    }

}
