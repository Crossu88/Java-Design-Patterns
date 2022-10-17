import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Baby baby1 = new Baby();
        Baby baby2 = new Baby();

        ArrayList<Subject> allBabies = new ArrayList<>();
        allBabies.add(baby1);
        allBabies.add(baby2);

        System.out.println("Babies have been made!");

        SimpleMonitor simpleMonitor = new SimpleMonitor(baby1);
        AdvancedMonitor advancedMonitor = new AdvancedMonitor(allBabies);

        System.out.println("Baby monitors are set up and listening!");

        System.out.println("The babies are making noise!");

        baby1.sob();
        baby1.cry();
        baby1.scream();
        baby1.relax();
        baby1.scream();
        baby2.cry();
        baby1.relax();
        baby1.relax();

        System.out.println("Monitors are no longer listening!");

        simpleMonitor.StopObserving();
        advancedMonitor.stopObservingAll();

        System.out.println("Babies are making more noise!");

        baby1.cry();
        baby2.cry();
    }
}
