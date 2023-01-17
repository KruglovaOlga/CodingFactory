package gr.aueb.cf.ch16.functional;

@FunctionalInterface
public interface IDChecker {
    /**
     * Checks student's ID based on predicate's logic
     * @param student
     *          the student instance
     * @return
     *          true , if the id of the student is void based
     *          on the predicate, false otherwise
     */
    boolean checkID(Student student);
}
