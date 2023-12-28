package CommandPattern;

public class Stock {
    private String name = "abc";
    private int quantity = 10;

    public void buy() {
        System.out.println(name+" shares bought for 20rs with quantity of "+quantity);
    }

    public void sell() {
        System.out.println(name+" shares sold for 25rs with quantity of "+quantity);
    }
}
