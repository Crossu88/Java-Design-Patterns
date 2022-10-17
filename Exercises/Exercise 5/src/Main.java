public class Main {
    public static void main(String[] args) {
        SlotMachineFactory WAFactory = new WASlotMachineFactory();
        SlotMachineFactory NJFactory = new NJSlotMachineFactory();
        SlotMachineFactory NVFactory = new NVSlotMachineFactory();

        SlotMachine straightMachine;
        SlotMachine bonusMachine;
        SlotMachine progressiveMachine;

        System.out.println("\nAn order has been placed at the WA factory");

        straightMachine = WAFactory.OrderSlotMachine("STRAIGHT");
        bonusMachine = WAFactory.OrderSlotMachine("BONUS");
        progressiveMachine = WAFactory.OrderSlotMachine("PROGRESSIVE");

        printSlotMachine(straightMachine);
        printSlotMachine(bonusMachine);
        printSlotMachine(progressiveMachine);

        System.out.println("\nAn order has been placed at the NJ factory");

        straightMachine = NJFactory.OrderSlotMachine("STRAIGHT");
        bonusMachine = NJFactory.OrderSlotMachine("BONUS");
        progressiveMachine = NJFactory.OrderSlotMachine("PROGRESSIVE");

        printSlotMachine(straightMachine);
        printSlotMachine(bonusMachine);
        printSlotMachine(progressiveMachine);

        System.out.println("\nAn order has been placed at the NV factory");

        straightMachine = NVFactory.OrderSlotMachine("STRAIGHT");
        bonusMachine = NVFactory.OrderSlotMachine("BONUS");
        progressiveMachine = NVFactory.OrderSlotMachine("PROGRESSIVE");

        printSlotMachine(straightMachine);
        printSlotMachine(bonusMachine);
        printSlotMachine(progressiveMachine);
    }

    public static void printSlotMachine(SlotMachine slotMachine) {
        System.out.println('\n' + slotMachine.getClass().getName() + " slot machine:");
        System.out.println("Cabinet: " + slotMachine.getCabinet());
        System.out.println("Display: " + slotMachine.getDisplay());
        System.out.println("Payment: " + slotMachine.getPayment());
        System.out.println("CPU: " + slotMachine.getCPU());
        System.out.println("OS: " + slotMachine.getOS());
    }
}
