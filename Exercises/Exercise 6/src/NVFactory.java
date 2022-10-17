public class NVFactory implements Factory {
    @Override
    public SlotMachine createStraight() {
        return new StraightSlots(
                new LargeCabinet(),
                new ReelsDisplay(),
                new TicketInTicketOutPayment(),
                new ARMCPU(),
                new LinuxOS()
        );
    }

    @Override
    public SlotMachine createBonus() {
        return new BonusSlots(
                new SmallCabinet(),
                new CRTDisplay(),
                new TicketInTicketOutPayment(),
                new X86CPU(),
                new LinuxOS()
        );
    }

    @Override
    public SlotMachine createProgressive() {
        return new ProgressiveSlots(
                new MediumCabinet(),
                new LCDDisplay(),
                new TicketInTicketOutPayment(),
                new X77CPU(),
                new AndroidOS()
        );
    }
}
