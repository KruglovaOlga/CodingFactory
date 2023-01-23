package gr.aueb.cf.ch17nestedClasses.clon;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        City athens = new City("Athens");
        City clonedAthens = (City) athens.clone();
        clonedAthens.setDescription("Athens2022");
        System.out.println(athens);
        System.out.println(clonedAthens);

        Trainee alice = new Trainee("Alice", new City("Athens"));
        Trainee clonedAlice = alice.clone();
        clonedAlice.setCity(new City(""));
        System.out.println(alice);
        System.out.println(clonedAlice);

        Trainee bob = new Trainee(alice);
        bob.getCity().setDescription("London");
        System.out.println(alice);
        System.out.println(bob);
    }
}
