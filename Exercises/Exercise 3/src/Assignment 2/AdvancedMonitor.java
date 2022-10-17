public class AdvancedMonitor implements Observer {
    Subject subject;

    public AdvancedMonitor(Subject observedSubject) {
        subject = observedSubject;
        subject.registerObserver(this);
    }
    public void StopObserving() {
        subject.removeObserver(this);
        subject = null;
    }
    @Override
    public void update(int newValue) {
        if (newValue < 0 || newValue > 2) return;

        System.out.print("Advanced Monitor: ");

        switch (newValue) {
            case 0 -> System.out.println("Baby is sobbing!");
            case 1 -> System.out.println("Baby is crying!");
            case 2 -> System.out.println("Baby is screaming!");
        }
    }
}
