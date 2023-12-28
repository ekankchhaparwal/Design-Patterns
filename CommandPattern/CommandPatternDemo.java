package CommandPattern;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);
        Broker broker = new Broker();
        broker.addOrder(buyStock);
        broker.addOrder(sellStock);
        broker.executeOrders();
    }
}
