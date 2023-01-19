package gr.aueb.cf.ch17nestedClasses.knight;

public class Main {

    public static void main(String[] args) {
        IKnight joa = new Knight();
        IKnight saintGeorge = new Knight();

        //implementation with lambdas
        joa.embarkOnMission(() -> killTheDragon());
        saintGeorge.embarkOnMission(() -> System.out.println("Save the princess"));

        //implementation with method reference
        joa.embarkOnMission(Main::killTheDragon);
        saintGeorge.embarkOnMission(Main::saveThePrincess);

        //implementation with anonymous class
        joa.embarkOnMission(new IMission() {
            @Override
            public void embark() {
            killTheDragon();
        }
        });

        saintGeorge.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                System.out.println("Save the princess");
            }
        });
    }

    public static void killTheDragon(){
        System.out.println("Kill the Dragon");
    }

    public static void saveThePrincess(){
        System.out.println("Save the princess");
    }
}
