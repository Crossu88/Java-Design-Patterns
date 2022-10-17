public class StraightSlots extends SlotMachine {
    public StraightSlots(Cabinet cabinet, Display display, Payment payment, CPU cpu, OS os) {
        super(cabinet, display, payment, cpu, os, SlotType.STRAIGHT);
    }
}
