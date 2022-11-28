package gr.aueb.cf.ch6;

public class ArrayReplaceNextSystemClassApp {

    public static void main(String[] args) {
        int[] ages = {21, 18, 33, 25, 32, 45};
        int[] agesCopy = new int[6];

        //Copy length-1 elements from ages to agesCopy
        System.arraycopy(ages, 0, agesCopy, 0, ages.length - 1);

        /* insert 0 as the last element of agesCopy
        Essentially, this is not needed in this case,
        since the default value of last element is zero,
        from initialization
         */
        agesCopy[agesCopy.length - 1] = 0;

        //Copies agesCopy reference to ages reference
        //shallow copy
        ages = agesCopy;

        for (int age : ages) {
            System.out.println(age + " ");
        }

    }
}
