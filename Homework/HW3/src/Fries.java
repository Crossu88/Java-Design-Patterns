public class Fries implements IOrderItem {
    @Override
    public void Order() {
        System.out.println("You order a side of fries");
    }

    @Override
    public String PrepareItem() {
        return "A side of golden-brown and perfectly crispy fries";
    }
}
