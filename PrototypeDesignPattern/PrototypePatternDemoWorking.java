package PrototypeDesignPattern;

public class PrototypePatternDemoWorking {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape circle = (Shape) ShapeCache.getShape("1");
        circle.draw();
    }
}
