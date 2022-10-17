public class Lime extends LiquorDecorator {
    public Lime(Liquor decoratedLiquor) {
        super(decoratedLiquor);
    }

    @Override
    public int GetCalories() {
        return liquor.GetCalories() + 2;
    }
}
