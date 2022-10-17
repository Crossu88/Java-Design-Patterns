import java.util.ArrayList;

public class AdvancedMonitor implements Observer {
    private ArrayList<Subject> subjects;

    public AdvancedMonitor(ArrayList<Subject> observedSubjects) {
        subjects = observedSubjects;

        for (Subject subject : observedSubjects)
            subject.registerObserver(this);
    }

    public void stopObserving(Subject subject) {
        subjects.remove(subject);
        subject.removeObserver(this);
    }

    public void stopObservingAll() {
        for (Subject observedSubject : subjects )
            observedSubject.removeObserver(this);

        subjects.clear();
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
