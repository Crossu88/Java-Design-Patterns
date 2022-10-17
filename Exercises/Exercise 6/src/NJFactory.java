public class NJFactory implements Factory {
    @Override
    public SlotMachine createStraight() {
        return new StraightSlots(
                new SmallCabinet(),
                new LCDDisplay(),
                new CoinsPayment(),
                new ARMCPU(),
                new WindowsMEOS()
        );
    }

    @Override
    public SlotMachine createBonus() {
        return new BonusSlots(
                new LargeCabinet(),
                new ReelsDisplay(),
                new CoinsPayment(),
                new ARMCPU(),
                new WindowsMEOS()
        );
    }

    @Override
    public SlotMachine createProgressive() {
        return new ProgressiveSlots(
                new SmallCabinet(),
                new CRTDisplay(),
                new BillsPayment(),
                new X86CPU(),
                new WindowsXPOS()
        );
    }
}
