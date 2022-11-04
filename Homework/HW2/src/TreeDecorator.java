import java.util.Objects;

public abstract class TreeDecorator extends Tree {
    private final Tree tree;

    public TreeDecorator(Tree decoratedTree) {
        tree = decoratedTree;
    }

    public Tree getTree() {
        return tree;
    }

    @Override
    public String description() {
        if (!(tree instanceof TreeDecorator))
            return tree.description() + " decorated with " + description;

        if (Objects.equals(description, ""))
            return tree.description();

        return tree.description() + ", " + description;
    }

    @Override
    public int cost() {
        return tree.cost() + cost;
    }
}