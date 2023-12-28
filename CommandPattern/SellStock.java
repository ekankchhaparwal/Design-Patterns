package CommandPattern;

public class SellStock implements Order{
    private Stock sellABC;
    SellStock(Stock stock) {
        this.sellABC = stock;
    }
    @Override
    public void exceute() {
        sellABC.sell();
    }
}
