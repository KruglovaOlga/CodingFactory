package gr.aueb.cf.ch20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
interface TeacherIDChecker {
    boolean checkId(Teacher teacher);
}

public class Main {
private static List<Teacher> teachers = Arrays.asList(
        new Teacher(1, "Than", "Androutsos"),
        new Teacher(2, "Pan", "Moschos"),
        new Teacher(3, "Markos", "Karampatsis")
);

    public static void main(String[] args) {
        int id = 3;
        printEqualID(teachers, new TeacherIDChecker() {
            @Override
            public boolean checkId(Teacher teacher) {
                return teacher.getTeacherId() == 1;
            }
        });

    printEqualID(teachers, teacher -> teacher.getTeacherId() == 2);
/*
    printEqualID(teachers, teacher -> teacher.getTeacherId() == id,
            Teacher:: printTeacher);

    printEqualID(teachers, teacher -> teacher.getTeacherId() > id,
            Teacher:: printFullName);
    */

    }




    public static void printEquals(List<Teacher> teachers, int teacherID) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() == teacherID) {
                System.out.println("Full name: " + teacher.getFirstname()
                + ", " + teacher.getLastname());
            }
        }
    }

    public static void printGraterThan(List<Teacher> teachers, int teacherID) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() > teacherID) {
                System.out.println("Full name: " + teacher.getFirstname()
                        + ", " + teacher.getLastname());
            }
        }
    }



    public static void printEqualID(List<Teacher> teachers, TeacherIDChecker idChecker) {
        for (Teacher teacher : teachers) {
            if (idChecker.checkId(teacher)) {
                System.out.println("Full name: " + teacher.getFirstname()
                        + ", " + teacher.getLastname());
            }
        }
    }

//    public static void printEqualId(List<Teacher> teachers, Predicate<Teacher> checker,
//                                    Consumer<Teacher> teacherConsumer) {
//        for (Teacher teacher : teachers) {
//            if (checker.test(teacher)) {
//                teacherConsumer.accept(teacher);
//            }
//        }
//    }

    public static void printEqualId(List<Teacher> teachers, Predicate<Teacher> checker,
                                    Consumer<Teacher> teacherConsumer) {
        teachers.forEach(teacher -> {if(checker.test(teacher)) teacherConsumer.accept(teacher);
        });
    }
}
