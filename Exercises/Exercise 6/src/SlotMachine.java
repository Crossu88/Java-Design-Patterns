public abstract class SlotMachine {
    public final Cabinet _cabinet;
    public final Display _display;
    public final Payment _payment;
    public final CPU _cpu;
    public final OS _os;
    public final SlotType _slotType;

    public SlotMachine(Cabinet cabinet, Display display, Payment payment, CPU cpu, OS os, SlotType slotType) {
        _cabinet = cabinet;
        _display = display;
        _payment = payment;
        _cpu = cpu;
        _os = os;
        _slotType = slotType;
    }

    @Override
    public String toString() {
        return  "Slot Type: " + _slotType.name() + "\n" +
                "Cabinet: " + _cabinet + "\n" +
                "Display: " + _display + "\n" +
                "Payment: " + _payment + "\n" +
                "CPU: " + _cpu + "\n" +
                "OS: " + _os;
    }
}
