public class Milkshake implements IOrderItem {
    @Override
    public void Order() {
        System.out.println("You ordered a tall milkshake");
    }

    @Override
    public String PrepareItem() {
        return "A cool, sweet and refreshing milkshake";
    }
}
