package map;

import java.util.*;

public class map1 {
    public static void main(String[] args) {
        List<String> toyota = new ArrayList<>();
        toyota.add("yaris");
        toyota.add("camry");
        toyota.add("rav4");
        toyota.add("highlander");
        List<String> volkswagen = new ArrayList<>();
        volkswagen.add("golf");
        volkswagen.add("passat");
        volkswagen.add("amarok");
        volkswagen.add("atlas");
        List<String> ford = new ArrayList<>();
        ford.add("fusion");
        ford.add("focus");
        ford.add("explorer");
        ford.add("mustang");
        Map<String, List<String>> carsModels = new LinkedHashMap<>();
        carsModels.put("JapanModels", toyota);
        carsModels.put("GermanModels", volkswagen);
        carsModels.put("AmericaModels", ford);


         for(Map.Entry entry:carsModels.entrySet()){
        System.out.println(entry.getKey() + " " + entry.getValue());
    }
    }
}
