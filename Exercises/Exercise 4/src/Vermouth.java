public class Vermouth extends LiquorDecorator {
    public Vermouth(Liquor decoratedLiquor) {
        super(decoratedLiquor);
    }

    @Override
    public int GetCalories() {
        return liquor.GetCalories() + 40;
    }
}
