public class Main {
    public static void main(String[] args) {
        Factory NJFac = new NJFactory();
        Factory NVFac = new NVFactory();
        Factory WAFac = new WAFactory();

        SlotMachine straight;
        SlotMachine bonus;
        SlotMachine progressive;

        System.out.println("Machines from Nevada factory\n");

        straight = NVFac.createStraight();
        bonus = NVFac.createBonus();
        progressive = NVFac.createProgressive();

        System.out.println(straight + "\n");
        System.out.println(bonus + "\n");
        System.out.println(progressive + "\n");

        System.out.println("Machines from New Jersey factory\n");

        straight = NJFac.createStraight();
        bonus = NJFac.createBonus();
        progressive = NJFac.createProgressive();

        System.out.println(straight + "\n");
        System.out.println(bonus + "\n");
        System.out.println(progressive + "\n");

        System.out.println("Machines from Washington factory\n");

        straight = WAFac.createStraight();
        bonus = WAFac.createBonus();
        progressive = WAFac.createProgressive();

        System.out.println(straight + "\n");
        System.out.println(bonus + "\n");
        System.out.println(progressive + "\n");
    }
}