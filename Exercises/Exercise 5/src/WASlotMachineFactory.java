public class WASlotMachineFactory extends SlotMachineFactory {
    @Override
    public SlotMachine OrderSlotMachine(String type) {
        type = type.toUpperCase();

        SlotMachine slotMachine;

        switch (type) {
            case "STRAIGHT" -> slotMachine = new WAStraight();
            case "BONUS" -> slotMachine = new WABonus();
            case "PROGRESSIVE" -> slotMachine = new WAProgressive();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }

        return slotMachine;
    }
}
