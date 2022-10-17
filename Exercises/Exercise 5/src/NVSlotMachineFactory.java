public class NVSlotMachineFactory extends SlotMachineFactory {
    @Override
    public SlotMachine OrderSlotMachine(String type) {
        type = type.toUpperCase();

        SlotMachine slotMachine;

        switch (type) {
            case "STRAIGHT" -> slotMachine = new NVStraight();
            case "BONUS" -> slotMachine = new NVBonus();
            case "PROGRESSIVE" -> slotMachine = new NVProgressive();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }

        return slotMachine;
    }
}
