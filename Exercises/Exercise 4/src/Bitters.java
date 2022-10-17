public class Bitters extends LiquorDecorator {
    public Bitters(Liquor decoratedLiquor) {
        super(decoratedLiquor);
    }

    @Override
    public int GetCalories() {
        return liquor.GetCalories() + 20;
    }
}
