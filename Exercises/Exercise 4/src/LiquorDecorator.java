public abstract class LiquorDecorator extends Liquor {
    Liquor liquor;

    public LiquorDecorator(Liquor decoratedLiquor) {
        liquor = decoratedLiquor;
    }
}
