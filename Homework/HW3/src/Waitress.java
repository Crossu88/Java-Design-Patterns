import java.util.ArrayList;

public class Waitress {
    private ArrayList<IOrderItem> order = new ArrayList<>();
    private final ShortOrderChef chef = new ShortOrderChef();

    public void AddToOrder(IOrderItem item) {
        item.Order();
        order.add(item);
    }

    public void CancelOrder() {
        order.clear();
    }

    public void FinishOrder() {
        if (order.isEmpty()) {
            System.out.println("You haven't ordered anything yet!");
            return;
        }

        System.out.println("The waitress sends the order to the cook.");


        order.forEach(chef::PrepareOrderItem);
        order.clear();
        String finishedOrder = chef.ServeOrder();

        System.out.println("After a while, the waitress returns with a tray containing:");
        System.out.println(finishedOrder);
    }
}
