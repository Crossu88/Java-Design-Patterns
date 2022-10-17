public class LimeJuice extends LiquorDecorator {
    public LimeJuice(Liquor decoratedLiquor) {
        super(decoratedLiquor);
    }

    @Override
    public int GetCalories() {
        return liquor.GetCalories() + 8;
    }
}
