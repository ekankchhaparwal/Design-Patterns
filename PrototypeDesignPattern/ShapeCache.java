package PrototypeDesignPattern;

import java.util.HashMap;

public class ShapeCache {
    private static HashMap<String,Shape> map = new HashMap<>();

    public static Shape getShape(String id) {
        if (map.containsKey(id)){
            Shape cache = map.get(id);
            return (Shape) cache.clone();
        }
        return null;
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        map.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        map.put(rectangle.getId(),rectangle);
    }
}
