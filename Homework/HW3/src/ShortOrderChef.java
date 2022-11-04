public class ShortOrderChef {
    private StringBuilder preparedOrder = new StringBuilder();
    private int orderLength = 0;

    public void PrepareOrderItem(IOrderItem item) {
        orderLength++;

        preparedOrder.append("    ")
                .append(orderLength)
                .append(") ")
                .append(item.PrepareItem())
                .append('\n');
    }

    public String ServeOrder() {
        String finishedOrder = preparedOrder.toString();

        preparedOrder = new StringBuilder();
        orderLength = 0;

        return finishedOrder;
    }
}
