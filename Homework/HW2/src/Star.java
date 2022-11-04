public class Star extends TreeDecorator {

    public Star(Tree decoratedTree) {
        super(decoratedTree);

        cost = 4;
        description = "a star";

        checkForStar(decoratedTree);
    }

    private void checkForStar(Tree tree) {
        Tree treeToCheck = tree;

        while (treeToCheck instanceof TreeDecorator) {

            if (treeToCheck instanceof Star) {
                System.out.println("Tree already has a star!");

                cost = 0;
                description = "";

                return;
            }

            treeToCheck = ((TreeDecorator) treeToCheck).getTree();
        }
    }
}
