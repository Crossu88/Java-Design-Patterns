public class Sugar extends LiquorDecorator {
    public Sugar(Liquor decoratedLiquor) {
        super(decoratedLiquor);
    }

    @Override
    public int GetCalories() {
        return liquor.GetCalories() + 300;
    }
}
