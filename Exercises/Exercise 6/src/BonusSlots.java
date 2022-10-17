public class BonusSlots extends SlotMachine {
    public BonusSlots(Cabinet cabinet, Display display, Payment payment, CPU cpu, OS os) {
        super(cabinet, display, payment, cpu, os, SlotType.BONUS);
    }
}
