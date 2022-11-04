public class Lights extends TreeDecorator {
    public Lights(Tree decoratedTree) {
        super(decoratedTree);

        cost = 5;
        description = "lights";
    }
}
