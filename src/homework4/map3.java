package map;

import java.util.HashMap;
import java.util.Map;

public class map3 {
    public static void main(String[] args) {
        Map<String, String> fruit = new HashMap<>();
        fruit.put("red", "strawberries");
        fruit.put("sweet", "Mango");
        fruit.put("big", "Banana");
        fruit.put("Green", "Apple");
        for (Map.Entry entry : fruit.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}