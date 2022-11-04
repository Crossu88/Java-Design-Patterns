public class Burger implements IOrderItem {

    @Override
    public void Order() {
        System.out.println("You ordered a burger");
    }

    @Override
    public String PrepareItem() {
        return "A steaming hot fresh-off-the-grill burger";
    }
}
