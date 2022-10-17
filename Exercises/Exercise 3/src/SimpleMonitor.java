public class SimpleMonitor implements Observer {
    Subject subject;
    public SimpleMonitor(Subject observableSubject) {
        subject = observableSubject;
        subject.registerObserver(this);
    }
    public void StopObserving() {
        subject.removeObserver(this);
        subject = null;
    }
    @Override
    public void update(int newValue) {
        if (newValue < 0 || newValue > 2)  return;

        System.out.print("Simple Monitor: ");

        System.out.println("Baby is crying!");
    }
}
