public class Cherry extends LiquorDecorator {
    public Cherry(Liquor decoratedLiquor) {
        super(decoratedLiquor);
    }

    @Override
    public int GetCalories() {
        return liquor.GetCalories() + 40;
    }
}
