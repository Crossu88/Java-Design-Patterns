import java.util.Random;

public class ComputerOrderSystem implements IOrderSystem {
    @Override
    public void TakeOrder() {
        int orderNumber = (new Random()).nextInt(1, 9999);
        System.out.println("New order: " + orderNumber);
    }
}
