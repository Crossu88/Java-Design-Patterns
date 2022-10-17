public class Main {
    public static void main(String[] args) {

        Baby baby = new Baby();

        System.out.println("A baby has been made!");

        SimpleMonitor simpleMonitor = new SimpleMonitor(baby);

        AdvancedMonitor advancedMonitor = new AdvancedMonitor(baby);

        System.out.println("Baby monitors are set up and listening!");

        System.out.println("The baby is making noise!");

        baby.sob();
        baby.cry();
        baby.relax();
        baby.scream();

        System.out.println("Monitors are no longer listening!");

        simpleMonitor.StopObserving();
        advancedMonitor.StopObserving();

        System.out.println("Baby is making more noise!");

        baby.cry();
    }
}
