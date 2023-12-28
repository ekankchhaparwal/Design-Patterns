package CommandPattern;

public class BuyStock implements Order{
    private Stock buyStock;
    BuyStock(Stock stock) {
        this.buyStock = stock;
    }
    @Override
    public void exceute() {
        buyStock.buy();
    }
}
