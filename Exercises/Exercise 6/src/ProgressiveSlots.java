public class ProgressiveSlots extends SlotMachine {
    public ProgressiveSlots(Cabinet cabinet, Display display, Payment payment, CPU cpu, OS os) {
        super(cabinet, display, payment, cpu, os, SlotType.PROGRESSIVE);
    }
}
