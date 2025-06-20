package gr.aueb.cf.ch17.knight;

public class Main {

    public static void main(String[] args) {
       // Knight joe = new Knight();
        //Knight saintGeorge = new Knight();
//        joe.embarkOnMission(new IMission() {
//            @Override
//            public void embark() {
//                System.out.println("Save the Princess");
//            }
//        });
//
//        saintGeorge.embarkOnMission(new IMission() {
//            @Override
//            public void embark() {
//                killTheDragon();
//            }
//        });
//        joe.embarkOnMission(() -> System.out.println("Save the Princess"));
//        saintGeorge.embarkOnMission(() -> killTheDragon());
        //joe.embarkOnMission(Main::saveThePrincess);
        //saintGeorge.embarkOnMission(Main::killTheDragon);
    }

    public static void killTheDragon() {
        System.out.println("Kill the Dragon");
    }

    public static void saveThePrincess() {
        System.out.println("Save the Princess");
    }
}
