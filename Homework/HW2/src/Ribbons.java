public class Ribbons extends TreeDecorator {
    public Ribbons(Tree decoratedTree) {
        super(decoratedTree);

        cost = 2;
        description = "ribbons";
    }
}
