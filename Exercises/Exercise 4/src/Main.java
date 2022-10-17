import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        init();
    }

    public static void init() {
        System.out.println("Welcome to the cocktail mixer!");
//        run();
        while (run()) {}
    }

    public static boolean run() {
        System.out.println("Enter 1 to mix or 2 to quit.");

//        Scanner scan = new Scanner(System.in);
        int choice = 0;

        while (choice != 1 && choice != 2) {
            choice = scan.nextInt();
        }

        if (choice == 2) return false;

        mix();

        return true;
    }

    public static void mix() {
//        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your choice of drink!");
        System.out.println("1) Bourbon\n2) Gin\n3) Vodka");

        int drinkChoice = 0;

        while (drinkChoice < 1 || drinkChoice > 3) {
            drinkChoice = scan.nextInt();
        }

        Liquor baseLiquor;

        switch (drinkChoice) {
            case 1 -> {
                System.out.println("Bourbon has been chosen");
                baseLiquor = new Bourbon();
            }
            case 2 -> {
                System.out.println("Gin has been chosen");
                baseLiquor = new Gin();
            }
            case 3 -> {
                System.out.println("Vodka has been chosen");
                baseLiquor = new Vodka();
            }
            default -> throw new IllegalStateException("Unexpected value: " + drinkChoice);
        }

        System.out.println("Enter a choice for an ingredient to add");
        System.out.println("1) Bitters\n2) Vermouth\n3) Cherry\n4) Lime\n5) Sugar\n6) Lime Juice\n0) Stop Mixing");

        int decoratorChoice = -1;

        while (decoratorChoice != 0) {
            decoratorChoice = scan.nextInt();

            switch (decoratorChoice) {
                case 0 -> {
                    System.out.println("Mixing stopped!");
                    System.out.println("Calories: " + baseLiquor.GetCalories());
                }
                case 1 -> {
                    System.out.println("Bitters added");
                    baseLiquor = new Bitters(baseLiquor);
                }
                case 2 -> {
                    System.out.println("Vermouth added");
                    baseLiquor = new Vermouth(baseLiquor);
                }
                case 3 -> {
                    System.out.println("Cherry added");
                    baseLiquor = new Cherry(baseLiquor);
                }
                case 4 -> {
                    System.out.println("Lime added");
                    baseLiquor = new Lime(baseLiquor);
                }
                case 5 -> {
                    System.out.println("Sugar added");
                    baseLiquor = new Sugar(baseLiquor);
                }
                case 6 -> {
                    System.out.println("Lime juice added");
                    baseLiquor = new LimeJuice(baseLiquor);
                }
            }
        }
    }
}
