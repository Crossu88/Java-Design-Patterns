public class NJSlotMachineFactory extends SlotMachineFactory {
    @Override
    public SlotMachine OrderSlotMachine(String type) {
        type = type.toUpperCase();

        SlotMachine slotMachine;

        switch (type) {
            case "STRAIGHT" -> slotMachine = new NJStraight();
            case "BONUS" -> slotMachine = new NJBonus();
            case "PROGRESSIVE" -> slotMachine = new NJProgressive();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }

        return slotMachine;
    }
}
