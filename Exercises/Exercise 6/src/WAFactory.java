public class WAFactory implements Factory {
    @Override
    public SlotMachine createStraight() {
        return new StraightSlots(
                new LargeCabinet(),
                new ReelsDisplay(),
                new BillsPayment(),
                new ARMCPU(),
                new LinuxOS()
        );
    }

    @Override
    public SlotMachine createBonus() {
        return new BonusSlots(
                new MediumCabinet(),
                new VGADisplay(),
                new TicketInTicketOutPayment(),
                new ARMCPU(),
                new SymbianOS()
        );
    }

    @Override
    public SlotMachine createProgressive() {
        return new ProgressiveSlots(
                new LargeCabinet(),
                new ReelsDisplay(),
                new CoinsPayment(),
                new ARMCPU(),
                new AndroidOS()
        );
    }
}
