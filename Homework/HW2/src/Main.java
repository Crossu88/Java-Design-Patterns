import java.util.Scanner;

public class Main {
    // The Scanner is used to check the type of the user's input
    private static final Scanner scan = new Scanner(System.in);

    // Program entry point
    public static void main(String[] args) {
        // Loop run() until it returns false
        while (run());
    }

    // The run() function is the body of the application loop
    // Each iteration of the loop, the user will either choose to build a tree or quit
    public static boolean run() {
        // User is prompted either to build a tree or quit
        System.out.println("Enter one of the following choices to continue");
        System.out.println("1) Decorate a New Tree\n2) Quit");

        // Local variable to read user input into
        int choice = 0;

        // Until we receive either a 1 or a 2 for user input, wait for more input
        while (choice != 1 && choice != 2)
            choice = scan.nextInt();

        // If the user chooses to quit, return false and break the application loop
        if (choice == 2) return false;

        // Otherwise, we will decorate a tree
        decorate();

        // Returns true to enter another loop iteration
        return true;
    }

    // Entered when a user wishes to decorate a tree
    public static void decorate() {
        // User is prompted for the type of tree they would like to decorate
        System.out.println("Enter your choice of tree to decorate!");
        System.out.println("1) Fraser Fir\n2) Douglas Fir\n3) Balsam Fir\n4) Colorado Blue Spruce");

        // Local variable to read user input into
        int treeChoice = 0;

        // Until a valid choice for tree is made, wait for valid input
        while (treeChoice < 1 || treeChoice > 4)
            treeChoice = scan.nextInt();

        // Local variable to hold the tree and its decorators
        Tree tree;

        // Instantiates a new tree of the type specified by user input
        switch (treeChoice) {
            case 1 -> {
                System.out.println("Fraser fir tree selected");
                tree = new FraserFirTree();
            }
            case 2 -> {
                System.out.println("Douglas fir tree selected");
                tree = new DouglasFirTree();
            }
            case 3 -> {
                System.out.println("Balsam fir tree selected");
                tree = new BalsamFirTree();
            }
            case 4 -> {
                System.out.println("Colorado spruce tree selected");
                tree = new ColoradoBlueSpruceTree();
            }
            default -> throw new IllegalStateException("Unexpected value: " + treeChoice);
        }

        // User is now prompted for the decorations that will be added to the tree
        System.out.println("Enter any of the choices below to add decorations or quit");
        System.out.println("0) Quit\n1) Star\n2) Ruffles\n3) Red Balls\n4) Blue Balls\n5) Silver Balls\n6) Ribbons\n7) Lights\n8) LEDs");

        // Local variable to read user input into
        int decorationChoice = -1;

        // Until the user quits, they can enter the numbers of the decorations they wish to add
        while (decorationChoice != 0) {
            decorationChoice = scan.nextInt();

            switch (decorationChoice) {
                case 0 -> {
                    System.out.println("Tree decoration finished!");
                    printtree(tree);
                }
                case 1 -> {
                    System.out.println("Adding a star");
                    tree = new Star(tree);
                }
                case 2 -> {
                    System.out.println("Adding ruffles");
                    tree = new Ruffles(tree);
                }
                case 3 -> {
                    System.out.println("Adding red balls");
                    tree = new BallsRed(tree);
                }
                case 4 -> {
                    System.out.println("Adding blue balls");
                    tree = new BallsBlue(tree);
                }
                case 5 -> {
                    System.out.println("Adding silver balls");
                    tree = new BallsSilver(tree);
                }
                case 6 -> {
                    System.out.println("Adding ribbons");
                    tree = new Ribbons(tree);
                }
                case 7 -> {
                    System.out.println("Adding lights");
                    tree = new Lights(tree);
                }
                case 8 -> {
                    System.out.println("Adding LEDs");
                    tree = new Leds(tree);
                }
            }
        }
    }

    // Formats the tree into a sentence as specified by HW2
    public static void printtree(Tree tree) {
        System.out.println(tree.description() + " costs $" + tree.cost() + ".0");
    }
}